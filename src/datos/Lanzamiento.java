/**
* Identificar cada valor que se genere en los lanzamientos.
* @author juan_san.erazo@uao.edu.co Juan Pablo Sandoval Erazo 2195823
* @author miguel.sanabria@uao.edu.co Miguel Angel Sanabria Rodriguez 2167228
* @author john.quintero@uao.edu.co John Alejandro Quintero Suaza 2171945
* @author esteban.garrido@uao.edu.co  Esteban Garrido  2160721
* @date 8 Marzo 2021
* @version 1.0
*/
package datos;

import pilas.Base;

/**
 *
 * @author Familia Sanabria
 */
public class Lanzamiento extends Base{

    private int dado1;
    private int dado2;

    public Lanzamiento() {
    }

    public Lanzamiento(int dado1, int dado2) {
        this.dado1 = dado1;
        this.dado2 = dado2;
    }

    /**
     * Get the value of dado2
     *
     * @return the value of dado2
     */
    public int getDado2() {
        return dado2;
    }

    /**
     * Set the value of dado2
     *
     * @param dado2 new value of dado2
     */
    public void setDado2(int dado2) {
        this.dado2 = dado2;
    }


    /**
     * Get the value of dado1
     *
     * @return the value of dado1
     */
    public int getDado1() {
        return dado1;
    }

    /**
     * Set the value of dado1
     *
     * @param dado1 new value of dado1
     */
    public void setDado1(int dado1) {
        this.dado1 = dado1;
    }

    @Override
    public String toString() {
        return "Lanzamiento " + "dado1=" + dado1 + ", dado2=" + dado2;
    }

    @Override
    public Base copia() {
       return new Lanzamiento(dado1, dado2);
    }
    
    
}
