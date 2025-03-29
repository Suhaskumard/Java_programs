import java.util.Scanner;

public class TopperFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int[][] marks = new int[students][subjects];

        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < subjects; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nTopper in each subject:");
        for (int j = 0; j < subjects; j++) {
            int maxMarks = 0, topper = 0;
            for (int i = 0; i < students; i++) {
                if (marks[i][j] > maxMarks) {
                    maxMarks = marks[i][j];
                    topper = i;
                }
            }
            System.out.println("Subject " + (j + 1) + ": Student " + (topper + 1));
        }

        int overallTopper = 0, maxTotal = 0;
        for (int i = 0; i < students; i++) {
            int total = 0;
            for (int j = 0; j < subjects; j++) {
                total += marks[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                overallTopper = i;
            }
        }

        System.out.println("\nOverall Topper: Student " + (overallTopper + 1));

        sc.close();
    }
}
