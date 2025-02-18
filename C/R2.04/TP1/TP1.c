# include <stdio.h>


int convertion() {
  int nombre;

  printf("Veuillez rentrer un nombre entier: \n");
  scanf("%d", &nombre);

    printf("Votre nombre est : %d.\n", nombre);
    printf("%d + 1 en decimal : %d\n", nombre, nombre + 1);
    printf("%d + 1 en octale : %o\n", nombre, nombre+1);
    printf("%d + 1 en hexadecimal : %x\n", nombre, nombre + 1);

    return 0;
 }
int estPlusGrand() {
    int a;
    int b;

    printf("\nVeuillez saisir la premiere valeur : ");
    scanf("%d", &a);
    printf("\nVeuillez saisir la deuxieme valeur : ");
    scanf("%d", &b);

    if (a>b) {
        printf("a > b\n");
        printf("%d > %d", a, b);
    }
    else {
        if (a<b) {
            printf("a < b\n");
            printf("%d < %d",a, b);
        }
        else {
            printf("a = b = %d", a);
        }
    }

    return 0;
}

int tableauDeNombre() {
    int tab[10];
    int valInt;
    int compteur;

    printf("Nous allons vous demander de rentrer 10 nombres. ");
    for (compteur = 0; compteur < 10; compteur++){
        printf("\nVeuillez rentrer un nombre : ");
        scanf("%d", &tab[compteur]);
        //* = &valInt;
    }

    printf("Votre tableau de valeur : [");
    for (compteur = 0; compteur < 9; compteur++) {
        printf("%d, ", tab [compteur]);
    }
    printf("%d]\n", tab[9]);
    printf("Leurs adresses respectivements : [");
    for (compteur = 0; compteur < 9; compteur++) {
        printf("%x, ", &tab[compteur]);
    }
    printf("%x]\n", &tab[9]);

    return 0;
}

int programmeC() {
    char str[81] = "ABCDEF";
    char *p;

    p = str;

    *p = 'X';
    p++;
    *p='Y';
    *(p+2) = 'Z';
    printf("%s\n", str);
    printf("%s\n", &str[1]);

    printf("%s\n", p);
    printf("%s\n", p+1);
    printf("%s\n", p-1);
    printf("%d\n", p-str);

    return 0;
}

int Calcul_Longueur_TAB() {
    int longueur = 0;
    char str;
    char chaine[1000000];

    printf("Saisir une chaine de caractere :\n");
    scanf("%s", &chaine);

    while (chaine[longueur] != '\0') {
        longueur++;
    }

    printf("La longueur de la chaine : %d", longueur);
    return 0;
}

int Calcul_Longueur_P() {
    int longueur = 0;
    char str[1000000];
    char *p;
    printf("Saisir une chaine de caractere :\n");
    scanf("%s", &str);

    while (*p != '\0') {
        longueur++;
        p++;
    }

    printf("La longueur de la chaine : %d", longueur);
    return 0;
}

int main() {
    // convertion();
    // estPlusGrand();
    //tableauDeNombre();
    //programmeC();
    //Calcul_Longueur_TAB();
    Calcul_Longueur_P();
}