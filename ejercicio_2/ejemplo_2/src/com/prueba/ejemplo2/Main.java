package com.prueba.ejemplo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
interface Funcx
{
    //boolean process(producto x);
   // void process2(producto d);
    int operacion (int a,int b);
}

class Test{
    static void printa ( String d){
        System.out.println("asdadsa");
    }
    public void printb(){
        System.out.println("vbbbba");
    }
}
interface Operation
{
    //boolean process(producto x);
    // void process2(producto d);
    int calculate (int a,int b);
}
public class Main {
    private static  boolean process(producto x){
        return x.getMarca().equals(x);
    }
    private  static  void oper (int a, int b, Operation operation){
        int result = operation.calculate(a, b);
        System.out.println(result);
    }
    private static List<producto> productos = new ArrayList<>();
    String das =" ";
    public static void main(String[] args) throws IOException {
	// write your code here
        Collection<producto> products = new ArrayList<>();
        products.add(new producto("A1", "Prod 1", 12.2F, "Akita", "None"));
        products.add(new producto("A2", "Prod 2", 12.2F, "Akita", "None2"));
        products.add(new producto("A1", "Prod 3", 12.2F, "Akita", "None3"));
        String input = "Akita";
        List<producto> p = new ArrayList<>();
        //Funcx ab = x -> x.getMarca().equals(input);
        Funcx ab = (a,b)-> a+b;


        Predicate<producto> z = x-> x.getMarca().equals(input);
        Function<producto,Boolean> pee = x-> x.getMarca().equals(input);



        //  Test.printa(das);
        p = products.stream()
                //.map(( producto  x) -> x.getCodigo())
                .filter(z)
                //.filter(pee)
                .filter( x -> x.getMarca().equals(input))
                //.filter( x -> x.getCategoria().equals("None"))
               .collect(Collectors.toList());
               // .forEach(System.out::println);
        //p.forEach( System.out::println);

     /*   String opcion = "" ;
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
        }*/
        calculoSuma(1, 2);
        oper(2, 1, (x, y) -> x - y);
    }

    private static void calculoSuma(int z, int q){
        oper(z, q, (x, y) -> x + y);
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
