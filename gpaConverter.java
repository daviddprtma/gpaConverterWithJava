import java.util.Scanner;

public class gpaConverter {
    public static void main (String[]args){
        System.out.println("How many course do you have this semester?");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        double [] course = new double[number];
        double sum = 0;

        for(int i = 0; i<course.length; i++) {
            System.out.println("Enter your average for course " + (i + 1) + " : ");
            course[i] = scan.nextDouble();
        }

        for(int i =0; i<course.length; i++){
            sum+= course[i];
        }

        double avge = sum / course.length;

        System.out.println("Your average of the course you have in these semester are : " + avge);

        if(avge > 90){
            System.out.println("You have A");
        }
        else if(avge > 80 && avge <=90){
            System.out.println("You have B");
        }
        else if (avge > 70 && avge <=80){
            System.out.println("You have C");
        }
        else if(avge > 60 && avge <=70){
            System.out.println("You have D");
        }
        else if(avge < 60) {
            System.out.println("You failed");
        }
        else{
            System.out.println("Please try again!!");
        }
    }
}
