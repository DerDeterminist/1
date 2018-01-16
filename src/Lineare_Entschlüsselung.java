import java.io.*;
import java.util.Scanner;

public class Lineare_Entschlüsselung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Eingabe = "";
        String Ausgabe = "";
        String Ausgabe_die_richtige = "";
        int Treffer = 0;
        String Beispiele = "";
        int k_ = 0;
        int Anzahl_der_Treffer = 0;
        int welcherbuchstabeoderso = 0;

        System.out.println("Automatische lineare Entschlüsselung");
        System.out.println("Bitte zu entschlüsselnden Text eingeben");
        Eingabe = input.nextLine();


        BufferedReader br = null;                                        //Beispiele einlsen
        try {
            br = new BufferedReader(new FileReader(new File("D:\\Betrieblich\\vorabreiten\\uebungen\\Textdatein\\§Wörterklein.txt")));
            String line = null;

            while ((line = br.readLine()) != null) {
                Beispiele += line + " ";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        Beispiele = Beispiele.toLowerCase();                                                                                    //beispiele aus txt klein
        String BeispieleA[] = Beispiele.split(" ");                                                                     //beispiele aus txt in array
        Eingabe = Eingabe.toLowerCase();
        String EingabeA[] = Eingabe.split(" ");


        for (int i = 0; i < EingabeA.length; i++) {                                                                        //für jedes wort  int k = 97; k < 123; k++

            for (int j = 0;j<EingabeA[i].length();j++) {

                for (int k = 97; k < 123; k++) {

                    if (Character.isLetter(EingabeA[i].charAt(j))) {

                        if (EingabeA[i].charAt(j) == 'ü' || EingabeA[i].charAt(j) == 'ö' || EingabeA[i].charAt(j) == 'ä') {
                            Ausgabe += EingabeA[i].charAt(j);                                                                           //umlaute anhängen
                        } else {

                            Ausgabe += (char) k;

                        }
                    } else {                                                                 //sonderzeichen
                        Ausgabe += EingabeA[i].charAt(j);
                    }
                }

                for (int m_ = 0; m_ < BeispieleA.length; m_++) {                                 //für jedes beispiel
                    if (Ausgabe.contains(BeispieleA[m_])) {
                        Treffer += BeispieleA[m_].length() * 1.8;  //wenn ein treffer gefunden wird praktisch die länge aller treffer bei dieser verschlüsslung adirt
                    }
                }

                if (Treffer > Anzahl_der_Treffer) {
                    Anzahl_der_Treffer = Treffer;
                    Ausgabe_die_richtige = Ausgabe;
                }
                Treffer = 0;
                System.out.println(Ausgabe);
                Ausgabe = "";
            }
        }
        System.out.println(Ausgabe_die_richtige);
    }
}