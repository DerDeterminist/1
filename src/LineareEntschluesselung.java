import sun.rmi.server.InactiveGroupException;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class LineareEntschluesselung {                                                                                  // Bug: wenn mit ~ lässt sich nicht mehr in case 2 ändern ; nach mutation erkennen ; wenn nicht letze sprache false == die danach mist

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String Eingabe = null;
        int ASCII_in_Eingabe[] = new int[127];
        String Häufigste_ASCII_in_Eingabe = "";
        String Sprachen_Namen[] = {"deutsch","englisch","französisch","spanisch","italienisch","schwedisch","polnisch"};
        int Häufigste_zeichen_in_sprachen[][] ={    {' ','e','n','i','s','r','a','t','d','h','u','l','c','g','m','o','b','w','f','k','z','p','v','ß','j','y','x','q'},
                                                    {' ','e','t','a','o','i','n','s','h','r','d','l','c','u','m','w','f','g','y','p','b','v','k','j','x','q','z'},
                                                    {' ','e','s','a','i','t','n','r','u','l','o','d','c','p','m','é','v','q','f','b','g','h','j','à','x','y','è','ê'},
                                                    {' ','e','a','o','s','r','n','i','d','l','c','t','u','m','p','b','g','v','y','q','h','f','z','j','x','w'},
                                                    {' ','e','a','i','o','n','l','r','t','s','c','d','p','u','m','v','g','h','f','b','q','z'},
                                                    {' ','e','a','n','t','r','s','l','i','d','o','m','g','k','v','h','f','u','p','b','c','j','y','x','w','z','q'},
                                                    {' ','a','o','i','e','z','n','s','c','w','r','y','l','d','k','t','m','p','j','u','b','g','h','ż','g'}};
        boolean Welche_Sprachen[] = new boolean[Häufigste_zeichen_in_sprachen.length];
        String was_wo_mit_ersetzen[][] = new String[Häufigste_zeichen_in_sprachen.length][Häufigste_zeichen_in_sprachen[0].length];
        String Ausgabe[] = new  String[Häufigste_zeichen_in_sprachen.length];
        String was_wo_mit_ersetzen_S[] = new  String [Häufigste_zeichen_in_sprachen.length];
        String ASCII_richtige[] = new String[Häufigste_zeichen_in_sprachen.length];

        for (int s=0;s<was_wo_mit_ersetzen_S.length;s++){                                                               // string vorbereiten
            was_wo_mit_ersetzen_S[s]="";
        }

        int Menü = 0;                                                                                                   // haubtmenü
        while (Menü==0) {
            System.out.println("Lineare Entschlüsselung");
            System.out.println("(0) Programm beenden");
            System.out.println("(1) Ausgabe in deutsch");
            System.out.println("(2) Sprachen auswählen");
            Menü = input.nextInt();
            switch (Menü) {
                case 0:
                    System.exit(0);
                    break;
                case 1:                                                                                                 // nur deutsch
                    Welche_Sprachen[0] = true;
                    break;
                case 2:                                                                                                 // jdede mögliche sprache
                    System.out.print("deutsch (true/false)     :");
                    Welche_Sprachen[0] = input.nextBoolean();
                    System.out.print("englisch (true/false)    :");
                    Welche_Sprachen[1] = input.nextBoolean();
                    System.out.print("französisch (true/false) :");
                    Welche_Sprachen[2] = input.nextBoolean();
                    System.out.print("spanisch (ture/false)    :");
                    Welche_Sprachen[3] = input.nextBoolean();
                    System.out.print("italienisch (true/false) :");
                    Welche_Sprachen[4] = input.nextBoolean();
                    System.out.print("schwedisch (true/false)  :");
                    Welche_Sprachen[5] = input.nextBoolean();
                    System.out.print("polnisch (true/false)    :");
                    Welche_Sprachen[6] = input.nextBoolean();
                    break;
                default:
                    System.out.println("Bitte geben Sie ein gültige Zahl ein");
                    break;
            }
        }

        String Filler = "";
        System.out.print("Eingabe: ");
        Filler = input.nextLine();
        Eingabe = input.nextLine();

        if (Eingabe.length()<20){                                                                                       // leerzeichen als ASCII nur, bei langer eingabe
            for (int s=0;s<Häufigste_zeichen_in_sprachen.length&&Welche_Sprachen[s]==true;s++){
                for (int i=1;i<Häufigste_zeichen_in_sprachen[s].length;i++){
                    Häufigste_zeichen_in_sprachen[s][i-1] = Häufigste_zeichen_in_sprachen[s][i];
                    if (Häufigste_zeichen_in_sprachen[s].length==i-1){
                        Häufigste_zeichen_in_sprachen[s][i]=0;
                    }
                }
            }
        }

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
        String[] ASCII_sortirt = new String[Anzahl_für_sortirung.length];

        for (int i=0;i<Anzahl_für_sortirung_als_double.length;i++){                                                     // als double fürs sortiren
            Anzahl_für_sortirung_als_double[i] = Double.valueOf(Anzahl_für_sortirung[i]);
        }

        for (int i = 0;i < Anzahl_für_sortirung_als_double.length;i++) {                                                // sortirt für jede sprache jeden treffer. größte vorne
            int temp = 0;
            double max = 0;
            for (int j = 0; j < Anzahl_für_sortirung_als_double.length; j++) {
                if (Anzahl_für_sortirung_als_double[j]!=null&&Anzahl_für_sortirung_als_double[j] > max) {
                    max = Anzahl_für_sortirung_als_double[j];
                    ASCII_sortirt[i] = Anzahl_für_sortirung[j];
                    temp = j;
                }
            }
            Anzahl_für_sortirung_als_double[temp] = null;
        }

        for (int s=0;s<Häufigste_zeichen_in_sprachen.length&&Welche_Sprachen[s];s++) {
            for (int i = 0; i < Häufigste_zeichen_in_sprachen[s].length; i++) {                                         // Array in String umwandeln für einfacher weitere bearbeitung
                ASCII_richtige[s] += ASCII_sortirt[i];
                ASCII_richtige[s] += " ";
            }
        }

        String Häufigste_Ascii_A[][] = new String[Häufigste_zeichen_in_sprachen.length][Häufigste_zeichen_in_sprachen[0].length+1];                                       // hätte glaube ich auch das allte array wieder nehmen können

        for (int s=0;s<Häufigste_zeichen_in_sprachen.length&&Welche_Sprachen[s];s++) {
            int couter = 0;                                                                                             // Nach dem das Array nach der Anzal der ASCII symbole sortiert worten ist wird diese info nicht mehr benötigt zudem wird aus dem string wieder ein Array
            for (int i = 0; i < ASCII_richtige[s].length(); ++i) {
                if (ASCII_richtige[s].charAt(i) == '.' && ASCII_richtige[s].charAt(i - 1) != '0') {
                    String sBuchstabe = "";
                    i++;
                    while (ASCII_richtige[s].charAt(i) != ' ') {
                        sBuchstabe += ASCII_richtige[s].charAt(i);
                        i++;
                    }
                    Häufigste_Ascii_A[s][couter] =sBuchstabe;
                    couter++;
                }
            }
        }

        for (int s = 0;s < Häufigste_zeichen_in_sprachen.length&&Welche_Sprachen[s];s++) {
            for (int i = 0; i < Häufigste_zeichen_in_sprachen[s].length && i < Häufigste_Ascii_A[s].length && Häufigste_Ascii_A[s][i] != null; i++) {         // Die informatonen dadrüber, welches ASCII symbol mit welchem ASCII Symbol aus welcher sprache ersetzt werden soll wird zusammen geführt
                was_wo_mit_ersetzen[s][i] = Häufigste_Ascii_A[s][i];
                was_wo_mit_ersetzen[s][i] += ".";
                was_wo_mit_ersetzen[s][i] += Häufigste_zeichen_in_sprachen[s][i];
            }
        }

        for (int s=0;s < Häufigste_zeichen_in_sprachen.length&&Welche_Sprachen[s]==true;s++) {
            for (int i = 0; i < was_wo_mit_ersetzen[s].length; i++) {                                                   // Das Array wird wieder in einen String verwandelt, da ich nicht weiß wie man ein String Array an eine Methode übergibt
                was_wo_mit_ersetzen_S[s] += was_wo_mit_ersetzen[s][i];
                was_wo_mit_ersetzen_S[s] += " ";
            }
        }

        int weiter =1;
        while (weiter!=0) {

            for (int s = 0; s < Häufigste_zeichen_in_sprachen.length&&Welche_Sprachen[s]; s++) {

                Ausgabe[s] = Ausgabe_erstellen(Eingabe, Ausgabe[s], was_wo_mit_ersetzen_S[s]);                          // Es wird eine Ausgabe erstellt. Wie siehe "Ausgabe_erstellen"

                System.out.println("Warscheinlichste Entschlüsselung in "+Sprachen_Namen[s]);                           // Ausgabe für jede Sprache
                System.out.println(Ausgabe[s]);
            }
            System.out.println("\b"+"(0) Programm beenden");                                                            // Menü für die weitere Bearbeitung
            System.out.println("(1) änlich warscheinliche Entschlüsselungen");
            System.out.println("(2) habe ein Wort erkannt");
            weiter = input.nextInt();

            switch (weiter){                                                                                            // umsetzung des Menüs
                case 0:
                    System.out.println("Program wurde beendet");
                    System.exit(0);
                    break;
                case 1:
                    for (int s=0;s<Häufigste_zeichen_in_sprachen.length;s++) {
                        was_wo_mit_ersetzen_S[s] = "";
                        for (int i = 0; i < was_wo_mit_ersetzen[s].length; i++) {                                       // Das Array wird wieder in einen String verwandelt, da ich nicht weiß wie man ein String Array an eine Methode übergibt
                            was_wo_mit_ersetzen_S[s] += was_wo_mit_ersetzen[s][i];
                            was_wo_mit_ersetzen_S[s] += " ";
                        }
                        was_wo_mit_ersetzen_S[s] = case1(was_wo_mit_ersetzen_S[s]);                                     // Eine Mutation der Warscheinlichsten Entschlüsselung wird erstellt. Siehe "case1"
                    }
                    break;
                case 2:
                    for (int s=0;s < Häufigste_zeichen_in_sprachen.length&&Welche_Sprachen[s];s++) {
                        was_wo_mit_ersetzen_S[s] = case2(Ausgabe[s], was_wo_mit_ersetzen_S[s],s);                       // Es kann wenn der Anwender ein Wort erkennt jede Ausgabe umgeändert
                        for (int a = 0; a < Häufigste_zeichen_in_sprachen.length; a++) {
                            was_wo_mit_ersetzen[s] = was_wo_mit_ersetzen_S[s].split(" ");
                        }
                    }
                    break;
                    default:
                        System.out.println("Bitte gültige Eingabe tätigen");
                        break;
            }
        }
    }

    public static String Ausgabe_erstellen (String Eingabe,String Ausgabe,String was_wo_mit_ersetzen_S){                // Ausgabe wird in jeder Sprache erstellt

        Ausgabe = "";
        String[] was_wo_mit_ersetzen_d = was_wo_mit_ersetzen_S.split(" ");                                        // Aus String nen Array machen

        for (int y = 0;y < Eingabe.length();y++) {
            String was = "";
            String wo_mit_d = "";
            boolean wurde_ersetzt = false;
            for (int j = 0; j < was_wo_mit_ersetzen_d.length; j++) {                                                    // der reihe nach werden alle ASCII symbole in der eingabe durchgegangen und etsprechend in den Ausgabe für jede sprache genändert
                if (was_wo_mit_ersetzen_d[j].contains(".")){

                    was = was_wo_mit_ersetzen_d[j].substring(0,was_wo_mit_ersetzen_d[j].indexOf('.'));                  // informaton wieder in 2 aufteilen
                    wo_mit_d = was_wo_mit_ersetzen_d[j].substring(was_wo_mit_ersetzen_d[j].indexOf('.')+1);

                    if (Eingabe.charAt(y)==Integer.valueOf(was)){
                        Ausgabe += (char)Integer.parseInt(wo_mit_d);
                        wurde_ersetzt = true;
                    }
                }
            }
            if (!wurde_ersetzt){
                Ausgabe += '~';
            }
        }
        return Ausgabe;                                                                                                 // rückgabe aller Ausgaben in allen Sprachen
    }

    public static String case1 (String was_wo_mit_ersetzen_S){                                                          // logic für case 1 im 2. menü

        String[] was_wo_mit_ersetzen_d = was_wo_mit_ersetzen_S.split(" ");                                        // Aus String nen Array machen

        String was = "";
        String was_alt = "";
        String wo_mit_d = "";
        String wo_mit_d_alt = "";

       for (int i=0;i<was_wo_mit_ersetzen_d.length;i++){                                                                // Mit einer giwissen warscheinlichkeit werden 2 plätze miteinander getauscht
           if (was_wo_mit_ersetzen_d[i].contains(".")){

               was = was_wo_mit_ersetzen_d[i].substring(0,was_wo_mit_ersetzen_d[i].indexOf('.'));
               wo_mit_d = was_wo_mit_ersetzen_d[i].substring(was_wo_mit_ersetzen_d[i].indexOf('.')+1);                  // informaton wieder in 2 aufteilen

               if (was_alt!=""&&wo_mit_d_alt!=""&&Math.random()*100<20){
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

       was_wo_mit_ersetzen_S="";
        for (int i=0;i<was_wo_mit_ersetzen_d.length;i++){                                                               // Array zu String, weil ich Arrays nicht übergeben kann
            was_wo_mit_ersetzen_S +=was_wo_mit_ersetzen_d[i];
            was_wo_mit_ersetzen_S += " ";
        }
        return was_wo_mit_ersetzen_S;                                                                                   // gibt die Mutirte lieste, welcher ASCII wert mit welchem ersetzt werden soll, zurück
    }

    public static String case2 (String Ausgabe,String was_wo_mit_ersetzen_S,int Name_Sprache){                          // logic für case 2 im Menü 2

        String Sprachen_Namen[] = {"deutsch","englisch","französisch","spanisch","italienisch","schwedisch","polnisch"};
        Scanner input  =new Scanner(System.in);
        String[] was_wo_mit_ersetzen = was_wo_mit_ersetzen_S.split(" ");                                          // String zu Array

        System.out.println("Bitte geben Sie zuerst das Wort ein, dass Sie in "+ Sprachen_Namen[Name_Sprache] +" ersetzen wollen und bei der 2. Eingabe das Wort mit dem Sie das erste ersetzen wollen");
        System.out.println("Weches Wort ersetzen?");                                                                    // Menü für den Fall, dass der Anwender ein Wort identifizirt hat
        String welches_Wort = input.nextLine();
        System.out.println("Mit welchem Wort ersetzen?");
        String mit_welchem_Wort = input.nextLine();

        String was = "";
        String wo_mit_d = "";
        char temp = ' ';
        boolean wurde_ersetzt[] = new boolean[welches_Wort.length()];
        boolean wort_im_text = true;

        for (int i=0;i < welches_Wort.length();i++){
            if (!Ausgabe.contains(String.valueOf(welches_Wort.charAt(i)))){
                wort_im_text = false;
            }
        }

        if (wort_im_text==true){
            for (int i = 0;i<welches_Wort.length();i++){                                                                // jedes ASCII zeichen in dem "gefundem" wort soll gegen das von nutzer angegebe ASCII zeichen ersetzt werden

                temp = welches_Wort.charAt(i);

                for (int j=0;j<was_wo_mit_ersetzen.length;j++){
                    if (was_wo_mit_ersetzen[j].contains(".")&&wurde_ersetzt[i]!=true){

                        was = was_wo_mit_ersetzen[j].substring(0,was_wo_mit_ersetzen[j].indexOf('.'));                  // informaton wieder in 2 aufteilen
                        wo_mit_d = was_wo_mit_ersetzen[j].substring(was_wo_mit_ersetzen[j].indexOf('.')+1);

                        if (Integer.parseInt(wo_mit_d)==(int)temp){                                                     // neue infos was womit ersetzt werden soll

                            was_wo_mit_ersetzen[j] = was;
                            was_wo_mit_ersetzen[j] += '.';
                            was_wo_mit_ersetzen[j] += (int)mit_welchem_Wort.charAt(i);

                            for (int k=0;k < was_wo_mit_ersetzen.length&&wo_mit_d==String.valueOf(mit_welchem_Wort.charAt(i));k++){

                                was_wo_mit_ersetzen= null;
                            }
                        }
                    }
                }
            }
        }
        else {
            System.out.println("Das von Ihnen eingegebene Wort konnte nicht in dem entschlüsseltem Text gefunden werden");
        }
        was_wo_mit_ersetzen_S="";
        for (int i=0;i<was_wo_mit_ersetzen.length;i++){                                                                 // Array zu String, weil ich Arrays nicht übergeben kann
            was_wo_mit_ersetzen_S +=was_wo_mit_ersetzen[i];
            was_wo_mit_ersetzen_S += " ";
        }
     return was_wo_mit_ersetzen_S;
    }
}