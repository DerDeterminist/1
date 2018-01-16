import java.io.*;
import java.util.*;
public class Rotationsentschlüsselung {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String Eingabe = "";
        String Ausgabe = "";
        String AusgabeA[] = new String [26];                                // eingabe in allen möglichen verschlüsselungen
        String Zwischen1 = "";
        String Beispiele = "die der und in zu den das nicht von sie ist des sich mit dem dass er es ein ich auf so eine auch als an nach wie im man aber aus durch wenn nur war noch werden bei hat wir was wird sein einen welche sind oder zur um haben einer mir ihm diese einem ihr uns da zum kann doch vor dieser mich ihn du hatte seine mehr am denn nun unter sehr selbst schon hier bis habe ihre dann ihnen seiner alle wieder meine Zeit gegen vom ganz einzelnen wo muss ohne eines sei ja wurde jetzt immer seinen wohl dieses ihren würde diesen sondern weil welcher nichts diesem alles waren will Herr viel mein also soll worden lassen dies machen ihrer weiter Leben recht etwas keine seinem ob dir allen großen Jahre Weise müssen welches wäre erst einmal Mann hätte zwei dich allein Herren während Paragraph anders Liebe kein damit gar Hand Herrn euch sollte konnte ersten deren zwischen wollen denen dessen sagen bin Menschen gut darauf wurden weiß gewesen Seite bald weit große solche hatten eben andern beiden macht sehen ganze anderen lange wer ihrem zwar gemacht dort kommen Welt heute Frau werde derselben ganzen deutschen lässt vielleicht meiner";
        int k = 0;
        boolean richtige_gefunden_ = false;

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
        System.out.println("Bitte zu entschlüsselnden Text eingeben");
        Eingabe = input.nextLine();


        BufferedReader br =null;                                        //Beispiele einlsen
        try {
            br = new BufferedReader(new FileReader(new File("D:\\Betrieblich\\vorabreiten\\uebungen\\Textdatein\\§Wörter.txt")));
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

        String BeispieleA[] = Beispiele.split(" ");                                                                     //beispiele aus txt in array

        int Zwischen[] = new int[Eingabe.length()];

        Eingabe = Eingabe.toLowerCase();

        for (;o <= 25;o++) {                                                                                                    //für jede rot verschlüsslung

            for (int i = 0; i < Eingabe.length(); i++) {                                                                            //für die gesamte eingabe

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
        System.out.println("sollte die Ausgabe falsch sein \"false\" eingeben");
        richtige_gefunden_ = input.nextBoolean();

        if (richtige_gefunden_==false){
            Treffer[Richtigeverschlüsslung]= Treffer[Richtigeverschlüsslung]/500;
        }
        else {
            System.exit(0);
        }
    }
    }
}
