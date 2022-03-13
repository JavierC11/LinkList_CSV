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
public class Listas_leer {
    
    nodo_leer primero;

    public Listas_leer() {
        primero = null;
    }

    public void InsertarInicio(String DPI, String Nombre, String Puesto) {
        nodo_leer nuevo;
        nuevo = new nodo_leer(DPI, Nombre, Puesto, primero);
        primero = nuevo;
    }

    public void visualizar() {
        nodo_leer n;
        int k = 1;
        n = primero;
        
        System.out.println("*****************************************************************");
        System.out.println("CARLOS DANIEL LOPEZ HERNANDEZ  //  5190-19-5203 // SECCION B ");
        System.out.println("*****************************************************************");
        System.out.println("#, DPI, NOMBRE, PUESTO");
        while (n != null) {
            System.out.print(k + ". " + n.DPI + ", " + n.Nombre + ", " + n.Puesto + "\n");
            n = n.Siguiente;
            k++;
        }
    }

    public void InsertarFinal(String DPI, String Nombre, String Puesto) {
        nodo_leer n;
        nodo_leer nuevo;

        n = primero;
        while (n.Siguiente != null) {
            n = n.Siguiente;
        }

        nuevo = new nodo_leer(DPI, Nombre, Puesto, null);
        n.Siguiente = nuevo;
    }

    public void Eliminar(String Codigo) {
        nodo_leer n;
        nodo_leer nant = null;
        boolean EncuentraLista = false;

        n = primero;
        while (n != null && !EncuentraLista) {
            if (n.DPI == Codigo) {
                EncuentraLista = true;
            } else {
                nant = n;
                n = n.Siguiente;
            }
        }

        if (n != null) {
            if (n == primero) {
                primero = n.Siguiente;
            } else {
                nant.Siguiente = n.Siguiente;
            }
        }
        n = null;
    }

}