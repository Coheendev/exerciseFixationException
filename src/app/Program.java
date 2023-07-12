package app;

import model.Exception.AccountException;
import model.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int accountNumber = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            Double inicialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();

            Account account = new Account(accountNumber, holder, inicialBalance, withdrawLimit);
            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            Double withdraw = sc.nextDouble();
            account.withdraw(withdraw);
            System.out.println(account);
        }
        catch (AccountException e){
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }



        sc.close();
    }
}
