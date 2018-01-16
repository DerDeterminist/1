import java.util. *;
public class EingabeNEU
{
    public static void main(String argv[])

    {
        String  str;
        Scanner input = new Scanner(System.in);
        System.out.print("Name eingeben:  ");
        str = input.nextLine();
        System.out.println("Guten Tag Benutzer ");
        System.out.println(str);
        System.out.println("Programmende Eingabe. ");
    }
}
