import java.text.DecimalFormat;
import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Student Grade Calculator");

        System.out.print("Enter marks for Subject 1 (out of 100): ");
        int sub1 = a.nextInt();

        System.out.print("Enter marks for Subject 2 (out of 100): ");
        int sub2 = a.nextInt();

        System.out.print("Enter marks for Subject 3 (out of 100): ");
        int sub3 = a.nextInt();

        int totalMarks = sub1 + sub2 + sub3;

        double avg = (double) totalMarks / 3;

        DecimalFormat df = new DecimalFormat("0.00");
        String Averageformat = df.format(avg);

        String grade = calculateGrade(avg);

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + Averageformat + "%");
        System.out.println("Grade: " + grade);

        a.close();
    }

    private static String calculateGrade(double avg) {
        if (avg >= 90) {
            return "A";
        } else if (avg >= 70) {
            return "B";
        } else if (avg >= 50) {
            return "C";
        } else if (avg >= 35) {
            return "D";
        } else {
            return "F";
        }
    }
}
