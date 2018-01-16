import java.io.*;
import java.util.Scanner;

public class Lineare_Entschlüsselung2 {
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

        for (int a = 0; a < 26; a++) {
            for (int b = 0; b < 26; b++) {
                for (int c = 0; c < 26; c++) {
                    for (int d = 0; d < 26; d++) {
                        for (int e = 0; e < 26; e++) {
                            for (int f = 0; f < 26; f++) {
                                for (int g = 0; g < 26; g++) {
                                    for (int h = 0; h < 26; h++) {
                                        for (int i = 0; i < 26; i++) {
                                            for (int j = 0; j < 26; j++) {
                                                for (int k = 0; k < 26; k++) {
                                                    for (int l = 0; l < 26; l++) {
                                                        for (int m = 0; m < 26; m++) {
                                                            for (int n = 0; n < 26; n++) {
                                                                for (int o = 0; o < 26; o++) {
                                                                    for (int p = 0; p < 26; p++) {
                                                                        for (int q = 0; q < 26; q++) {
                                                                            for (int r = 0; r < 26; r++) {
                                                                                for (int s = 0; s < 26; s++) {
                                                                                    for (int t = 0; t < 26; t++) {
                                                                                        for (int u = 0; u < 26; u++) {
                                                                                            for (int v = 0; v < 26; v++) {
                                                                                                for (int w = 0; w < 26; w++) {          //etwa ++ jede sec bei ~ 20 buchstaben länge
                                                                                                    for (int x = 0; x < 26; x++) {
                                                                                                        for (int y = 0; y < 26; y++) {
                                                                                                            for (int z = 0; z < 26; z++) {

                                                                                                                Ausgabe = "";

                                                                                                                for (int i_ = 0; i_ < Eingabe.length(); i_++) {                                                                        //für die gesamte eingabe

                                                                                                                    if (Character.isLetter(Eingabe.charAt(i_))) {                                                                     //allles zu kleinbuchstaben

                                                                                                                        if (Eingabe.charAt(i_) == 'ü' || Eingabe.charAt(i_) == 'ö' || Eingabe.charAt(i_) == 'ä') {
                                                                                                                            Ausgabe += Eingabe.charAt(i_);                                                                           //umlaute anhängen
                                                                                                                        } else {

                                                                                                                            k_ = (int)Eingabe.charAt(i_);
                                                                                                                            k_ = k_ - 97;

                                                                                                                            while (k_ > 25) {                             //k anpassen
                                                                                                                                k_ -= 26;
                                                                                                                            }

                                                                                                                            if (k_==a){
                                                                                                                                welcherbuchstabeoderso = a;
                                                                                                                            }
                                                                                                                            if (k_==b){
                                                                                                                                welcherbuchstabeoderso = b;
                                                                                                                            }
                                                                                                                            if (k_==c){
                                                                                                                                welcherbuchstabeoderso = c;
                                                                                                                            }
                                                                                                                            if (k_==d){
                                                                                                                                welcherbuchstabeoderso = d;
                                                                                                                            }
                                                                                                                            if (k_==e){
                                                                                                                                welcherbuchstabeoderso = e;
                                                                                                                            }
                                                                                                                            if (k_==f){
                                                                                                                                welcherbuchstabeoderso = f;
                                                                                                                            }
                                                                                                                            if (k_==g){
                                                                                                                                welcherbuchstabeoderso = g;
                                                                                                                            }
                                                                                                                            if (k_==h){
                                                                                                                                welcherbuchstabeoderso = h;
                                                                                                                            }
                                                                                                                            if (k_==i){
                                                                                                                                welcherbuchstabeoderso = i;
                                                                                                                            }
                                                                                                                            if (k_==j){
                                                                                                                                welcherbuchstabeoderso = j;
                                                                                                                            }
                                                                                                                            if (k_==k){
                                                                                                                                welcherbuchstabeoderso = k;
                                                                                                                            }
                                                                                                                            if (k_==l){
                                                                                                                                welcherbuchstabeoderso = l;
                                                                                                                            }
                                                                                                                            if (k_==m){
                                                                                                                                welcherbuchstabeoderso = m;
                                                                                                                            }
                                                                                                                            if (k_==n){
                                                                                                                                welcherbuchstabeoderso = n;
                                                                                                                            }
                                                                                                                            if (k_==o){
                                                                                                                                welcherbuchstabeoderso = o;
                                                                                                                            }
                                                                                                                            if (k_==p){
                                                                                                                                welcherbuchstabeoderso = p;
                                                                                                                            }
                                                                                                                            if (k_==q){
                                                                                                                                welcherbuchstabeoderso = q;
                                                                                                                            }
                                                                                                                            if (k_==r){
                                                                                                                                welcherbuchstabeoderso = r;
                                                                                                                            }
                                                                                                                            if (k_==s){
                                                                                                                                welcherbuchstabeoderso = s;
                                                                                                                            }
                                                                                                                            if (k_==t){
                                                                                                                                welcherbuchstabeoderso = t;
                                                                                                                            }
                                                                                                                            if (k_==u){
                                                                                                                                welcherbuchstabeoderso = u;
                                                                                                                            }
                                                                                                                            if (k_==v){
                                                                                                                                welcherbuchstabeoderso = v;
                                                                                                                            }
                                                                                                                            if (k_==w){
                                                                                                                                welcherbuchstabeoderso = w;
                                                                                                                            }
                                                                                                                            if (k_==x){
                                                                                                                                welcherbuchstabeoderso = x;
                                                                                                                            }
                                                                                                                            if (k_==y){
                                                                                                                                welcherbuchstabeoderso = y;
                                                                                                                            }
                                                                                                                            if (k_==z){
                                                                                                                                welcherbuchstabeoderso = z;
                                                                                                                            }

                                                                                                                            welcherbuchstabeoderso += 97;
                                                                                                                            Ausgabe += (char)welcherbuchstabeoderso;                          //neuzusammensetzen
                                                                                                                            welcherbuchstabeoderso=0;
                                                                                                                        }
                                                                                                                    } else {                                                                 //sonderzeichen
                                                                                                                        Ausgabe += Eingabe.charAt(i_);
                                                                                                                    }
                                                                                                                }

                                                                                                                System.out.println(Ausgabe);

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


                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(Ausgabe_die_richtige);
    }
}