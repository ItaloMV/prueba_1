import java.beans.ExceptionListener;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int dato;
        Scanner in = new Scanner(System.in);
        dato = in.nextInt();

        System.out.println("dato = "+ dato);

        try{
            do{
                System.out.println("1- Continuar" +
                        "2- Salir");
                System.out.println("Ingrese Dato: ");
                dato = in.nextInt();

            }while(dato > 0);
        }
        catch(Exception ex){
            throw ex;
        }

    }
}