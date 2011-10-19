/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p65.herencia;

/**
 *
 * @author Gotcha
 */
public class CuentaPersonal extends CuentaBancaria {
    
    private boolean activo;
    
    public CuentaPersonal(int nc,String n){
        super(nc,n);
        activo = true;
    }
    
    /**
     * Esta funcion sirve para hacer depositos
     * @param monto es el monto a depositar
     */
    @Override
    public void hacerDeposito(double monto){
        if( !activo ){
            activo = true;
            monto -= monto * 0.05;
        }
        super.hacerDeposito(monto);
    }
    
    @Override
    public void registrarIntereses(){
        if( activo )
            saldo += saldo * tasaInteres;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println(activo ? " - Cuenta Activa" : " - Cuenta Inactiva");
        
    }
    
    @Override
    public void quienSoy(){
        System.out.println("Soy JEAN el Hijo");
    }
}
