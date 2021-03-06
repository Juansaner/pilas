/**
* Convierte la Pila en una tabla HTML para WebView
* @author juan_san.erazo@uao.edu.co Juan Pablo Sandoval Erazo 2195823
* @author miguel.sanabria@uao.edu.co Miguel Angel Sanabria Rodriguez 2167228
* @author john.quintero@uao.edu.co John Alejandro Quintero Suaza 2171945
* @author esteban.garrido@uao.edu.co  Esteban Garrido  2160721
* @date 8 Marzo 2021
* @version 1.0
*/
package pilas;

import datos.Lanzamiento;
import pilas.OperacionesPilas;
import pilas.Pila;

/**
 *
 * @author 
 */
public class Tools
{

    /**
     * Metodo que recibe una pila y convierte su contenido en un documento en formato
     * HTML para su posterior visualización.
     * El metodo hace usa copia profunda para asegurar que no se toquen o destruyan los datos 
     * de la pila original <code>p</code>.
     * @param p
     * @return 
     */
    //<editor-fold defaultstate="collapsed" desc="Metodo :: String convertirPilaAHtml(Pila<Valor>)">
    public static String convertirPilaAHtml(Pila<Lanzamiento> p)
    {
        StringBuilder sb = new StringBuilder("<html>");
        Pila<Lanzamiento> q = OperacionesPilas.duplicarPila(p);
        
        sb.append("<noscript>").append("</noscript>");
        
        if (!q.estaVacia())
        {
            sb.append("<table align=\"center\" border=\"2\" font color=\"#000000\">");
            sb.append("<tr>").append("<th>").append("Lanzamientos").append("</th>").append("</tr>");
            do
            {
                Lanzamiento e = q.desapilar();
                sb.append("<tr>").append("<td>");
                sb.append(e.getDado1());
                sb.append(" - ");
                sb.append(e.getDado2());
                sb.append("</td>").append("</tr>");
            }
            while (!q.estaVacia());
            sb.append("</table>");
        }
        else
        {
            sb.append("<h1 align=\"center\">").append("Pila Vacia").append("</h1>");
        }
        
        sb.append("</html>");
        
        return sb.toString();
    }
    //</editor-fold>

    /**
     * Metodo que inyecta código HTML en un documento buscando la marca <code>script</code>, esto es util
     * para delegar tareas que no se deben o quieren realizar en el procesamiento principal.
     * @param p
     * @param texto
     * @return 
     */
    //<editor-fold defaultstate="collapsed" desc="String convertirPilaAHtml(Pila<Valor> p, String texto)">
    public static String convertirPilaAHtml(Pila<Lanzamiento> p, String texto)
    {
        String html = "<br><center>Se retiro " + texto + "</center></br>";
        StringBuilder sb = new StringBuilder(convertirPilaAHtml(p));
        try
        {
            sb.replace(sb.indexOf("<noscript>"), sb.indexOf("</noscript>"), html);
        }
        catch (StringIndexOutOfBoundsException ex)
        {
        }
        
        return sb.toString();
    }
    //</editor-fold>
}
