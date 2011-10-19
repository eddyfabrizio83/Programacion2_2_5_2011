/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p65.herencia;

/**
 *
 * @author Gotcha
 */
public class CuentaBancaria {
    protected int numCuenta;
    protected String nombre;
    protected double saldo;
    protected double tasaInteres;
    public static int MINIMO_DEPOSITO_INICIAL = 500;
    
    public CuentaBancaria(int nc,String n){
        numCuenta = nc;
        nombre = n;
        saldo = MINIMO_DEPOSITO_INICIAL;
        tasaInteres = 0.02; 
    }
    
    public void hacerDeposito(double monto){
        saldo += monto;
    }
    
    public void hacerRetiro(double monto){
        if( monto < saldo )
            saldo -= monto;
    }
    
    public void registrarIntereses(){
        saldo += saldo * tasaInteres;
    }
    
    @Override
    public String toString(){
        String res= this.numCuenta + " - " +
                this.nombre + " - " + this.saldo + " lps";
        return res;
    }
    
    public void imprimir(){
        System.out.println(this);
    }
    
    public void quienSoy(){
        System.out.println("Soy el PAPA!");
    }
}
