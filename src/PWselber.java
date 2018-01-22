// import org.omg.Messaging.SYNC_WITH_TRANSPORT;


// Hallööööle LUKAS :D


import java.util.*;

public class PWselber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int Hauptmenü = 1;                  //Programlogic
        int random = 0;                                     //teoretisch überflüssig aber übersichtlicher
        String String = "";
        int lauflänge = 0;
        boolean secret = false;
        String Zeichen [] = new String[91];             //String für Beispiele
        int VersuchNR = 1;

        int länge = 7;     //vorgaben                             //PW ist eine stelle länger als da steht
        int Buchstabenanz = 2;
        int zahlen = 1;
        int grb = 1;
        int klb = 1;
        int sonder = 1;

        int isbuchstabe = 0;        //überprüfen
        int iszahl = 0;
        int isgbr = 0;
        int isklb = 0;
        int issonder = 0;

        boolean triggerhappy = false;           //random stuff

        Zeichen[0] = "a";                               //Zeichen anfang
        Zeichen[1] = "b";
        Zeichen[2] = "c";
        Zeichen[3] = "d";
        Zeichen[4] = "e";
        Zeichen[5] = "f";
        Zeichen[6] = "g";
        Zeichen[7] = "h";
        Zeichen[8] = "i";
        Zeichen[9] = "j";
        Zeichen[10] = "k";
        Zeichen[11] = "l";
        Zeichen[12] = "m";
        Zeichen[13] = "n";
        Zeichen[14] = "o";
        Zeichen[15] = "p";
        Zeichen[16] = "q";
        Zeichen[17] = "r";
        Zeichen[18] = "s";
        Zeichen[19] = "t";
        Zeichen[20] = "u";
        Zeichen[21] = "v";
        Zeichen[22] = "w";
        Zeichen[23] = "x";
        Zeichen[24] = "y";
        Zeichen[25] = "z";
        Zeichen[26] = "A";
        Zeichen[27] = "B";
        Zeichen[28] = "C";
        Zeichen[29] = "D";
        Zeichen[30] = "E";
        Zeichen[31] = "F";
        Zeichen[32] = "G";
        Zeichen[33] = "H";
        Zeichen[34] = "I";
        Zeichen[35] = "J";
        Zeichen[36] = "K";
        Zeichen[37] = "L";
        Zeichen[38] = "M";
        Zeichen[39] = "N";
        Zeichen[40] = "O";
        Zeichen[41] = "P";
        Zeichen[42] = "Q";
        Zeichen[43] = "R";
        Zeichen[44] = "S";
        Zeichen[45] = "T";
        Zeichen[46] = "U";
        Zeichen[47] = "V";
        Zeichen[48] = "W";
        Zeichen[49] = "X";
        Zeichen[50] = "Y";
        Zeichen[51] = "Z";
        Zeichen[52] = "0";
        Zeichen[53] = "1";
        Zeichen[54] = "2";
        Zeichen[55] = "3";
        Zeichen[56] = "4";
        Zeichen[57] = "5";
        Zeichen[58] = "6";
        Zeichen[59] = "7";
        Zeichen[60] = "8";
        Zeichen[61] = "9";
        Zeichen[62] = "!";
        Zeichen[63] = " ";
        Zeichen[64] = "§";
        Zeichen[65] = "%";
        Zeichen[66] = "&";
        Zeichen[67] = "/";
        Zeichen[68] = "(";
        Zeichen[69] = ")";
        Zeichen[70] = "=";
        Zeichen[71] = "?";
        Zeichen[72] = "ß";
        Zeichen[73] = "9";
        Zeichen[74] = "[";
        Zeichen[75] = "]";
        Zeichen[76] = "}";
        Zeichen[77] = "<";
        Zeichen[78] = ">";
        Zeichen[79] = "^";
        Zeichen[80] = "°";
        Zeichen[81] = "#";
        Zeichen[82] = "+";
        Zeichen[83] = "*";
        Zeichen[84] = "~";
        Zeichen[85] = ",";
        Zeichen[86] = ";";
        Zeichen[87] = ".";
        Zeichen[88] = ":";
        Zeichen[89] = "-";
        Zeichen[90] = "_";                                      //Zeichen ende


        while (Hauptmenü != 0) {

            System.out.println("\n" + "\n" + "Passwort Generator");       //Menü
            System.out.println("(0) Beenden");
            System.out.println("(1) Standartvorgaben");
            System.out.println("(2) Eigentevorgaben");
            Hauptmenü = input.nextInt();

            switch (Hauptmenü) {
                case 9:
                    secret = true;
                case 2:
                    System.out.println("Länge des Passworts");
                    länge = input.nextInt();
                    länge -= 1;                                                 //kein wirklicher fix aber so geht es
                    System.out.println("Mindest Anzahl der Buchstaben");
                    Buchstabenanz = input.nextInt();
                    System.out.println("Mindest Anahl der Zahlen");
                    zahlen = input.nextInt();
                    System.out.println("Mindest Anzahl der Großbuchstaben");
                    grb = input.nextInt();
                    System.out.println("Mindest Anzahl der Kleinbuchstabebn");
                    klb = input.nextInt();
                    System.out.println("Mindest Anzahl der Sonderzeichen");
                    sonder = input.nextInt();
                    break;
                default:
                    System.out.println("Falsche Eingabe");
                    break;
            }
            if (Hauptmenü == 1 || Hauptmenü == 2 || Hauptmenü == 2 || Hauptmenü == 9) {                  //wann darf generirt werden?
                if (grb + klb > Buchstabenanz) {
                    System.out.println("mehr Buchstaben als Buchstaben?");
                }
                if (Buchstabenanz + zahlen + sonder > 0.7 * länge || zahlen > 0.4 * länge) {
                    System.out.println("Bitte relativ zur Länge weniger Vorgaben machen");
                    if (länge == -1) {
                        System.out.println("Länge 0?");
                        if (triggerhappy == true) {
                            System.out.print("-> Cya");
                            System.exit(0);
                        }
                        triggerhappy = true;
                    }
                } else {

                    System.out.println("Ihr Passwort wird jetzt generirt");
                    System.out.println("abhänig von den Eistellung kann es länger dauern");

                    while (String.length() <= länge) {

                        random = new Random().nextInt(91);
                        String += Zeichen[random];                     //Pw bauen

                        if (secret == true) {                                                   // mode 9
                            System.out.println("-----------" + random);
                            System.out.println(String);
                        }

                        if (String.length() == länge) {                                                   //zählen, was im fertigen PW ist

                            VersuchNR++;

                            while (lauflänge < String.length()) {
                                if (Character.isLetter(String.charAt(lauflänge))) {
                                    isbuchstabe++;
                                }
                                if (Character.isDigit(String.charAt(lauflänge))) {
                                    iszahl++;
                                }
                                if (Character.isUpperCase(String.charAt(lauflänge))) {
                                    isgbr++;
                                }
                                if (Character.isLowerCase(String.charAt(lauflänge))) {
                                    isklb++;
                                } else {
                                    issonder++;
                                }
                                lauflänge++;
                            }

                            if (isbuchstabe < Buchstabenanz || iszahl < zahlen || isgbr < grb || isklb < klb || issonder < sonder) {         //was drin ist mit vorgaben vergleichen
                                String = "";
                                lauflänge = 0;
                                isbuchstabe = 0;
                                iszahl = 0;
                                isgbr = 0;
                                isklb = 0;
                                issonder = 0;
                            }
                        }
                    }
                    System.out.println("Passwort beim " + VersuchNR + "ten Versuch gefunden:");
                    System.out.println(String);
                    String = "";

                }
            }


        }
    }
}
