/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import domain.Taxi;
import java.util.List;

/**
 *
 * @author iMac
 */
public interface ITaximanager {

    List<Taxi> findAll();

    Taxi findById(Integer id);
    
}
