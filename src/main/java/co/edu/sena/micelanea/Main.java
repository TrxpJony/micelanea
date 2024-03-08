package co.edu.sena.micelanea;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {

        //variables
        double dato1;
        double dato2;
        double dato3;
        double dato4;
        String dato5;
        int opt;
        ejercicios ejercicios = new ejercicios();
        Scanner src = new Scanner(System.in);

        System.out.println("MICELANIA DE EJERCICIOS JAVA");
        System.out.println("¿Cuales ejercicios desea ejecutar?");

        System.out.println("1. Operadores");
        System.out.println("2. Condicionales");
        System.out.println("3. Ciclos");
        opt = src.nextInt();

switch (opt) {
    case 1:    // operadores

        System.out.println("1.1. Calcular el area de un triangulo");
        System.out.println("1.2. Suma entre 2 numeros");
        System.out.println("1.3. Numero elevado al cuadrado");
        System.out.println("1.4. Convertidor de euros a dolares");
        System.out.println("1.5. Area y perimetro de un cuadrado");
        System.out.println("1.6. Calcular el area y volumen de un cilindro");
        System.out.println("1.7. Longitud y area de una circunferencia");
        System.out.println("1.8. Calcular el promedio");
        opt = src.nextInt();

        switch (opt) {
            case 1://area triangulo
        System.out.println("1.1. Calcular el area de un triangulo");

        System.out.println("Ingrese la base del triangulo");
        dato1 = src.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        dato2 = src.nextDouble();
        dato4 = ejercicios.areaTriangulo(dato1, dato2);
        System.out.println("El area del triangulo es " +dato4);
            break;
            case 2://suma
        System.out.println("1.2. Suma entre 2 numeros");


        System.out.println("Ingrese el primer numero");
        dato1 = src.nextDouble();
        System.out.println("Ingrese el segundo numero");
        dato2 = src.nextDouble();
        dato4 = ejercicios.suma(dato1, dato2);
        System.out.println("La suma es "+dato4);
            break;
            case 3://numero elevado al cuadrado
        System.out.println("1.3. Numero elevado al cuadrado");

        System.out.println("Ingrese un numero");
        dato1=src.nextDouble();
        dato4= ejercicios.elevado(dato1);
        System.out.println("El resultado es "+dato4);
            break;
            case 4://convertidor
        System.out.println("1.4. Convertidor de euros a dolares");

        System.out.println("Ingrese el valor en Euros");
        dato1=src.nextDouble();
        dato4= ejercicios.convertidor(dato1);
        System.out.println("La conversion a dolares es "+dato4);
            break;
            case 5:// area y perimetro
        System.out.println("1.5. Area y perimetro de un cuadrado");

        System.out.println("Ingrese el valor de un lado del cuadrado");
        dato1=src.nextDouble();
        dato5 = ejercicios.areaperi(dato1);
        System.out.println(dato5);  
            break;
            case 6://area y volumen
        System.out.println("1.6. Calcular el area y volumen de un cilindro");

        System.out.println("Ingrese el radio de la base del cilindro");
        dato1=src.nextDouble();
        System.out.println("Ingrese la altura del cilindro");
        dato2=src.nextDouble();
        dato5 = ejercicios.volar(dato1,dato2);
        System.out.println(dato5);
            break;
            case 7://radio
        System.out.println("1.7. Longitud y area de una circunferencia");

        System.out.println("Ingrese el radio de la circunferencia ");
        dato1=src.nextDouble();
        dato5 = ejercicios.radio(dato1);
        System.out.println(dato5);
            break;
            case 8://promedio
        System.out.println("1.8. Calcular el promedio");
        
        System.out.println("Ingrese el primer numero");
        dato1 = src.nextDouble();
        System.out.println("Ingrese el segundo numero");
        dato2 = src.nextDouble();
        System.out.println("Ingrese el tercer numero");
        dato3 = src.nextDouble();
        dato4 = ejercicios.promedio(dato1, dato2, dato3);
        System.out.println("El promedio de los numeros es "+dato4);
            break;
        
            default:
                break;
        }


        
        break;
    case 2://condicionales

          System.out.println("2.1. Numero positivo o negativo");
          System.out.println("2.2. Numero mayor y menor");
          System.out.println("2.3. Cual es el mayor y menor entre 3 numeros");
          System.out.println("2.4. Dos números A y B, sumarlos si A es menor que B o sino restarlos");
          System.out.println("2.5. Division");
          System.out.println("2.6. ¿Es un año bisieto?");
          opt = src.nextInt();

          switch (opt) {
            case 1://positivo o negativo
            System.out.println("2.1. Numero positivo o negativo");
            System.out.println("Ingrese un numero");
            dato1=src.nextDouble();

            dato5 = ejercicios.positi(dato1);

            System.out.println("El numero es "+dato5);

            
                  break;
            case 2://numero mayor y menor
            System.out.println("2.2. Numero mayor y menor");

            System.out.println("Ingrese un numero");
            dato1=src.nextDouble();
            System.out.println("Ingrese otro numero");
            dato2=src.nextDouble();

            dato5 = ejercicios.maymen(dato1, dato2);

            System.out.println(dato5);

            
                  break;
            case 3:  // mayor entre 3
            System.out.println("2.3. Cual es el mayor y menor entre 3 numeros");

            System.out.println("Ingrese el primer numero");
            dato1=src.nextDouble();
            System.out.println("Ingrese el segundo numero");
            dato2=src.nextDouble();
            System.out.println("Ingrese el tercer numero");
            dato3=src.nextDouble();

            dato5 = ejercicios.tresmay(dato1, dato2, dato3);

            System.out.println(dato5);
            
                  break;
            case 4: //dados 2 numero sumarlos o restarlos
            System.out.println("2.4. Dos números A y B, sumarlos si A es menor que B o sino restarlos");

            System.out.println("Ingrese el primer numero");
            dato1 = src.nextDouble();
            System.out.println("Ingrese el segundo numero");
            dato2 = src.nextDouble();

            dato4 = ejercicios.sumres(dato1, dato2);
            System.out.println(dato4);
            
                  break;
            case 5:// division
            System.out.println("2.5. Division");

            System.out.println("Ingrese el primer numero");
            dato1 = src.nextDouble();
            System.out.println("Ingrese el segundo numero");
            dato2 = src.nextDouble();

            dato5 = ejercicios.divicion(dato1, dato2);
            System.out.println(dato5);

                  break;
            case 6://suma o multiplicacion

            System.out.println("Suma o multiplicacion?");

            System.out.println("Ingrese un numero postivivo o negativo");
            dato1 = src.nextDouble();
            System.out.println("Ingrese otro numero positivo o negativo");
            dato2 = src.nextDouble();

            dato5 = ejercicios.mulsum(dato1, dato2);

            System.out.println(dato5);


                  break;

            case 7://año bisiesto
            System.out.println("2.6. ¿Es un año bisieto?");
            
            System.out.println("Ingrese el año que quiere verificar");
            dato1 = src.nextDouble();
            dato5 = ejercicios.añobi(dato1);
            System.out.println(dato5);

                  break;




    
              default:
                  break;
    }
        
        break;
    case 3:
        
        break;

    default:
        break;
}
















    }
}
