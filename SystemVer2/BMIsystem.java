package SystemVer2;
import java.util.*;

public class BMIsystem {
    public void bmi (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("===WELCOME TO BMI SYSTEM===");
        System.out.print("Enter your height: ");
        double height = sc.nextDouble();
        System.out.print("Enter your weight: ");
        double weight = sc.nextDouble();
        
        double bmiResult = weight / (height * height);
        System.out.println("RESULT: " + bmiResult);
    }
    
}
