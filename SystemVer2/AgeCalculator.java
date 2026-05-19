package SystemVer2;
import java.util.*;
public class AgeCalculator {
    public void calculator(){
        Scanner sc=new Scanner(System.in);
        System.out.print("\nWELCOME TO AGE CALCULATOR");

        System.out.print("\nEnter the year you want either current, past, or future year");
        int yearInput= sc.nextInt();
        System.out.print("\nEnter the year you Born on");
        int yearBorn = sc.nextInt();
        System.out.println("\nAGE ESTIMATION IS: " + (yearBorn - yearInput));
    }
}
