CREATE DATABASE VGSale;
CREATE TABLE sales(
    rang SMALLINT PRIMARY KEY,
    nom VARCHAR(50) NOT NULL,
    plateform VARCHAR(12) NULL,
    annee YEAR,
    genre VARCHAR(12),
    publisher VARCHAR(20) NOT NULL,
    NA_SALE FLOAT,
    EU_SALE FLOAT,
    JP_SALE FLOAT,
    Other_SALE FLOAT,
    Global_SALE FLOAT,
);