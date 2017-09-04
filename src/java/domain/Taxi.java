/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;

/**
 *
 * @author iMac
 */
public class Taxi {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    int id;
    String name;
    int postcode;
    int passengers;
    Person driver;
    
    public Taxi(int id, String name, int postcode, int passengers, Person driver) {
        this.id = id;
        this.name =name;
        this.postcode = postcode;
        this.passengers = passengers;
        this.driver = driver;
    }

    public Taxi() {
    }
}
