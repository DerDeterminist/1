import java.util. *;
public class Grenzwert {
    public static void main(String args[]) {

        //Variablen
        int a = 0;
        int b = 0;
        int c = 0;

        Scanner input = new Scanner(System.in);

        //input
        System.out.println("Bitte gehen Sie einen Grenzwert an");
        a = input.nextInt();

        //logic
        while (c + 1 <= a)
        {
            b = b + 1;
            c = c + b;
        }


        //output
        System.out.println("Grenzwert: "+a);
        System.out.println("Nach "+b+" Schritten ist der Grenzwert errreicht.");
        System.out.println("Die Summe ist: "+c);

    }
}
