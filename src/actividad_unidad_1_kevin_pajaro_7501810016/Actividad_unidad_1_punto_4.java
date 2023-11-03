package actividad_unidad_1_kevin_pajaro_7501810016;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author kevin pajaro
 */
public class Actividad_unidad_1_punto_4 {
    public static void main(String[] args) {

        int[] ventas = inicializarVentasAleatorias();
        mostrarVentas(ventas);


        //4.Ordenar arreglos
        ordenarVentasDescendente(ventas);
        mostrarVentas(ventas);

        ordenarVentasAscendente(ventas);
        mostrarVentas(ventas);

        desordenarVentas(ventas);
        mostrarVentas(ventas);

        ordenarPartesImparesVentas(ventas);
        mostrarVentas(ventas);
    }

    // Función para inicializar el arreglo de ventas con valores aleatorios
    public static int[] inicializarVentasAleatorias() {
        Random random = new Random();
        int cantidadVentas = random.nextInt(10) + 1;
        int[] ventas = new int[cantidadVentas];

        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = random.nextInt(1000) + 1;
        }
        return ventas;
    }

    // Función para mostrar los valores de las ventas
    public static void mostrarVentas(int[] ventas) {
        for (int venta : ventas) {
            System.out.println(venta);
        }
    }

    // Función para ordenar las ventas de forma descendente
    public static void ordenarVentasDescendente(int[] ventas) {
        Arrays.sort(ventas);
        int temp;
        for (int i = 0; i < ventas.length / 2; i++) {
            temp = ventas[i];
            ventas[i] = ventas[ventas.length - i - 1];
            ventas[ventas.length - i - 1] = temp;
        }
        System.out.println("Ventas ordenadas de forma descendente");
    }

    // Función para ordenar las ventas de forma ascendente
    public static void ordenarVentasAscendente(int[] ventas) {
        Arrays.sort(ventas);
        System.out.println("Ventas ordenadas de forma ascendente");
    }

    // Función para desordenar las ventas
    public static void desordenarVentas(int[] ventas) {
        Random random = new Random();
        for (int i = ventas.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = ventas[i];
            ventas[i] = ventas[j];
            ventas[j] = temp;
        }
        System.out.println("Ventas desordenadas");
    }

    // Función para ordenar primero las partes y luego los impares
    public static void ordenarPartesImparesVentas(int[] ventas) {
        int[] ventasPares = Arrays.stream(ventas).filter(v -> v % 2 == 0).toArray();
        int[] ventasImpares = Arrays.stream(ventas).filter(v -> v % 2 != 0).toArray();
        Arrays.sort(ventasPares);
        Arrays.sort(ventasImpares);
        System.arraycopy(ventasPares, 0, ventas, 0, ventasPares.length);
        System.arraycopy(ventasImpares, 0, ventas, ventasPares.length, ventasImpares.length);
        System.out.println("Ventas ordenadas primero las pares y luego las impares");
    }
}
