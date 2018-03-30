/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.Echiquier;

/**
 *
 * @author csnd2342
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Echiquier e=new Echiquier();
        System.out.println(e);
        e.deplacement(0, 0, 7, 7);
        System.out.println(e);
        e.deplacement(7, 7, 0, 0);
        System.out.println(e);
        
    }
    
}
