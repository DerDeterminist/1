import com.sun.xml.internal.ws.api.pipe.ServerTubeAssemblerContext;

import java.util.Scanner;

/**
 * Created by LukaDete24 on 13.11.2017.
 */
public class Vokale {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String Buffer;
        int a = 0;
        char Stuff;

        System.out.println("Bitte geben Sie einen Text ein");

        Buffer = input.nextLine();

        while (a < Buffer.length()) {
            Stuff = Buffer.charAt(a);
            a = a +1;
            if (Stuff == 'a' || Stuff == 'A' || Stuff == 'e' || Stuff == 'E'|| Stuff == 'o'|| Stuff == 'O'|| Stuff == 'u'|| Stuff == 'U'|| Stuff == 'i'|| Stuff == 'I'){
                System.out.print("");
            }
            else {
                System.out.print(Stuff);
            }
        }
    }
}
