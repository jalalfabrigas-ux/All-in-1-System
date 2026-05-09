package SystemVer1;
import java.util.*;

public class SystemOne{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("WELCOME TO SYSTEM VERSION 1");
        System.out.print("PLEASE SELECT SYSTEM DESIGN ^_^");
        System.out.print("\n1. Calculator System");
        System.out.print("\n2. Student Grade System");
        System.out.print("\n3. Odd or Even Number Checker System");
        System.out.print("\n4. Voting Eligibility System");
        System.out.print("\n5. ATM Machine System");
        System.out.print("\n6. Temperature Converter");
        System.out.print("\n7. Multiplication Table Generator");
        System.out.println();
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
                break;
case 3:
                System.out.println("WELCOME TO ODD OR EVEN NUMBER CHECKER SYSTEM");
                System.out.print("\nEnter how many numbers you want to input: ");
                int number = sc.nextInt();
                int[] numArr = new int [number];

                int evenCount = 0;
                int oddCount = 0;

                for(int i = 0; i < numArr.length; i++){

                System.out.print("Number Input [" + (i + 1) + "]: ");
                numArr[i] = sc.nextInt();
                }
                for(int i = 0; i < numArr.length; i++){
                if(numArr[i] % 2 == 0){
                evenCount++;
                System.out.println(numArr[i] + " is an EVEN number.");
                }
                else
                {
                oddCount++;
                System.out.println(numArr[i] + " is an ODD number.");
                }
                }
                System.out.println("\nTOTAL EVEN NUMBERS: " + evenCount);
                System.out.println("TOTAL ODD NUMBERS: " + oddCount);
                break;
case 4:
                System.out.println("Voting Eligibility System");
                System.out.print("\nEnter your age: ");
                int age = sc.nextInt();

                if(age >= 18){
                    System.out.println("You are eligible to vote!");
                    System.out.println("PROCEDING TO VOTING SYSTEM...");
                    System.out.print("\nEnter your Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("\nWhat is your Nationality? ");
                    String nationality = sc.nextLine();
                    System.out.print("\nEnter your Addess: ");
                    String address = sc.nextLine();
                    System.out.print("\nEnter your Contact Number: ");
                    String contact = sc.nextLine();
                    System.out.println("\nEnter your Votes ID:");
                    int voterID = sc.nextInt();
                    System.out.println("WHO WILL YOU VOTE FOR PRESIDENT? ");
                    System.out.println("1. Candidate A");
                    System.out.println("2. Candidate B");
                    System.out.println("3. Candidate C");
                    int voteChoice = sc.nextInt();
                    System.out.println("==VOTER's Full Information==");
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    System.out.println("Nationality: " + nationality);
                    System.out.println("Address: " + address);
                    System.out.println("Contact Number: " + contact);
                    System.out.println("Voter ID: " + voterID);
                    if(voteChoice == 1){
                        System.out.println("You voted for Candidate A");
                    }
                    else if(voteChoice == 2){
                        System.out.println("You voted for Candidate B");
                    }
                    else if(voteChoice == 3){
                        System.out.println("You voted for Candidate C");
                    }
                    else{
                        System.out.println("Invalid vote choice!");
                    }
                }
                else{
                    System.out.println("You are not Eligible to Vote ! ");
                }
                break;
case 5: 
                System.out.println("WELCOME TO ATM MACHINE SYSTEM");
                System.out.print("\nEnter your PIN: ");
                int pin = sc.nextInt();
                int myPin  = 6363;

                if(pin != myPin){
                    System.out.println("Invalid PIN! Access Denied.");
                    return;
                }else{
                System.out.println("PIN accepted. Welcome to the ATM Machine System!");
                
                double balance = 1000.00;
                System.out.println("Your current balance is: $" + balance);
                System.out.println("What transaction would you like to perform?");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                int perform = sc.nextInt();
                
                switch(perform){
                case 1:
                    System.out.println("Enter the amount to deposit: ");
                    double deposit = sc.nextDouble();
                    if(deposit <= 0){
                        System.out.println("Invalid deposit amount!");
                    }else{
                        balance += deposit;
                        System.out.println("Deposit successful! Your new balance is: $" + balance);
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if(withdraw <= 0){
                        System.out.println("Invalid withdrawal amount!");
                    }else if(withdraw > balance){
                        System.out.println("Insufficient funds! Your current balance is: " + balance);{
                    }
                    }else{
                        balance -= withdraw;
                        System.out.println("Withdrawal successful! Your new balance is: " + balance);
                    }
                    break;
                default:
                    System.out.println("Invalid transaction choice!");
                    break;  
                    }
                    break;
                    }
case 6:
            System.out.println("TEMPERATURE CONVERTER SYSTEM!");
            System.out.print("1. Celcius to Farenheit || 2. Farenheit to Celcius" + "\n");
            int converter = sc.nextInt();
            
            switch (converter){
                case 1:
                    System.out.print("Enter Temperature in Celcius: ");
                    double celcius = sc.nextDouble();
                    double resultfarenheit = ( celcius * 9/5) + 32;
                    System.out.println("Temperature in Farenheit: " + resultfarenheit);
                    break;
                case 2:
                    System.out.print("Enter Temperature in Farenheit: ");
                    double farenheit = sc.nextDouble();
                    double resultCelcius = (farenheit - 32) * 5/9;
                    System.out.println("Temperature in Celcius: " + resultCelcius);
                    break;
                default:
                    System.out.println("Invalid converter choice!");
                    break;
            }
            break;
case 7:
            System.out.println("Multiplication Table Generator");
            System.out.println("Enter number to be Multiplied ");
            int num = sc.nextInt();
            System.out.println("Up to ? ( 1 - 10 ) ");
            int limit = sc.nextInt();
           
            for(int i = 0; i<=limit;i++){
                if(limit <= 10 ){
                double multiply = num * i;
                System.out.println( num + " * " + i +" = " + multiply );
            }
        }
            System.out.println();
            break;
case 8:
        System.out.println("Number Guessing Game");
        System.out.println("FOR PLAYER 1: Enter The Secret Number :");
        int secretNum = sc.nextInt();

        int guess;
        do{
            System.out.println("FOR PLAYER 2: GUESS THE NUMBER :");
            guess = sc.nextInt();
            if(guess > secretNum){
                System.out.print("\n" + guess + " number is too high ");
            }
            else if(guess < secretNum){
                System.out.print("\n" + guess + " number is too low ");
            }
            else{
                System.out.println("\nCONGRATSS YOU GUESSED IT ^_^");
            }
        }
        while(guess != secretNum);

        }
            sc.close();
    }
}

    
