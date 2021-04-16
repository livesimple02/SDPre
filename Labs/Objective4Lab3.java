import java.util.Scanner;
import java.util.Calendar;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");

    age = input.nextInt();
    currentYear = Calendar.getInstance().get(Calendar.YEAR);
    birthYear = currentYear - age;

    System.out.println("You were born in " + birthYear);
    input.close();
    
  }
}
