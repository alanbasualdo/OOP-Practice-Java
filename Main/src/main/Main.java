package main;

import java.util.Scanner;

public class Main {

    private static void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        //Teclado
        Scanner s1 = new Scanner(System.in);
        //Ingresamos nombre
        System.out.print("Nombre: ");
        String name = s1.nextLine();
        //Ingresamos edad
        System.out.print("Edad: ");
        int age = Integer.valueOf(s1.nextLine());
        ///Nuevo robot
        Robot r1 = new Robot(name, age);
        //Variable
        int r = 0, total = 0;
        //Bucle
        while (r < 100 && r >= 0) {
            System.out.print("CUADRAS A CAMINAR? (Número negativo para terminar): ");
            int cuadras = Integer.valueOf(s1.nextLine());
            if (cuadras < 100) {
                //Suma cuadras en total
                if (cuadras > 0) {
                    total += cuadras;
                }
                //Suma cuadras
                r += cuadras;
                r1.setCuadrasRecorridas(r);
                //Main

                if (r < 100 && r > 0) {
                    System.out.println("He caminado con gusto las " + r + " cuadras que me solicitó.");
                    System.out.println("");
                }
                if (r > 100) {
                    System.out.println("Ya me ha hecho caminar " + r + " cuadras y necesito descansar.");
                    System.out.println("");
                    r1.setCansado(1);
                    System.out.println("1 = Cansado; 0 = Descansado; Resultado: " + r1.getCansado());
                    System.out.println("");
                    System.out.println("-----Descansando-----");
                    //Descanso del robot
                    for (int seg = 0; seg <= 5; seg++) {
                        System.out.println("Segundos descansando " + seg);
                        delay();
                        if (seg == 5) {
                            System.out.println("Ya he descansado lo suficiente, podemos continuar.");
                            System.out.println("");
                            r1.setCansado(0);
                            System.out.println("1 = Cansado; 0 = Descansado; Resultado: " + r1.getCansado());
                            System.out.println("");
                            r = 0;
                            break;
                        }
                    }
                }
                //Datos
                if (cuadras <= -1) {
                    System.out.println("");
                    System.out.println("Fin del recorrido.");
                    r1.mostrarDatos();
                    System.out.println("Total de cuadras recorridas: " + total);
                    break;
                }
            } else {
                System.out.println("Intente con un número menor a 100");
                System.out.println("");
            }
        }
    }
}
