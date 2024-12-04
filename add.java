/* here we see wat are objects and classes are and how to declare and use them 
 * 
 * class - class in java are the blueprints ... like if we need to create a program to print addition of 2 numbers
 *         it has the blueprint of how to add number like it shows the method and the data members to perform addition
 * 
 * objects - objects are just like variables that uses the functionalities of class ... like object (calculator) uses the blueprint
 *              to add 2 numbers just by using the methods and data members decleared in the class.
 * 

 */

 // Example 
import java.util.*;

   // add is the class 
 public class add{
   //Data members 
    int num1; // number 1 
    int num2; // number 2
    int result;

    //methods of the class add 
    public void implement(int num1,int num2){
      this.num1 = num1;
      this.num2 = num2;
         this.result = this.num1+this.num2;
    }
    public void print_add(){
         System.out.println("ADDITION OF TWO NUMBERS IS " + this.result);
    }

    //main method
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("enter number 1 : ");
         int n1 = sc.nextInt();
         System.out.print("Enter number 2 :");
         int n2 = sc.nextInt();
         
         // creating an object numbers that uses the class add decleared above   
         add numbers = new add();
         // uses the method implement in class 
         numbers.implement(n1, n2);
         numbers.print_add();
         sc.close();
    }
 }