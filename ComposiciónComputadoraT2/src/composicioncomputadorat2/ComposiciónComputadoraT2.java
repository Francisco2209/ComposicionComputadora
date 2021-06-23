/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicioncomputadorat2;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author PC
 */
public class ComposiciónComputadoraT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora comp1 = new Computadora ( "Pride", "Gaming", new Mouse( "Cougar", "Deathfire", "Alambrico"), 
                new Teclado( "Cougar", "Deathfire", 93, 12), 
                new Monitor ( "LG", "UltraGear", 21), 
                new CPU ("AMD", "Ryzen 5 3600", 4) );
    
        System.out.println( comp1 );
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println( "Computadora " + comp1.getMarca() + " " + comp1.getModelo() );
        System.out.println( "Procesador " + comp1.getCpu().getMarca() + " " + comp1.getCpu().getModelo() + " " + comp1.getCpu().getVelocidadProcesador() + "Ghz" );
        System.out.println("Monitor " + comp1.getMonitor().getMarca() + " " + comp1.getMonitor().getModelo() + " " + comp1.getMonitor().getPulgadas() + " pulgadas" );
        System.out.println("Mouse " + comp1.getMouse().getMarca() + " " + comp1.getMouse().getModelo() + " " + comp1.getMouse().getTipo() );
        System.out.println("Teclado " + comp1.getTeclado().getMarca() + " " + comp1.getTeclado().getModelo() + " de " + comp1.getTeclado().getNumeroDeTeclas() + " teclas + " + comp1.getTeclado().getMultimedia() + " multimedia");
        
                            
            
                             
                            
        
        
               
        
        
        
        
        
        
        
    }
    
}
