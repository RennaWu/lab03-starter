/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rennawu
 */
import model.BankAccount;


public class BankAccountAPP {
    
    public static void main(String[] args) throws Exception {

        BankAccount myOwnBankAccount = new BankAccount("Renna", "USD", 100000000);

        myOwnBankAccount.printAccountInfo();
    }
    
}
