-- Exo 1 :
SELECT plateforme AS Plateforme
FROM (
    SELECT p.plateforme, SUM(j.ventes_EU) AS ventesEU
    FROM Jeu j
    INNER JOIN Plateforme p ON j.ID_Plateforme = p.ID_Plateforme
    WHERE j.annee >= 2010
    GROUP BY p.plateforme
) AS sous_requete
WHERE ventesEU > 20
ORDER BY ventesEU DESC;

-- Exo 2
SELECT publisher
FROM Jeu j
INNER JOIN Plateforme p ON j.ID_Plateforme = p.ID_Plateforme
INNER JOIN Editeur e ON j.ID_Editeur = e.ID_Editeur
WHERE p.plateforme = 'PS4' 
  AND j.ventes_EU > 2
ORDER BY j.ventes_EU DESC;


