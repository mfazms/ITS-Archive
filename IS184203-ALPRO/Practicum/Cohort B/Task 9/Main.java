/**
 * ES234211 - Basic Programming
 * Computing Lab. Work
 * Coursework No.   : 09
 * Student ID       : 5026221110
 * Student Name     : Moehammad Fazle Mawla Sidiki
 * Class            : D
 * Cohort           : B
 */
 
 import java.util.Scanner;
 import java.lang.*;

public class Main {
    
    
    public static void main(String[] args) {
      task1();
      task2();
      task3();
    }
    
    
    public static void task1(){
        double r = 5;
        double t = 10;
        
        Tube tube1 = new Tube(r, t);
        
        System.out.println("The circumference of the base: "+ "\t\t"+ tube1.baseCircumference());
        System.out.println("The area of the base: "+ "\t\t\t" + tube1.baseArea());
        System.out.println("The total surface area of the tube: "+ "\t" + tube1.area());
        System.out.println("The volume of the tube: "+ "\t\t" + tube1.volume());
        System.out.println();
    }
    
    
    public static void task2(){
        OpoAccount userA = new  OpoAccount("12345678", "User A", 100.0);
        OpoAccount userB = new  OpoAccount("87654321", "User B", 50.0);
        
        //User A topUp and transfer to User B
        userA.topUp(200);
        userA.transfer(userB, 150);
        
        //User B withdraw money their Opo account
        userB.withdraw(100.0);
        
        // Print account details for both accounts
        System.out.println("Account details for " + userA.getName() + ":");
        System.out.println("Balance: $" + userA.getBalance());
        System.out.println("Points: " + userA.getPoints());
        System.out.println("Transaction History: "+ userA.getTransactions());
        
        System.out.println("Account details for " + userB.getName() + ":");
        System.out.println("Balance: $" + userB.getBalance());
        System.out.println("Points: " + userB.getPoints());
        System.out.println("Transaction History: "+ userB.getTransactions());
        
    }
    
    
    public static void task3(){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Monster Battle Warrior II");

        System.out.print("Input Player's Name: ");
        String playerName = scanner.nextLine();
        Human player = new Human(playerName);

        System.out.print("Input Monster's Name: ");
        String monsterName = scanner.nextLine();
        Monster monster = new Monster(monsterName);

        System.out.println();

        player.checkStatus();
        monster.checkStatus();

        System.out.println("Before the battle begin, please look forward to this battle option: ");
        System.out.println("Type (1) to attack");
        System.out.println("Type (2) to check the character's current status for once, then return to the options to attack or skip a turn");
        System.out.println("Type (0) to skip the current character's turn");
        System.out.println("WARNING! If you're trying to enter input other than the one above, automatically you will lose your turn.");
        System.out.println("Let the battle begin!");
        System.out.println();

        while (!player.isDead() && !monster.isDead()) {
            
            System.out.println("Player " + playerName + "'s Turn");
            System.out.print("Enter Action: ");
            int playerAction = scanner.nextInt();

            if (playerAction == 1) {
                int playerDamage = player.attack();
                monster.attacked(playerDamage);
                System.out.println("Ouch! " + monsterName + " got hit for " + playerDamage + " damage!");
                System.out.println();
            } else if (playerAction == 2 ) {
                
                while (playerAction == 2 ) {
                 player.checkStatus();
                 System.out.println("Player " + playerName + "'s Turn");
                    int pAction = scanner.nextInt();

                    if (pAction == 1) {
                    int playerDamage = player.attack();
                    monster.attacked(playerDamage);
                    System.out.println("Ouch! " + monsterName + " got hit for " + playerDamage + " damage!");
                    System.out.println();
                    } else if (pAction == 0 ) {
                System.out.println("The Player's choosing to skip the turn attack");
                System.out.println();
                    } else {
                System.out.println("You've already check your status! Now is the Monster " + monsterName + "'s Turn!");
                System.out.println();
                    }
                    break;
                }
            } else if (playerAction == 0 ) {
                System.out.println("The Player's choosing to skip the turn attack");
                System.out.println();
            } else {
                System.out.println("Invalid input! You've already lose your turn, please type the valid action in another time.");
                System.out.println();
            }

            if (monster.isDead()) {
                System.out.println();
                System.out.println(monsterName + " Defeated!");
                player.levelUp();
                break;
            }

            System.out.println("Monster " + monsterName + "'s Turn");
            System.out.print("Enter Action: ");
            int monsterAction = scanner.nextInt();

            if (monsterAction == 1) {
                int monsterDamage = monster.attack();
                player.attacked(monsterDamage);
                System.out.println("Ouch! " + playerName + " got hit for " + monsterDamage + " damage!");
                System.out.println();
            } else if (monsterAction == 2 ) {
                
                while (monsterAction == 2 ) {
                 player.checkStatus();
                 System.out.println("Monster " + monsterName + "'s Turn");
                    int mAction = scanner.nextInt();

                    if (mAction == 1) {
                    int monsterDamage = monster.attack();
                    player.attacked(monsterDamage);
                    System.out.println("Ouch! " + playerName + " got hit for " + monsterDamage + " damage!");
                    System.out.println();
                    } else if (mAction == 0 ) {
                System.out.println("The Monster's choosing to skip the turn attack");
                System.out.println();
                    } else {
                System.out.println("You've already check your status! Now is the Player " + playerName + "'s Turn!");
                System.out.println();
                    }
                    break;
                }
            } else if (monsterAction == 0 ) {
                System.out.println("The Monster's choosing to skip the turn attack");
                System.out.println();
            } else {
                System.out.println("Invalid input! You've already lose your turn, please type the valid action in another time.");
                System.out.println();
            }

            if (player.isDead()) {
                System.out.println();
                System.out.println(playerName + " Defeated!");
                break;
            }
        }
        System.out.println();
        player.checkStatus();
        monster.checkStatus();
        scanner.close();

    }
    
}