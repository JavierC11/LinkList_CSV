/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcial;

/**
 *
 * @author CARLOS DANIEL LOPEZ HERNANDEZ
 */
public class nodo_leer {
    String DPI;
    String Nombre;
    String Puesto;

    nodo_leer Siguiente;

    public nodo_leer(String dpi, String nombre, String puesto, nodo_leer SiguienteNODO)
    {
        DPI = dpi;
        Nombre = nombre;
        Puesto = puesto;
        Siguiente = SiguienteNODO;
    }
}
