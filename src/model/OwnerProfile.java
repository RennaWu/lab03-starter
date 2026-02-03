/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rennawu
 */
public class OwnerProfile {
    
  String name;
  String ownerType;
  Address address;
  // ContactInformation contactInfo

  public OwnerProfile(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }
    
}
