import java.util.*;
public class suche {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //suchen

        String Suchbegriffe = "";
        String Text = "";
        String Text_ohne_suchbegriffe = "";

        System.out.println("Es können mehere Suchbegriffe eingegeben werden. Diese werden mit einem Lehrzeichen getrennt");
        System.out.println("Bitte geben Sie die Suchbegriffe ein");
        Suchbegriffe = input.nextLine();
        System.out.println("Bitte geben Sie den Text ein in dem gesucht werden soll"+"\n"+"Der Text darf kein Zeilenumbruch enthalten. Wenn doch startet die Suche direkt und wird nicht korrekt ausgeführt");
        Text = input.nextLine();

        //suchbetriffe in arry
        String SuchbegriffeA[] = Suchbegriffe.split(" ");

        for (int i = 0; i < SuchbegriffeA.length;i++){
            if (Text.contains(SuchbegriffeA[i])) {
                System.out.println(SuchbegriffeA[i] + " an Stelle "+Text.indexOf(SuchbegriffeA[i])+" das erste Mal gefunden");                  //gibt eine stelle vor dem fundort an
                Text_ohne_suchbegriffe = Text.replace(SuchbegriffeA[i],"");                                                         //Suchbegriff im text löschen
                System.out.println((Text.length()-Text_ohne_suchbegriffe.length())/SuchbegriffeA[i].length()+" mal im Text"+"\n");              //(text - text ohne das gesuchte wort)/länge des gesuchten worts
            }
            else {
                System.out.println(SuchbegriffeA[i]+" nicht gefunden"+"\n");
            }
        }

       /* String Wechsel [][] = new String[SuchbegriffeA.length][Text.length()];
        int couter1 = 0;
        int couter2 = -1;
        int couter3 = -2;
        int AnzTeiler = 2;
        int Länge_eines_Teils_in_der_Schelife_zuvor_durch_2 = 0;

        for (int i = 0; i < SuchbegriffeA.length; i++){                                                     //für alle sucbegriffe
            if (couter1 > couter2 || couter1 > couter3){                                                    //wenn in den letzten sucbverläfuen was gefunden wurde

                for (int l = 0 ; l < AnzTeiler;l++){                                                        //für jedes teil
                    Länge_eines_Teils_in_der_Schelife_zuvor_durch_2 = Wechsel[i].length/2;                  //Länge eines teils halbiren
                    for (int j = 0; j < Länge_eines_Teils_in_der_Schelife_zuvor_durch_2;j++){               //einen neuen teil schreiben
                        Wechsel[i][l] += Text.charAt(j);                                                    //schreiben
                    }
                }

                AnzTeiler = AnzTeiler*2;                                                                    //anzahl der teile verdoppeln


                for (int k = 0; k < Wechsel[i].length;k++){                                                 //für alle teile
                    if (Wechsel[i][k].contains(SuchbegriffeA[i])){                                          //wenn ein sucbbegriff vorkommt
                        couter1++;                                                                          //zählen
                    }
                }
                couter3 = couter2;
                couter2 = couter1;
            }
        }
        System.out.println(couter1);
        */




    }
}
