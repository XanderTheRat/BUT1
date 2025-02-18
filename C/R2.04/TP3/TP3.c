#include <stdio.h>
void AfficherCouleur(void) {
    char *couleur[] = {"rouge", "vert", "bleu", "blanc", "noir", "orange", NULL};
    char **ptrCouleur = couleur;
    char *ptrChar;

    while (*ptrCouleur != NULL) {
        *ptrChar = *ptrCouleur;
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
    char *ptrChar;

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
int main(void) {
    char *couleur[] = {"rouge", "vert", "bleu", "blanc", "noir", "orange", NULL};
    AfficherCouleurSansPourcentS(couleur);
    return 0;
}