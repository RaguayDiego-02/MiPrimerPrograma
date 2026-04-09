package org.diegoraguay.view;
import java.util.Scanner; 

public class ViewMenuPrincipal {
    //global
    int opcionMenu = 0; 
    Scanner leer = new Scanner(System.in); 
    //variables globales
    public void mostrarMenu(){
        //local
        while (opcionMenu == 0){
            System.out.println("Bienvenido, seleccione una opcion:");
            System.out.println("1. Operaciones matematicas");
            System.out.println("2. Operaciones de texto"); 
            System.out.println("3. Operaciones de logica"); 
            System.out.println("4. Salir del sistema"); 
            opcionMenu = Integer.parseInt(leer.nextLine()); 
        }
        
    }
    public void mostrarMenuMatematicas(){
        System.out.println("Bienvenido al menu de operaciones matematicas");
    }
}
