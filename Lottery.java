package lottery;

import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int golden1, golden2;
        System.out.println("please Enter the Golden number 1");
        golden1 = input.nextInt();

        System.out.println("please Enter the Golden number 2");
        golden2 = input.nextInt();

        int randomNumber1 = (int) (Math.random() * 10);
        int randomNumber2 = (int) (Math.random() * 10);
        System.out.println("the golden number is " + randomNumber1 + "" + randomNumber2);

        if (golden1 == randomNumber1 && golden2 == randomNumber2) {
            System.out.println("congratulation you have won 10,000$ ");
        } else if (golden1 == randomNumber2 && golden2 == randomNumber1) {
            System.out.println("congratulation you have won 3,000$ ");
        } else if (golden1 == randomNumber1 ^ golden2 == randomNumber2) {
            System.out.println("congratulation you have won 1,000$ ");
        } else {
            System.out.println("you have won noyhing try again");
        }
    }

}
