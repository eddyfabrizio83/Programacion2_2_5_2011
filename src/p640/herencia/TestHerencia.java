/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p640.herencia;

/**
 *
 * @author Gotcha
 */
public class TestHerencia {
    public static void main(String args[]){
        Trabajador ts[] = new Trabajador[2];
        
        ts[0] = new Trabajador(1,"Carlos",'M');
        ts[1] = new Empleado(2,"Wendy",'F',6700);
        
        for( Trabajador t : ts){
            t.quiensoy();
        }
                
    }
}
