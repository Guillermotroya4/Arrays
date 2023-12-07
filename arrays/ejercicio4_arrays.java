/**
 * En este programa haremos un array que vaya del 1 al 100 y el segundo array
 * hara lo del array anterior pero al revés
 * 
 * @author Guillermo Trpya Albarrán
 */
public class ejercicio4_arrays {
    public static void main(String[] args) {

        // este es el array original, que va desde el 1 hasta el 100
        int num[] = new int[100];
        int contador = 1;
        System.out.println("Array original");
        for (int i = 0; i < num.length; i++) {
            num[i] = contador;
            contador++;
            System.out.println(num[i]);
        }

        // Este es el array al revés, que va desde el 100 al 1
        int num2[] = new int[100];
        int contador2 = 100;
        System.out.println("Array al revés");
        for (int i = num.length - 1; i >= 0; i--) {
            num2[i] = contador2;
            contador2--;
            System.out.println(num2[i]);
        }

    }
}