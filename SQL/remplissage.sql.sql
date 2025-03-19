-- Table Plateforme
INSERT INTO Plateforme (plateforme)
SELECT DISTINCT plateforme
FROM ventes;

-- Table Editeur
INSERT INTO Editeur (publisher)
SELECT DISTINCT publisher
FROM ventes;

-- Table Genres
INSERT INTO Genre (genre)
SELECT DISTINCT genre
FROM ventes;

-- Table Jeu
INSERT INTO Jeu (rang, nom, annee, ventes_EU, nb_ventes, ventes_JP, autres_ventes, ID_Editeur, ID_Genre, ID_Plateforme)
SELECT 
    v.rang,
    v.nom,
    v.annee,
    v.ventes_EU,
    v.nb_ventes,
    v.ventes_JP,
    v.autres_ventes,
    e.ID_Editeur,
    g.ID_Genre,
    p.ID_Plateforme
FROM ventes v
INNER JOIN Editeur e ON v.publisher = e.publisher
INNER JOIN Genre g ON v.genre = g.genre
INNER JOIN Plateforme p ON v.plateforme = p.plateforme;


