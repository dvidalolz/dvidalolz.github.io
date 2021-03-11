import java.util.Scanner;

public class Credits {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String studentName, degreeName;
        Double creditsDegree, creditsTaken, creditsLeft;

        System.out.print("Enter your name ");
        studentName = keyboard.nextLine();

        System.out.print("Enter the name of your degree ");
        degreeName = keyboard.nextLine();

        System.out.print("Enter the number of credits required to graduate ");
        creditsDegree = keyboard.nextDouble();

        System.out.print("Enter the number of credits taken so far ");
        creditsTaken = keyboard.nextDouble();

        creditsLeft = creditsDegree - creditsTaken;

        System.out.println("The student's name is " + studentName);
        System.out.println("The degree program is called " + degreeName);
        System.out.println("Credits left to graduate " + creditsLeft);
    }
}