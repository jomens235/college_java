import java.util.*;

public class firstClass {
    static Scanner in = new Scanner(System.in);
    static double balance = 0;

    public static void WhatDoYouWantToDo() {
        System.out.println("1 - Deposit Money");
        System.out.println("2 - Withdraw Money");
        System.out.println("3 - How much money do I have?");
        System.out.println("4 - Can I buy this?");
        System.out.println("5 - Quit");
    }

    public static void DepositMoney() {
        System.out.println("Enter deposit amounts:");
        boolean repeat = true;
        while (repeat) {
            double deposit = in.nextDouble();
            if (deposit != -1) {
                balance += deposit;
            }
            else {
                repeat = false;
            }
        }
        System.out.println("You have $" + balance);
    }

    public static void WithdrawMoney() {
        System.out.println("Enter amount to withdraw:");
        boolean repeat = true;
        while (repeat) {
            double withdraw = in.nextDouble();
            if (withdraw != -1) {
                balance -= withdraw;
            }
            else {
                repeat = false;
            }
        }
        System.out.println("You have $" + balance);
    }

    public static void Balance() {
        System.out.println("You have $" + balance + " in your account.");
    }

    public static boolean CanIBuyIt(double cost) {
        if (balance - cost >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        WhatDoYouWantToDo();
        boolean loop = true;
        while (loop) {
            int selection = in.nextInt();
            if (selection == 1) {
                DepositMoney();
            } else if (selection == 2) {
                WithdrawMoney();
            } else if (selection == 3) {
                Balance();
            } else if (selection == 4) {
                System.out.println("Enter the cost of the item");
                double price = in.nextDouble();
                if (CanIBuyIt(price)) {
                    System.out.println("You can buy it!");
                } else {
                    System.out.println("You can't afford it.");
                }
            } else if (selection == 5) {
                System.out.println("You exited the program.");
                loop = false;
            } else {
                WhatDoYouWantToDo();
            }
   
        }
    }

}
