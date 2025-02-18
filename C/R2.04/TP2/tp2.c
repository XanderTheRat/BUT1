#include <stdio.h>

void CopieChaine(char *dest, char *src) {
    char *p = src;
    char *q = dest;

    while (*p != '\0') {
        *q = *p;
        p++;
        q++;
    }
    *q= '\0';
}

void FonctionPointeur() {
    char str[100];
    char str2[100];
    char str3[100];
    char *p = str;
    char *p2 = str2;
    char *p3 = str3;

    printf("Entrer vos deux chaines : \n");
    gets(str);
    gets(str2);

    while (*p != '\0') {
        *p3 = *p;
        p++;
        p3++;
    }
    *p3 = '\0';
    printf("Str3 avant concatenation :\n%s\n", str3);
    printf("\n");


    while (*p2 != '\0') {
        *p3 = *p2;
        *p3++;
        *p2++;
    }
    *p3 = '\0';

    printf("Str3 apres concatenation : \n%s", str3);
    printf("\n");
}

void ToMaj() {
  char str[100];
  char strMAJ[100];
  char *p = str;
  char *p2 = strMAJ;

  printf("Veuillez saisir votre chaine : \n");
  scanf("%s",&str);


  while (*p) {
    if (*p >= 97 && *p <= 122) {
      *p2 = *p - 32;
    }
    p++;
    p2++;
  }
  *p2 = '\0';
  printf("%s\n", strMAJ);
}

int main(void) {
    int choix;
    char chaine[150];
    char *pointeur = chaine;

    printf("Quelle fonction souhaitez vous lancer ?");
    scanf("%d",&choix);
    switch (choix) {
        case 1 : FonctionPointeur();
        break;
        case 2 :ToMaj();
        break;
        default: printf("Vous quittez.");
        break;

    }
    printf("\n");
    printf("--------------------------------------------------------------\n");

    return 0;
}

