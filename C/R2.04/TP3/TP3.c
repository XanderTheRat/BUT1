#include <stdio.h>
void AfficherCouleur(void) {
    char *couleur[] = {"rouge", "vert", "bleu", "blanc", "noir", "orange", NULL};
    char **ptrCouleur = couleur;
    char *ptrChar;

    while (*ptrCouleur != NULL) {
        *ptrChar = **ptrCouleur;
        while (*ptrChar != '\0') {
            printf("%c", *ptrChar);
            ptrChar++;
        }
        putchar('\n');
        ptrCouleur++;
    }
}

void AfficherCouleurSansLaPremiereLettre(char *couleur[]) {
    char **ptrCouleur = couleur;

    while (*ptrCouleur != NULL) {
        printf("%s\n", *ptrCouleur + 1);
        ptrCouleur++;
    }
}

void AfficherCouleurEnMaj(char *couleur[]) {
    char **ptrCouleur = couleur;
    char *ptrChar;

    while (*ptrCouleur != NULL) {
        ptrChar = *ptrCouleur;
        while (*ptrChar != '\0') {
            if (*ptrChar >= 'a' && *ptrChar <= 'z') {
                printf("%c", *ptrChar - 32);
            }
            ptrChar++;
        }
        printf("\n");
        ptrCouleur++;
    }
}

void AfficherCouleurSansPourcentS(char *couleur[]) {
    char **ptrCouleur = couleur;
    char *ptrChar = NULL; //Attribution d'une valeur pour la qualité de code. Ici, cela ne sert à rien.

    while (*ptrCouleur != NULL) {
        ptrChar = *ptrCouleur;
        while (*ptrChar != '\0') {
            if (*ptrChar >= 'a' && *ptrChar <= 'z') {
                printf("%c", *ptrChar);
            }
            ptrChar++;
        }
        printf("\n");
        ptrCouleur++;
    }
}

void exo2(char *p[6]) {
    int i = 0;

    while (p[i] != NULL) {
        i++;
    }

    for (i = i - 1; i >= 0; i--) {
        printf("%s\n", p[i]);
    }
}

int main(void) {
    int choix;
    char *couleur[] = {"rouge", "vert", "bleu", "blanc", "noir", "orange", NULL};
    char *p[6] = {"ABC", "DEFGH", "IJKLM", "NOPQRS", "TUV", NULL};

    printf("Quelle fonction souhaitez vous lancer ?");
    scanf("%d",&choix);
    switch (choix) {
        case 1 :
            printf("L'exercice 1 ne marche pas !\n");
            break;
        case 2 :
            AfficherCouleurSansLaPremiereLettre(couleur);
            break;
        case 3 :
            AfficherCouleurEnMaj(couleur);
            break;
        case 4 :
            AfficherCouleurSansPourcentS(couleur);
            break;
        case 5 :
            exo2(p);
            break;
        default: printf("Vous quittez.");
        break;

    }
    printf("\n");
    printf("--------------------------------------------------------------\n");
    return 0;
}