package Topic_3_stack;

import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	Stack stack = new Stack();
    	
    	System.out.println("Hello Love");
    	
    	  while(true) {
              System.out.println("Choose what you want to do: "
                       + " 1. Size"
                       + " 2. Push"
                       + " 3. Pop"
                      +  " 4. Exit");
               int choice = sc.nextInt();
           switch(choice) {
           
           case 1:
               System.out.println("Stack size is: " + stack.size());
               System.out.println("~~~~~~~~~~~~~~~~~~");
               break;
               
           case 2:   
               System.out.println("Add a number: ");
               int num = sc.nextInt();
               System.out.println("Pushed value: " + num);
               stack.push(num);
               stack.size();
               System.out.println("~~~~~~~~~~~~~~~~~~");
               break; 
    }
}
    }
}
