# include <stdio.h>

int main(void) {
    char *couleur[] = {"rouge", "vert", "bleu", "blanc", "noir", "orange", NULL};
    int numCouleur;
    char *charCompteur = couleur;

    while (charCompteur != NULL) {
        numCouleur = 0;
        while (charCompteur[numCouleur] != '\0') {
            printf("%c", charCompteur[numCouleur]);
            numCouleur++;
        }
    printf("\n");
    charCompteur++;
    }
}