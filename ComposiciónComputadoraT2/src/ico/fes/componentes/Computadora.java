/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author PC
 */
public class Computadora {
    private String marca;
    private String modelo;
    private Mouse mouse;
    private Teclado teclado;
    private Monitor monitor;
    private CPU cpu;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, Mouse mouse, Teclado teclado, Monitor monitor, CPU cpu) {
        this.marca = marca;
        this.modelo = modelo;
        this.mouse = mouse;
        this.teclado = teclado;
        this.monitor = monitor;
        this.cpu = cpu;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", mouse=" + mouse + ", teclado=" + teclado + ", monitor=" + monitor + ", cpu=" + cpu + '}';
    }
    
    


    


}
