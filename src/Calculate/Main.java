package Calculate;

import java.util.Scanner;

public class Main extends Calculator {

    public static void main(String[] args) {
        Main rd = new Main();
        String ch ="y";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter first number");
            int a = scanner.nextInt();
            System.out.println("Please enter second number");
            int b = scanner.nextInt();
            System.out.println("Please enter Symbol");
            String sym = scanner.next();
            switch (sym) {
                case "+":
                    rd.addition(a, b);
                    break;
                case "-":
                    rd.subtraction(a, b);
                    break;
                case "*":
                    rd.multiplication(a, b);
                    break;
                case "/":
                    rd.division(a, b);
                    break;
                default:
                    System.out.println("Hi");}
                    System.out.println("“Would you like to do\n" +
                            "        more calculation Please enter “Y” or “N” :” ");
                     ch = scanner.next();

        } while (ch.equalsIgnoreCase( "Y"));
        //scanner close
       scanner.close();
    }
}