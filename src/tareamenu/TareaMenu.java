/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareamenu;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class TareaMenu {

    public static void main(String[] args) {

        Lista lista = new Lista();
        {
            boolean salir = false;
            int a = 0;
            String menu;
            Scanner scanner = new Scanner(System.in);
            Scanner uno = new Scanner(System.in);
            lista.agregarAlFinal(23);
            lista.agregarAlFinal(24);
            lista.agregarAlFinal(25);

            while (salir != true) {

                System.out.println("***** Menu principal ***");
                System.out.println("1. Crear una lista de datos numericos ");
                System.out.println("2. Insertar al final de la lista ");
                System.out.println("3. Eliminar elemento final de la lista ");
                System.out.println("4. Visualizar lista ");
                System.out.println("5. Comprobar si la lista està vacia ");
                System.out.println("6. Tamaño de la lista");
                System.out.println("x. Salir del menù ");
                menu = scanner.nextLine();
                {

                    switch (menu) {

                        case "1":
                            lista.eliminar();
                            System.out.println("Ingrese valor numerico para la lista");
                            a = uno.nextInt();
                            lista.agregarAlFinal(a);
                            break;

                        case "2":
                            if (lista.esVacio() != true) {
                                System.out.println("Ingrese valor numerico para la lista");
                                a = uno.nextInt();
                                lista.agregarAlFinal(a);

                            } else {
                                System.out.println("la lista esta vacia, cree una lista");
                            }
                            break;

                        case "3":
                            if (lista.esVacio() != true) {
                                System.out.println("Se ha eliminado ultimo valor de la lista ");
                                lista.removerUltimaPosicion();
                            } else {
                                System.out.println("la lista esta vacia, cree una lista");
                            }
                            break;

                        case "4":
                            if (lista.esVacio() != true) {
                                System.out.println("***** Visualizar lista *****");
                                lista.listar();
                            } else {
                                System.out.println("la lista esta vacia, cree una lista");
                            }
                            break;

                        case "5":
                            if (lista.esVacio() != true) {
                                System.out.println("lista contiene datos ");
                            } else {
                                System.out.println("la lista esta vacia  ");
                            }

                            break;
                        case "6":
                            System.out.println("El tamaño de la lista es: "+ lista.getTamanio());
                            
                            break;

                        case "x":
                            System.out.println("ha salido del menù");
                            salir = true;

                            break;

                    }
                }

            }
        }
    }
}
