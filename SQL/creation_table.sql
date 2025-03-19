CREATE DATABASE vgsale;
CREATE TABLE ventes(
    rang SMALLINT PRIMARY KEY,
    nom VARCHAR(255),
    plateforme VARCHAR(20),
    annee YEAR,
    genre VARCHAR(20),
    publisher VARCHAR(50),
    nb_ventes FLOAT,
    ventes_EU FLOAT,
    ventes_JP FLOAT,
    autres_ventes FLOAT,
    ventes_global FLOAT
)
