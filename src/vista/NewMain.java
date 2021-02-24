/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Cliente;
import pilas.Pila;

/**
 *
 * @author jupas
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila<Cliente> pilaC=new Pila<>();
        
        pilaC.apilar(new Cliente("20145", "da@uao.edu.co", "David", "12000", "calle56"));
        pilaC.apilar(new Cliente("2589", "ma@uao.edu.co", "Maria", "96325", "calle32"));
        pilaC.apilar(new Cliente("3454", "rt@uao.edu.co", "Ramiro", "8547", "Avenida 6"));
        
        System.out.println("Datos en la pila original" + pilaC.toString());
        
        pilaC.desapilar();
        
        System.out.println("Datos en la pila original" + pilaC.toString());
    }
    
}
