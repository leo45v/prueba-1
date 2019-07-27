package com.prueba.ejemplo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<producto> productos = new ArrayList<>();
    public static void main(String[] args) throws IOException {
	// write your code here
        String opcion = "" ;
        boolean repetir=true;
        BufferedReader Leer = new BufferedReader( new InputStreamReader(System.in));
        while (repetir) {
            System.out.println("1. Registrar producto");
            System.out.println("2. Imprimir productos por Código");
            System.out.println("3. Imprimir producots por precio");
            System.out.println("4. Imprimir productos por marca");
            System.out.println("5. Imprimir producto por precio elevado");
            System.out.println("6. Imprimir producto por precio bajo");
            System.out.println("7. Imprimir productos por rango de precios");
            System.out.println("8. Imprimir productos de mayor cantidad de una marca");
            System.out.println("9. Salir");
            opcion = Leer.readLine();
            if (Verificar_Opcion(opcion)) {
                System.out.println("TODO BIEN");
                switch (Integer.parseInt(opcion)) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 9:
                        repetir = false;
                        break;
                    default:
                        System.out.println("Comando Erroneo...");
                        break;
                }
            } else {
                System.out.println("Comando Erroneo...");
            }
        }
    }
    private static boolean Verificar_Opcion(String opcion){
        if(!opcion.isEmpty()){
            if(!opcion.isBlank()){
                if(opcion.matches("-?\\d+")){
                    return true;
                }
            }
        }
        return false;
    }
}
