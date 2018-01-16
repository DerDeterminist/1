import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.*;
public class RechnerSelber {
    public static void main(String args[]) {
        //Variablen deklarieren
        double a = 0;   //Eingabe 1
        double b = 0;   //Eingabe 2
        double c = 0;   //Ergebnis das erste
        double d = 0;   //Ergebnis RAMMMM
        int y = 0;      //direkt Rechnen? ja/nein
        int x = 0;      //weiter Rechnen?
        int z = 0;      //welche Rechenart?


        //Inhaltsverzeichnis
        Scanner input = new Scanner(System.in);
        System.out.println("1  um Befehle einzusehen");
        System.out.println("2  um zu rechnen");
        System.out.println("3  um das rechnen zu beenden");
        y = input.nextInt();

        //Programlogic
        if (y == 1)
        {
            //Liste der Rechenoperationen
            System.out.println("Nummer der Rechenart:                                          Komentare:");
            System.out.println("Nr.1   +                                                        ");
            System.out.println("Nr.2   -                                                        ");
            System.out.println("Nr.3   *                                                        ");
            System.out.println("Nr.4   /                                                        ");
            System.out.println("Nr.5  (Zahl 1)^2                                               Die Eingabe bei Zahl 2 ist irelevant");
        }

        if (y == 2 || y == 1)
        {
            //Input
            System.out.println("Nummer Der Rechenart:  ");
            z = input.nextInt();
            System.out.println("Zahl 1:");
            a = input.nextDouble();
            System.out.println("Zahl 2:");
            b = input.nextDouble();

            //Rechnung
            switch (z) {
                case 1:
                    c = a + b;
                    break;
                case 2:
                    c = a - b;
                    break;
                case 3:
                    c = a * b;
                    break;
                case 4:
                    c = a / b;
                    break;
                case 5:
                    c = a * a;
                    break;
                default:
                    System.out.println("Bitte eine Rechenart aus der Liste auswählen");
            }

            System.out.println("Ergebinis: " + c);
        }
        if (y == 3)
        {
            System.out.println("Wurde beendet");
        }
        else
        {
            System.out.println("Biite geben Sie eine Zahl von der Liste ein");
        }


        if (y == 1 || y == 2) //weiterrechnen
        {

            System.out.println("1 um weiter zu rechenen");
            System.out.println("2 um das rechenen zu beenden");
            x = input.nextInt();
            d = c;                  //swichvorbereitung

            if (x == 2)
            {
                System.out.println("Wurde beendet");
            }

            while (x == 1 || x== 3)  //Schleife zum weiterrechen
            {
                //Inhaltsverzeichnis die 2.
                System.out.println("1  um Befehle einzusehen");
                System.out.println("2  um zu rechnen");
                System.out.println("3  um das rechen zu beenden");
                y = input.nextInt();

                //Programlogic die 2.
                if (y == 1) {
                    //Liste der Rechenoperationen die 2.
                    System.out.println("Nummer der Rechenart:                                          Komentare:");
                    System.out.println("Nr.1   +                                                       ");
                    System.out.println("Nr.2   -                                                       ");
                    System.out.println("Nr.3   *                                                       ");
                    System.out.println("Nr.4   /                                                       ");
                    System.out.println("Nr.5  (letztes Ergebmis)^2                                     ");
                }

                if (y == 2 || y == 1) {
                    //Input der 2.
                    System.out.println("Nummer Der Rechenart:  ");
                    z = input.nextInt();
                    System.out.println("Zahl 1:");
                    b = input.nextDouble();

                    //Rechnung die 2.
                    switch (z) {
                        case 1:
                            d = c + b;
                            break;
                        case 2:
                            d = c - b;
                            break;
                        case 3:
                            d = c * b;
                            break;
                        case 4:
                            d = c / b;
                            break;
                        case 5:
                            d = c * c;
                            break;
                        default:
                            System.out.println("Bitte eine Rechenart aus der Liste auswählen");
                    }
                    x = 0;
                    System.out.println("Ergebinis: " + d);
                    System.out.println("1 um weiter zu rechen");
                    System.out.println("2 um die Rechnung zu beenden");
                    System.out.println("3 um das letze Ergebis zu löschen");
                    x = input.nextInt();

                    if (x == 3) //ergebnis löschen
                    {
                        d = c;
                        System.out.println("Zurückgestes Ergebnis "+d);
                    }
                    c = d;      //switch

                }
                if (y == 3) {
                    System.out.println("Wurde beendet");
                } else {
                    System.out.println("Bitte geben Sie eine Zahl von der Liste ein");
                }

                //Switch rechnung
                if (x == 1)
                {
                    //Inhaltsverzeichnis die 3.
                    System.out.println("1  um Befehle einzusehen");
                    System.out.println("2  um zu rechnen");
                    System.out.println("3  um das rechen zu beenden");
                    y = input.nextInt();


                    if (y == 1)
                    {
                    //Liste der Rechenoperationen die 3.
                    System.out.println("Nummer der Rechenart:                                          Komentare:");
                    System.out.println("Nr.1   +                                                       ");
                    System.out.println("Nr.2   -                                                       ");
                    System.out.println("Nr.3   *                                                       ");
                    System.out.println("Nr.4   /                                                       ");
                    System.out.println("Nr.5  (letztes Ergebmis)^2                                     ");
                   }

                    if (y == 2 || y == 1)
                    {
                        //Input der 2.
                        System.out.println("Nummer Der Rechenart:  ");
                        z = input.nextInt();
                        System.out.println("Zahl 1:");
                        b = input.nextDouble();

                        //Rechnung die 3.
                        switch (z) {
                            case 1:
                                d = c + b;
                                break;
                            case 2:
                                d = c - b;
                                break;
                            case 3:
                                d = c * b;
                                break;
                            case 4:
                                d = c / b;
                                break;
                            case 5:
                                d = c * c;
                                break;
                            default:
                                System.out.println("Bitte eine Rechenart aus der Liste auswählen");
                        }
                        x = 0;
                        System.out.println("Ergebinis: " + d);
                        System.out.println("1 um weiter zu rechen");
                        System.out.println("2 um die Rechnung zu beenden");
                        System.out.println("3 um das letze Ergebnis zu löschen");
                        x = input.nextInt();

                        if (x == 3)//ergebis "löschen"
                        {
                               d = c;
                               System.out.println("Zurückgestetes Ergebnis "+d);
                        }
                        c = d;      //switch
                    }
                    if (y == 3)
                    {
                        System.out.println("wurde beendet");
                    }
                    else
                        {
                            System.out.println("Bitte geben Sie eine Nummer von der Liste ein");
                        }
                }
                else
                {
                    System.out.println("wurde beendet");
                }
            }
        }
    }
}