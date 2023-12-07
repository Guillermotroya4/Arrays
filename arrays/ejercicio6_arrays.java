/**
 * En este programa vamos a hacer un arraya de extension que nos diga el usuario y dentro de él, vamos a empezar en el número que nos diga el usuario e incrementaremos lo que tambien nos diga
 * @author Guillermo Troya Albarrán
 */
public class ejercicio6_arrays {
    public static void main(String[] args) {
        System.out.println("Por favor, introduce la cantidad de números que quieres que sea el array");         //Esta será la extensión del array
        int cantidad = Integer.parseInt(System.console().readLine());
        int num[] = new int[cantidad];

        System.out.println("Por favor, introduce cual quieres que sea el primero valor");           //Este será el primer valo0r del array
        int primero = Integer.parseInt(System.console().readLine());

        System.out.println("Por favor, introduce que valor quieres ir incrementando");              //Esto será lo que incrementa por cada valor del array
        int incremento = Integer.parseInt(System.console().readLine());

        int i;

        for (i =0; i < num.length; i ++) {
            num[i]=primero+i*incremento;            //aquio le diremos que el array es el primero más el segundo, multiplicado por lo que incrementa
        }
        System.out.println("");
        for (i =0; i < num.length; i ++) {
            System.out.println(num[i]);
        }

    }
}
