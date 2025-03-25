package fizzbuzz;

public class FizzBuzz {
    public String jouer(int nombre) {
        if (nombre % 15 == 0) {
            return "FizzBuzz";
        }
        if (nombre % 3 == 0) {
            return "Fizz";
        }
        if (nombre % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(nombre);
    }
}
