import java.util.*;
public class Körperformen {
    public static final double PI = Math.PI;

    public static void main(String args[]) {
        //Variablen
        double Pi = Math.PI;
        double a = 0;
        double b = 0;
        double c = 0;
        double f = 0;
        int d = 0;
        int e = 0;

        //Inhaltsverzeichnis
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte Wälhen Sie eine From aus");
        System.out.println("Nr.1 Zylinder");
        System.out.println("Nr.2 Würfel");
        System.out.println("Nr.3 Quader");
        d = input.nextInt();

        switch (d) {
            case 1: //Zylinder
                System.out.println("Bitte wählen Sie die Oberfläche (1) oder das Volumen (2)");
                e = input.nextInt();
                    if (e == 1)
                    {//oberfläche
                        System.out.println("Bitte geben Sie die Höhe ein");
                        a = input.nextDouble();
                        System.out.println("Bitte gehen Sie den Radius ein");
                        b = input.nextDouble();
                        f = 2 * PI * b * b + a * 2 * Pi * b;
                        System.out.println("Die Oberfäche ist " + f + " groß");
                    }

                    if (e == 2) //volumen
                    {
                        System.out.println("Bitte geben Sie die Höhe ein");
                        a = input.nextDouble();
                        System.out.println("Bitte gehen Sie den Radius ein");
                        b = input.nextDouble();
                        f = Pi * b * b * a;
                        System.out.println("Das Voulumen ist " + f + " groß");
                    }
                    else
                    {
                        System.out.println("Bitte Wählen Sie eine From von der Liste");
                    }
                break;
            case 2: //Würfel
                System.out.println("Bitte wählen Sie die Oberfläche (1) oder das Volumen (2)");
                e = input.nextInt();
                    if (e == 1) //Oberfläche
                    {
                        System.out.println("Bitte gehen Sie die Kantenlänge ein");
                        a = input.nextDouble();
                        f = a * a * 6;
                        System.out.println("Die Oberfäche ist " + f + " groß");
                    }

                    if (e == 2)//Voulumen
                    {
                        System.out.println("Bitte gehen Sie die Kantenlänge ein");
                        a = input.nextDouble();
                        f = a* a * a;
                        System.out.println("Das Voulumen ist "+f+" groß");
                    }
                    else
                    {
                        System.out.println("Bitte Wählen Sie eine Form von der Liste");
                    }
                break;
            case 3: //Quader
                System.out.println("Bitte wählen Sie die Oberfäche (1) oder das Volumen (2)");
                e = input.nextInt();
                    if (e == 1) //Oberfläche
                    {
                        System.out.println("Bitte geben Sie die Kantenlänge a ein");
                        a = input.nextDouble();
                        System.out.println("Bitte geben Sie die Kantenlänge b ein");
                        b = input.nextDouble();
                        System.out.println("Bitte geben Sie die Kantenlänge c ein");
                        c = input.nextDouble();
                        f = a * b * 2 + b * c * 2 + b * c * 2;
                        System.out.println("Die Oberfläche ist "+f+" groß");
                    }
                    if (e == 2) //Voulumen
                    {
                        System.out.println("Bitte geben Sie die Kantenlänge a ein");
                        a = input.nextDouble();
                        System.out.println("Bitte geben Sie die Kantenlänge b ein");
                        b = input.nextDouble();
                        System.out.println("Bitte geben Sie die Kantenlänge c ein");
                        c = input.nextDouble();
                        f = a * b * c;
                        System.out.println("Das Voulumen ist "+f+" groß");
                    }
                    else
                    {
                        System.out.println("bitte wählen Sie eine Form von der Liste");
                    }

                break;
                    default: System.out.println("Bitte Wählen Sie eine From von der Liste");

        }
    }
}