/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p640.herencia;


/**
 *
 * @author Gotcha
 */
public class Trabajador {
    protected int codigo;
    protected String nombre;
    protected char genero;
    protected static double TASA_RAP = 0.035;
    
    public Trabajador(int c,String n,char g){
        codigo = c;
        nombre = n;
        genero = g;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void quiensoy(){
        System.out.println("Soy el PAPA Trabajador");
    }
    
    public double pagoTotal(){
        return 0;
    }
    
    @Override
    public String toString(){
        String cad = codigo + " - " +
                nombre + " - " + genero;
        return cad;
    }
    
    public void imprimir(){
        System.out.println( this );
    }
 
}
