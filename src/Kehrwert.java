import java.util.*;
public class Kehrwert {
    public static void main(String args[]) {

        //Variablen
        double a = 0;
        Scanner input = new Scanner(System.in);

        //Benutzereingabe
        System.out.println("Kehrwertberechnung");
        System.out.println("Eingabe: ");
        a = input.nextDouble();

        //Programlogic
        if (a != 0) {
            a = 1 / a;
            System.out.println("Ergebnis: " + a);
        } else {
            System.out.println("Nicht möglich");
        }


    }
}

