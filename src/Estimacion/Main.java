package Estimacion;



/**
 * @author Ricardo
 */
public class Main {

    public static void main(String[] args) {
        double Piaproxi=0;
        double Pi=0;
        boolean estado=true;
        Simulador key = new Simulador(9, (int) 1e6);
        System.out.println(key.PI()+" Este es el valor Estimado de PI ");
        System.out.println(Math.PI+" Este el valor de PI");
        //Piaproxi=key.PI();
       // Pi=Math.PI;
      
        //estado=(Pi-(key.PI())<0.1);
        
    }
}