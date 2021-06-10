import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double aleatorio;
        char seleccion;
        boolean meta = false;

        do {

            System.out.println("Generador de multiplos de 5, sele");
            seleccion = entrada.next().charAt(0);
            if(seleccion != 's' && seleccion != 'S'){
                do{
                    aleatorio = (int)(Math.random()*1000000);

                    if (aleatorio % 5 == 0){
                        System.out.println(aleatorio);
                        meta = true;
                        break;
                    } else{
                      meta = false;
                    }
                } while(meta == false);
            }

        } while(seleccion != 's' && seleccion != 'S');

        System.out.println("Adios");
    }
}