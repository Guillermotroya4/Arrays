/**
 * En este preograma haremos una secuencia de números en la cual se imprimira cada numero las veces que sea el número
 * @author Guillermo Troya Albarrán
 */
public class ejercicio7_arrays{
public static void main(String[] args) {
            int tamano = 10;
            int[] num = new int[tamano * (tamano + 1) / 2]; // Aquí lo que vamos a hacer es calcular el tamaño del array diciendole que tiene que llegar hasta el 10
    
            // Aquí vamos a meter los datos en el array
            int indice = 0;
            for (int i = 1; i <= tamano; i++) {
                for (int j = 1; j <= i; j++) {
                    num[indice++] = i;
                }
            }
    
            // Aquí vamos a mostrar el array
            System.out.println("Secuencia generada:");
            for (int i = 0; i < num.length; i++) {
                System.out.print(num[i] + ",");
            }
        }
}