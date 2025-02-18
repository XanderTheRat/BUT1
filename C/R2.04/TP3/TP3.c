#include <stdio.h>

int main(void) {
    char *couleur[] = {"rouge", "vert", "bleu", "blanc", "noir", "orange", NULL};
    char **ptrCouleur = couleur;

    while (*ptrCouleur != NULL) {
        char *ptrChar = *ptrCouleur;
        while (*ptrChar != '\0') {
            printf("%c", *ptrChar);
            ptrChar++;
        }
        putchar('\n');
        ptrCouleur++;
    }

    return 0;
}