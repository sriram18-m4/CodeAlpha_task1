import java.io.*;
import java.util.*;
import java.lang.*;

public class TaskOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students: ");
        int studentscount = s.nextInt();

        ArrayList<Integer> scores = new ArrayList<>();

        // Input grades for each student
        for (int i=0; i<studentscount; i++){
            System.out.println("Enter grade of student: " + (i+1) );
            scores.add(s.nextInt());
        }

        // Initialize variables for computations
        int sum=0;
        int minscore = scores.get(0);
        int maxscore = scores.get(0);

        // Compute averagescore, minimum and maximum scores
        for (int score : scores){
            sum+=score;
            if (score<minscore ) {
                minscore = score;                
            }
            if (score>maxscore) {
                maxscore = score;
            }
        }

        // Calculate average
        double averagescore = (double) sum/studentscount;

        // Display results
        System.out.println("Average score: " + averagescore);
        System.out.println("Minimum score: " + minscore);
        System.out.println("Maximum score: " + maxscore);

        s.close();
    }


}