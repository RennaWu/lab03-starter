/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rennawu
 */
public class BankAccount {
    
  OwnerProfile owner;
  String currency;
  int balance;

  public BankAccount(String n, String c, int b) {
    owner = new OwnerProfile(n);
    currency = c;
    balance = b;
  }

  public void printAccountInfo() {
    System.out.println(owner.getName() + " - " + currency + " - " + balance);
  }

}
