public class Main {
    public static void main(String[] args) {
        int resultado = 0;
        resultado = suma(2, 4, 6);
        System.out.println("La suma de los 3 valores es " + resultado);

        Coche miCoche = new Coche();
        miCoche.ColocarPuertas();
        miCoche.ColocarPuertas();
        miCoche.ColocarPuertas();
        miCoche.ColocarPuertas();
        System.out.println("El número de puertas es " + miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}