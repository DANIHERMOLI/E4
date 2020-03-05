import java.util.Scanner;
/**
 * Una clase Pendulo
 * -Operanciones: periodo de oscilación
 * -Metodo contructor, getters(analizadores)
 */
public class Pendulo
{
    //Atributos
    private double longitud, aceleracion_gravitacional;
    //Contructor
    public Pendulo (double l,double g)
    {
        this.longitud=l;
        this.aceleracion_gravitacional=g;
    }
    //Analizadores
    public double getlongitud()
    {
        return this.longitud;
    }
    public double getaceleracion_gravitacional()
    {
        return this.aceleracion_gravitacional;
    }
    //Periodo de oscilación
    public double oscilación()
    {
        return (2*Math.PI) * Math.sqrt(this.aceleracion_gravitacional/this.longitud);
    }
    
    }
