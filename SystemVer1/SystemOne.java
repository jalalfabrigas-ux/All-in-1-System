package SystemVer1;
import java.util.*;

public class SystemOne{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("WELCOME TO SYSTEM VERSION 1");
        System.out.println("PLEASE SELECT SYSTEM DESIGN ^_^");
        System.out.println("\n1.Calculator System");

        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("WELCOME TO CALCULATOR SYSTEM");
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
                        double sum=0;
                        for(int i=0;i<arr.length;i++){
                            sum += arr[i];
                        }
                        System.out.println("RESULT: "+ sum);
                        break;
                    case '-':
                        double sub=0;
                        for(int i = 0;i<arr.length;i++){
                            sub -= arr[i];
                        }
                        System.out.println("RESULT: "+sub);
                        break;
                    case '*':
                        double mul=0;
                        for(int i=0;i<arr.length;i++){
                            mul *= arr[i];
                        }
                        System.out.println("RESULT: "+ mul);
                        break;
                    case '/':
                        double div=0;
                        for(int i=0;i<arr.length;i++){
                        if(arr[i]==0){
                            System.out.println("! CANNOT BE DIVIDED BY ZERO");
                        }
                        else{
                            div /= arr[i];
                        }
                        System.out.println ("RESULT: " + div);
                        
                    }
                }
        }
    }
}