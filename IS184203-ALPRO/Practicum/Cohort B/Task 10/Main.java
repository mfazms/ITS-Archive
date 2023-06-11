/**
 * ES234211 - Basic Programming
 * Computing Lab. Work
 * Coursework No.   : 10
 * Student ID       : 5026221110
 * Student Name     : Moehammad Fazle Mawla Sidiki
 * Class            : D
 * Cohort           : B
 */
 import java.util.Scanner;
 import java.lang.Math.*;
 

public class Main {
    
    
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    
    public static void task1(){
        System.out.println(sumOfDigits(412));
    }
    
    public static int sumOfDigits(int num){
        
        int div = num / 10;
        int mod = num % 10;
        
        if(div > 0){
            return mod + sumOfDigits(div);
        } else {
            return mod;
        }
    }
    
    public static void task2(){
        Scanner scanner = new Scanner(Main.class.getResourceAsStream("Maze2.txt"));
        int numRows = Integer.parseInt(scanner.nextLine());
        int numCols = Integer.parseInt(scanner.nextLine());
            
        char[][] maze = new char[numRows][numCols];
        
        for(int i=0; i<numRows; i++) {
            String row = scanner.nextLine();
            for(int j=0; j<numCols; j++) {
                maze[i][j] = row.charAt(j);
            }
        }
        
        System.out.println(explore(0,0,0,maze));    
            
    }
    
    
    public static int explore(int row, int col, int step, char[][] maze){
        // Kalau keluar maze
        if(row < 0 || col < 0 || row > maze.length-1 || col > maze[0].length-1) {
            return 1000;
        }
        // Kalau ketemu tembok
        if(maze[row][col] == 'x') {
            return 1000;
        }
        // Ketemu titik akhir
        if(maze[row][col] == 'O') {
            return step;
        }
        
        maze[row][col] = 'x';
        
        int atas = explore(row-1, col, step+1, maze);
        int bawah = explore(row+1, col, step+1, maze);
        int kanan = explore(row, col+1, step+1, maze);
        int kiri = explore(row, col-1, step+1, maze);
        
        maze[row][col] = '.';
        
        int dist = 1000000;
        
        if(atas < dist) dist = atas;
        if(bawah < dist) dist = bawah;
        if(kanan < dist) dist = kanan;
        if(kiri < dist) dist = kiri;
        
        return dist;
    } //100, 20, 35, 45, 12, 15, 81, 23, 75
    
    public static void task3(){
        int money = 100;
        int[] price_list = {100, 20, 35, 45, 12, 15, 81, 23, 75};
        System.out.println("The max amount of item that can be bought with the current money is: " + buyStuff(money, price_list, 0));
        
    }
    
    public static int buyStuff(int money, int[]price_list, int idx) {
    
    // Base case phase
    // This code is to tell if the available money is less than or equal to 0 or, there is no more items left consider to buy
     if (money <= 0 || idx >= price_list.length) {
            return 0; 
     }
     if (money < price_list[idx]) {
            return buyStuff(money, price_list, idx + 1);
     }
     
     // Recursion phase
     // This code is try to show what happen if we bought or skipped the current item
     int boughtCurrentItem = 1 + buyStuff(money - price_list[idx], price_list, idx+1);
     int skipCurrentItem = buyStuff(money, price_list, idx+1);
     // Make return with Math.max between those 2 variables to choose wether we should bought it or not.
     return Math.max(boughtCurrentItem, skipCurrentItem);
    
    }
}