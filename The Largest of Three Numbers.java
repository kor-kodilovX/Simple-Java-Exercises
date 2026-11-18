//The Largest of Three Numbers

import java.util.Scanner;
public class Tarea_6 {

public static void main(String [] args) {

Scanner scanner = new Scanner (System.in);

System.out.println("Enter the first number: ");
int number1 = scanner.nextInt();

System.out.println("Enter the second number: ");
int number2 = scanner.nextInt();

System.out.println("Enter the third number: ");
int number3 = scanner.nextInt();

if (number1 > number2 && number1 > number3) {

System.out.println("The largest number is: " + number1);
}

else if (number2 > number1 && number2 > number3) {

System.out.println("The largest number is: " + number2);
}

else {

System.out.println("The largest number is: " + number3);
}

scanner.close();
}

}