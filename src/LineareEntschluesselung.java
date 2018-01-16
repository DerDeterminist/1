import java.util.Arrays;
import java.util.Scanner;

public class LineareEntschluesselung {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String Eingabe = null;
        int ASCII_in_Eingabe[] = new int[127];
        String Heufigste_ASCII_in_Eingabe = "";
        String ASCII_richtige = "";
        int Häufigste_zeichen_d[] = {'e','n','i','s','r','a','t','d','h','u','l','c','g','m','o','b','w','f','k','z','p','v','ß','j','y','x','q'};
        String was_wo_mit_ersetzen_d[] = new String[Häufigste_zeichen_d.length];
        String Ausgabe_d = "";
        String was_wo_mit_ersetzen_d_S = "";


        System.out.println("Lineare Entschlüsselung");
        System.out.print("Eingabe:");
        Eingabe = input.nextLine();

        for (int i = 0; i < Eingabe.length(); i++) {
            for (int j = 33; j <= 126; j++) {
                if (Eingabe.charAt(i) == (char) j) {
                    ASCII_in_Eingabe[j] += 1;
                }
            }
        }

        for (int i = 0; i < ASCII_in_Eingabe.length; i++) {                                                  //string mit allen infos basteln
            Heufigste_ASCII_in_Eingabe += ASCII_in_Eingabe[i];
            Heufigste_ASCII_in_Eingabe += ".";
            Heufigste_ASCII_in_Eingabe += i;
            Heufigste_ASCII_in_Eingabe += " ";
        }

        String[] Anzahl_für_sortirung = Heufigste_ASCII_in_Eingabe.split(" ");

        Arrays.sort(Anzahl_für_sortirung);

        for (int i = 0; i < (Anzahl_für_sortirung.length / 2); i++) {                                       //Array umdrehen
            String temp = "";
            temp = Anzahl_für_sortirung[i];
            Anzahl_für_sortirung[i] = Anzahl_für_sortirung[(Anzahl_für_sortirung.length - i - 1)];
            Anzahl_für_sortirung[Anzahl_für_sortirung.length - i - 1] = temp;
        }

        for (int i = Anzahl_für_sortirung.length - 1; i >= 26; i--) {                                        //überflüssiges löschen
            Anzahl_für_sortirung[i] = "";
        }

        for (int i = 0; i < 26; i++) {                                          //array to string
            ASCII_richtige += Anzahl_für_sortirung[i];
            ASCII_richtige += " ";
        }

        String Häufigste_Ascii_A[] = new String[27];

        int couter = 0;                                                                                     //nimmt nur die ersten 4 mit
        for (int i = 0; i < ASCII_richtige.length(); ++i) {
            if (ASCII_richtige.charAt(i) == '.'&&ASCII_richtige.charAt(i-1)!='0') {
                String sBuchstabe = "";
                int a = i+1;
                while (ASCII_richtige.charAt(a) != ' ') {
                    sBuchstabe += ASCII_richtige.charAt(a);
                    a++;
                }
                Häufigste_Ascii_A[couter] = sBuchstabe;
                couter++;
            }
        }

        for (int i=0;i<Häufigste_zeichen_d.length&&i<Häufigste_Ascii_A.length&&Häufigste_Ascii_A[i]!=null;i++){
            was_wo_mit_ersetzen_d[i] = Häufigste_Ascii_A[i];
            was_wo_mit_ersetzen_d[i] += ".";
            was_wo_mit_ersetzen_d[i] += Häufigste_zeichen_d[i];
        }


        for (int i=0;i<was_wo_mit_ersetzen_d.length;i++){
            was_wo_mit_ersetzen_d_S +=was_wo_mit_ersetzen_d[i];
            was_wo_mit_ersetzen_d_S += " ";
        }
        Ausgabe_d = Ausgabe_erstellen(Eingabe,Ausgabe_d,was_wo_mit_ersetzen_d_S);

//        Ausgabe_d = Eingabe;
//        boolean wurde_ersetzt[] = new boolean[Eingabe.length()];
//        for (int y = 0;y < Eingabe.length();y++) {
//            String was = "";
//            String wo_mit_d = "";
//            for (int j = 0; j < was_wo_mit_ersetzen_d.length; j++) {
//                if (was_wo_mit_ersetzen_d[j] != null) {
//                    int b = 0;
//                    was = "";
//                    wo_mit_d="";
//                    while (was_wo_mit_ersetzen_d[j].charAt(b) != '.') {
//                        was += was_wo_mit_ersetzen_d[j].charAt(b);
//                        b++;
//                    }
//                    b++;
//                    while (b < was_wo_mit_ersetzen_d[j].length()) {
//                        wo_mit_d += was_wo_mit_ersetzen_d[j].charAt(b);
//                        b++;
//                    }
//                    if (Eingabe.charAt(y)==(char)Integer.parseInt(was)){
//                            Ausgabe_d=Ausgabe_d.replace(Ausgabe_d.charAt(y),(char)Integer.parseInt(wo_mit_d));wurde_ersetzt[y]=true;
//                        }
//
//                    if (wurde_ersetzt[y]!=true){
//                        Ausgabe_d=Ausgabe_d.replace(Ausgabe_d.charAt(y),'~');
//                    }
//                }
//            }
//        }

        System.out.println("Warscheinlichste Entschlüsselung in deutsch");
        System.out.println(Ausgabe_d);

        int weiter =1;
        while (weiter!=0) {
            System.out.println("(0) Programm beenden");
            System.out.println("(1) änlich warscheinliche Entschlüsselungen");
            System.out.println("(2) habe ein Wort erkannt");
            weiter = input.nextInt();

            switch (weiter){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    was_wo_mit_ersetzen_d_S = "";
                    for (int i=0;i<was_wo_mit_ersetzen_d.length;i++){
                        was_wo_mit_ersetzen_d_S +=was_wo_mit_ersetzen_d[i];
                        was_wo_mit_ersetzen_d_S += " ";
                    }
                    was_wo_mit_ersetzen_d_S=case1(was_wo_mit_ersetzen_d_S);
                    Ausgabe_d=Ausgabe_erstellen(Eingabe,Ausgabe_d,was_wo_mit_ersetzen_d_S);
                    System.out.println(Ausgabe_d);
                    break;
                case 2:
                    was_wo_mit_ersetzen_d_S = "";
                    for (int i=0;i<was_wo_mit_ersetzen_d.length;i++){
                        was_wo_mit_ersetzen_d_S +=was_wo_mit_ersetzen_d[i];
                        was_wo_mit_ersetzen_d_S += " ";
                    }
                    was_wo_mit_ersetzen_d_S=case2(Ausgabe_d,was_wo_mit_ersetzen_d_S);
                    break;
            }
        }
    }



    public static String Ausgabe_erstellen (String Eingabe,String Ausgabe_d,String was_wo_mit_ersetzen_d_S){

        String[] was_wo_mit_ersetzen_d = was_wo_mit_ersetzen_d_S.split(" ");

        Ausgabe_d = Eingabe;
        boolean wurde_ersetzt[] = new boolean[Eingabe.length()];
        for (int y = 0;y < Eingabe.length();y++) {
            String was = "";
            String wo_mit_d = "";
            for (int j = 0; j < was_wo_mit_ersetzen_d.length; j++) {
                if (was_wo_mit_ersetzen_d[j]!=null&&wurde_ersetzt[y]!=true) {
                    int b = 0;
                    was = "";
                    wo_mit_d="";

                    was = was_wo_mit_ersetzen_d[j].substring(0,was_wo_mit_ersetzen_d[j].indexOf('.'));
                    wo_mit_d = was_wo_mit_ersetzen_d[j].substring(was_wo_mit_ersetzen_d[j].indexOf('.'));

                    if (Eingabe.charAt(y)==(char)Integer.parseInt(was)){
                        Ausgabe_d=Ausgabe_d.replace(Ausgabe_d.charAt(y),(char)Integer.parseInt(wo_mit_d));wurde_ersetzt[y]=true;
                    }
                    if (wurde_ersetzt[y]!=true){
                        Ausgabe_d=Ausgabe_d.replace(Ausgabe_d.charAt(y),'~');
                    }
                }
            }
        }
        return Ausgabe_d;
    }

    public static String case1 (String was_wo_mit_ersetzen_d_S){

        String[] was_wo_mit_ersetzen_d = was_wo_mit_ersetzen_d_S.split(" ");

       for (int i=1;i<was_wo_mit_ersetzen_d.length;i++){
           if (Math.random()*100<15){
               String temp = "";
               temp = was_wo_mit_ersetzen_d[i];
               was_wo_mit_ersetzen_d[i]=was_wo_mit_ersetzen_d[i-1];
               was_wo_mit_ersetzen_d[i-1] = temp;
           }
       }
       was_wo_mit_ersetzen_d_S="";
        for (int i=0;i<was_wo_mit_ersetzen_d.length;i++){
            was_wo_mit_ersetzen_d_S +=was_wo_mit_ersetzen_d[i];
            was_wo_mit_ersetzen_d_S += " ";
        }
        return was_wo_mit_ersetzen_d_S;
    }

    public static String case2 (String Ausgabe_d,String was_wo_mit_ersetzen_d_S){
        Scanner input  =new Scanner(System.in);
        String[] was_wo_mit_ersetzen_d = was_wo_mit_ersetzen_d_S.split(" ");

        System.out.println("Weches Wort gefunden?");
        String welches_Wort = input.nextLine();
        System.out.println("Durch welches soll dieses ersetzt werden?");
        String mit_welchem_Wort = input.nextLine();

        String was = "";
        String wo_mit_d = "";
        char temp = ' ';
        boolean wurde_ersetzt[] = new boolean[welches_Wort.length()];
        if (Ausgabe_d.contains(welches_Wort)){
            for (int i= Ausgabe_d.indexOf(welches_Wort);(i-Ausgabe_d.indexOf(welches_Wort))<welches_Wort.length();i++){

                temp = Ausgabe_d.charAt(i);

                for (int j=0;j<was_wo_mit_ersetzen_d.length;j++){
                    if (was_wo_mit_ersetzen_d[j]!=null&&wurde_ersetzt[i-Ausgabe_d.indexOf(welches_Wort)]!=true) {
                        int b = 0;
                        was = "";
                        wo_mit_d = "";
                        String Split[] = was_wo_mit_ersetzen_d[j].split("\\.");
                        was = Split[0];
                        wo_mit_d = Split[1];
                        if (wo_mit_d==String.valueOf(temp)){
                            // im string array was_wo_mit_ersetzen_d die werte, die untescheidlich sind ändern
                        }
                    }
                }
            }
        }
     return "asdf";
    }




}

