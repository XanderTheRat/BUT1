import time
import tkinter as tk
temps=0
temps1=0
temps2=0
continuer=True
#=============================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
def Chrono_1():
    global temps,temps1,temps2, continuer
    continuer=True
    #Texte.set(f"{temps1}s")
    temps1=time.time_ns()
    print(f"{temps1}cs")
    main_chrono.after(1000,Chrono_)
#=============================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
def Chrono_2():
    global temps,temps1,temps2, continuer
    temps2=time.time_ns()
    print(f"{temps2}cs")
    temps=(temps2-temps1)*10e-7
    print(f"{temps}cs")
    Texte.set(f"{temps//1000 }s")
    temps2=0
    #temps1=0
    temps=0
    continuer=False#Je n'ai pas spécialement eu l'occasion d'utiliser une donction utilisant la variable "continuer", cette derniere est donc inutile dans le programme.
    print("hfgh")
#=============================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
def intermede1():
    intermede=time.time_ns()
    intermede=(intermede-temps1)*-10e-7
    Pause.set(f"{-(intermede//1000)}s")
    print(f"{intermede}cs")
#=============================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
def Chrono_():
        temps__=time.time_ns()
        temps___=(temps__-temps1)*10e-7
        Texte.set(f"{temps___//1000 +1}s")
        if continuer==True:
            main_chrono.after(1000, Chrono_)
#=============================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
#Création de la page
main_chrono=tk.Tk()
main_chrono.title('Chronometre')
main_chrono.geometry('1500x500')
#Bouton qui démare le chrono
bouton_qui_commence=tk.Button(main_chrono, text='Départ', command=Chrono_1)
bouton_qui_commence.grid(row=0, column=0)
#Bouton qui arrete le programme et affiche le temps
bouton_qui_arrete=tk.Button(main_chrono, text='Fin', command=Chrono_2)
bouton_qui_arrete.grid(row=0, column=1)
#Bouton qui affiche l'intermede
bouton_intermede=tk.Button(main_chrono, text="Intermede", command=intermede1)
bouton_intermede.grid(row=2, column=0)
#Label ou vas s'afficher le temps en secondes
Texte=tk.StringVar(master=main_chrono)
Durée=tk.Label(main_chrono, textvariable=Texte, fg='red', bg='white')
Durée.grid(row=0, column=2)
#Label ou vas s'afficher la pause
Pause=tk.StringVar(master=main_chrono)
Pause1=tk.Label(main_chrono, textvariable=Pause, fg='red', bg='white')
Pause1.grid(row=1, column=2)

#Desormais, nous placerons les modifications :
#Un bouton pour quitter:
BoutonQuiQuitte=tk.Button(main_chrono, text="Quitter le chronometre.", command=main_chrono.destroy)
BoutonQuiQuitte.grid(row=10,column=5)
#=============================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
#Quelques lignes de codes afin d'implémenter un minuteur
'''def compteur():
    global Champs
    try:
        champs_int=int(Champs.get())
    except ValueError as e:
        Erreur.set("Votre nombre de secondes est invalides !!")#Retourne une erreur si jamais on renvoie autre chose qu'un nombre ( un string, un booléen ou encore une liste.)
    for i in range(champs_int):#On lance une boucle qui s'execute jusqu'au nombre récupéré
        s_rest=champs_int-(i+1)
        Secondes_restant.set(f"{s_rest} secondes restantes")#On affiche alors le nombre de secondes.
        print(f"{champs_int-(i+1)}")
        #time.sleep(1)#Fonction python qui vas attendre une seconde avant de recommencer la boucle'''
#Les lignes de codes ci-dessus sont le premier essaie du minuteur, celles-ci font freeze la fenetre à cause notamment du time.sleep(1) mais a l'avantage d'etre plus compact et peut archer partout.



def compteur():
    global Champs
    global champs_int
    try:
        champs_int=int(Champs.get())
    except ValueError as e:
        Erreur.set("Votre nombre de secondes est invalides !!")#Retourne une erreur si jamais on renvoie autre chose qu'un nombre ( un string, un booléen, un tuple, un dictionnaire ou encore une liste.)
    if champs_int==0:#Ici, on vas retourner une erreur si jamais l'utilisateur rentre un nombre de seconde égale à 0
         Erreur.set("Votre nombre de secondes est invalide, votre chronometre ne vas pas tourner !!")
    else:
        compteur1()#Invocation de la fonction principale

def compteur1():#Fonction principale, appel de la fonction 
     if champs_int > 0:#Tant que le nombre de secondes rentrées est supperieur à 0, on vas executer le programme, puis rappeler cette fonction jusqu'à temps que le nombre deseconde est de 0.
          main_chrono.after(1000, compteur2)
          compteur1
     else :
          Secondes_restant.set("Chronometre arrivé à 0")#Si le nombre de secondes est arrivé à 0, on vas prgvenir l'utilisateur.
          


def compteur2():#Fonction secondaire, fonctionnement du minuteur.
     global champs_int
     champs_int=champs_int-1 #Étant donné que l'appel est effectué au bout d'une seconde, on enleve 1.
     Secondes_restant.set(f"{champs_int} secondes restantes")#Affiche le nombre de secondes restantes dans un stringvar.
     print(f"{champs_int} secondes restantes")#Une trace dans les logs.
     compteur1()#On reviens à la fonction principale.

          

#=============================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
Erreur=tk.StringVar(master=main_chrono)
erreur=tk.Label(main_chrono, textvariable=Erreur, fg="red", bg="white")
erreur.grid(row=4, column=5)
#Il s'agit du Label ou vas s'afficher le texte en cas d'erreurs.
#=============================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
Secondes_restant=tk.StringVar(master=main_chrono)
#=============================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
Champs=tk.Entry(main_chrono)
Champs.grid(row=3, column=6)
#L'entry qui sert a obtenir le nombre de secondes.
#=============================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
Nombre_Secondes=tk.Label(main_chrono, text="Entrer un nombre de seconde pour le minuteur.")
Nombre_Secondes.grid(row=3, column=5)
#Le labe qui précede l'entry.
#=============================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
nombres_secondes_restantes=tk.Label(main_chrono, textvariable=Secondes_restant)
nombres_secondes_restantes.grid(row=4, column=6)
#Le label ou vas s'afficher le nombre de secondes qui restent.
#=============================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================
BoutonValider=tk.Button(main_chrono, text='Valider', command=compteur )
BoutonValider.grid(row=4, column=8)
#Le bouton qui sert a executer la commande du minuteur par appel.
#=============================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================




main_chrono.mainloop()