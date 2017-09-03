/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import domain.Taxi;
import domain.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author iMac
 */
public class Taximanager implements ITaximanager {

  
   private static final List<Taxi> list = new ArrayList<>();

    static {
        list.add(new Taxi(1,"TaxiMarcel", 9000, 3, new Person("Patrick")));
        list.add(new Taxi(2,"TaxiSofie", 8000, 1, new Person("Mike")));
        list.add(new Taxi(3,"TaxiPat", 8500, 2, new Person("Patel")));
        list.add(new Taxi(4,"TaxiSaar", 9100, 1, new Person("Saartje")));
        
    }

    @Override
    public List<Taxi> findAll() {
        return list;
    }

    @Override
    public Taxi findById(Integer id) {
        
        Optional<Taxi> taxi
                = list.stream().filter(i -> i.getId() == id).findFirst();
        return (taxi.isPresent()) ? taxi.get() : null;
    }
    


}
