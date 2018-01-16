import java.io.*;
import java.util.*;
public class RechnerSelber2{


    public static double Rechner() {               //Recher
        Scanner input = new Scanner(System.in);

        //Variablen deklariren
        int Rechnerloop = 1; //läst rechner weiter laufen
        int Rechenart = 0; //Rechenart
        double Z1 = 0;
        double Z2 = 0;
        long Z3 = 0;

        double Ergebnis [] = new double[100];                //Rammmm neu
        int speicherzeiger = 0;



        //Konsole
        System.out.println("\n" + "Rechner"+"\n");
        System.out.println("Bitte wählen Sie die Nummer einer Rechenart"+"\n");                                                  //ändern wenn neu
        System.out.println("(0) Rechner beenden");
        System.out.println("(1) +");
        System.out.println("(2) -");
        System.out.println("(3) *");
        System.out.println("(4) /");
        System.out.println("(5) Potenz");
        System.out.println("(&) Wurzel");
        System.out.println("(7) Fakultät");
        System.out.println("(8) Betrag");
        System.out.println("(9) Runden");
        System.out.println("(10) Aufrunden");
        System.out.println("(11) Abrunden");
        System.out.println("(20) trigonometrische Funktionenen");
        Rechenart = input.nextInt();
        if (Rechenart == 20){
            System.out.println("(21) Sinus");
            System.out.println("(22) Cosinus");
            System.out.println("(23) Tangens");
            System.out.println("(24) Arcus Sinus");
            System.out.println("(25) Arcus Cosinus");
            System.out.println("(26) Arcus Tangens");
            System.out.println("(27) Sinus Hyperbolicus");
            System.out.println("(28) Cosinus Hyperbolicus");
            Rechenart = input.nextInt();
        }

        Rechenart = Rechenart * 100;       //Rechenart codiren

        if (Rechenart == 0){                //Rechner im 1. Menü beenden
            System.out.println("\n"+"\n"+"\n"+"Rechner wurde beendet"+"\n"+"\n"+"\n"+"\n"+"\n");
            return 0;
        }


        while (Rechnerloop == 1) {

                    Z3 = 0;               //Variablen zurücksetzen

            switch (Rechenart) {           //Recher
                case 100:                                    //Summe 1                                                                            //ändern wenn neu
                    System.out.println("1. Summand");
                    Z1 = input.nextDouble();
                    System.out.println("2.Summand");
                    Z2 = input.nextDouble();
                    Ergebnis[0] = Z1 + Z2;
                    break;
                case 200:                                   //differenz 1
                    System.out.println("1. Minuend");
                    Z1 = input.nextDouble();
                    System.out.println("2.Subtrahend");
                    Z2 = input.nextDouble();
                    Ergebnis[0] = Z1 - Z2;
                    break;
                case 300:                                   //Produkt 1
                    System.out.println("1.Faktor");
                    Z1 = input.nextDouble();
                    System.out.println("2.Faktor");
                    Z2 = input.nextDouble();
                    Ergebnis[0] = Z1 * Z2;
                    break;
                case 400:                                   //Quotient 1
                    System.out.println("Dividend");
                    Z1 = input.nextDouble();
                    System.out.println("Divisor");
                    Z2 = input.nextDouble();
                    Ergebnis[0] = Z1 / Z2;
                    break;
                case 500:                                   //exponent 1
                    System.out.println("Basis");
                    Z1 = input.nextDouble();
                    System.out.println("Exponent");
                    Z2 = input.nextDouble();
                    Ergebnis[0] = Math.pow(Z1,Z2);
                    break;
                case 600:                                   //Wurzel 1
                    System.out.println("Radikand");
                    Z1 = input.nextDouble();
                    System.out.println("Wurzelexponent");
                    Z2 = input.nextDouble();
                    Ergebnis[0] = Math.pow(Z1,(1/Z2));
                    break;
                case 700:                                   //fakultät 1
                    System.out.println("Variable");
                    Z3 = input.nextLong();
                    if (Z3 >= 0){
                        Ergebnis[0] = Ergebnis[0] +1;
                        while ( Z3 > 1){
                            Ergebnis[0] = Ergebnis[0] * Z3;
                            Z3 = Z3 -1;
                        }
                    }
                    break;
                case 800:                                   //Betrag 1
                    System.out.println("Variable");
                    Z1 = input.nextDouble();
                    Ergebnis[0] = Math.abs(Z1);
                    break;
                case 900:
                    System.out.println("Variable");         //kaufmänisches runden 1
                    Z1 = input.nextDouble();
                    Ergebnis[0] = Math.round(Z1);
                    break;
                case 1000:
                    System.out.println("Variable");         //aufrunden 1
                    Z1 = input.nextDouble();
                    Ergebnis[0] = Math.ceil(Z1);
                    break;
                case 1100:
                    System.out.println("Variable");         //abrunden 1
                    Z1 = input.nextDouble();
                    Ergebnis[0] = Math.floor(Z1);
                    break;
                case 2100:                                   //Sinus 1
                    System.out.println("Variable");
                    Z1 = input.nextDouble();
                    Ergebnis[0] = Math.sin(Z1);
                    break;
                case 2200:                                   //Cosinus 1
                    System.out.println("Variable");
                    Z1 = input.nextDouble();
                    Ergebnis[0] = Math.cos(Z1);
                    break;
                case 2300:                                  //Tangens 1
                    System.out.println("Variable");
                    Z1 = input.nextDouble();
                    Ergebnis[0] = Math.tan(Z1);
                    break;
                case 2400:                                  //arcsin 1
                    System.out.println("Variable");
                    Z1 = input.nextDouble();
                    Ergebnis[0] = Math.asin(Z1);
                    break;
                case 2500:                                  //arccos 1
                    System.out.println("Variable");
                    Z1 = input.nextDouble();
                    Ergebnis[0] = Math.acos(Z1);
                    break;
                case 2600:                                  //arctan 1
                    System.out.println("Variable");
                    Z1 = input.nextDouble();
                    Ergebnis[0] = Math.atan(Z1);
                    break;
                case 2700:                                  //sinh 1
                    System.out.println("Variable");
                    Z1 = input.nextDouble();
                    Ergebnis[0] = Math.sinh(Z1);
                    break;
                case 2800:                                  //cosh 1
                    System.out.println("Variable");
                    Z1 = input.nextDouble();
                    Ergebnis[0] = Math.cosh(Z1);
                    break;

                case 1:                                        //Summe oo                                                                                  //ändern wenn neu
                    System.out.println("2.Summand");
                    Z2 = input.nextDouble();
                    Ergebnis[0] = Ergebnis[0] + Z2;
                    break;
                case 2:                                     //differenz oo
                    System.out.println("Subtrahend");
                    Z2 = input.nextDouble();
                    Ergebnis[0] = Ergebnis[0] - Z2;
                    break;
                case 3:                                     //Produkt oo
                    System.out.println("2.Faktor");
                    Z2 = input.nextDouble();
                    Ergebnis[0] = Ergebnis[0] * Z2;
                    break;
                case 4:                                     //Quotient oo
                    System.out.println("Divisor");
                    Z2 = input.nextDouble();
                    Ergebnis[0] = Ergebnis[0] / Z2;
                    break;
                case 5:                                     //exponent oo
                    System.out.println("Exponent");
                    Z2 = input.nextDouble();
                    Z1 = Ergebnis[0];
                    Ergebnis[0] = Math.pow(Z1,Z2);
                    break;
                case 6:                                     //wurzel oo
                    System.out.println("Wurzelexponent");
                    Z2 = input.nextDouble();
                    Ergebnis[0] = Math.pow(Ergebnis[0],(1/Z2));
                    break;
                case 7:                                     //fakultät oo
                    if (Ergebnis[0] >= 0){
                        Z1 = Ergebnis[0];
                        while ( Z1 > 1){
                            Ergebnis[0] = Ergebnis[0] * Z1;
                            Z1 --;
                        }
                    }
                    else {
                        System.out.println("Ergebinis kleiner als 0");
                    }
                    break;
                case 8:
                    Ergebnis[0] = Math.abs(Ergebnis[0]);                       //Betrag oo
                case 9:
                    Ergebnis[0] = Math.round(Ergebnis[0]);                     //kaufmänisches runden
                    break;
                case 10:
                    Ergebnis[0] = Math.ceil(Ergebnis[0]);                      //Aufrunden oo
                    break;
                case 11:
                    Ergebnis[0] = Math.floor(Ergebnis[0]);                    //abrunden oo
                    break;
                case 21:                                     //Sinus oo
                    Ergebnis[0] = Math.sin(Ergebnis[0]);
                    break;
                case 22:                                     //Cosinus oo
                    Ergebnis[0] = Math.cos(Ergebnis[0]);
                    break;
                case 23:                                    //Tangens oo
                    Ergebnis[0] = Math.tan(Ergebnis[0]);
                    break;
                case 24:                                    //arcsin oo
                    Ergebnis[0] = Math.asin(Ergebnis[0]);
                    break;
                case 25:                                    //arccis oo
                    Ergebnis[0] = Math.acos(Ergebnis[0]);
                    break;
                case 26:                                    //arctan oo
                    Ergebnis[0] = Math.atan(Ergebnis[0]);
                    break;
                case 27:                                    //sinh oo
                    Ergebnis[0] = Math.sinh(Ergebnis[0]);
                    break;
                case 28:                                    //cosh oo
                    Ergebnis[0] = Math.cosh(Ergebnis[0]);
                    break;
                default:
                    System.out.println("Bitte wählen Sie eine Rechenart");
                    break;
            }
            System.out.println("\n" + "\n" + "\n" + "\n"+"Ergebnis:  " + Ergebnis[0]+"\n");        //Ergebnis

            System.out.println("Wählen Sie eine Nummer von der Liste");
            System.out.println("(0) Rechner beenden");                                                                                    //ändern wenn neu
            System.out.println("(1) +");
            System.out.println("(2) -");
            System.out.println("(3) *");
            System.out.println("(4) /");
            System.out.println("(5) Potenz");
            System.out.println("(6) Wurzel");
            System.out.println("(8) Fakultät");
            System.out.println("(9) Runden");
            System.out.println("(10) Aufrunden");
            System.out.println("(11) Abrunden");
            System.out.println("(20) Trigonometrische Funktionen");
            System.out.println("(33) letztes Ergebnis löschen");
            Rechenart = input.nextInt();
            if (Rechenart == 20){
                System.out.println("(21) Sinus");
                System.out.println("(22) Cosinus");
                System.out.println("(23) Tangens");
                System.out.println("(24) Arcus Sinus");
                System.out.println("(25) Arcus Cosinus");
                System.out.println("(26) Arcus Tangens");
                System.out.println("(27) Sinus Hyperbolicus");
                System.out.println("(28) Cosinus Hyperbolicus");
                Rechenart = input.nextInt();
            }


            switch (Rechenart) {
                case 0:                 //Rechner beenden
                    Rechnerloop = 0;
                    System.out.println("Rechner wurde beendet"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n");
                    return Ergebnis[0];
                case 33:                            //ergebnis um zurücksetzen
                    speicherzeiger = 0;
                    while (speicherzeiger < Ergebnis.length-1){
                        Ergebnis[speicherzeiger] = Ergebnis[speicherzeiger+1];
                        speicherzeiger++;
                    }

                    break;
                case 1:                                                                                                                    //ändern wenn neu
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:                        //normales weiterspeichern
                    speicherzeiger = Ergebnis.length-1;
                    while (speicherzeiger > 0){
                        Ergebnis[speicherzeiger] = Ergebnis[speicherzeiger-1];
                        speicherzeiger--;
                    }

                default:
                    System.out.println("Biite wählen Sie eine Nummer von der Liste");           //Fehlermeldung für Rechenart im Loop
                    break;
            }

        }
        return Ergebnis[0];
    }

    public static String PWGenerator(double ErgebnisRechner) {

        Scanner input = new Scanner(System.in);

        int Hauptmenü = 1;                  //Programlogic
        int random = 0;                                     //teoretisch überflüssig aber übersichtlicher
        String String = "";
        int lauflänge = 0;
        boolean secret = false;
        String Zeichen [] = new String[91];             //String für Beispiele
        int VersuchNR = 0;
        boolean Rechnerübernahme = false;

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
            System.out.println("(2) Eigenevorgaben"+"\n"+"\n");
            Hauptmenü = input.nextInt();

            switch (Hauptmenü) {
                case 9:
                    secret = true;
                case 2:
                    if (ErgebnisRechner!=0){
                        System.out.println("Möchsten Sie das Ergebnis des Rechners als länge des Passworts übernehmen? true/false");
                        Rechnerübernahme=input.nextBoolean();
                        if (Rechnerübernahme=true){
                            länge = (int) ErgebnisRechner;
                            länge -=1;
                        }
                    }
                    if (Rechnerübernahme=false){
                        System.out.println("Länge des Passworts");
                        länge = input.nextInt();
                        länge -= 1;                                                                             //kein wirklicher fix aber so geht es
                    }
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
                case 1:                                                             //die die über sind damit die defoult ausgabe nicht kommt
                    break;
                case 0:
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
                    System.out.println("abhänig von den Eistellung kann es länger dauern"+"\n"+"\n");

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
                    System.out.println("Passwort beim " + VersuchNR + "ten Versuch gefunden:"+"\n");
                    System.out.println(String);
                    String = "";
                    VersuchNR = 0;

                }
            }


        }
        return String;
    }

    public static String Rotverschlüsslung(double ErgebnisRechner) {

        Scanner input = new Scanner(System.in);

        String Zeichen[] = new String[26];

        Zeichen[0] = "a";
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


        String Eingabe = "";
        String Ausgabe = "";
        int Vorgabe = 0;
        int k = 0;

        System.out.println("Bitte zu verschlüsselnden Text eingeben");
        Eingabe = input.nextLine();
        System.out.println("Bitte Rotation wählen");
        if (ErgebnisRechner!=0){
            System.out.println("(0) um das Ergebnis vom Rechner als Rotation zu übernehmen");
        }
        Vorgabe = input.nextInt();
        if (Vorgabe==0){
            Vorgabe=(int)ErgebnisRechner;
        }

        int Zwischen[] = new int[Eingabe.length()];

        while (Vorgabe > 25) {                                                       //vorgaben anpassen
            Vorgabe = Vorgabe - 26;
        }

        for (int i = 0; i < Eingabe.length(); i++) {

            if (Character.isLetter(Eingabe.charAt(i))) {                         //allles zu kleinbuchstaben

                if (Eingabe.charAt(i) == 'ü' || Eingabe.charAt(i) == 'ö' || Eingabe.charAt(i) == 'ä'){
                    Ausgabe += Eingabe.charAt(i);                                                               //umlaute anhängen
                }
                else {

                    Eingabe = Eingabe.toLowerCase();

                    switch (Eingabe.charAt(i)) {
                        case 'a':
                            Zwischen[i] = 0;
                            break;
                        case 'b':
                            Zwischen[i] = 1;
                            break;
                        case 'c':
                            Zwischen[i] = 2;
                            break;
                        case 'd':
                            Zwischen[i] = 3;
                            break;
                        case 'e':
                            Zwischen[i] = 4;
                            break;
                        case 'f':
                            Zwischen[i] = 5;
                            break;
                        case 'g':
                            Zwischen[i] = 6;
                            break;
                        case 'h':
                            Zwischen[i] = 7;
                            break;
                        case 'i':
                            Zwischen[i] = 8;
                            break;
                        case 'j':
                            Zwischen[i] = 9;
                            break;
                        case 'k':
                            Zwischen[i] = 10;
                            break;
                        case 'l':
                            Zwischen[i] = 11;
                            break;
                        case 'm':
                            Zwischen[i] = 12;
                            break;
                        case 'n':
                            Zwischen[i] = 13;
                            break;
                        case 'o':
                            Zwischen[i] = 14;
                            break;
                        case 'p':
                            Zwischen[i] = 15;
                            break;
                        case 'q':
                            Zwischen[i] = 16;
                            break;
                        case 'r':
                            Zwischen[i] = 17;
                            break;
                        case 's':
                            Zwischen[i] = 18;
                            break;
                        case 't':
                            Zwischen[i] = 19;
                            break;
                        case 'u':
                            Zwischen[i] = 20;
                            break;
                        case 'v':
                            Zwischen[i] = 21;
                            break;
                        case 'w':
                            Zwischen[i] = 22;
                            break;
                        case 'x':
                            Zwischen[i] = 23;
                            break;
                        case 'y':
                            Zwischen[i] = 24;
                            break;
                        case 'z':
                            Zwischen[i] = 25;
                            break;
                    }

                    if (Zwischen[i] + Vorgabe > 25) {                       //vorgaben anpassen
                        k = Zwischen[i] + Vorgabe - 26;
                    } else {
                        k = Zwischen[i] + Vorgabe;
                    }

                    Ausgabe += Zeichen[k];      //neuzusammensetzen
                }
            }
            else{                                                  //sonderzeichen
                Ausgabe += Eingabe.charAt(i);
            }
        }
        System.out.println(Ausgabe);
        return Ausgabe;
    }

    public static String Rotationsentschlüsselung(String ErgebnisRotverschlüsslung){
        Scanner input = new Scanner(System.in);


        String Eingabe = "";
        String Ausgabe = "";
        String AusgabeA[] = new String [26];                                // "eingabe" in allen möglichen verschlüsselungen
        String Zwischen1 = "";
        String Beispiele = "";
        int k = 0;
        boolean richtige_gefunden_ = false;
        boolean ErgebnisRotverschlüsslungübernehmen = false;

        String Zeichen[]= new String[26];

        Zeichen[0] = "a";
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


        int Treffer[] = new int[26];
        int o = 0;
        int Richtigeverschlüsslung =0;
        int Anzahl_der_Treffer = 0;

        System.out.println("Automatische Rotations entschlüsselung");
        if (ErgebnisRotverschlüsslung!=null){
            System.out.println("Ergebnis der Rotationsverschlüsslung übernehmen true/false");
            ErgebnisRotverschlüsslungübernehmen=input.nextBoolean();
        }
        if (ErgebnisRotverschlüsslungübernehmen==true){
            Eingabe = ErgebnisRotverschlüsslung;
        }
        else {
            System.out.println("Bitte zu entschlüsselnden Text eingeben");
            Eingabe = input.nextLine();
        }



        BufferedReader br =null;                                        //Beispiele einlsen
        try {
            br = new BufferedReader(new FileReader(new File("" + "D:\\Betrieblich\\vorabreiten\\uebungen\\Textdatein\\§Wörter.txt")));
            String line = null;

            while ((line = br.readLine()) !=null) {
                Beispiele += line+" ";
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(br!=null){
                try{
                    br.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        Beispiele = Beispiele.toLowerCase();                                                                                    //beispiele aus txt klein

        String BeispieleA[] = Beispiele.split(" ");                                                                     //beispiele aus txt in array

        int Zwischen[] = new int[Eingabe.length()];

        Eingabe = Eingabe.toLowerCase();

        for (;o <= 25;o++) {                                                                                                    //für jede rot verschlüsslung

            for (int i = 0; i < Eingabe.length(); i++) {                                                                        //für die gesamte eingabe

                if (Character.isLetter(Eingabe.charAt(i))) {                                                                     //allles zu kleinbuchstaben

                    if (Eingabe.charAt(i) == 'ü' || Eingabe.charAt(i) == 'ö' || Eingabe.charAt(i) == 'ä') {
                        Ausgabe += Eingabe.charAt(i);                                                                           //umlaute anhängen
                    } else {

                        Eingabe = Eingabe.toLowerCase();

                        switch (Eingabe.charAt(i)) {
                            case 'a':
                                Zwischen[i] = 0;
                                break;
                            case 'b':
                                Zwischen[i] = 1;
                                break;
                            case 'c':
                                Zwischen[i] = 2;
                                break;
                            case 'd':
                                Zwischen[i] = 3;
                                break;
                            case 'e':
                                Zwischen[i] = 4;
                                break;
                            case 'f':
                                Zwischen[i] = 5;
                                break;
                            case 'g':
                                Zwischen[i] = 6;
                                break;
                            case 'h':
                                Zwischen[i] = 7;
                                break;
                            case 'i':
                                Zwischen[i] = 8;
                                break;
                            case 'j':
                                Zwischen[i] = 9;
                                break;
                            case 'k':
                                Zwischen[i] = 10;
                                break;
                            case 'l':
                                Zwischen[i] = 11;
                                break;
                            case 'm':
                                Zwischen[i] = 12;
                                break;
                            case 'n':
                                Zwischen[i] = 13;
                                break;
                            case 'o':
                                Zwischen[i] = 14;
                                break;
                            case 'p':
                                Zwischen[i] = 15;
                                break;
                            case 'q':
                                Zwischen[i] = 16;
                                break;
                            case 'r':
                                Zwischen[i] = 17;
                                break;
                            case 's':
                                Zwischen[i] = 18;
                                break;
                            case 't':
                                Zwischen[i] = 19;
                                break;
                            case 'u':
                                Zwischen[i] = 20;
                                break;
                            case 'v':
                                Zwischen[i] = 21;
                                break;
                            case 'w':
                                Zwischen[i] = 22;
                                break;
                            case 'x':
                                Zwischen[i] = 23;
                                break;
                            case 'y':
                                Zwischen[i] = 24;
                                break;
                            case 'z':
                                Zwischen[i] = 25;
                                break;
                        }

                        k = Zwischen[i] + o;
                        while (k > 25){                             //k anpassen
                            k -= 26;
                        }

                        Ausgabe += Zeichen[k];                                            //neuzusammensetzen
                    }
                } else {                                                                 //sonderzeichen
                    Ausgabe += Eingabe.charAt(i);
                }
            }

            for (int m = 0; m < BeispieleA.length;m++){                                 //für jedes beispiel ?
                if (Ausgabe.contains(BeispieleA[m])){
                    Treffer[o] +=BeispieleA[m].length()*1.8;                     //wenn ein treffer gefunden wird praktisch die länge aller treffer bei dieser verschlüsslung adirt
                }
            }

            AusgabeA[o]= Ausgabe;                                                       //rede ausgabe im arry speichern unter der nummer der rotation
            Ausgabe = "";                                                               // zurücksetzen der ausgabe
        }

        ////////////////////////

        while (richtige_gefunden_!=true){

            for (int p = 0; p < Treffer.length;p++){                                     //größten wert finden
                if (Treffer[p]>Anzahl_der_Treffer){
                    Anzahl_der_Treffer = Treffer[p];
                    Richtigeverschlüsslung = p;
                }
            }
            Anzahl_der_Treffer=0;                                                       //zurücksetzen

            System.out.println("Rotverschlüsselung zum entschlüsseln "+Richtigeverschlüsslung+"\n");
            System.out.println(AusgabeA[Richtigeverschlüsslung]+"\n");
            System.out.println(" \"false\" wenn falsch und \"true\" wenn richtig");
            richtige_gefunden_ = input.nextBoolean();

            if (richtige_gefunden_==false){
                Treffer[Richtigeverschlüsslung]= Treffer[Richtigeverschlüsslung]/500;
            }
        }
        return AusgabeA[Richtigeverschlüsslung];
    }




    public static void Suchen(String ErgebnisPWGenerator, String ErgebnisRotverschlüsslung, String ErgebnisRotationsentschlüsselung, double ErgebnisRechner) {                                                       //suchen

        Scanner input = new Scanner(System.in);

        int  Menü = 1;
        boolean großklein = false;
        int nach_vorher_suchen = 0;
        String Fill = "";

        while (Menü != 0) {

            String Suchbegriffe ="";
            String Text = "";
            String Text_ohne_suchbegriffe = "";

            String Filler = "";

            System.out.println("Textsuche");
            System.out.println("(0) beenden");
            System.out.println("(1) Standartvorgaben");
            System.out.println("(2) Eigenevorgaben");
            Menü = input.nextInt();
            Filler = input.nextLine();                                                      //hä???????????????????????????????

            switch (Menü) {

                case 0:
                    break;
                case 1:
                case 2:
                    if (ErgebnisPWGenerator!=null){
                        System.out.println("(0) Nach keinem Vorherigem Ergebnis suchen");
                        System.out.println("(1) Nach dem Ergebnis des Rechners suchen");
                        System.out.println("(2) Nach dem Ergebnis des Passwortgeneratos suchen");
                        System.out.println("(3) Nach dem Ergebnis der Rotatonsverschlüsslung suchen");
                        System.out.println("(4) Nach dem Ergebnis der Rotatonsentschlüsslung suchen");
                        nach_vorher_suchen = input.nextInt();
                        Fill = input.nextLine();
                        if (nach_vorher_suchen==1){
                            Suchbegriffe = Double.toString(ErgebnisRechner);
                        }
                        if (nach_vorher_suchen==2){
                            Suchbegriffe = ErgebnisPWGenerator;
                        }
                        if (nach_vorher_suchen==3){
                            Suchbegriffe = ErgebnisRotverschlüsslung;
                        }
                        if (nach_vorher_suchen==4){
                            Suchbegriffe = ErgebnisRotationsentschlüsselung;
                        }
                    }
                    if (nach_vorher_suchen==0) {
                        System.out.println("Es können mehere Suchbegriffe eingegeben werden. Diese werden mit einem Lehrzeichen getrennt");
                        System.out.println("Bitte geben Sie die Suchbegriffe ein");
                        Suchbegriffe = input.nextLine();
                    }
                    System.out.println("Bitte geben Sie den Text ein in dem gesucht werden soll"+"\n"+"Der Text darf kein Zeilenumbruch enthalten. Wenn doch startet die Suche direkt und wird nicht korrekt ausgeführt");
                    Text = input.nextLine();

                    String SuchbegriffeA[] = Suchbegriffe.split(" ");           //suchbetriffe in arry

                    if (Menü==2) {
                        System.out.println("(true/false)Groß und kleinschreibung berücksichtigen?");
                        großklein = input.hasNext();
                        Filler = input.nextLine();                                                          //hä die 2.

                        if (großklein == false) {
                            Text = Text.toLowerCase();
                            for (int i = 0; i < SuchbegriffeA.length;i++) {
                                SuchbegriffeA[i] = SuchbegriffeA[i].toLowerCase();
                            }
                        }
                    }

                    for (int i = 0; i < SuchbegriffeA.length; i++) {                        //alle suchbegriffe
                        if (Text.contains(SuchbegriffeA[i])) {
                            System.out.println(SuchbegriffeA[i] + " an Stelle " + Text.indexOf(SuchbegriffeA[i]) + " das erste mal gefunden");          //gibt eine stelle vor dem fundort an
                            Text_ohne_suchbegriffe = Text.replace(SuchbegriffeA[i], "");                                                         //Suchbegriff im text löschen
                            System.out.println((Text.length() - Text_ohne_suchbegriffe.length()) / SuchbegriffeA[i].length() + " mal im Text" + "\n");              //(text - text ohne das gesuchte wort)/länge des gesuchten worts
                        } else {
                            System.out.println(SuchbegriffeA[i] + " nicht gefunden" + "\n");
                        }
                    }
                break;
            }
        }
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Inhaltsverzeichnis

        //Vaiablen deklariren
        int index = 999; //index Variable
        double ErgebnisRechner=0;
        String ErgebnisPWGenerator="";
        String ErgebnisRotverschlüsslung="";
        String ErgebnisRotationsentschlüsselung="";


        while (index != 0) {          //Hauptmenü wiederholung


            //konsole inhaltsverzeichnis
            System.out.println("Inhlatsverzeichnis");
            System.out.println("(0) Program beenden");
            System.out.println("(1) Rechner");
            System.out.println("(2) Passwortgenerator");
            System.out.println("(3) Rotationsverschlüsslung");
            System.out.println("(4) Rotationsentschlüsselung");
            System.out.println("(5) Textsuche");
            System.out.println("\n"+"Bitte Program auswählen"+"\n"+"\n");
            index = input.nextInt();


            switch (index) {            //welchers programm logic
                case 0:                      //Benden Hauptmenü
                    System.out.println("wurde beendet."+"\n"+"\n"+"\n");
                    System.exit(0);
                    break;
                case 1:
                    ErgebnisRechner = Rechner();                        //Rechner
                    break;
                case 2:
                    ErgebnisPWGenerator = PWGenerator(ErgebnisRechner);                   //Passwortgenerator
                    break;
                case 3:
                    ErgebnisRotverschlüsslung = Rotverschlüsslung(ErgebnisRechner);           //rotationsverschlüsslung
                    break;
                case 4:
                    ErgebnisRotationsentschlüsselung=Rotationsentschlüsselung(ErgebnisRotverschlüsslung);     //rotationsentschlüsselung
                    break;
                case 5:
                    Suchen(ErgebnisPWGenerator, ErgebnisRotverschlüsslung, ErgebnisRotationsentschlüsselung, ErgebnisRechner);                       //intext suche
                    break;
                default:
                    System.out.println("Bitte wählen Sie ein Progam von der Liste");    //Fehlermeldung für Hauptmenü Eingabe
                    break;
            }
        }
    }
}