#include <stdio.h>
void exo1(void) {
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

void exo2(char *couleur[]) {
    char **ptrCouleur = couleur;

    while (*ptrCouleur != NULL) {
        printf("%s\n", *ptrCouleur + 1);
        ptrCouleur++;
    }
}

void exo3(char *couleur[]) {
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

int main(void) {
    char *couleur[] = {"rouge", "vert", "bleu", "blanc", "noir", "orange", NULL};
    exo3(couleur);
    return 0;
}