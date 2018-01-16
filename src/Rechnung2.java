import java.util.*;
public class Rechnung2{
    public static void main(String [] args) {
        System.out.println("Berechnung des Rechnungsbetrages");
        double Preis = 0;
        System.out.println("Bestellwert in Euro");
        Scanner input = new Scanner(System.in);
        Preis = input.nextDouble();
        if (Preis < 200) {
            System.out.println("Versandkostenoauschale  5,5€");
            Preis = Preis + 5.5;
        }
        System.out.println("Bestellbetrag: " + Preis);
        System.out.println("Programende Bestell.");
    }}
