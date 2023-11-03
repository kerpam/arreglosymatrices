
package actividad_unidad_1_kevin_pajaro_7501810016;

import java.util.Random;

/**
 *
 * @author kevin pajaro
 */
public class Actividad_unidad_1_punto_3 {
    public static void main(String[] args) {
        int[] ventas = inicializarVentasAleatorias();

        // a. Buscar la venta más alta
        int ventaMasAlta = buscarVentaMasAlta(ventas);
        System.out.println("Venta más alta: " + ventaMasAlta);

        // b. Buscar la venta más baja
        int ventaMasBaja = buscarVentaMasBaja(ventas);
        System.out.println("Venta más baja: " + ventaMasBaja);

        // c. Obtener el total de las ventas
        int totalVentas = obtenerTotalVentas(ventas);
        System.out.println("Total de ventas: " + totalVentas);

        // d. Obtener el promedio de las ventas
        double promedioVentas = obtenerPromedioVentas(ventas);
        System.out.println("Promedio de ventas: " + promedioVentas);

        // e. Buscar la venta más cercana al valor que sigue al promedio
        int ventaMasCercanaAlPromedio = buscarVentaMasCercanaAlPromedio(ventas, promedioVentas);
        System.out.println("Venta más cercana al promedio: " + ventaMasCercanaAlPromedio);
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

    // a. Función para buscar la venta más alta
    public static int buscarVentaMasAlta(int[] ventas) {
        int ventaMasAlta = ventas[0];
        for (int venta : ventas) {
            if (venta > ventaMasAlta) {
                ventaMasAlta = venta;
            }
        }
        return ventaMasAlta;
    }

    // b. Función para buscar la venta más baja
    public static int buscarVentaMasBaja(int[] ventas) {
        int ventaMasBaja = ventas[0];
        for (int venta : ventas) {
            if (venta < ventaMasBaja) {
                ventaMasBaja = venta;
            }
        }
        return ventaMasBaja;
    }

    // c. Función para obtener el total de las ventas
    public static int obtenerTotalVentas(int[] ventas) {
        int totalVentas = 0;
        for (int venta : ventas) {
            totalVentas += venta;
        }
        return totalVentas;
    }

    // d. Función para obtener el promedio de las ventas
    public static double obtenerPromedioVentas(int[] ventas) {
        int totalVentas = obtenerTotalVentas(ventas);
        return (double) totalVentas / ventas.length;
    }

    // e. Función para buscar la venta más cercana al valor que sigue al promedio
    public static int buscarVentaMasCercanaAlPromedio(int[] ventas, double promedio) {
        int ventaMasCercana = ventas[0];
        double diferenciaMinima = Math.abs(ventaMasCercana - promedio);

        for (int venta : ventas) {
            double diferencia = Math.abs(venta - promedio);
            if (diferencia < diferenciaMinima) {
                diferenciaMinima = diferencia;
                ventaMasCercana = venta;
            }
        }

        return ventaMasCercana;
    }
}
