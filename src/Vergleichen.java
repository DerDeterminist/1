import java.util.*;

public class Vergleichen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //übung 1

        /*String Kette1 = "";
        String Kette2 = "";
        int länge = 0;
        int lauflänge  = 0;
        int Anz = 0;

        Kette1 = input.next();
        Kette2 = input.next();

        if (Kette1.length() > Kette2.length()){
            länge = Kette2.length();
        }
        else {
            länge = Kette1.length();
        }





        while (lauflänge < länge){
            if (Kette1.charAt(lauflänge) != Kette2.charAt(lauflänge)){
             Anz++;
            }
            lauflänge++;
        }
        System.out.print("Anzahl ungleicher Zeichen "+Anz);
        */


        //übung 2

        /*String Eingabe = "";
        int ei = 0;
        int au = 0;
        int äu = 0;
        int eu = 0;
        int ai = 0;
        int oi = 0;
        int ui = 0;

        Eingabe = input.next();

        for (int i = 0; i<Eingabe.length(); i++){
            switch (Eingabe.charAt(i)){
                case 'e':
                    if (Eingabe.charAt(i+1)=='i'){
                        ei++;
                    }
                    if (Eingabe.charAt(i+1)=='u'){
                        eu++;
                    }
                case 'a':
                    if (Eingabe.charAt(i+1)=='u'){
                        au++;
                    }
                    if (Eingabe.charAt(i+1)=='i'){
                        ai++;
                    }
                case 'ä':
                    if (Eingabe.charAt(i+1)=='u'){
                        äu++;
                    }
                case 'o':
                    if (Eingabe.charAt(i+1)=='i'){
                        oi++;
                    }
                case 'u':
                    if (Eingabe.charAt(i+1)== 'i'){
                        ui++;
                    }

            }
        }
        System.out.println("ei "+ ei);
        System.out.println("eu "+eu);
        System.out.println("au "+au );
        System.out.println("ai "+ai);
        System.out.println("oi "+oi);
        System.out.println("ui "+ui);
        */

        //übung 3


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
        Eingabe = input.next();
        System.out.println("Bitte ROT wählen");
        Vorgabe = input.nextInt();

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
    }
}