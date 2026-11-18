//The Fibonacci Sequence

import java.util.Scanner;
public class Tarea_2 {
public static void main(String [] args){
Scanner scanner = new Scanner (System.in);
System.out.println("How many numbers of the Fibonacci sequence do you want to print?");
int n = scanner.nextInt();

if (n <= 0) {
System.out.println("Please enter a number greater than 0");
} else {
long first = 0;
long second = 1;
System.out.println("The first " + n + " numbers of the Fibonacci sequence");

for (int i = 1; i <= n; i++) {
System.out.println(first + " ");
long next = first + second;
first = second;
second = next;
}
System.out.println();
}
scanner.close();
}
}
