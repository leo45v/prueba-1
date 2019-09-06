package com.prueba.ejemplo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
        String Patron,Palabra, Key,Encry;

        System.out.print("Ingrese un Texto: ");
        Palabra = buffReader.readLine();
        System.out.print("Ingrese un Patron: ");
        Patron = buffReader.readLine();
        System.out.print("Ingrese su llave: ");
        Key = buffReader.readLine();

        Encry = encriptar(Palabra,Patron,Key);
        System.out.println(Encry);

        System.out.println((desencriptar(Encry,Patron,Key)));
        System.out.println("modificacion sha");
                System.out.println("modificacion 2 sha");


    }

    private static String encriptar(String Palabra,String Patron ,String Key){
        String end = Palabra.replace(Patron,Key);
        return  end;
    }
    private static String desencriptar(String Palabra,String Patron ,String Key){
        String end = Palabra.replace(Key,Patron);
        return  end;
    }
}
