package util;

import java.util.concurrent.TimeoutException;

@SuppressWarnings("serial")
public class DivisionParZeroException extends Exception {
    public DivisionParZeroException(String message) {
        super(message);
    }

    public void divisionParZero(Integer diviseur) throws DivisionParZeroException {
        if(diviseur == 0) {
            throw new DivisionParZeroException("Division impossible car le diviseur est égal à 0 !");
        }
    }
}
