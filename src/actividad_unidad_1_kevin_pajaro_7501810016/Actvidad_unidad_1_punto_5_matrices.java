package actividad_unidad_1_kevin_pajaro_7501810016;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kevin pajaro
 */
public class Actvidad_unidad_1_punto_5_matrices {
    public static void main(String[] args) {
        // a. Declarar e inicializar una matriz de 5 x 8 de tipo Object en una variable llamada lenguajes
        Object[][] lenguajes = new Object[8][5];

        /*
        b. A la primera línea de la matriz lenguajes se debe asignar los siguientes valores en ese orden:
           [NOMBRE, AÑO, AUTOR, DETALLES, FRAMEWORKS]
         */
        lenguajes[0][0] = "NOMBRE";
        lenguajes[0][1] = "AÑO";
        lenguajes[0][2] = "AUTOR";
        lenguajes[0][3] = "DETALLES";
        lenguajes[0][4] = "FRAMEWORKS";

        /*
        c.	Realizar una función llamada infoLenguajes que permita llenar 
        la matriz lenguajes  con datos por teclado a partir de la segunda fila.
        */
        infoLenguajes(lenguajes);
        
        /*
        d.Realizar una función que reciba como parámetro el nombre de un lenguaje 
        y retorna verdadero si este se encuentra dentro de la matriz lenguajes, de lo contrario retorna falso.
        */
        String buscarLenguaje = "Java";
        boolean encontrado = buscarLenguajeEnMatriz(lenguajes, buscarLenguaje);

        if (encontrado) {
            System.out.println("El lenguaje " + buscarLenguaje + " se encuentra en la matriz.");
        } else {
            System.out.println("El lenguaje " + buscarLenguaje + " no se encuentra en la matriz.");
        }
        
        /*
        e.funcion para buscar y mostrar coordenadas del lenguaje buscado
        */
        int[] coordenadas = buscarCoordenadasLenguaje(lenguajes, buscarLenguaje);

        if (coordenadas != null) {
            int fila = coordenadas[0];
            int columna = coordenadas[1];
            System.out.println("El lenguaje " + buscarLenguaje + " se encuentra en la fila " + fila + ", columna " + columna + " de la matriz.");
        } else {
            System.out.println("El lenguaje " + buscarLenguaje + " no se encuentra en la matriz.");
        }
        
        /*
        f.Realizar una función que reciba como parámetro una fila y retorne el registro completo 
        (datos en la fila) del lenguaje en esa fila. Si la fila está errada (no existe en la matriz lenguajes) 
        entonces, debe retornar una excepción con un mensaje informando el problema.
        */
        int filaDeseada = 2;
        try {
            Object[] registro = obtenerRegistroPorFila(lenguajes, filaDeseada);
            if (registro != null) {
                System.out.println("Registro de la fila " + filaDeseada + ": " + Arrays.toString(registro));
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        /*
        g.Realizar una función que reciba como parámetro una columna y retorne un todos los datos en esa columna.
        Si la columna está errada (no existe en la matriz lenguajes) entonces, 
        debe retornar una excepción con un mensaje informando el problema.
        */
        int columna = 2; // Obtenemos los datos de la columna 2 (AUTOR)
        try {
            Object[] datosColumna = obtenerColumna(lenguajes, columna);
            System.out.println("Datos de la columna " + lenguajes[0][columna] + ":");
            for (Object dato : datosColumna) {
                System.out.println(dato);
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage()); // Manejamos la excepción
        }
        
        /*
        h.Realizar una función que reciba como parámetro las coordenadas (fila, columna) 
        y retorne el valor en esa coordinada y el registro (fila) completo con ojos datos de ese lenguaje, 
        si las coordinadas son erradas (no existen en la matriz lenguajes) entonces, 
        debe retornar una excepción con un mensaje informando el problema.
         */
        int fila = 3; // Fila 3 (lenguaje en la cuarta fila)
        columna = 2;
        try {
            Object[] resultado = obtenerDatoEnCoordenada(lenguajes, fila, columna);
            System.out.println("Valor en la coordenada (" + fila + ", " + columna + "): " + resultado[0]);
            System.out.println("Registro completo del lenguaje:");
            Object[] filaCompleta = (Object[]) resultado[1];
            for (Object dato : filaCompleta) {
                System.out.println(dato);
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage()); // Manejar la excepción
        }
        
        /*
        i.Realizar una función que permita mostrar los datos de la matriz lenguajes según la siguiente logia:
        i. La función debe recibir como parámetro un arreglo con 5 elementos de tipo boolean
        ii. Al invocar la función se debe mostrar solo la información de la matriz lenguajes de acuerdo 
        al valor (false o true) que tenga el arreglo que recibe como parámetro. Por ejemplo:
        
        boolean info[] = {true, false, true, true, false};
        infoLenguajes(info)

        Debe mostrar los nombres de los lenguajes, los autores, los frameworks

        */
        
        // Llamar a la función infoLenguajes para mostrar la información de acuerdo a un arreglo de booleanos
        boolean[] infoMostrar = {true, false, true, true, false};
        infoLenguajes(lenguajes, infoMostrar);

        // Imprimir la matriz lenguajes para verificar los datos ingresados
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(lenguajes[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //c.Función para llenar la matriz a partir de la segunda fila
    public static void infoLenguajes(Object[][] lenguajes) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 8; i++) {
            System.out.println("Ingrese los datos para el lenguaje en la fila " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese " + lenguajes[0][j] + ": ");
                // Leer los datos del usuario y almacenarlos en la matriz
                lenguajes[i][j] = scanner.nextLine();
            }
        }
    }

    //d. Función para buscar un lenguaje en la matriz
    public static boolean buscarLenguajeEnMatriz(Object[][] matriz, String nombreLenguaje) {
        for (int i = 1; i < matriz.length; i++) {
            if (matriz[i][0] != null && matriz[i][0].equals(nombreLenguaje)) {
                return true;
            }
        }
        return false;
    }

    //e.Función para buscar las coordenadas de un lenguaje en la matriz
    public static int[] buscarCoordenadasLenguaje(Object[][] matriz, String nombreLenguaje) {
        for (int i = 1; i < matriz.length; i++) {
            if (matriz[i][0] != null && matriz[i][0].equals(nombreLenguaje)) {
                int fila = i;
                int columna = 0; // La primera columna contiene el nombre del lenguaje
                int[] coordenadas = {fila, columna};
                return coordenadas;
            }
        }
        return null; // Si no se encuentra el lenguaje, se retorna null
    }

    //f.Función para obtener el registro completo de una fila
    public static Object[] obtenerRegistroPorFila(Object[][] matriz, int fila) {
        if (fila < 1 || fila >= matriz.length) {
            throw new IllegalArgumentException("Fila fuera de los límites de la matriz");
        }
        return matriz[fila];
    }

    //g.Función para obtener los datos de la columna 2 Autor
    public static Object[] obtenerColumna(Object[][] matriz, int columna) {
        if (columna < 0 || columna >= matriz[0].length) {
            throw new IllegalArgumentException("La columna especificada no existe en la matriz.");
        }

        Object[] datosColumna = new Object[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            datosColumna[i] = matriz[i][columna];
        }
        return datosColumna;
    }

    //h.Función para obtener datos en las coordenada especificada
    public static Object[] obtenerDatoEnCoordenada(Object[][] matriz, int fila, int columna) {
        if (fila < 0 || fila >= matriz.length || columna < 0 || columna >= matriz[0].length) {
            throw new IllegalArgumentException("Las coordenadas especificadas no existen en la matriz.");
        }

        Object valor = matriz[fila][columna];
        Object[] filaCompleta = matriz[fila];

        return new Object[]{valor, filaCompleta};
    }
    
    //i.Función para Para mostrar la información de la matriz lenguajes 
    public static void infoLenguajes(Object[][] matriz, boolean[] infoMostrar) {
        if (infoMostrar.length != matriz[0].length) {
            System.err.println("El tamaño del arreglo de booleanos no coincide con el número de columnas en la matriz.");
            return;
        }

        for (int i = 0; i < matriz[0].length; i++) {
            if (infoMostrar[i]) {
                System.out.print(matriz[0][i] + "\t");
            }
        }
        System.out.println();

        for (int j = 1; j < matriz.length; j++) {
            for (int i = 0; i < matriz[0].length; i++) {
                if (infoMostrar[i]) {
                    System.out.print(matriz[j][i] + "\t");
                }
            }
            System.out.println();
        }
    }

}
