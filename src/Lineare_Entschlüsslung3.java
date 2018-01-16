import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lineare_Entschlüsslung3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Eingabe = null;
        int ASCII_in_Eingabe[] = new int[127];
        String Heufigste_ASCII_in_Eingabe = "";
        int Häufigste_26_in_Eingabe[] = new int[52];
        int ASCII_richtige_Reihenfolge[]=new int[26];
        String ASCII_richtige = "";

        Eingabe = input.nextLine();

        for (int i= 0;i < Eingabe.length();i++){
            for (int j = 33;j <=126;j++){
                if (Eingabe.charAt(i)==(char)j){
                    ASCII_in_Eingabe[j]+=1;
                }
            }
        }

        for (int i = 0;i<ASCII_in_Eingabe.length;i++){                                                  //string mit allen infos basteln
            Heufigste_ASCII_in_Eingabe+=ASCII_in_Eingabe[i];
            Heufigste_ASCII_in_Eingabe+=".";
            Heufigste_ASCII_in_Eingabe+=i;
            Heufigste_ASCII_in_Eingabe+=" ";
        }

        String[] Anzahl_für_sortirung = Heufigste_ASCII_in_Eingabe.split(" ");

        Arrays.sort(Anzahl_für_sortirung);

        for (int i =0;i<(Anzahl_für_sortirung.length/2);i++){                                       //Array umdrehen
            String temp ="";
            temp = Anzahl_für_sortirung[i];
            Anzahl_für_sortirung[i]=Anzahl_für_sortirung[(Anzahl_für_sortirung.length-i-1)];
            Anzahl_für_sortirung[Anzahl_für_sortirung.length-i-1]=temp;
        }

        for (int i=Anzahl_für_sortirung.length-1;i>=26;i--){                                        //überflüssiges löschen
            Anzahl_für_sortirung[i]="";
        }

        for (int i=0;i<26;i++){                                          //array to string
            ASCII_richtige+=Anzahl_für_sortirung[i];
            ASCII_richtige+=" ";
        }

        //System.out.println(ASCII_richtige);

        int couter = 0;
        for (int i=0;i<ASCII_richtige.length()-1;i++){
            if (ASCII_richtige.charAt(i)=='.'){
                String sBuchstabe = "";
                int a = i;
                while (ASCII_richtige.charAt(a+1)!=' '){
                    sBuchstabe+=ASCII_richtige.charAt(a+1);
                    a++;
                }

                //System.out.println(sBuchstabe);
                System.out.println((char)Integer.parseInt(sBuchstabe));

                switch (couter){
                    case 0:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'e');
                        break;
                    case 1:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'n');
                        break;
                    case 2:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'i');
                        break;
                    case 3:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'s');
                        break;
                    case 4:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'r');
                        break;
                    case 5:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'a');
                        break;
                    case 6:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'t');
                        break;
                    case 7:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'d');
                        break;
                    case 8:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'h');
                        break;
                    case 9:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'u');
                        break;
                    case 10:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'l');
                        break;
                    case 11:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'c');
                        break;
                    case 12:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'g');
                        break;
                    case 13:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'m');
                        break;
                    case 14:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'o');
                        break;
                    case 15:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'b');
                        break;
                    case 16:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'w');
                        break;
                    case 17:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'f');
                        break;
                    case 18:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'k');
                        break;
                    case 19:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'z');
                        break;
                    case 20:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'p');
                        break;
                    case 21:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'v');
                        break;
                    case 22:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'ß');
                        break;
                    case 23:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'j');
                        break;
                    case 24:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'y');
                        break;
                    case 25:
                        Eingabe.replace((char)Integer.parseInt(sBuchstabe),'x');
                        break;
                    }
                couter++;
            }
        }

        System.out.println(Eingabe);

    }
}

