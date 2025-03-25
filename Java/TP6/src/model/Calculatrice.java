package model;

import util.DivisionParZeroException;

public class Calculatrice {
    public Calculatrice() {}

    public Integer additionner(Integer int1, Integer int2) {
        return int1 + int2;
    }

    public Integer soustraire(Integer int1, Integer int2) {
        return int1 - int2;
    }

    public Integer multiplier(Integer int1, Integer int2) {
        return int1 * int2;
    }

    public Integer diviser(Integer int1, Integer int2) throws DivisionParZeroException {
        if(int2 == 0) {
            throw new DivisionParZeroException("Division impossible car le diviseur est égal à 0 !");
        }
        return int1 / int2;
    }
}
