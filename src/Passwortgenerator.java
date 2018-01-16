import java.util.*;

/**
 * Created by LukaDete24 on 13.11.2017.
 */
public class Passwortgenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double lauf = 0;
        String Text;
        String zwischen;
        int lauf2 = 0;
        int lauf3 = 1;

        int Buchstaben = 0;
        int lauf4 = 0;
        int isDigit = 0;
        int isUpperCase = 0;

        System.out.print("Bitte Text eingeben");
        Text = input.nextLine();

        String[] a = Text.split(" ");
        Text = "";

        while (lauf < a.length){
            if (Character.isLetter(a[lauf2].charAt(a[lauf2].length()-1))){
                if (lauf3++ %2==1){
                Text += (Character.toUpperCase(a[lauf2].charAt(a[lauf2].length()-1)));
                }
                if (lauf3 %2 ==0){
                    Text += (Character.toLowerCase(a[lauf2].charAt(a[lauf2].length()-1)));
                }

            }
            else {
                Text += (a[lauf2].charAt(a[lauf2].length()-1));
            }
            lauf2 += 1;
            lauf++;
        }

        //Testen

        while (lauf4++ < Text.length()) {
            if (Character.isLetter(Text.charAt(lauf4))) {
                Buchstaben++;
            }
            if (Character.isDigit(Text.charAt(lauf4))){
                isDigit ++;
            }
            if (Character.isUpperCase(Text.charAt(lauf4))){
                isUpperCase ++;
            }
        }


        if (isDigit <= 2){
            System.out.println("zu wenig Zahlen");
        }

        if (Buchstaben <= 3){
            System.out.println("zu wenig Buchstaben");
        }

        if (Text.length() < 10 ){
            System.out.println("Passwort zu kurz");
        }





        System.out.print(Text);
    }
}
