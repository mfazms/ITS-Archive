/**
 * ES234211 - Basic Programming
 * Computing Lab. Work
 * Coursework No.   : 11
 * Student ID       : 5026221110
 * Student Name     : Moehammad Fazle Mawla Sidiki
 * Class            : D
 * Cohort           : B
 */
 import java.util.Scanner;
 import java.lang.Math.*;
 import java.io.*;
 import java.util.InputMismatchException;
 

public class Main {
    
    
    public static void main(String[] args) {
        // task1();
        task2();
    }
    
    //  public static void task1() {
    //     try {
    //         String input_file = "Root/output/input.txt";
    //         String output_file = "Root/output/output.txt";

    //         File input = new File(input_file);
    //         File output = new File(output_file);

    //         FileInputStream fis = new FileInputStream(input);
    //         FileOutputStream fos = new FileOutputStream(output);

    //         byte[] buffer = new byte[1024];
    //         int bytesRead;

    //         while ((bytesRead = fis.read(buffer)) != -1) {
    //             fos.write(buffer, 0, bytesRead);
    //         }
    //         System.out.println("Proses Copying Selesai");
    //     }
    //     catch(IOException e){
    //         System.out.println(e);
    //     }
    // }
    
    public static void task2() {
       Scanner sc = new Scanner(System.in);
        double nom = 0;
        double denom = 0;
        
        System.out.println("Welcome to Calc! :D");

        try {
            System.out.print("Please Input nominator value : ");
            nom = sc.nextInt();
        } catch (RuntimeException e) {
            System.out.println("Wrong Input Type !");
            System.exit(0);
        }

        try {
            System.out.print("Input denominator : ");
            denom = sc.nextInt();
        } catch (RuntimeException e) {
            System.out.println("Wrong Input Type !");
            System.exit(0);
        }

        try {
            System.out.println("The result is : " + nom / denom);
            System.out.println("Thank you for using Calc!, have a nice day :D");
        } catch (ArithmeticException e) {
            System.out.println("Tidak dapat membagi dengan angka 0!");
        }

        sc.close();
    }
}

