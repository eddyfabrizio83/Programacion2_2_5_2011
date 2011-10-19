/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p65.herencia;

/**
 *
 * @author Gotcha
 */
public class TestCuenta {
    public static void main(String args[]){
        CuentaBancaria cb[] = new CuentaBancaria[2];
        
        cb[0] = new CuentaBancaria(1,"Carlos");
        cb[1] = new CuentaPersonal(2,"Josue");
        
        for(CuentaBancaria cuenta : cb ){
            cuenta.imprimir();
        }
       
    }
}
