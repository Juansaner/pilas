/**
* Contiene las Operaciones Realizadas en las pilas
* @author juan_san.erazo@uao.edu.co Juan Pablo Sandoval Erazo 2195823
* @author miguel.sanabria@uao.edu.co Miguel Angel Sanabria Rodriguez 2167228
* @author john.quintero@uao.edu.co John Alejandro Quintero Suaza 2171945
* @author esteban.garrido@uao.edu.co  Esteban Garrido  2160721
* @date 8 Marzo 2021
* @version 1.0
*/
package pilas;

import datos.Lanzamiento;

/**
 *
 * @author jupas
 */
public class OperacionesPilas<T extends Base> {

    public static <T extends Base> Pila<T> duplicarPila(Pila<T> pilaOriginal) {
        Pila<T> duplicada = new Pila<>();
        Pila<T> colaAux = new Pila<>();

        while (!pilaOriginal.estaVacia()) {
            colaAux.apilar(pilaOriginal.desapilar());
        }

        while (!colaAux.estaVacia()) {
            T temporal = colaAux.desapilar();
            T temporal2 = (T) temporal.copia();
            pilaOriginal.apilar(temporal);
            duplicada.apilar(temporal2);
        }

        return duplicada;

    }

    // invertir
    public static <T extends Base> Pila<T> invertir(Pila<T> p) {
        Pila<T> pilaInvertida = new Pila<>();
        Pila<T> pilaAux = duplicarPila(p);
        while (!pilaAux.estaVacia()) {
            pilaInvertida.apilar(pilaAux.desapilar());
        }
        return pilaInvertida;
    }

    // concatenar
    public static <T extends Base> Pila<T> concatenar(Pila<T> p1, Pila<T> p2) {
        Pila<T> pilaAuxP = invertir(p1);
        Pila<T> pilaAuxQ = invertir(p2);
        Pila<T> pilaConcatenada = new Pila<>();
        while (!pilaAuxP.estaVacia()) {
            pilaConcatenada.apilar(pilaAuxP.desapilar());

        }
        while (!pilaAuxQ.estaVacia()) {
            pilaConcatenada.apilar(pilaAuxQ.desapilar());

        }
        return pilaConcatenada;
    }

    public static <T extends Base> Pila<T> obtenerPares(Pila<T> pilaOriginal) {
        Pila<T> pilapares = new Pila<>();
        Pila<T> piladuplicada = duplicarPila(pilaOriginal);

        while (!piladuplicada.estaVacia()) {
            T elemento = piladuplicada.desapilar();
            Lanzamiento objl = (Lanzamiento) elemento;

            if (objl.getDado1() == objl.getDado2());
            pilapares.apilar(elemento);
        }

        return pilapares;

    }
    
    public static double factorial (double n){
        
        double factorial = 1;
        double numero = n;
        
        for (double i = numero; i > 0; i--) {
            factorial=factorial*i;
        }
        return factorial;
        
    }
}
