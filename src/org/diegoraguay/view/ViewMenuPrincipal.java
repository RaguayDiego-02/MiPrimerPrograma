package org.diegoraguay.view;
import java.util.Scanner; 

public class ViewMenuPrincipal {
    Scanner leer = new Scanner(System.in); 
    
    public void mostrarMenuPrincipal(){
        int opcionMenu = 0; 
        do {
            System.out.println("|______Menu Principal______|");
            System.out.println("|1.Operaciones matematicas |");
            System.out.println("|2.Operaciones de texto    |");
            System.out.println("|3.Operaciones de logica   |");
            System.out.println("|4.Salir del menu          |");
            System.out.println("|__________________________|");
            System.out.println("Seleccione una opcion");
            opcionMenu = Integer.parseInt(leer.nextLine());
            
            switch (opcionMenu){
                case 1:
                    System.out.println("Entrando a menu Operaciones matematicas"); 
                    break;
                case 2:
                    System.out.println("Entrando a menu Operaciones de texto");
                    break;
                case 3:
                    System.out.println("Entrando a menu Operaciones de logica");
                    break;
                case 4:
                    System.out.println("Saliendo del menu");
                    break; 
                default :
                    System.out.println("Opcion no existente, por favor mantener el rango (1-4)");
            }
        }while (opcionMenu != 4); 
        
    }
}
