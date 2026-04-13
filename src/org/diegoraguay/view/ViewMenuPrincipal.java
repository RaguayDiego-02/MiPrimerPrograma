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
            System.out.println("|3.Operaciones logicas     |");
            System.out.println("|4.Salir del menu          |");
            System.out.println("|__________________________|");
            System.out.println("Seleccione una opcion");
            opcionMenu = Integer.parseInt(leer.nextLine());
            
            switch (opcionMenu){
                case 1:
                    mostrarMenuOperacionesMatematicas();  
                    break;
                case 2:
                    mostrarMenuOperacionesDeTexto();
                    break;
                case 3:
                    mostrarMenuOperacionesLogicas();
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
        System.out.println("|_Menu operaciones matematicas_|");
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
                System.out.println("Saliendo del Menu operaciones matematicas");
                break;
            default :
                System.out.println("Opcion invalida, mantener el rango(1-11)");

        }

    } while (opcionMatematica != 11);
            
 }
 
public void mostrarMenuOperacionesDeTexto(){
    int opcionTexto = 0; 
     
    do{
        System.out.println("|__Menu operaciones de texto__|");
        System.out.println("|1.Concatenador de nombre     |");
        System.out.println("|2.Contador de longitud       |");
        System.out.println("|3.Inversor de texto          |");
        System.out.println("|4.Detector de vocales        |");
        System.out.println("|5.Extractor de iniciales     |");
        System.out.println("|6.Normalizador de mayusculas |");
        System.out.println("|7.Conversor binario          |");
        System.out.println("|8.Repetidor de palabras      |");
        System.out.println("|9.Validador de password      |");
        System.out.println("|10.Generador de email        |");
        System.out.println("|11.Salir del menu            |");
        System.out.println("|_____________________________|");
        System.out.println("Seleccione una opcion");
        
        opcionTexto = Integer.parseInt(leer.nextLine()); 
        
        switch (opcionTexto){
            case 1: 
                System.out.println("Concatenador de nombre");
                break; 
            case 2:
                System.out.println("Contador de longitud");
                break; 
            case 3:
                System.out.println("Inversor de texto");
                break; 
            case 4:    
                System.out.println("Detector de vocales");
                break; 
            case 5:   
                System.out.println("Extractor de iniciales");
                break; 
            case 6:
                System.out.println("Normalizador de mayusculas");
                break; 
            case 7:
                System.out.println("Conversor binario");
                break; 
            case 8:
                System.out.println("Repetidor de palabras");
                break; 
            case 9:
                System.out.println("Validador de password");
                break; 
            case 10:
                System.out.println("Generador de email");
                break; 
            case 11:
                System.out.println("Saliendo del Menu operaciones de texto");
                break;
            default :
                System.out.println("Opcion invalida, mantener el rango(1-11)");
        }
        
    }while (opcionTexto !=11); 
  }

 public void mostrarMenuOperacionesLogicas(){
    int opcionLogica = 0; 
     
    do{
        System.out.println("|_Menu operaciones logicas_|");
        System.out.println("|1.Verificador de edad     |");
        System.out.println("|2.Numero par              |");
        System.out.println("|3.Semaforo                |");
        System.out.println("|4.Rango numerico          |");
        System.out.println("|5.Login simple            |");
        System.out.println("|6.Mayor de dos            |");
        System.out.println("|7.Año bisiesto            |");
        System.out.println("|8.Aprobado/reprobado      |");
        System.out.println("|9.Validador de triangulo  |");
        System.out.println("|10.Comparador de cadenas  |");
        System.out.println("|11.Salir del menu         |");
        System.out.println("|__________________________|");
        System.out.println("Seleccione una opcion");
        
        opcionLogica = Integer.parseInt(leer.nextLine());
        
        switch(opcionLogica){
            case 1: 
                System.out.println("Verificador de edad");
                break; 
            case 2:
                System.out.println("Numero par");
                break; 
            case 3:
                System.out.println("Semaforo");
                break; 
            case 4:    
                System.out.println("Rango numerico");
                break; 
            case 5:   
                System.out.println("Login simple");
                break; 
            case 6:
                System.out.println("Mayor de dos");
                break; 
            case 7:
                System.out.println("Año bisiesto ");
                break; 
            case 8:
                System.out.println("Aprobado/reprobado");
                break; 
            case 9:
                System.out.println("Validador de triangulo");
                break; 
            case 10:
                System.out.println("Comparador de cadenas");
                break; 
            case 11:
                System.out.println("Saliendo del Menu operaciones logicas");
                break;
            default :
                System.out.println("Opcion invalida, mantener el rango(1-11)");
        }
    }while(opcionLogica !=11);
 }
}
