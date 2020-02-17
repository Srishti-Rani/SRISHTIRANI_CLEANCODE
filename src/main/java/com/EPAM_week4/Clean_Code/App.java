package com.EPAM_week4.Clean_Code;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        PrintStream obj = new PrintStream(new FileOutputStream(FileDescriptor.out));
        int con = 1;
        do {
            obj.print("---------------Welcome to Assignemnt 3-----------------\n");
            obj.print("---------------Press 1 to run INTEREST CALCULATION----------------\n");
            obj.print("---------------Press 2 to run COST ESTIMATION---------------------\n");
            obj.print("Enter your choice = ");
            int choice = scan.nextInt();
            switch (choice) 
            {
                case 1:
                    InterestCalculation obj1 = new InterestCalculation();
                    obj1.calculate();
                    break;
                case 2:
                	CostEstimation obj2 = new CostEstimation();
                    obj2.calculate();
                    break;
                default:
                    obj.print("Wrong choice\n");
            }
            obj.print("Press 0 to stop\n");
            con = scan.nextInt();
        }while (con!=0);
    }
}
