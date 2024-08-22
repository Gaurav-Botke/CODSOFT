import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subject :");
        int numsubject = sc.nextInt();

        if(numsubject <= 0){
            System.out.println("Please enter a valid number of subject ");
           // return 0;
        }
        int totalMarks = 0;
        int maxMarks=100;

        for(int i = 1; i<=numsubject;i++){
            System.out.println("Enter a marks obtaine in subject "+i+" (out of 100)");
            int marks = sc.nextInt();

            if(marks < 0 || marks >maxMarks){
                System.out.println("Marks should be in the range of 0 to 100.\nPlease enter a valid marks");
                i--;
            }
            else{
               totalMarks += marks;
            }
        }
        double avgPercentage = (double) totalMarks / (numsubject * maxMarks)*100;
        System.out.println("Total marks : "+ totalMarks);
        System.out.println("Average percentage : " +avgPercentage +"%");
        String grade;

        if(avgPercentage >= 90){
            grade = "A+";
        }
        else if(avgPercentage >= 80){
            grade = "A";
        }
        else if(avgPercentage >= 70){
            grade = "B";
        }
        else if(avgPercentage >= 60){
            grade = "c";
        }
        else if(avgPercentage >= 50){
            grade = "D";
        }
        else{
            grade = "F";
        }
        System.out.println("Grade " +grade);
        sc.close();
    }
}
