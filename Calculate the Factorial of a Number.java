//Calculate the Factorial of a Number.

import java.util.Scanner;
public class Tarea_1 {

public static void main(String[] args) {

Scanner scanner = new Scanner (System.in);
System.out.println("Enter a number to calculate its factorial");
int Number = scanner.nextInt();
long Factorial = 1;
int i = 1;

while(i <= Number) {
    Factorial = Factorial * i;
i++;
}

System.out.println("The factorial of " + Number + " is: " + Factorial);
scanner.close();
}

}
