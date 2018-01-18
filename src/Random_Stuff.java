import java.io.*;
import java.util.*;
public class Random_Stuff {
    public static void main(String[] args) {

       String a = "81";
        System.out.println((char)Integer.parseInt(a));


//        for (int j=0;j<3;j++) {
//            for (int i = 0; i < 10; i++) {
//                if (i == 0&&j==0) {
//                    System.out.print("┌");
//                }
//                if (i == 10&&j==0) {
//                    System.out.println("┐");
//                }
//                if (i==0&&j==2){
//                    System.out.print("└");
//                }
//                if (i==10&&j==2){
//                    System.out.println("┘");
//                }
//                if (i==10&&j==2){
//                    System.out.println("│");
//                }
//                if (i<10&&i>1&&(j==0||j==2)){
//                    System.out.print("─");
//                }
//                if ((i==0||i==10)&&j==1){
//                    System.out.print("│");
//                }
//            }
//        }






        /*String mitLehrzeichen = null;
        String fertig = null;

        BufferedReader br =null;
        try {
            br = new BufferedReader(new FileReader(new File("D:\\Betrieblich\\vorabreiten\\uebungen\\Textdatein\\§Neues.txt")));
            String line = null;

            while ((line = br.readLine()) !=null) {
            mitLehrzeichen += line+" ";
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
        //System.out.print("+"+mitLehrzeichen);
        String sonderzeichenraus[] = mitLehrzeichen.split(" ");
        for (int i = 0; i < sonderzeichenraus.length;i++){
            if (!sonderzeichenraus[i].contains("?")){
                fertig = fertig + sonderzeichenraus[i]+" ";
               // System.out.print(fertig);
            }
        }

        PrintWriter pwriter = null;
        try {
            pwriter = new PrintWriter(new BufferedWriter(new FileWriter("D:\\Betrieblich\\vorabreiten\\uebungen\\Textdatein\\Wörter.txt")));
            pwriter.println(fertig);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }finally {
            if (pwriter != null){
                pwriter.flush();
                pwriter.close();
            }
        }

        */
    }
}
