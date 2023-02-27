/*Crea un programa que permita ingresar un numero y muestre el numero en forma invertida, por ejemplo:
ingresar 12345 deberá mostrarlo 54321.
 */
import java.util.Scanner; 
public class Ejercicio11{
    public static void main(String[]args){

        String entradaNumeros; 
        int numeroCaracteres; 

        Scanner sc = new Scanner (System.in); 

        System.out.println("Ingrese una serie de nÃºmeros: ");

        entradaNumeros = sc.nextLine();
        numeroCaracteres = entradaNumeros.length();
        System.out.println("Total" + numeroCaracteres);
        System.out.println("La cadena de caracteres invertida: ");
        for (int i = numeroCaracteres; i > 0; i--){
            System.out.println(entradaNumeros.charAt(i-1));

        }  
    }    
}