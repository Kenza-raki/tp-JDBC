/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.proejet.test;

import ma.proejet.beans.Developpeur;
import ma.proejet.beans.Manager;
import ma.proejet.service.DeveloppeurService;
import ma.proejet.service.ManagerService;

/**
 *
 * @author HP
 */
public class test {
     public static void main(String[] args) {
        DeveloppeurService ds = new DeveloppeurService();
         ManagerService ms = new ManagerService();
                 
      
        ds.create(new Developpeur("Kenza", 200));
        ds.create(new Developpeur("Samia", 200));
        ms.create(new Manager("Manger1", 1000));
        
   
       
}
}