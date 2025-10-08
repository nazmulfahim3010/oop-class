
import java.util.Scanner;

public class StudentTest {
    
    public static void main(String[] args) {
        System.out.println("about student 1 :");
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();
        String id1 = input.nextLine();
        System.out.println("about student 2 :" );
        String name2 = input.nextLine();
        String id2 = input.nextLine();
        System.out.println("about student 1's avg :" );
        double avg1 = input.nextDouble();
        System.out.println("about student 2's avg :" );
        double avg2 = input.nextDouble();
        

        Student account1 = new Student(name1, avg1, id1);
        Student account2 = new Student(name2, avg2, id2);
        
       
        System.out.println("ID=" + account1.getID() + ", " + account1.getName() + "'s letter grade is " +
            account1.getLetterGrade());
        System.out.printf("ID=%s, %s's letter grade is %s%n",
            account2.getID(), account2.getName(), account2.getLetterGrade());
            
        
        account2.setAverage(88.0);
        System.out.printf("\nAfter updating %s's average:%nID=%s, %s's new letter grade is %s%n",
            account2.getName(), account2.getID(), account2.getName(), account2.getLetterGrade());

        input.close();
            
    } // end main
    
} // end class StudentTest