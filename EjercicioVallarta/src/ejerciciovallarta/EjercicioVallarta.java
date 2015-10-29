/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovallarta;

import javax.swing.JOptionPane;

/**
 *
 * @author koebner
 */
public class EjercicioVallarta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Netbook minipc = new Netbook();
           minipc.sumar(4, 6);
           JOptionPane.showMessageDialog(null,minipc.getResultado());
           
       
       
        
        
    }
    
}
