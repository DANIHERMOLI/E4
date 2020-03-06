

   /**
  * Una clase Ascensor tiene tres atributos
  */ 
  public class Ascensor
 {
    // Atributos
    private int pisos, sotanos, piso_actual;
    //Constructor
    public Ascensor (int p, int s,int c)
    {
        this.pisos= p;
        this.sotanos= s;
        this.piso_actual= c;
    }
    //Getters
    public int getpisos()
    {
        return this.pisos;
    }
    public int getsotanos()
    {
        return this.sotanos;
    }
    public int getpiso_actual()
    {
        return this.piso_actual;
    }
    //Pisos en total del edificio
    public int pisos_total()
    {
       return this.pisos + this.sotanos;
    }
    //Pisos subida
    public int subida()
    {
        
        if (true)
        {
            piso_actual + 1 < pisos;
        }
        else
        {
          System.out.printl("Ingrese nuevamente el piso actual");
         }
     }
    //Pisos bajada
    public int bajada()
       {
        
        if (true)
        {
            piso_actual -1 > sotanos;
        }
        else
        {
          System.out.println("Ingrese nuevamente el piso actual");
        }
      
    
        }
    
        
    
}

