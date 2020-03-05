import java.util.Scanner;
/**
 * Programa para conocer el periodo de oscilación de un péndulo
 * 
 * @author (Daniela) 
 * @version (1.0)
 */
     public class ProgramaP
{
       public static void main(String[]args)
    {
        Scanner teclado = new Scanner(System.in);
        Pendulo p = null;
        int opc;
          do
        {
            System.out.println("1. Crear el pendulo");
            System.out.println("2. Conocer el periodo de oscilacion");
            System.out.println("0. Salir");
            System.out.println("Opcion =>");
            opc = teclado.nextInt();
            switch (opc)
            {
                case 1:
                System.out.print("Longitud = ");
                double l = teclado.nextDouble();
                System.out.print("Aceleracion gravitacional =");
                double g = teclado.nextDouble();
                p = new Pendulo (l,g);
                System.out.println("Pendulo creado");
                break;
               
                
                case 2:
                System.out.printf("El periodo de oscilación es %.2f/n",
                      p.oscilación());
                  break;
                
                                  
    
           }
        }  
           while(opc !=0);
    
    
        } 
    }
