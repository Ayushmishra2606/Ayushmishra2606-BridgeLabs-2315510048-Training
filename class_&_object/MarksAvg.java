package oops;

import java.util.Scanner;

class Student {
    private int[] marks = new int[4];
    private int total;
    private double average;
    private double percentage;

    public void inputMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 4 subjects (out of 100): ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

    public void calculate() {
        total = 0;
        for (int m : marks) {
            total += m;
        }
        average = total / 4.0;
        percentage = (total / 400.0) * 100;
    }

    public void display() {
        
        System.out.println("Total Marks = " + total + " / 400");
        System.out.println("Average Marks = " + average);
        System.out.println("Percentage = " + percentage + " %");
    }
}

public class MarksAvg {
	   public static void main(String Args[]) {
		   Student s1 = new Student();
		   s1.inputMarks();
		   s1.calculate();
		   s1.display();
	   }

}
