/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcial;

/*Libreria para BufferwdReader*/
import java.io.BufferedReader;
/*Lireria leer documentos sin excepcion*/
import java.io.FileNotFoundException;
/*Libreria Leer archivo*/
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author CARLOS DANEIL LOPEZ HERNANDEZ
 */
public class LeerCSV {
    public void leerCSV() {
		BufferedReader bufferLectura = null;
		String[] campos = null;
		try {
			bufferLectura = new BufferedReader(new FileReader("ListaB.csv"));

			String linea = bufferLectura.readLine();
			
                        Listas_leer ListaLeer = new Listas_leer();
                        ListaLeer.InsertarInicio("5190-19-5203", "CARLOS DANIEL LOPEZ HERNANDEZ", "Desarrollador Web"); //cambiar por tus datos
  
			while (linea != null) {
				campos = linea.split(";");

				linea = bufferLectura.readLine();

        //INSERTAR AL FINAL
        ListaLeer.InsertarInicio(campos[0], campos[1], campos[2]);
        /*//ELIMINAR
        System.out.println("ELIMINAR 002 Y 004");
        ListaLeer.Eliminar("002");
        ListaLeer.Eliminar("004");
        ListaLeer.visualizar();

        System.out.println("ELIMINAR 005");
        ListaLeer.Eliminar("005");
        ListaLeer.visualizar();

        System.out.println("INSERTAR DESPUES DE 003");
        ListaLeer.Insertar( "006", "Gladys", 3215.25f, "003");
        ListaLeer.visualizar();*/
			}

      ListaLeer.visualizar();
      
		} catch (IOException e) {
                    
			e.printStackTrace();
                        
		} finally {
			if(bufferLectura != null) {
				try {
                                    
					bufferLectura.close();
                                        
				} catch(IOException e) {
                                    
					e.printStackTrace();
                                        
				}
			}
		}
	}
}
