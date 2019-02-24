/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
import java.util.Scanner;

/**
 *
 * @author rgarg
 */
public class Calculator {
    public static void main(String[] args){
        // Defining the variables
        
        float num_1, num_2, add, diff, product, divide, remainder;
        char command = 'a';
        
        // Get the inputs
        
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Enter the first number: ");
            num_1 = input.nextInt();
            System.out.print("Enter the second number: ");
            num_2 = input.nextInt();
        
        // Giving the selection choice
        
            System.out.println("Enter 'a' for add, 's' for subtract, 'm' for multiply, 'd' for divide, 'r' for remainder, 'e' to exit");
            command = input.next().charAt(0);
        
            // Writing the if and else conditions
        
                if (command == 'a'){
                
                // Adding the 2 numbers
                
                    add = num_1 + num_2;
                    System.out.println("The sum of the two numbers is: "+ add);
                
                }else if(command == 's'){
                
                // subtracting the 2 numbers
                
                    diff = num_1 - num_2;
                    System.out.println("The difference of the 2 numbers is: "+ diff);
                
                }else if(command == 'm'){
                
                // multiplying the 2 numbers
                
                    product = num_1 * num_2;
                    System.out.println("The product of the 2 numbers is: " +product );
                
                }else if(command == 'd'){
                
                // diving the two numbers
                
                    divide = num_1/num_2;
                    System.out.println("The division of the numbers is: "+ divide);
                
                }else if(command == 'r'){
                
                //getting the remainder
                
                    remainder = num_1%num_2;
                    System.out.println("The remainder of the numbers is: " + remainder);
                    
                }else if(command == 'e'){
                    
                    // Breaking the loop
                    
                    break;
                }
        }while (true);
    }
    
}
