/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArrayList011 {

    public static void main(String[] args) {

        ArrayList<String> arreglo2 = obtenerDatos();
        String cadenaFinal = obtenerCadenaFinal(arreglo2);
        System.out.printf("%s\n", cadenaFinal);
    }

    public static ArrayList<String> obtenerDatos() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> arreglo = new ArrayList<>();
        boolean bandera = true;
        String pais;
        int opcion;

        while (bandera) {
            System.out.println("Ingrese el nombre de un país:");
            pais = entrada.nextLine();
            arreglo.add(pais);
            System.out.println("Si desea agregar un pais presione i");
            opcion = entrada.nextInt();
            entrada.nextLine();
            if (opcion !=1){
                bandera = false;
            }
        }
              
            return arreglo;
        }
    public static String obtenerCadenaFinal(ArrayList<String>arreglo){
        String mensaje = "";
        for (int i = 0; i < arreglo.size(); i++){
            mensaje = String.format("%%\n", mensaje, arreglo.get(i));
        }
        return mensaje;

    }
}


/*
        ArrayList <String> arreglo2 = new ArrayList<>();
        
        ArrayList <Boolean> arreglo4 = new ArrayList<>();
 */
