CREATE TABLE Plateforme (
    ID_Plateforme INT AUTO_INCREMENT PRIMARY KEY,
    plateforme VARCHAR(20)
);

CREATE TABLE Editeur (
    ID_Editeur INT AUTO_INCREMENT PRIMARY KEY,
    publisher VARCHAR(50)
);

CREATE TABLE Genre (
    ID_Genre INT AUTO_INCREMENT PRIMARY KEY,
    genre VARCHAR(20)
);


CREATE TABLE Jeu (
    rang INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    annee YEAR,
    ventes_EU FLOAT,
    nb_ventes FLOAT,
    ventes_JP FLOAT,
    autres_ventes FLOAT,
    ventes_global FLOAT,
    ID_Editeur INT,
    ID_Genre INT,
    ID_Plateforme INT,
    CONSTRAINT FK_Plateforme FOREIGN KEY (ID_Plateforme) REFERENCES Plateforme(ID_Plateforme),
    CONSTRAINT FK_Editeur FOREIGN KEY (ID_Editeur) REFERENCES Editeur(ID_Editeur),
    CONSTRAINT FK_Genre FOREIGN KEY (ID_Genre) REFERENCES Genre(ID_Genre)
);




