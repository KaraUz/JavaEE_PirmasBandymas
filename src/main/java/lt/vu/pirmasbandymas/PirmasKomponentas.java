/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vu.pirmasbandymas;

import java.util.Date;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Karolis
 */
@Named
//@RequestScoped
//po uzklausos sunaikinamas beanas.
//@SessionScoped
//nesunaikinamas beanas visos sesijos metu.
//@Stateful
//saugo kliento busena, tik vienas aktyvus klientas.
@Stateless
//nesaugoja jokios busenos, todel dirba su daug klientu.
public class PirmasKomponentas {

    public String sakykLabas() {
      return "Labas " + new Date() + " " + toString();
    }
    
    @PostConstruct
    public void init() {
      System.out.println(toString() + " constructed.");
    }
    
    @PreDestroy
    public void aboutToDie() {
      System.out.println(toString() + " ready to die.");
    }   
    
    public String toString(){
        return "Pirmas komponentas";
    }
}
