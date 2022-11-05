import java.util.Scanner;
/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Menu
{
        public void displayMenu(){
        System.out.println("please select one of the options below");
        System.out.println("1. Calculate Grade for your percentage");
        System.out.println("2. Calculate Square , Cube and Square root of your given limits");
        System.out.println("3. Calculate Additions , Average , Min value and Max value");
        System.out.println("0. Exit");
        }
     public Menu(){
        
        }
        public void processUSerChoices(){
            int userInput;
             do{
        displayMenu();
        Scanner s = new Scanner(System.in);
        userInput = s.nextInt();
        switch(userInput){
            case 1:
            Choice.choice1();
                 break;
            case 2:
                System.out.println("Enter Lower Bound Here:");
                Scanner lowerBound = new Scanner(System.in);
                int lowerBoundValue = lowerBound.nextInt();

                System.out.println("Enter Upper Bound Here:");
                Scanner upperBound = new Scanner(System.in);
                int upperBoundValue = upperBound.nextInt();

                Choice.choice2(lowerBoundValue , upperBoundValue);
                 break;
            case 3:
            Choice.choice3();
                 break;
            case 4:
            Choice.exit();
                 break;
            default:
                System.out.println("error");
                break;
                }
               
                    
                }
                while(userInput != 4);
            
          
          
        }
        public static void main(String[] args){
            Menu m = new Menu();
            m.processUSerChoices();
            
            
            
            
            
        }
        
        
        
      
    
}
