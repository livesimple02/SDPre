import java.util.Scanner;
import java.util.Calendar;

public class Objective4Lab3Extra {
  public static void main(String[] args) {
    int birthYear, age, currentYear;
    String birthdayPassed;
    boolean validEntry = false;

    birthYear = 0;
    currentYear = Calendar.getInstance().get(Calendar.YEAR);


    Scanner input = new Scanner(System.in);

    System.out.println("How old are you?");
    age = input.nextInt();

    // Clear input buffer
    input.nextLine();

    do  {
        System.out.println("Yes or No: I have already had my birthday this year.");
        birthdayPassed = input.nextLine();

        if (birthdayPassed.equalsIgnoreCase("yes")) {
          birthYear = currentYear - age;
          validEntry = true;
        } else if (birthdayPassed.equalsIgnoreCase("no")) {
          birthYear = currentYear - age - 1;
          validEntry = true;
        } else {
          System.out.println("Invalid Entry!");
        }
      } while (validEntry == false);

    System.out.println("You were born in " + birthYear);
    input.close();

  }
}
