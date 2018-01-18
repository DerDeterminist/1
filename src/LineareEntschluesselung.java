import sun.rmi.server.InactiveGroupException;

import java.util.Arrays;
import java.util.Scanner;

public class LineareEntschluesselung {                                                                                      // Bug: d = ASCII 100 wird zu 1 daher wird das d mit ~ ersetzt

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String Eingabe = null;
        int ASCII_in_Eingabe[] = new int[127];
        String Häufigste_ASCII_in_Eingabe = "";
        String ASCII_richtige = "";                                                                                     // noch nicht eingebunden
        int Häufigste_zeichen_in_sprachen[][] ={{' '+'e','n','i','s','r','a','t','d','h','u','l','c','g','m','o','b','w','f','k','z','p','v','ß','j','y','x','q'},
                                                {' '+'e','t','a','o','i','n','s','h','r','d','l','c','u','m','w','f','g','y','p','b','v','k','j','x','q','z'},
                                                {' '+'e','s','a','i','t','n','r','u','l','o','d','c','p','m','é','v','q','f','b','g','h','j','à','x','y','è','ê'},
                                                {' '+'e','a','o','s','r','n','i','d','l','c','t','u','m','p','b','g','v','y','q','h','f','z','j','x','w'},
                                                {' '+'e','a','i','o','n','l','r','t','s','c','d','p','u','m','v','g','h','f','b','q','z'},
                                                {' '+'e','a','n','t','r','s','l','i','d','o','m','g','k','v','h','f','u','p','b','c','j','y','x','w','z','q'},
                                                {' '+'a','o','i','e','z','n','s','c','w','r','y','l','d','k','t','m','p','j','u','b','g','h','ż','g'}};
        int Häufigste_zeichen_deutsch[] =     {'e','n','i','s','r','a','t','d','h','u','l','c','g','m','o','b','w','f','k','z','p','v','ß','j','y','x','q'};
        int Häufigste_zeichen_englisch[] =    {'e','t','a','o','i','n','s','h','r','d','l','c','u','m','w','f','g','y','p','b','v','k','j','x','q','z'};
        int Häufigste_zeichen_französisch[] = {'e','s','a','i','t','n','r','u','l','o','d','c','p','m','é','v','q','f','b','g','h','j','à','x','y','è','ê'};
        int Häufigste_zeichen_spanisch[] =    {'e','a','o','s','r','n','i','d','l','c','t','u','m','p','b','g','v','y','q','h','f','z','j','x','w'};
        int Häufigste_zeichen_italienisch[] = {'e','a','i','o','n','l','r','t','s','c','d','p','u','m','v','g','h','f','b','q','z'};
        int Häufigste_zeichen_schwedisch[] =  {'e','a','n','t','r','s','l','i','d','o','m','g','k','v','h','f','u','p','b','c','j','y','x','w','z','q'};
        int Häufigste_zeichen_polnisch[] =    {'a','o','i','e','z','n','s','c','w','r','y','l','d','k','t','m','p','j','u','b','g','h','ż','g'};
        String was_wo_mit_ersetzen_d[] = new String[Häufigste_zeichen_deutsch.length];
        String Ausgabe_d = "";
        String was_wo_mit_ersetzen_d_S = "";


        System.out.println("Lineare Entschlüsselung");
        System.out.print("Eingabe:");
        Eingabe = input.nextLine();

        for (int i = 0; i < Eingabe.length(); i++) {                                                                    // zählt die Anzal der ASCII sysmbole
            for (int j = 32; j < ASCII_in_Eingabe.length; j++) {
                if (Eingabe.charAt(i) == (char) j) {
                    ASCII_in_Eingabe[j] += 1;
                }
            }
        }

        for (int i = 0; i < ASCII_in_Eingabe.length; i++) {                                                             // String mit den information welcher ASCII wert wie heufig vor karm
            Häufigste_ASCII_in_Eingabe += ASCII_in_Eingabe[i];
            Häufigste_ASCII_in_Eingabe += ".";
            Häufigste_ASCII_in_Eingabe += i;
            Häufigste_ASCII_in_Eingabe += " ";
        }

        String[] Anzahl_für_sortirung = Häufigste_ASCII_in_Eingabe.split(" ");                                    // wird nach treffer anzahl und dann nach ASCII ordnugszahl sortirt. kleiste vorne
        Double Anzahl_für_sortirung_als_double[] =  new Double [Anzahl_für_sortirung.length];

        for (int i=0;i<Anzahl_für_sortirung_als_double.length;i++){                                                     // als double fürs sortiren
            Anzahl_für_sortirung_als_double[i] = Double.valueOf(Anzahl_für_sortirung[i]);
        }

        Arrays.sort(Anzahl_für_sortirung_als_double);                                                                   // sortiren

        for (int i = 0;i < Anzahl_für_sortirung_als_double.length;i++){                                                 // als string zur weiten bearbeitung
            Anzahl_für_sortirung[i] = String.valueOf(Anzahl_für_sortirung_als_double[i]);
        }

        for (int i = 0; i < (Anzahl_für_sortirung.length / 2); i++) {                                                   // Array umdrehen. Größte vorne
            String temp = "";
            temp = Anzahl_für_sortirung[i];
            Anzahl_für_sortirung[i] = Anzahl_für_sortirung[(Anzahl_für_sortirung.length - i - 1)];
            Anzahl_für_sortirung[Anzahl_für_sortirung.length - i - 1] = temp;
        }

        for (int i = 0; i < Häufigste_zeichen_deutsch.length; i++) {                                                          // Array in String umwandeln für einfacher weitere bearbeitung
            ASCII_richtige += Anzahl_für_sortirung[i];
            ASCII_richtige += " ";
        }

       String Häufigste_Ascii_A[] = new String[Häufigste_zeichen_deutsch.length];                                             // hätte glaube ich auch das allte array wieder nehmen können

        int couter = 0;                                                                                                 // Nach dem das Array nach der Anzal der ASCII symbole sortiert worten ist wird diese info nicht mehr benötigt zudem wird aus dem string wieder ein Array
        for (int i = 0; i < ASCII_richtige.length(); ++i) {
            if (ASCII_richtige.charAt(i) == '.' && ASCII_richtige.charAt(i-1)!='0') {
                String sBuchstabe = "";
                i++;
                while (ASCII_richtige.charAt(i) != ' ') {
                    sBuchstabe += ASCII_richtige.charAt(i);
                    i++;
                }
                Häufigste_Ascii_A[couter] = sBuchstabe;
                couter++;
            }
        }

        for (int i=0;i<Häufigste_zeichen_deutsch.length&&i<Häufigste_Ascii_A.length&&Häufigste_Ascii_A[i]!=null;i++){         // Die informatonen dadrüber, welches ASCII symbol mit welchem ASCII Symbol aus welcher sprache ersetzt werden soll wird zusammen geführt
            was_wo_mit_ersetzen_d[i] = Häufigste_Ascii_A[i];
            was_wo_mit_ersetzen_d[i] += ".";
            was_wo_mit_ersetzen_d[i] += Häufigste_zeichen_deutsch[i];
        }

        was_wo_mit_ersetzen_d_S = "";
        for (int i=0;i<was_wo_mit_ersetzen_d.length;i++){                                                           // Das Array wird wieder in einen String verwandelt, da ich nicht weiß wie man ein String Array an eine Methode übergibt
            was_wo_mit_ersetzen_d_S +=was_wo_mit_ersetzen_d[i];
            was_wo_mit_ersetzen_d_S += " ";
        }

        int weiter =1;
        while (weiter!=0) {

            Ausgabe_d = Ausgabe_erstellen(Eingabe,Ausgabe_d,was_wo_mit_ersetzen_d_S);                                   // Es wird eine Ausgabe erstellt. Wie siehe "Ausgabe_erstellen"

            was_wo_mit_ersetzen_d_S = "";
            for (int i=0;i<was_wo_mit_ersetzen_d.length;i++){                                                           // Das Array wird wieder in einen String verwandelt, da ich nicht weiß wie man ein String Array an eine Methode übergibt
                was_wo_mit_ersetzen_d_S +=was_wo_mit_ersetzen_d[i];
                was_wo_mit_ersetzen_d_S += " ";
            }

            System.out.println("\b"+"Warscheinlichste Entschlüsselung in deutsch");                                     // Ausgabe für jede Sprache
            System.out.println(Ausgabe_d);

            System.out.println("(0) Programm beenden");                                                                 // Menü für die weitere Bearbeitung
            System.out.println("(1) änlich warscheinliche Entschlüsselungen");
            System.out.println("(2) habe ein Wort erkannt");
            weiter = input.nextInt();

            switch (weiter){                                                                                            // umsetzung des Menüs
                case 0:
                    System.exit(0);
                    System.out.println("Program wurde beendet");
                    break;
                case 1:
                    was_wo_mit_ersetzen_d_S=case1(was_wo_mit_ersetzen_d_S);                                             // Eine Mutation der Warscheinlichsten Entschlüsselung wird erstellt. Siehe "case1"
                    Ausgabe_d=Ausgabe_erstellen(Eingabe,Ausgabe_d,was_wo_mit_ersetzen_d_S);                             // Es wird eine Ausgabe erstellt. Wie siehe "Ausgabe_erstellen"
                    break;
                case 2:
                    was_wo_mit_ersetzen_d_S=case2(Ausgabe_d,was_wo_mit_ersetzen_d_S);                                   // Es kann wenn der Anwender ein Wort erkennt jede Ausgabe umgeändert
                    Ausgabe_d=Ausgabe_erstellen(Eingabe,Ausgabe_d,was_wo_mit_ersetzen_d_S);
                    was_wo_mit_ersetzen_d = was_wo_mit_ersetzen_d_S.split(" ");
                    break;
                    default:
                        System.out.println("Bitte gültige Eingabe tätigen");
                        break;
            }
        }
    }


    public static String Ausgabe_erstellen (String Eingabe,String Ausgabe_d,String was_wo_mit_ersetzen_d_S){            // Ausgabe wird in jeder Sprache erstellt

        Ausgabe_d = "";
        String[] was_wo_mit_ersetzen_d = was_wo_mit_ersetzen_d_S.split(" ");                                      // Aus String nen Array machen

        for (int y = 0;y < Eingabe.length();y++) {
            String was = "";
            String wo_mit_d = "";
            boolean wurde_ersetzt = false;
            for (int j = 0; j < was_wo_mit_ersetzen_d.length; j++) {                                                    // der reihe nach werden alle ASCII symbole in der eingabe durchgegangen und etsprechend in den Ausgabe für jede sprache genändert
                if (was_wo_mit_ersetzen_d[j].contains(".")==true){

                    was = was_wo_mit_ersetzen_d[j].substring(0,was_wo_mit_ersetzen_d[j].indexOf('.'));                  // informaton wieder in 2 aufteilen
                    wo_mit_d = was_wo_mit_ersetzen_d[j].substring(was_wo_mit_ersetzen_d[j].indexOf('.')+1);

                    if (Eingabe.charAt(y)==Integer.valueOf(was)){
                        Ausgabe_d += (char)Integer.parseInt(wo_mit_d);
                        wurde_ersetzt = true;
                    }
                }
            }
            if (wurde_ersetzt==false){
                Ausgabe_d += '~';
            }
        }
        return Ausgabe_d;                                                                                               // rückgabe aller Ausgaben in allen Sprachen
    }

    public static String case1 (String was_wo_mit_ersetzen_d_S){                                                        // logic für case 1 im 2. menü

        String[] was_wo_mit_ersetzen_d = was_wo_mit_ersetzen_d_S.split(" ");                                      // Aus String nen Array machen

        String was = "";
        String was_alt = "";
        String wo_mit_d = "";
        String wo_mit_d_alt = "";

       for (int i=0;i<was_wo_mit_ersetzen_d.length;i++){                                        //Bug: ersetzt nicht    // Mit einer giwissen warscheinlichkeit werden 2 plätze miteinander getauscht
           if (was_wo_mit_ersetzen_d[i].contains(".")){

               was = was_wo_mit_ersetzen_d[i].substring(0,was_wo_mit_ersetzen_d[i].indexOf('.'));
               wo_mit_d = was_wo_mit_ersetzen_d[i].substring(was_wo_mit_ersetzen_d[i].indexOf('.')+1);                  // informaton wieder in 2 aufteilen

               if (i!=0&&Math.random()*100<20){
                   was_wo_mit_ersetzen_d[i] = was;
                   was_wo_mit_ersetzen_d[i] += ".";
                   was_wo_mit_ersetzen_d[i] += wo_mit_d_alt;

                   was_wo_mit_ersetzen_d[i-1] = was_alt;
                   was_wo_mit_ersetzen_d[i-1] += ".";
                   was_wo_mit_ersetzen_d[i-1] += wo_mit_d;
               }

               wo_mit_d_alt = wo_mit_d;
               was_alt = was;
           }
       }

       was_wo_mit_ersetzen_d_S="";
        for (int i=0;i<was_wo_mit_ersetzen_d.length;i++){                                                               // Array zu String, weil ich Arrays nicht übergeben kann
            was_wo_mit_ersetzen_d_S +=was_wo_mit_ersetzen_d[i];
            was_wo_mit_ersetzen_d_S += " ";
        }
        return was_wo_mit_ersetzen_d_S;                                                                                 // gibt die Mutirte lieste, welcher ASCII wert mit welchem ersetzt werden soll, zurück
    }

    public static String case2 (String Ausgabe_d,String was_wo_mit_ersetzen_d_S){                                       // logic für case 2 im Menü 2

        Scanner input  =new Scanner(System.in);
        String[] was_wo_mit_ersetzen_d = was_wo_mit_ersetzen_d_S.split(" ");                                      // String zu Array

        System.out.println("Bitte geben Sie zuerst das Wort ein, dass Sie ersetzen wollen und bei der 2. Eingabe das Wort mit dem Sie das erste ersetzen wollen");
        System.out.print("Weches Wort ersetzen?");                                                                      // Menü für den Fall, dass der Anwender ein Wort identifizirt hat
        String welches_Wort = input.nextLine();
        System.out.print("Mit welchem Wort ersetzen?");
        String mit_welchem_Wort = input.nextLine();

        String was = "";
        String wo_mit_d = "";
        char temp = ' ';
        boolean wurde_ersetzt[] = new boolean[welches_Wort.length()];

        if (Ausgabe_d.contains(welches_Wort)){                                               // noch zu testen          // jedes ASCII zeichen in dem "gefundem" wort soll gegen das von nutzer angegebe ASCII zeichen ersetzt werden
            for (int i = Ausgabe_d.indexOf(welches_Wort);(i-Ausgabe_d.indexOf(welches_Wort))<welches_Wort.length();i++){

                temp = Ausgabe_d.charAt(i);

                for (int j=0;j<was_wo_mit_ersetzen_d.length;j++){
                    if (was_wo_mit_ersetzen_d[j].contains(".")&&wurde_ersetzt[i-Ausgabe_d.indexOf(welches_Wort)]!=true){

                        was = was_wo_mit_ersetzen_d[j].substring(0,was_wo_mit_ersetzen_d[j].indexOf('.'));              // informaton wieder in 2 aufteilen
                        wo_mit_d = was_wo_mit_ersetzen_d[j].substring(was_wo_mit_ersetzen_d[j].indexOf('.')+1);

                        if (wo_mit_d==String.valueOf(temp)){                                                            // neue infos was womit ersetzt werden soll

                            was_wo_mit_ersetzen_d[j] = was;
                            was_wo_mit_ersetzen_d[j] += '.';
                            was_wo_mit_ersetzen_d[j] += (int)mit_welchem_Wort.charAt(i-Ausgabe_d.indexOf(welches_Wort));

                            for (int k=0;k < was_wo_mit_ersetzen_d.length&&wo_mit_d==String.valueOf(mit_welchem_Wort.charAt(i-Ausgabe_d.indexOf(welches_Wort)));k++){

                                was_wo_mit_ersetzen_d= null;                        //hä?
                            }
                        }
                    }
                }
            }
        }
        else {
            System.out.println("Das von Ihnen eingegebene Wort konnte nicht in dem entschlüsseltem Text gefunden werden");
        }
        was_wo_mit_ersetzen_d_S="";
        for (int i=0;i<was_wo_mit_ersetzen_d.length;i++){                                                               // Array zu String, weil ich Arrays nicht übergeben kann
            was_wo_mit_ersetzen_d_S +=was_wo_mit_ersetzen_d[i];
            was_wo_mit_ersetzen_d_S += " ";
        }
     return was_wo_mit_ersetzen_d_S;
    }
}