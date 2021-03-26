package com.yani;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Seleccione el numero del ejercicio para ver (1 - 18): ");

        int ejercicio= scanner.nextInt();

        switch (ejercicio) {

            case 1 -> {

                System.out.println("\n1. Programa java que realice lo siguiente: declarar una variable N de tipo int, una variable A de tipo double y una variable C de tipo char y ");
                System.out.println("asigna a cada una un valor. A continuación muestra por pantalla: El valor de cada variable, la suma de N + A, la diferencia de A - N, el valor ");
                System.out.println("numérico correspondiente al carácter que contiene la variable C.\n");

                int N = 2;
                double A = 945_612;
                char C = 's';

                System.out.println("Variables inicializadas:\n");

                System.out.println("Entero: " + N);
                System.out.println("Double: " + A);
                System.out.println("Char: " + C);

                System.out.println("\nSuma de N y A:\n");

                System.out.println(N + A);

                System.out.println("\nDiferencia de A y N:\n");

                System.out.println(A - N);

                System.out.println("\nValor numérico de la letra " + C + ":\n");

                System.out.println(((int) C));

            }

            case 2 -> {

                System.out.println("\n2. Programa java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos variables N y M de tipo double y asigna a cada una un valor. ");
                System.out.println("A continuación mostrar por pantalla una serie de operaciones entre ellas.\n");

                int X = 20;
                int Y = 15;
                double N_ = 12.5;
                double M = 28.9;

                System.out.println("Multiplicación entre M e Y:\n");

                System.out.println(M * Y);

                System.out.println("\nDivisión entre M y X:\n");

                System.out.println(Math.round(M / X));

                System.out.println("\nSuma entre Y y N:\n");

                System.out.println(Y + N_);
            }

            case 3 -> {

                System.out.println("\n3. Programa Java que declare una variable entera N, asignarle un valor. A continuación escribe las instrucciones que realicen lo siguiente: ");
                System.out.println("incrementar N en 77, reducir su valor a 3, duplicar su valor.\n");

                int N = 48;

                System.out.print("Incremento de N en 77: " + (N + 77));
                System.out.print("\nReducción de N en 3: " + (N - 3));
                System.out.print("\nValor de N duplicado: " + (N * 2));

            }

            case 4 -> {

                System.out.println("\n4. Programa java que declare cuatro variables enteras A, B, C y D y asignarle un valor a cada una. A continuación realiza las instrucciones ");
                System.out.println("necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.\n");

                int A_ = 7;
                int B = 16;
                int C_ = 33;
                int D = 8;
                int aux = C_;
                int aux2 = B;

                B = aux;
                C_ = A_;
                A_ = D;
                D = aux2;

                System.out.println(A_); // 8
                System.out.println(B); // 33
                System.out.println(C_); // 7
                System.out.println(D); // 16

            }

            case 5 -> {

                System.out.println("\n5. Programa Java que declare una variable A de tipo entero, asignarle un valor. A continuación mostrar un mensaje indicando si A es par o impar.\n");

                System.out.print("Ingrese un numero para asignarle a la variable entera: ");

                int AA = scanner.nextInt();

                if (AA % 2 == 0) {
                    System.out.println("\n" + AA + " es par");
                } else {
                    System.out.println("\n" + AA + " es impar");
                }
            }

            case 6 -> {

                System.out.println("\n6. Programa Java que declare una variable B de tipo entero y asignarle un valor. A continuación mostrar un mensaje indicando si el valor ");
                System.out.println("de B es positivo o negativo.\n");

                System.out.print("Ingrese un numero para asignarle a la variable entera: ");

                int BB = scanner.nextInt();

                if (BB >= 0) {
                    System.out.println("\n" + BB + " es positivo");
                } else {
                    System.out.println("\n" + BB + " es negativo");
                }
            }

            case 7 -> {

                System.out.println("\n7. Programa Java que declare una variable C de tipo entero y asignarle un valor. A continuación mostrar un mensaje indicando si el valor de C ");
                System.out.println("es positivo o negativo, si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100.\n");

                System.out.print("Ingrese un numero para asignarle a la variable entera: ");

                int CC = scanner.nextInt();

                System.out.print("\n");

                if (CC % 5 == 0) {
                    System.out.println(CC + " es multiplo de 5");
                } else {
                    System.out.println(CC + " no es multiplo de 5");
                }

                if (CC % 10 == 0) {
                    System.out.println(CC + " es multiplo de 10");
                } else {
                    System.out.println(CC + " no es multiplo de 10");
                }

                if (CC % 2 == 0) {
                    System.out.println(CC + " es par");
                } else {
                    System.out.println(CC + " es impar");
                }

                if (CC > 100) {
                    System.out.println(CC + " es mayor a 100");
                } else {
                    System.out.println(CC + " es menor o igual a 100");
                }
            }

            case 8 -> {

                System.out.println("\n8. Programa Java que lea un nombre y muestre por pantalla: “Buenos días, {NOMBRE}”.\n");

                System.out.print("Ingrese su nombre: ");

                String nombre= scanner.nextLine();

                System.out.println("\nBuenos días, " + nombre);
            }

            case 9 -> {

                System.out.println("\n9. Programa Java que lea un número entero por teclado y calcule el doble y el triple de ese número y lo muestre por pantalla.\n");

                System.out.print("Ingrese un número para calcular su doble y su triple: ");

                int numero = scanner.nextInt();
                int doble = numero * 2;
                int triple = numero * 3;

                System.out.println("\nEl doble de " + numero + " es " + doble + " y su triple es " + triple);
            }

            case 10 -> {

                System.out.println("\n10. Programa que lea una cantidad de grados Fahrenheit y lo convierta a grados centígrados.\n");

                System.out.print("Ingrese una temperatura en grados Fahrenheit: ");

                int fahrenheit = scanner.nextInt();
                double resultado = (fahrenheit - 32) * (5.0 / 9.0);

                System.out.println("\nEl resultado de la temperatura en grados Celcius es: " + Math.round(resultado) + ". (Resultado redondeado hacia arriba)");
            }

            case 11 -> {

                System.out.println("\n11. Programa que lee por teclado el valor del radio de una circunferencia, calcula y muestra por pantalla la longitud y el área de ");
                System.out.println("la circunferencia.\n");

                System.out.print("Ingrese el valor del radio del circulo: ");

                double radio = scanner.nextDouble();
                double circunferencia = Math.round(2 * Math.PI * radio);
                double area = Math.round(Math.PI * Math.pow(radio, 2));

                System.out.print("\nCircunferencia del circulo: " + circunferencia);
                System.out.print("\nArea del circulo: " + area + "\n");
            }

            case 12 -> {

                System.out.println("\n12. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.\n");

                System.out.print("Ingrese la velocidad para pasar de km/h a m/s: ");

                double velocidad = scanner.nextDouble();
                double kmToMs = Math.round(velocidad * (5.0 / 18.0));
                System.out.print("\n" + velocidad + " km/h equivalen a " + kmToMs + " m/s\n");

            }

            case 13 -> {

                System.out.println("\n13. Programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras.\n");

                System.out.print("Ingrese la longitud del cateto A: ");

                double catetoA = scanner.nextDouble();

                System.out.print("Ingrese la longitud del cateto B: ");

                double catetoB = scanner.nextDouble();
                double hipotenusa = Math.pow(catetoA, 2) + Math.pow(catetoB, 2);

                System.out.println("\nEl valor de la hipotenusa es: " + Math.sqrt(hipotenusa));

            }

            case 14 -> {

                System.out.println("\n14. Programa que calcula el volumen de una esfera.\n");

                System.out.print("Ingrese el valor del radio de la esfera (en centimetros): ");

                double radioEsfera = scanner.nextDouble();

                double volumen = 4.0 / 3.0 * (Math.pow(radioEsfera, 3) * Math.PI);

                System.out.println("\nEl volumen de la esfera es: " + Math.round(volumen) + " centimetros cúbicos");
            }

            case 15 -> {

                System.out.println("\n15. Programa que calcula el área de un triángulo a partir de la longitud de sus lados.\n");

                System.out.print("Ingrese el valor de la altura: ");

                double altura = scanner.nextDouble();

                System.out.print("Ingrese el valor de la base: ");

                double base = scanner.nextDouble();
                double areaTriangulo = (base * altura) / 2;

                System.out.println("\n El area del triangulo es: " + areaTriangulo);
            }

            case 16 -> {

                System.out.println("\n16. Programa que lee un número de 3 cifras y muestra sus cifras por separado.\n");

                System.out.print("Ingrese un numero de tres cifras para mostrar sus cifras por separado: ");

                int numTresCifras = scanner.nextInt();
                int cifra3 = numTresCifras % 10;
                numTresCifras = numTresCifras / 10;
                int cifra2 = numTresCifras % 10;
                numTresCifras = numTresCifras / 10;
                int cifra1 = numTresCifras % 10;

                System.out.println("Mostrando numero de tres cifras con sus numeros por separado: " + cifra1 + " " + cifra2 + " " + cifra3);
            }

            case 17 -> {

                System.out.println("\n17. Programa que lea un número entero N de 5 cifras y muestre las cifras que ocupan posiciones impares.\n");

                System.out.print("Ingrese un numero de cinco cifras para mostrar sus posiciones impares: ");

                int numero= scanner.nextInt();

            }

            case 18 -> {

                System.out.println("\n18. Programa que lea tres números enteros H, M, S que contienen hora, minutos y segundos respectivamente, y comprueba si la hora que indican ");
                System.out.println("es una hora válida.\n");

                System.out.print("Ingrese hora: ");
                int hora = scanner.nextInt();
                System.out.print("Ingrese minutos: ");
                int minutos = scanner.nextInt();
                System.out.print("Ingrese segundos: ");
                int segundos = scanner.nextInt();

                if (segundos >= 0 && segundos <= 59) {
                    if (minutos >= 0 && minutos <= 59) {
                        if (hora >= 0 && hora <= 23) {
                            System.out.println("\nHora: " + hora + "\nMinutos: " + minutos + "\nSegundos: " + segundos);
                        } else {
                            System.out.println("\nLa hora introducida no es valida!");
                        }
                    } else {
                        System.out.println("\nLos minutos introducidos no son válidos!");
                    }
                } else {
                    System.out.println("\nLos segundos introducidos no son válidos");
                }
            }
        }
    }
}
