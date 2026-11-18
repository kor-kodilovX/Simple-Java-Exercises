//Leap Year

import java.util.Scanner;
public class Tarea_3 {

public static void main(String [] args) {

Scanner scanner = new Scanner (System.in);
System.out.println("Enter a year to check if it is a leap year: ");
int Year = scanner.nextInt();

if ((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)) {

System.out.println("The year " + Year + " is a Leap Year");
}

else {

System.out.println("The year " + Year + " is not a Leap Year");
}

scanner.close();
}

}
