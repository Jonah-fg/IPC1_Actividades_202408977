package actividad.pkg4.ipc1;

import java.util.Scanner;

public class Actividad4IPC1 {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      String Opciones; 
      Scanner scanner=new Scanner(System.in);
      do {
          System.out.println("---Ingrese una opcion---");
          System.out.println("uno: suma");
          System.out.println("dos: Resta");
          System.out.println("tres: Multiplicación");
          System.out.println("cuatro: division");
          System.out.println("cinco: potencia");
          System.out.println("seis: Raiz");
          System.out.println("siete: Salir");
          System.out.println("\nIngrese una opcion: ");
          Opciones=scanner.nextLine();
          
                
        switch(Opciones) {
           
           case "uno":
                FuncionSuma();
                break;
           
           case "dos":
                FuncionResta();
                break;
           
           case "tres":   
                FuncionMultiplicacion();
                break;
            
           case "cuatro":  
                FuncionDivision();
                break;
                
           case "cinco":
                FuncionPotencia();
                break; 
                
           case "seis":  
                FuncionRaiz();
                break;
                
           case "siete":  
               System.out.println("esta saliendo del programa");
               break;
            
             default:
                    System.out.println("opcion no disponible, ingrese una opcion valida");
                    break;
        }  
    }    while (!Opciones.equals("siete"));     
      scanner.close();
   }
      private static double[] solicitarNumeros() {
        double[] numeros = new double[2];
        System.out.print("Ingrese el primer número (a): ");
        numeros[0] = scanner.nextDouble();
        System.out.print("Ingrese el segundo número (b): ");
        numeros[1] = scanner.nextDouble();
        scanner.nextLine();
        return numeros;
       } 
      
    private static void FuncionSuma() {
        System.out.println("\n--- SUMA ---");
        double[] numeros=solicitarNumeros();
        double resultado=numeros[0]+numeros[1];
        System.out.println("Resultado: " + numeros[0] + " + " + numeros[1] + " = " + resultado);
       }     

    private static void FuncionResta() {
        System.out.println("\n--- RESTA ---");
        double[] numeros=solicitarNumeros();
        double resultado=numeros[0] - numeros[1];
        System.out.println("Resultado: " + numeros[0] + " - " + numeros[1] + " = " + resultado);
    }

    private static void FuncionMultiplicacion() {
        System.out.println("\n--- Multiplicacion ---");
        double[] numeros=solicitarNumeros();
        double resultado=numeros[0] * numeros[1];
        System.out.println("Resultado: " + numeros[0] + " - " + numeros[1] + " = " + resultado);
    }

    private static void FuncionDivision() {
        System.out.println("\n--- DIVISIÓN ---");
        double[] numeros=solicitarNumeros();
        if(numeros[1]==0){
            System.out.println("no puedes dividir un numero dentro de 0");
        }
        else{
            double resultado = numeros[0] / numeros[1];
            System.out.println("Resultado: " + numeros[0] + " / " + numeros[1] + " = " + resultado);            
       }
    }

    private static void FuncionRaiz() {
        System.out.println("\n--- RAIZ ---");
        double[] numeros=solicitarNumeros(); 
        
        if(numeros[0]<0){
            System.out.println("no existe la raiz de un numero negativo");
            }
        else if(numeros[1]==0){
            System.out.println("El índice de la raíz no puede ser cero");
        }
        else{
            double resultado = Math.pow(numeros[0], 1 / numeros[1]);
            System.out.println("Resultado: Raíz " + numeros[1] + " de " + numeros[0] + " = " + resultado);
        }
    }

    private static void FuncionPotencia() {
         System.out.println("\n--- POTENCIA ---");
        double[] numeros = solicitarNumeros();
        double resultado = Math.pow(numeros[0], numeros[1]);
        System.out.println("Resultado: " + numeros[0] + " ^ " + numeros[1] + " = " + resultado);      
    }
    
}
    