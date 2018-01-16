import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.*;
public class Zahlinfo {
    public static void main(String args[]) {

        //Benutzereingabe
        Scanner input = new Scanner(System.in);
        int a = 0;
        System.out.println("Zu testende Zahl:    ");
        a = input.nextInt();

        //Programlogic
        if (a%2 == 0)
        {
            System.out.println("Eingegebene Zahl ist grade");
        }
        else {
            System.out.println("Eingegebene Zahl ist ungrade");
        }
        if (a == 0 )
        {
            System.out.println("und 0");
        }
        if (a > 0)
        {
            System.out.println("und größer als 0");
        }
        if (a < 0)
        {
            System.out.println("und kleiner als 0");
        }
    }
}