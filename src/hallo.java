import java.util.*;
public class hallo {
    public static void main(String[] args) {            /*
        System.out.println(22);
        System.out.println("zweiundzwanzig");
        System.out.println("zwei"+"und"+ "zwanzig");
        System.out.println(2+"und"+20);
        System.out.println(20+2);
        System.out.println();                           */

        Scanner input = new Scanner(System.in);
        double a = 0;
        System.out.println("Eingabe Zahl 1");
        a = input.nextInt();
        System.out.println("Zahl 1: "+a);
        double b = 0;
        System.out.println("Eingabe Zahl 2");
        b = input.nextInt();
        System.out.println("Zahl 2: "+b);
        double c = a/b;

        System.out.println("Das Ergebnis ist "+c);
    }
}
