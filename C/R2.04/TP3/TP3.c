#include <stdio.h>

int main(void) {
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

    return 0;
}