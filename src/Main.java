import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ArrayList<persona> personas = new ArrayList<>();
//        persona persona1 = new persona("ITALO DANIEL","MATASOGLIO", "VALCARCEL", 22, 72628577);
//        persona persona2 = new persona("SHEYLA DAIANA","CUADROS", "AVILA", 21, 71501715);
//        persona persona3 = new persona("DANIEL JOSISAS","PINEDO", "RUBINA", 23, 12345678);
//        personas.add(persona1);
//        personas.add(persona2);
//        personas.add(persona3);
//
//        System.out.println(personas.toString());
//
//        for(int i=0; i<personas.size();i++){
//            System.out.println(personas.get(i).toString());
//        }


        // ------------------------------------------------------------
//        File archivo;
//        FileWriter escribir;
//        PrintWriter linea;
//
//        Scanner in = new Scanner(System.in);
//        String nombre, apellido_paterno, apellido_materno;
//
//        archivo = new File("personas.txt");
//
//        if(!archivo.exists()){
//
//            try {
//                archivo.createNewFile();
//                System.out.print("Ingrese su nombre: ");
//                nombre = in.nextLine();
//                System.out.print("Ingrese su apellido_paterno: ");
//                apellido_paterno = in.nextLine();
//                System.out.print("Ingrese su apellido_materno: ");
//                apellido_materno = in.nextLine();
//                escribir = new FileWriter(archivo, true);
//                linea = new PrintWriter(escribir);
//
//                linea.print(nombre + ",");
//                linea.print(apellido_paterno + ",");
//                linea.println(apellido_materno);
//
//                linea.close();
//                escribir.close();
//
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        else {
//            try {
//                System.out.print("Ingrese su nombre: ");
//                nombre = in.nextLine();
//                System.out.print("Ingrese su apellido_paterno: ");
//                apellido_paterno = in.nextLine();
//                System.out.print("Ingrese su apellido_materno: ");
//                apellido_materno = in.nextLine();
//                escribir = new FileWriter(archivo, true);
//                linea = new PrintWriter(escribir);
//
//                linea.print(nombre + ",");
//                linea.print(apellido_paterno + ",");
//                linea.println(apellido_materno);
//
//                linea.close();
//                escribir.close();
//
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }

        File archivo;
        FileReader leer;
        BufferedReader almacenamiento;
        Scanner in = new Scanner(System.in);
        String linea;

        archivo = new File("personas.txt");


        try{
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            while((linea = almacenamiento.readLine()) != null){
                String[] partes = linea.split(",");

                if (partes.length == 3) {
                    String nombre = partes[0];
                    String apellidoPaterno = partes[1];
                    String apellidoMaterno = partes[2];

                    System.out.println("Nombre: " + nombre);
                    System.out.println("Apellido Paterno: " + apellidoPaterno);
                    System.out.println("Apellido Materno: " + apellidoMaterno);
                    System.out.println();
                }
            }
            almacenamiento.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}