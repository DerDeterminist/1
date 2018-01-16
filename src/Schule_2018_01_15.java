import java.util.Scanner;

public class Schule_2018_01_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String Richtige_PW  = "";
        String Versuch = "";

        Richtige_PW = input.nextLine();

        for (int j=0;j<999999999;j++) {
            Versuch += ' ';
            for (int a=j;a>0;a--) {
                Versuch+='a';
                for (int i = 33; i < 255; i++) {
                    Versuch.replace(Versuch.charAt(a),(char)i);
                }



            }
        }


        System.out.println(Versuch);



    }
}
