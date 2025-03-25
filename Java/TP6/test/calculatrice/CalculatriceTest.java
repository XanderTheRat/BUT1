package calculatrice;

import static org.junit.jupiter.api.Assertions.*;

import model.Calculatrice;
import org.junit.jupiter.api.Test;
import util.DivisionParZeroException;

class CalculatriceTest {
    @Test
    void doitAdditionnerDeuxEntiers() {
        Calculatrice calc = new Calculatrice();
        Integer nombre1 = 1;
        Integer nombre2 = 2;
        Integer resultat  = calc.additionner(nombre1, nombre2);
        assertEquals(3,resultat);
    }

    @Test
    void doitSoustraireDeuxEntiers() {
        Calculatrice calc = new Calculatrice();
        Integer nombre1 = 2;
        Integer nombre2 = 1;
        Integer resultat  = calc.soustraire(nombre1, nombre2);
        assertEquals(1,resultat);
    }

    @Test
    void doitMultiplierDeuxEntiers() {
        Calculatrice calc = new Calculatrice();
        Integer nombre1 = 2;
        Integer nombre2 = 1;
        Integer resultat  = calc.multiplier(nombre1, nombre2);
        assertEquals(2, resultat);
    }

    @Test
    void doitDivisionDeuxEntiers() throws DivisionParZeroException {
        Calculatrice calc = new Calculatrice();
        Integer nombre1 = 2;
        Integer nombre2 = 0;
        Integer resultat = calc.diviser(nombre1, nombre2);
        assertEquals(2, resultat);
    }
}