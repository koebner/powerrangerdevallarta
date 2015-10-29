/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovallarta;

/**
 *
 * @author koebner
 */
public class Computadora {
    private String procesador;
    private String marca;
    private String color;  
    private String tipo;
    private int memoria;   
    private int almacenamiento; 
    private int resultado;
    private float precio;
    
    public void encender(){
        System.out.println("La maquina esta encendida");
    
    }
    
    public void apagar ()
    {
        System.out.println("La maquina esta apagada");
    }
    
    public int sumar(int valor1, int valor2)
    {    
        resultado = valor1 + valor2;
        
        
        return resultado;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
    
}
