/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p640.herencia;

/**
 *
 * @author Gotcha
 */
public class Empleado extends Trabajador{
   
    private double salario;
    private double deducciones;
    
    public Empleado(int c,String n,char g,double s){
        super(c,n,g);
        salario = s;
        deducciones = 0;
    }

    public double getSalario(){
        return salario;
    }
    
    public double deducciones(){
        return deducciones;
    }
    
    @Override
    public double pagoTotal(){
        deducciones = salario * TASA_RAP;
        double pt = salario - deducciones;
        return pt;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("salario: " + salario);
    }
    
    @Override
    public void quiensoy(){
        System.out.println("Soy el hijo Empleado");
    }
    
}
