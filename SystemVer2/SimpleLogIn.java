package SystemVer2;
import java.util.*;

public class SimpleLogIn{
    public void main(String args[]){
        Scanner sc= new Scanner (System.in);

        String fixedGmail="urSoftwareEngineer@gmail.com";
        String fixedPass="Engineer123";

        System.out.print("\n==WELCOME TO Simple Log In System==");
        System.out.print("\nEnter your Gmail: ");
        String gmail = sc.nextLine();
        System.out.print("\nEnter your Password: ");
        String password = sc.nextLine();

        if(!gmail .equals(fixedGmail) || !password .equals(fixedPass)){
            System.out.print("ACCESS DENIED!");
        }else{
            System.out.print("Log In Successful!");
        }
        
        
    }
}