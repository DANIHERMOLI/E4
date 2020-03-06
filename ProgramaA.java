import java.util.Scanner;
/**
 * Programa para probar las operaciones del Ascensor
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProgramaA
{
    public static void main(String[] arg)
    {
        Scanner teclado = new Scanner(System.in);
        Ascensor a = null;
        
        do
        {
            System.out.println("1. Ingrese la cantidad de pisos del edificio");
            System.out.println("2. Ingrese la cantidad de sotanos del edificio");
            System.out.println("3. Ingrese el piso en el que está el ascensor");
            System.out.println("0. Salir");
            System.out.print("Opcion =>");
            opc = teclado.nextInt();
            
            switch(opc)
            {
                case 1: 
                System.out.print("Cantidad de pisos del edificio");
                int pisos = teclado.nextInt();
                System.out.print("Cantidad de sotanos del edificio");
                int sotanos = teclado.nextInt();
                System.out.print ("Piso en el que se encuentra el asensor");
                int piso_actual = teclado.nextInt();
                a = new Ascensor (p,s,c);
                System.out.println("Pisos de edificio creado");
                break;
                
                case 2:
                System.out.println("pisos =" +
                a.getpisos() + ",sotanos =" +
                a.getsotanos() + ",piso_actual =" +
                a.getpiso_actual());
                break;
                
                case 3:
                System.out.println("La totalidad de pisos del edifico es" + a.pisos_total());
                System.out.println("Al subir un piso el ascensor está en el piso" + a.subida());
                System.out.println("Al bajar un piso el ascensor está en el piso" + a.bajada());
                break;
            }
            
        }
        
        
        while(opc!= 0);
    
    }
}
