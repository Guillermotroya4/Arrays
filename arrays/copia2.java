import java.util.Scanner;

public class copia2 {
    public static void main(String[] args) {
        int num[] = new int[10];
        Scanner scanner = new Scanner(System.in);

        char opcion;
        do {
            System.out.println("Menú:");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.next().charAt(0);

            switch (opcion) {
                case 'a':
                    System.out.println("Valores del array:");
                    for (int i=0; i<num.length; i++) {
                        int random;
                        random= (int)(Math.random()*10);
                        num[i]=random;
                        System.out.println(num[i]);
                    }
                    System.out.println();
                    break;
                case 'b':
                    System.out.print("Por favor, introduzca el valor, debes saber que debe ser entero : ");
                    int valor = scanner.nextInt();

                    System.out.print("Introduzca la posición donde desea poner el valor, teniedno en cuena que está comprendida entre 0 y 9: ");
                    int posicion = scanner.nextInt();

                    if (posicion >= 0 && posicion < num.length) {
                        num[posicion] = valor;
                        System.out.println("Valor insertado correctamente en la posición " + posicion);
                    } else {
                        System.out.println("La posición no es válida. Debe estar entre 0 y " + (num.length - 1));
                    }
                    break;
                case 'c':
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione 'a', 'b' o 'c'.");
            }
        } while (opcion != 'c');

        scanner.close();
    }
}
