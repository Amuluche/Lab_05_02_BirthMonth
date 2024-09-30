//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the your birth month [1-12]: ");
        int month = scanner.nextInt();

        if (month > 12)
        {System.out.println(" That is not a valid month ");}

        else if (month < 1)
        {System.out.println(" That is not a valid month ");}

        else if (month >=1 || month <=12)
        {System.out.println(" Your birth month is " + month);}
    }
}