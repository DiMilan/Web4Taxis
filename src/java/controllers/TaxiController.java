/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import services.Taximanager;

/**
 *
 * @author iMac
 */
@Controller
//@RequestMapping("taxi")
public class TaxiController {
    
    @Autowired
    private Taximanager taximanager;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String listTaxis(Model model) {
        model.addAttribute("taxisList", taximanager.findAll());
        return "listTaxis";

    }
    
    
    
}
