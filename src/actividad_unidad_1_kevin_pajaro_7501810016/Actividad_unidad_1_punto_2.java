
package actividad_unidad_1_kevin_pajaro_7501810016;

import java.util.Random;

/**
 *
 * @author kevin pajaro
 */
public class Actividad_unidad_1_punto_2 {
    
    public static void main(String[] args) {
        
        String[] dataStructs = {"Listas", "Colas", "Pilas", "Mapas", "Conjuntos"};
        String[] características = 
        {
            "Simples, Circulares y Enlazadas", 
            "Primero en entrar, Primero en Salir. Último en entrar, Primero en salir", 
            "Primero en entrar, Último en salir",
            "Parejas de clave y valor", 
            "Elementos no repetidos"
        };

        // a. Mostrar los elementos del arreglo dataStructs con su equivalente elemento del arreglo características.
        System.out.println("Elementos de dataStructs y sus características:");
        for (int i = 0; i < dataStructs.length; i++) {
            System.out.println(dataStructs[i] + ": " + características[i]);
        }

        // b. Declarar un arreglo de enteros llamado ventas
        int[] ventas;

        // c. Inicializar el arreglo ventas con una cantidad aleatoria de elementos.
        Random random = new Random();
        int cantidadVentas = random.nextInt(10) + 1; // Entre 1 y 10 elementos
        ventas = new int[cantidadVentas];

        // d. Llenar el arreglo ventas con valores aleatorios entre 1 y 1000
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = random.nextInt(1000) + 1;
        }

        // e. Mostrar la cantidad de ventas
        System.out.println("Cantidad de ventas: " + ventas.length);

        // f. Mostrar el valor de cada una de las ventas
        System.out.println("Valores de las ventas:");
        for (int venta : ventas) {
            System.out.println(venta);
        }

        // g. Mostrar el total de ventas
        int totalVentas = 0;
        for (int venta : ventas) {
            totalVentas += venta;
        }
        System.out.println("Total de ventas: " + totalVentas);

        // h. Mostrar el promedio de las ventas.
        double promedioVentas = (double) totalVentas / ventas.length;
        System.out.println("Promedio de ventas: " + promedioVentas);
    }
    
}
