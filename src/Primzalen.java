import java.util.*;
public class Primzalen {
    public static void main(String args[])
    {
        //Variablen
        double a = 0;
        double i = 0;
        double c = 0;
        double d = 1;
        double e = 1;

        //input
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine mögliche Primzahl an");
        a = input.nextDouble();

        //logic
        while (i * i <= a)
        {
            i = i + 1;
            c = a / i;

            while ((d != 0 && e < a)) //testet ob c eiue ganze zahl ist
            {
               d = c - e;
               e = e + 1;
            }
        }
        if (d == 0 - 1)
        {
            System.out.println(a + " ist eine Primzahl");
        }
        else
        {
            System.out.println(a + " ist keine Primzahl");
        }


    }
}
