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
                    mostrarMenuOperacionesMatematicas();  
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
    
 public void mostrarMenuOperacionesMatematicas(){
    int opcionMatematica = 0;

    do{
        System.out.println("|________Menu Matematico_______|");
        System.out.println("|1. Calculadora de salario     |");
        System.out.println("|2. Área de triángulo          |");
        System.out.println("|3. Promedio académico         |");
        System.out.println("|4. Convertidor de temperatura |");
        System.out.println("|5. Perímetro de círculo       |");
        System.out.println("|6. Volumen de un cilindro     |");
        System.out.println("|7. Hipotenusa                 |");
        System.out.println("|8. Días a minutos             |");
        System.out.println("|9. Resto de división          |");
        System.out.println("|10. Potencia al cubo          |");
        System.out.println("|11. Salir del menu            |");
        System.out.println("|______________________________|");
        System.out.println("Seleccione una opcion");

        opcionMatematica = Integer.parseInt(leer.nextLine());

        switch (opcionMatematica){
            case 1: 
                System.out.println("Calculadora de salario");
                break; 
            case 2:
                System.out.println("Area de triangulo");
                break; 
            case 3:
                System.out.println("Promedio academico");
                break; 
            case 4:    
                System.out.println("Convertidor de temperatura");
                break; 
            case 5:   
                System.out.println("Perimetro de circulo");
                break; 
            case 6:
                System.out.println("Volumen de un cilindro");
                break; 
            case 7:
                System.out.println("Hipotenusa");
                break; 
            case 8:
                System.out.println("Dias a minutos");
                break; 
            case 9:
                System.out.println("Resto de division");
                break; 
            case 10:
                System.out.println("Potencia al cubo ");
                break; 
            case 11:
                System.out.println("Saliendo del Menu Matematico");
                break;
            default :
                System.out.println("Opcion invalida, mantener el rango(1-11)");

        }

    } while (opcionMatematica != 11);
    
 }
 
}
