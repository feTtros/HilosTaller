
package excepcionespunto5;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio {
    
    private int numero;
    
    //Excepcion propia, valida que el numero sea mayor a 10
    public  Ejercicio(int numero) throws Exception {
        if (numero < 10 )
            throw new Exception("Tiene que digitar un numero mayor a 10");
        this.numero = numero;
    }
    
    public static void main(String[] args) {
        
        //Prueba digitando un numero mayor a 10
        System.out.println("---- Ingresango numero mayor a 10 ----");
        int num, divisor;
        double res;
        Scanner sc = new Scanner(System.in);
        try {

            System.out.print("Digite un numero (dividendo): ");
            num = sc.nextInt();
            System.out.print("Digite el divisor: ");
            divisor = sc.nextInt();
            Ejercicio ej = new Ejercicio(num);
            res = num / divisor;
            System.out.println("El resultado es= " + res);
            System.out.println("");
        } catch (Exception ex) {
            System.out.println("Valor inválido " + ex.getMessage());
        }
        
        //Metodo donde se capturan las demás excepciones
        division();  
    }
    
    public static void division() {
        Scanner sc = new Scanner (System.in);
        
        int num, divisor;
        double res;

        System.out.println("---- Ingresando letras o dividendo igual a 0 -----");
         try {
            System.out.print("Ingrese un numero (dividendo): ");
            num = sc.nextInt();
            System.out.print("Ingrese un numero (divisor): ");
            divisor = sc.nextInt();
            res = num/divisor;
            System.out.println("El resultado es = "+res);
             System.out.println("");
         } catch (InputMismatchException ex) {
            System.out.println("Debe ser un valor numerico");
         } catch (ArithmeticException ex){
             System.out.println("No se puede dividir por cero");   
         }
    }  
}
