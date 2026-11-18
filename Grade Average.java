//Grade Average

import java.util.Scanner;
public class Tarea_4 {
public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
double gradeSum = 0;

for (int i = 1; i <=5; i++) {
System.out.println("Enter grade " + i + " : ");
double Grade = scanner.nextDouble();
gradeSum += Grade;
double Average = gradeSum / 5;

if (Average >= 6) {
System.out.println("The student has passed");
}
else {
System.out.println("The student has failed");
}
}
scanner.close();
}    
}
