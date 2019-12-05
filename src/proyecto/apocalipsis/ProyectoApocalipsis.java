package proyecto.apocalipsis;

import clases.Misil;
import clases.SilodeMisiles;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import excepciones.ExFaltadeMisiles;
import excepciones.ExPlataformaDañada;
import excepciones.ExSinObjetivo;

public class ProyectoApocalipsis {

    public static void main(String[] args) throws ExFaltadeMisiles {
        Scanner sc = new Scanner(System.in);
        boolean resp = false;
        String respuesta;
        String ciudad = null;

        ArrayList<Misil> misiles = new ArrayList<>();
        Misil misil1 = new Misil("Gran Berta", "v2", "H");
        Misil misil2 = new Misil("fatboy", "ac 234", "A");
        Misil misil3 = new Misil("La Suegra", "ac 234", "A");
        Misil misil4 = new Misil("Big Boom", "v8", "H");

        misiles.add(misil1);
        misiles.add(misil2);
        misiles.add(misil3);
        misiles.add(misil4);

        SilodeMisiles silo = new SilodeMisiles(misiles, "villa retiro", false);
        do {
            try {
                System.out.println("Sistema de lanzamiento de misieles \n");

                System.out.println("1) Estado de la plataforma");
                System.out.println("2) Reparar la plataforma");
                System.out.println("3) Inventario de misiles");
                System.out.println("4) Preparar misil ");
                System.out.println("5) Apuntar misil");
                System.out.println("6) Lanzar misil");
                System.out.println("7) Terminar lanzamiento");
                

                int menu = sc.nextInt();

                switch (menu) {
                    case 1:
                        silo.estadoPlataforma();
                        break;
                    case 2:
                        silo.arreglarPlataforma();
                        break;
                    case 3:
                        try {
                            silo.inventario();
                        } catch (ExFaltadeMisiles e) {
                            System.out.println(e.getMessage()); 
                        }
                        break;
                    case 4:
                        try {
                            silo.prepararMisil();
                        } catch (ExFaltadeMisiles e) {
                           System.out.println( e.getMessage());
                        } catch (ExPlataformaDañada a) {
                            System.out.println(a.getMessage());
                        }
                        break;
                    case 5:
                        try {
                            
                            System.out.println("Ingrese la ciudad a apuntar ");
                            sc.nextLine();
                            ciudad = sc.nextLine();
                            silo.apuntarciudad(ciudad);
                        } catch (ExSinObjetivo b) {
                            b.noHayObjetivo();
                        }
                        break;
                    case 6:
                        try {
                            silo.atacarCiudad(ciudad);
                        } catch (ExFaltadeMisiles as) {
                            System.out.println(as.getMessage());
                        } catch (ExPlataformaDañada ad) {
                            System.out.println(ad.getMessage());
                        } catch (ExSinObjetivo aa) {
                            System.out.println(aa.getMessage());
                        }
                        break;
                    case 7:
                        System.out.println("Gracias vuelva prontos");
                        resp = true ; 
                        break;
                    default:
                        System.out.println("el numero no es una opcion del menu");
                        break;
                }

            } catch (InputMismatchException ex) {
                System.out.println("El elemento ingresado no es un numero por favor elija una opcion del menu");
                sc.next();
            }
        } while (resp != true);
    }

}
