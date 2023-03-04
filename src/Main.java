import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
        public class Main {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("What's the operation you want to realize? \n \n  Write a number \n \n 1. Adittion \n 2. Subtract \n 3. Multiplication \n 4. Division" );
        int operation = sc.nextInt();

        System.out.println("First value");
        double Num1 = sc.nextInt();
        System.out.println("Second value");
        double Num2 = sc.nextInt();

        if (operation == 1){
            System.out.println(Num1 + Num2);
        }
            else if (operation == 2){
            System.out.println(Num1 - Num2);
        }
                else if (operation == 3){
            System.out.println(Num1 * Num2);
        }
                    else if(operation == 4){
            System.out.println(Num1 / Num2);
        }


         }
    }