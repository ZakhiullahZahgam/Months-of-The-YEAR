import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validMonthEntered = false;

        while (!validMonthEntered) {
            System.out.println("Please Enter a Month Name");
            String month = sc.nextLine().strip().toLowerCase();

            switch (month) {
                case "january":
                    System.out.println("This is the First month of the Year");
                    validMonthEntered = true;
                    break;
                case "february":
                    System.out.println("This is the Second month of the Year");
                    validMonthEntered = true;
                    break;
                case "march":
                    System.out.println("This is the third month of the Year");
                    validMonthEntered = true;
                    break;
                case "april":
                    System.out.println("This is the Fourth month of the Year");
                    validMonthEntered = true;
                    break;
                case "may":
                    System.out.println("This is the Fifth month of the Year");
                    validMonthEntered = true;
                    break;
                case "june":
                    System.out.println("This is the Sixth month of the Year");
                    validMonthEntered = true;
                    break;
                case "july":
                    System.out.println("This is the Seventh month of the Year");
                    validMonthEntered = true;
                    break;
                case "august":
                    System.out.println("This is the Eighth month of the Year");
                    validMonthEntered = true;
                    break;
                case "september":
                    System.out.println("This is the Ninth month of the Year");
                    validMonthEntered = true;
                    break;
                case "october":
                    System.out.println("This is the Tenth month of the Year");
                    validMonthEntered = true;
                    break;
                case "november":
                    System.out.println("This is the Eleventh month of the Year");
                    validMonthEntered = true;
                    break;
                case "december":
                    System.out.println("This is the Twelfth month of the Year");
                    validMonthEntered = true;
                    break;
                default:
                    System.out.println("This is either NOT A MONTH or the spelling you have entered is incorrect\nPLEASE TRY AGAIN");
            }
        }
        sc.close();
    }
}