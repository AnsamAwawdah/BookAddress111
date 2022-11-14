/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.addressbook;

/**
 *
 * @author ansam
 */
public class Person extends ContactInformation{
    String firstName , lastName;
    BirthDate birthDate ; 

    public Person(String firstName, String lastName, BirthDate birthDate, String country, String city, String postalCode, String email, int telephoneNo) {
        super(country, city, postalCode, email, telephoneNo);
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
    
    

    

    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BirthDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(BirthDate birthDate) {
        this.birthDate = birthDate;
    }
    @Override 
    public String getInfo(){
    return  super.getInfo() + "Name:" + firstName + " " + lastName + " " +"Age:" ;
    }
    
    
    
}
