/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author iMac
 */
public class Person {

    public Person(String Naam) {
        this.Naam = Naam;
    }

    public Person() {
    }
    
    private String Naam;
    
    public String getNaam() {
        return Naam;
    }

    public void setNaam(String Naam) {
        this.Naam = Naam;
    }
 
    
    
    
}
