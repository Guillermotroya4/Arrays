public class prueba {
    public static void main(String[] args) {
        System.out.println("Por favor, introduce la cantidad de números que quieres que sea el array");
        int cantidad = Integer.parseInt(System.console().readLine());
        int num[] = new int[cantidad];

        System.out.println("Por favor, introduce cual quieres que sea el primer valor");
        int primero = Integer.parseInt(System.console().readLine());

        System.out.println("Por favor, introduce qué valor quieres ir incrementando");
        int incremento = Integer.parseInt(System.console().readLine());

        int i;

        for (i = 0; i < num.length; i++) {
            num[i] = primero + i * incremento;
        }

        System.out.println("Valores del array:");

        for (i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
