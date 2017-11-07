package Estimacion;



/**
 * @author LAPTOP
 */
public class Main {

    public static void main(String[] args) {
        Simulador key = new Simulador(9, (int) 1e6);
        System.out.println(key.PI());
    }
}
