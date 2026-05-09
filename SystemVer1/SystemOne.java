package SystemVer1;
import java.util.*;

public class SystemOne{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("WELCOME TO SYSTEM VERSION 1");
        System.out.println("PLEASE SELECT SYSTEM DESIGN ^_^");
        System.out.print("\n1.Calculator System");
        System.out.print("\n2.Student Grade System");
        int choice = sc.nextInt();

        switch (choice){
    case 1:
                System.out.print("\nWELCOME TO CALCULATOR SYSTEM");
                System.out.print("\nENTER HOW MANY NUMBER YOU WANT TO INPUT !");
                int repeat = sc.nextInt();

                int[]arr =new int[repeat];
                for(int i = 0;i<arr.length;i++){
                    System.out.println("Number ["+(i+1)+"]: ");
                    arr[i]=sc.nextInt();
                }
                System.out.println("WHAT OPERATIONS?");
                System.out.println("+|-|*|/");
                char ope = sc.next().charAt(0);

                switch(ope){

        case '+':
                double sum = 0;
                for(int i = 0; i < arr.length; i++){
                    sum += arr[i];
                }
                System.out.println("RESULT: " + sum);
                break;

        case '-':

                double sub = arr[0];
                for(int i = 1; i < arr.length; i++){
                sub -= arr[i];
                }
                System.out.println("RESULT: " + sub);
                break;

        case '*':
                double mul = 1;
                for(int i = 0; i < arr.length; i++){
                mul *= arr[i];
                }
                System.out.println("RESULT: " + mul);
                break;

        case '/':
                double div = arr[0];
                for(int i = 1; i < arr.length; i++){
                if(arr[i] == 0){
                System.out.println("CANNOT DIVIDE BY ZERO!");
                return;
                }
                div /= arr[i];
                }
                System.out.println("RESULT: " + div);
                break;

        default:
                System.out.println("ENTER VALID OPERATOR!");
                break;
                }
                break;
case 2:         

                System.out.println("STUDENT GRADE SYSTEM");
                System.out.print("\nHOW MANY SUBJECT ");
                int studentsub = sc.nextInt();

                int[] grades = new int[studentsub];
                for(int i = 0; i < grades.length; i++){
                System.out.println("SUBJECT ["+(i+1)+"] GRADE: ");
                grades[i] = sc.nextInt();
                }
                int genAve=0;
                for(int i = 0;i<grades.length;i++){
                genAve += grades[i];
                }
                double result= genAve / grades.length;


                if(result >= 90){
                    System.out.println( "General Average: " + result + "Remarks: " + "Excellent");
                }
                else if(result >= 80){
                    System.out.println( "General Average: " + result + "Remarks: " + "Very Good");
                }
                
                else if(result >= 75){
                    System.out.println( "General Average: " + result + "Remarks: " + "Satisfied");
                }
                else{
                    System.out.println( "General Average: " + result + " | Remarks: " + "FAILED! NEED REMEDIATION");
                }

                }

                sc.close();
            }
        }
    
