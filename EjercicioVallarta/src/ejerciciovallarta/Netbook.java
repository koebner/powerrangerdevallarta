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
public class Netbook extends Computadora{
    
    public void Netbook()
    {
     JOptionPane.showMessageDialog(null,"soy la clase Netbook");
    
    }
    
    public int sumar(int valor1, int valor2, int valor3)
    {
        
        int resultado = (valor1 * valor2) + valor3;
        return resultado;
        
    }
   
    
    
}
