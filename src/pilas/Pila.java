/**
* Crea la Pila, apila y desapila elementos en ella.
* @author juan_san.erazo@uao.edu.co Juan Pablo Sandoval Erazo 2195823
* @author miguel.sanabria@uao.edu.co Miguel Angel Sanabria Rodriguez 2167228
* 
* 
* @date 8 Marzo 2021
* @version 1.0
*/
package pilas;

import java.util.LinkedList;

/**
 *
 * @author jupas
 */
public class Pila<T extends Base> {
    
    private LinkedList<T> tope;
    
    public Pila () {
        tope= new LinkedList<>();
    }
    
    public void apilar(T elem) {
        tope.addFirst(elem);
    }
    public T desapilar() {
        return tope.removeFirst();
    }

    public boolean estaVacia() {
        return tope.isEmpty();
    }
    
    public T primero(){
        return tope.peek();
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder("[");
        for (T e : tope)
        {
            sb.append(" ").append(e.toString());
        }
        sb.append("]");
        
        return sb.toString();
    }
    
}
