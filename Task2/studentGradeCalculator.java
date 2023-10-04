import java.util.Scanner;

public class studentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        int subject;
        int currSubject;
        float totalMarks = 0;
        float percentage;
        



        System.out.println("Enter Number of Subject");
        subject = sc.nextInt();

        
        for (currSubject = 1; currSubject <= subject; currSubject++) {
            System.out.println("Enter Marks of " + currSubject + " Subject");
            totalMarks += sc.nextInt();
        }

        System.out.println();
        System.out.println("Total : " + totalMarks);
        // Each subject is of 100 Marks
        percentage = totalMarks / subject ;
        System.out.println("Percentage: " + percentage);

        switch ((int) percentage / 10) {
        case 9:
            System.out.println("Grade : O");
            break;
        case 8:
            System.out.println("Grade : A+");
            break;
        case 7:
            System.out.println("Grade : A");
            break;
        case 6:
            System.out.println("Grade : B");
            break;
        case 5:
            System.out.println("Grade : C");
            break;
        default:
            System.out.println("Grade : D");
            break;
        }
    sc.close();
    }
}