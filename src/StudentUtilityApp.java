import java.util.Scanner;

public class StudentUtilityApp {
    public static void chooseActivity(int a) {
        if (a == 1) addTwoNumbers();
        else if (a == 2) evernOrOdd();
        else if (a == 3) printToN();
        else if (a == 4) dayOfTheWeek();
    } 

    public static void addTwoNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number x: "); int x = scan.nextInt();
        System.out.print("Enter another number y: "); int y = scan.nextInt();
        System.out.println("The sum of the two numbers " + x + " and " + y + ", is " + (x + y));
    }

    public static void evernOrOdd() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number x: "); int x = scan.nextInt();
        String result = (x % 2 == 0) ? "EVEN" : "ODD";

        System.out.println("The number x is " + result);
    } 

    public static void printToN() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number x: "); int x = scan.nextInt();
        for (int i = 1; i < x + 1; i++) System.out.println(i);
    } 

    public static void dayOfTheWeek() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number x: "); int x = scan.nextInt();
        String result = "";

        switch (x) {
            case 1: result = "Monday";
                break;
            case 2: result = "Tuesday";
                break;
            case 3: result = "Wednesday";
                break;
            case 4: result = "Thursday";
                break;
            case 5: result = "Friday";
                break;
            case 6: result = "Saturday";
                break;
            case 7: result = "Sunday";
                break;
            default:
                break;
        } 

        System.out.println("The day of the week is " + result);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("===== STUDENT UTILITY APP =====");
        System.out.println("1. Add two numbers");
        System.out.println("2. Check if a number is EVEN or ODD");
        System.out.println("3. Print numbers from 1 to N");
        System.out.println("4. Display day of the week");
        System.out.println("5. Exit");

        while (true) {
            System.out.println();
            System.out.print("Enter a number for an activity: "); int choice = scan.nextInt();
            if ((choice >= 1) && (choice <= 4)) chooseActivity(choice);
            else if (choice == 5) break;
            else System.out.println("Invalid choice! Enter a number between 1 and 5, both inclusive.");
        } 

        System.out.println();
        System.out.println("Thank you for using the app!");

        scan.close();
    }
}
