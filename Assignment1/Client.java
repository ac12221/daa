import java.rmi.*;
import java.util.Scanner;

public class Client{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    try{
      String serverURL = "rmi://localhost/Server";
      ServerIntf serverIntf = (ServerIntf) Naming.lookup(serverURL);
      
      System.out.print("Enter the first Number : ");
      double num1 = sc.nextDouble();
      
      System.out.print("Enter the Second Number : ");
      double num2 = sc.nextDouble();
      
      
      System.out.println("first Number is : "+ num1);
      
      System.out.println("second Number is : "+ num2);
      System.out.println("-----------Results-------------");
      
      System.out.println("Addition is : "+ serverIntf.Addition(num1,num2));
      System.out.println("Subtraction is : "+ serverIntf.Subtraction(num1,num2));
      System.out.println("Multiplication is : "+ serverIntf.Multiplication(num1,num2));
      System.out.println("Division is : "+ serverIntf.Division(num1,num2));
      
    }catch(Exception e){
      System.out.println("Exception Occurred at main :"+e.getMessage());
    }
  }
}

