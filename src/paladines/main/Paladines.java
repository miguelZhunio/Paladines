/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paladines.main;

import paladines.interfazes.principal;

/**
 *
 * @author PC01
 */
public class Paladines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Llamamos a la ventana Principal
        principal mostrarPrincipal = new principal();
        mostrarPrincipal.setVisible(true);
        
    }
    
}
