# -*- coding: utf-8 -*-
"""
Created on Thu Feb  3 16:59:38 2023
@author: LMM
"""


# =============================================================================
# Codage du contenu d'une case :
# - une case minée contient la valeur 1 ;
# - une case non minée contient la valeur correspondant au nombre de mines
# qui l'entourent + 10 ;
# - une case suspectée de contenir une mine (avec un drapeau '!') contient sa
# valeur normale ×(-1) ;
# - une case découverte contient sa valeur normale + 100 (101 = fin du jeu !).
#
# Résumé :
# - de -18 à -10 : case non minée non découverte avec drapeau ;
# - -1 : case minée non découverte avec drapeau ;
# - 1 : case minée non découverte ;
# - de 10 à 18 : case non minée non découverte ;
# - 101 : case minée découverte = perdu !
# - 110 : case non minée sans mine autour découverte ;
# - de 111 à 118 : case non minée avec mine autour découverte.
# =============================================================================


from random import randint
import time 

class Demineur:
    print(f"""Lors de l'appel de votre démineur, définissez en parametre une taille, définie de base, un nombre de mine, définie de base, un nombre de coups, défini de base et un nombre, à 0 de base.\n
          Chaques parametres définis de bases n'a pas essentiellement besoin d'etre défini lors de l\'appel de votre démineur.\n
          Les diférentes tailles de bases sont :\n
                            |   petit : 9x9\n
                            |   normal :16x16\n
                            |   grand : 16x30\n
          Vous pouvez définir une taille sous forme de deux-uplet (a,b) à la place de défnir une taille prédéfinie.\n
          Pour définir votre démineur, tapez [nom du démineur]=Demineur()\n
          Mettez les parametres cités plus haut dans la paranthese si vous en voulez.""")

    def __init__(self, taille="normal", diff=15, nbr_coup= 100, nbr_vie=0, creative=False): #Possibilté de mettre un nombre de coup et de vie, le mode créatif, caché, est le mode permettant de finir à coups sur le jeu.

        DIC_TAILLE = {"petit": (9, 9), "normal": (16, 16), "grand": (16, 30)}

        assert taille in DIC_TAILLE or ((type(taille) == tuple)
                                        and 0 < taille[0] < 27
                                        and 0 < taille[1] < 100)
        assert 10 < diff < 35 and type(diff) == int
        assert type(nbr_coup)==int, "Votre nombre de coup n'est pas valide"
        assert 0<=nbr_coup, "Nombre de coup trop bas, 50 minimum"

        if type(taille) == str:
            self.__LARG = DIC_TAILLE[taille][0]
            self.__HAUT = DIC_TAILLE[taille][1]
        else:
            self.__LARG = taille[0]
            self.__HAUT = taille[1]

        self.__plateau =[[10]*self.__LARG for _ in range(self.__HAUT)]
        self.__NB_MINE = int(self.__LARG*self.__HAUT*diff/100)
        self.__nb_c_dec = 0    # nombre de cases découvertes
        self.__nb_m_dec = 0    # nombre de cases suspectées
        self.__fin = False    # fin du jeu
        self.__ALENTOUR = [(1, 0), (1, -1), (0, -1), (-1, -1), (-1, 0),
                           (-1, 1), (0, 1), (1, 1)]
        self.__nbr_coup=nbr_coup #Nombre de coups 
        self.__nbr_vie=nbr_vie #Nombre de vies 
        self.__vie_perdue=0
        self.__minage()
        self.__decompte()
        self.__creative=creative
        print(f"Démineur de taille {self.__LARG}x{self.__HAUT} avec {self.__NB_MINE} mines et {self.__nbr_coup} coups possible. Afficher le plateau de jeu ne compte pas comme \n un coup et il n'est pas possible de récuperer des coups. La commande {__name__}.aide() est disponible pour vous fournir les commandes disponibles. Bonne chance !!")
        if self.__creative:
            self.__nbr_vie=self.__NB_MINE+120
            self.__nbr_coup=2147483647 # nombre max codé sur 32bits
        self.__start_time = None    ### pour calcul du tps
        self.__score = None         ###.............du score
        self.__win = None

    def __minage(self):
        """Place les mines sur le plateau de jeu."""
        for _ in range(self.__NB_MINE):
            X = randint(0, self.__LARG-1)
            Y = randint(0, self.__HAUT-1)
            self.__plateau[Y][X] = 1

    def __decompte(self):
        """Inscrit le nombre de mines qui entourent chaque case non minée."""
        for i in range(self.__HAUT):
            for j in range(self.__LARG):
                if self.__plateau[i][j] != 1:
                    nb_mine = 0
                    for cases in range(8):
                        a, b = self.__ALENTOUR[cases]
                        if 0 <= i + a < self.__HAUT and 0 <= j + b < self.__LARG and self.__plateau[i + a][j + b] == 1 :
                            nb_mine += 1
                            
                    self.__plateau[i][j] = nb_mine + 10

    def __verif_pos(self, pos):
        """Verifie que la chaine correspondant aux coordonnées d'une case est
        valide. Renvoie le booléen correspondant et sous forme numérique
        l'abscisse et l'ordonnée de la case (None et None si pos est non
        valide)."""
        rep = False
        x_ind = None
        y_ind = None
        if type(pos) == str and 1 < len(pos) < 4:
            x = pos[0].upper()  # lettre de la colonne
            x_int = ord(x)
            if 64 < x_int < 65 + self.__LARG:
                x_ok = True
                x_ind = x_int - 65
            else:
                x_ok = False
                x_ind = None

            y = pos[1:]  # nombre de la ligne
            try:
                y_int = int(y)
                if 0 < y_int < 1 + self.__HAUT:
                    y_ok = True
                    y_ind = y_int - 1
                else:
                    y_ok = False
                    y_ind = None
            except ValueError:
                y_ok = False
                y_ind = None
            rep = x_ok and y_ok
        return rep, x_ind, y_ind

    def __propage(self, x, y):
        """Découvre les cases vides adjacentes à celle de départ, en propageant
        l'opération de proche en proche."""
        for cpl in self.__ALENTOUR:
            x_voisin = x + cpl[0]
            y_voisin = y + cpl[1]
            if -1 < x_voisin < self.__LARG and -1 < y_voisin < self.__HAUT :
                val = self.__plateau[y_voisin][x_voisin]
                if 10 < val < 19:
                    self.__plateau[y_voisin][x_voisin] = val+100
                    self.__nb_c_dec += 1
                elif val == 10:
                    self.__plateau[y_voisin][x_voisin] = 110
                    self.__nb_c_dec += 1
                    self.__propage(x_voisin, y_voisin)

    def clic(self, pos):
        """Révèle une case et affiche le plateau de jeu."""
        if self.__start_time is None:
            self.__start_time = time.time() # chronomètre qui démarre dès que le joueur commence la partie et s'arrête lorsque la partie prend fin   
        test, x, y = self.__verif_pos(pos)
        if test and not self.__fin:
            val = self.__plateau[y][x]
            if 0 < val < 19:
                self.__plateau[y][x] = val + 100

            if val == 1:    # perdu si nombre de vie=0!
                self.__nb_m_dec += 1
                if self.__nbr_vie==0:
                    self.__fin = True
                    print("   \nPERDU!   ")
                else:
                    self.__nbr_vie-=1
                    self.__vie_perdue+=1
            elif 10 < val < 19:    # case entourée de mines
                self.__nb_c_dec += 1
            elif val == 10:    # cases adjacentes vides
                self.__nb_c_dec += 1
                self.__propage(x, y)

            if self.__nb_c_dec == self.__LARG*self.__HAUT - self.__NB_MINE:
                self.__fin = True
                print("    \nGAGNÉ!!!   ")
            self.affiche()
            self.__nbr_coup-=1 #Nombre de coups -1
            if self.__nbr_coup==0:
                self.__fin=True
                print("Perdu, nombre de coup égal à 0")
        else:
            self.__alerte()

    def danger(self, pos):
        """Marque une case du drapeau '!' et affiche le plateau de jeu."""
        Test, x, y = self.__verif_pos(pos)
        if Test and not self.__fin:
            val = self.__plateau[y][x]
            if 0<val<19 :
                self.__plateau[y][x] = -val
                self.__nb_m_dec += 1
            self.affiche()
            self.__nbr_coup-=1 #Nombre de coups -1
            if self.__nbr_coup==0:
                self.__fin=True
                print("Perdu, nombre de coup égal à 0")
        else:
            self.__alerte()

    def annule(self, pos):
        """Supprime le drapeau '!' sans dévoiler la case et affiche le plateau de jeu."""
        test, x, y = self.__verif_pos(pos)
        if test and not self.__fin:
            val = self.__plateau[y][x]
            if val < 0:
                self.__plateau[y][x] = -val
                self.__nb_m_dec -= 1
            self.affiche()
            self.__nbr_coup-=1 #Nombre de coups -1
            if self.__nbr_coup==0:
                self.__fin=True
                print("Perdu, nombre de coup égal à 0")
        else:
            self.__alerte()

    def affiche(self):
        """Affiche le plateau de jeu."""
        if not self.__creative :
            nbr_vie_rest="❤️" #Nombre de vie
            nbr_vie_perdue=""
            for _ in range(self.__nbr_vie):
                nbr_vie_rest+="❤️"
            for _ in range(self.__vie_perdue):
                nbr_vie_perdue+="💔"
        txt = "\nNombre de mines non découvertes :\n "
        txt += str(self.__NB_MINE-self.__nb_m_dec) + "/" + str(self.__NB_MINE)
        txt += "\n"*2

        if self.__fin:
            tps_ecoule = time.time() - self.__start_time
            print(f"Temps écoulé: {tps_ecoule:.2f} secondes")
###     pour calculer la durée totale du jeu par soustraction du tps d'arrivée par celui de départ

            self.__score = self.calcul_score(tps_ecoule)
            print(f"Score: {self.__score} points")
###     pour calculer le score total

        absc = "   "
        for i in range(self.__LARG):
            absc += chr(65+i)
        txt += absc
        txt += "\n"

        for i in range(self.__HAUT):
            if i < 9:
                txt += " " + str(i+1) + "|"
            else:
                txt += str(i+1) + "|"

            for j in range(self.__LARG):
                val = self.__plateau[i][j]
                if val < 0:
                    symb = "!"    # case suspectée minée
                elif val < 19:    # case non découverte
                    if j % 2 == 1 :
                        symb = "░"
                    else:
                        symb = "▒"
                elif val == 110:
                    symb = " "    # cases adjacentes vides
                elif val > 110:
                    symb = "₁₂₃₄₅₆₇₈"[val-110-1]    # entourée de mines
                elif val == 101:
                    symb = "×"    # pied sur une mine : Perdu ! ☠
                txt += symb

            txt += "|" + str(i+1) + "\n"
        txt += absc
        print(txt)
        if not self.__creative:
            print(f"{self.__nbr_coup} coups restant")
            print(f"Nombre de vie :\n {nbr_vie_rest}{nbr_vie_perdue}")

    def __alerte(self):
        if self.__fin:
            print("Jeu terminé...")
        else:
            print("Entrer des coordonnées valides !")
    
    def aide(self): #Systeme d'aide, affichant les diferentes methodes dispo
        print(f"{__name__} = Nom de la variable contenant la classe démineur que vous avez définie.\n")
        print(f"{__name__}.affiche() = Affiche le plateau de jeu.")
        print(f"{__name__}.clic('case') = Revele une case")
        print(f"{__name__}.danger('case') = Marque une case comme étant minée")
        print(f"{__name__}.annule('case') = Retire le marqueur d'une case marquée comme étant une mine")

    def calcul_score(self, tps_ecoule):
        if self.__win == True:
            return int(10000 / (1 + 0.1 * tps_ecoule))
            
###    On a ici une fonction qui nous sert à donner + de pts
###    pour un temps plus court, en cas de partie gagnée.

if __name__ == "__main__":
    print(Demineur.__doc__)