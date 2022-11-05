import java.sql.SQLOutput;
import java.util.Scanner;
/**
 * Write a description of class Choice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Choice 
{
    public static void choice1(){
    
        System.out.println("Enter percentage below");
        Scanner S = new Scanner(System.in);
        int takeInput = S.nextInt();

        if(takeInput > 69){
            System.out.println("A grade");
        }
        else if(takeInput < 69 && takeInput > 59){
            System.out.println("B Grade");
        }
        else if(takeInput <59 && takeInput>49){
            System.out.println("C Grade");
        }
        else if(takeInput < 49 && takeInput > 39){
            System.out.println("D Grade");
        }
        else if(takeInput < 39 ){
            System.out.println("E Grade");
        }

        System.out.println("method choice 1 executed");

    }
    
    public static void choice2(int lowerBound , int upperBound){


        for (int i = lowerBound; i <upperBound + 1  ; i++) {
            System.out.println("--------------------------------------------------");
            System.out.println("Value: " +  i +" " + "Square: " + i*i + " "+ "Cube:" + i*i*i + " " + "Square Root:" + Math.sqrt(i));
            System.out.println("--------------------------------------------------");

        }
    }
    
    public static void choice3(){
        System.out.println("Enter Number 1 ");
        Scanner takeNumber1 = new Scanner(System.in);
        int number1 = takeNumber1.nextInt();

        System.out.println("Enter Number 2 ");
        Scanner takeNumber2 = new Scanner(System.in);
        int number2 = takeNumber2.nextInt();

        System.out.println("Enter Number 3 ");
        Scanner takeNumber3 = new Scanner(System.in);
        int number3 = takeNumber3.nextInt();

        System.out.println("Enter Number 4 ");
        Scanner takeNumber4 = new Scanner(System.in);
        int number4 = takeNumber4.nextInt();

        while(number1 != (-1) ){
            int total = number1+number2+ number3+number4;
            int average = total/4;

            int[] myArr = {number1 , number2 , number3 , number4};
            int minValue = number1;

            for (int i = 0 ; i <myArr.length ;i++){
                if(myArr[i] < minValue){
                    minValue = myArr[i] ;
                }
            }


            System.out.println("Addition is " + total);
            System.out.println("Average is " + average);
            System.out.println("Min value is " + minValue);



            break;


        }

    }
    
    public static void exit(){


    }
    
    
}
