import java.util.*;
public class Bestell2 {
    public static void main(String args[]) {


        //Variablen dekariren
        double a = 0;
        double b = 0;

        //input + logic
        Scanner input = new Scanner(System.in);
        System.out.println("Berechnung des Rechnungsbetrags");
        System.out.println("Aufgragssumme in Euro:");
        a = input.nextDouble();
        if (a < 100)
        {
            b = a + 5.5;
        }
        if (a > 250)
        {
            b = a;
        }
        if (a >= 100 && a <= 250)
        {
            b = a + 3;
        }

        System.out.println("Rechnungsbetrag: "+b+" Euro");
        System.out.println("Programende Bestell2");
    }
}
