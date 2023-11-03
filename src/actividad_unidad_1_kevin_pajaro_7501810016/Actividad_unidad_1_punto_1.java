package actividad_unidad_1_kevin_pajaro_7501810016;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author kevin pajaro
 * 
 */
public class Actividad_unidad_1_punto_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* a.Declarar un arreglo por cada uno de los tipos de datos primitivos 
        (byte, Byte, char, Character, short, Short, int, 
        Integer, long, Long, float, Float, double, Double, Object, String. 
         */

        byte[] byteArray;
        Byte[] arrayByteObjeto;

        char[] charArray;
        Character[] arrayCharacterObjeto;

        short[] shortArray;
        Short[] arrayShortObjeto;

        int[] intArray;
        Integer[] arrayIntegerObjeto;

        long[] longArray;
        Long[] arrayLongObjeto;

        float[] floatArray;
        Float[] arrayFloatObjeto;

        double[] doubleArray;
        Double[] arrayDoubleObjeto;

        Object[] objectArray;
        String[] stringArray;

        /*
        b.Definir cada uno de los arreglos anteriores con tamaño de 5 elementos
         */
        byteArray = new byte[5];
        arrayByteObjeto = new Byte[5];

        charArray = new char[5];
        arrayCharacterObjeto = new Character[5];

        shortArray = new short[5];
        arrayShortObjeto = new Short[5];

        intArray = new int[5];
        arrayIntegerObjeto = new Integer[5];

        longArray = new long[5];
        arrayLongObjeto = new Long[5];

        floatArray = new float[5];
        arrayFloatObjeto = new Float[5];

        doubleArray = new double[5];
        arrayDoubleObjeto = new Double[5];

        objectArray = new Object[5];
        stringArray = new String[5];

        /*
        c.Asignar valores a cada arreglo usando la notación de posiciones o índices
         */
        //byte y Byte
        byteArray[0] = 1;
        byteArray[1] = 2;
        byteArray[2] = 3;
        byteArray[3] = 4;
        byteArray[4] = 5;

        arrayByteObjeto[0] = 1;
        arrayByteObjeto[1] = 2;
        arrayByteObjeto[2] = 3;
        arrayByteObjeto[3] = 4;
        arrayByteObjeto[4] = 5;

        //char y character
        charArray[0] = 'A';
        charArray[1] = 'B';
        charArray[2] = 'C';
        charArray[3] = 'D';
        charArray[4] = 'E';

        arrayCharacterObjeto[0] = 'F';
        arrayCharacterObjeto[1] = 'G';
        arrayCharacterObjeto[2] = 'H';
        arrayCharacterObjeto[3] = 'I';
        arrayCharacterObjeto[4] = 'J';

        //short y Short
        shortArray[0] = 10;
        shortArray[1] = 20;
        shortArray[2] = 30;
        shortArray[3] = 40;
        shortArray[4] = 50;

        arrayShortObjeto[0] = 100;
        arrayShortObjeto[1] = 200;
        arrayShortObjeto[2] = 300;
        arrayShortObjeto[3] = 400;
        arrayShortObjeto[4] = 500;

        //int y Integer
        intArray[0] = 1000;
        intArray[1] = 2000;
        intArray[2] = 3000;
        intArray[3] = 4000;
        intArray[4] = 5000;

        arrayIntegerObjeto[0] = 10000;
        arrayIntegerObjeto[1] = 20000;
        arrayIntegerObjeto[2] = 30000;
        arrayIntegerObjeto[3] = 40000;
        arrayIntegerObjeto[4] = 50000;

        //long y Long
        longArray[0] = 100000L;
        longArray[1] = 200000L;
        longArray[2] = 300000L;
        longArray[3] = 400000L;
        longArray[4] = 500000L;

        arrayLongObjeto[0] = 1000000L;
        arrayLongObjeto[1] = 2000000L;
        arrayLongObjeto[2] = 3000000L;
        arrayLongObjeto[3] = 4000000L;
        arrayLongObjeto[4] = 5000000L;

        //float y Float
        floatArray[0] = 1.1f;
        floatArray[1] = 2.2f;
        floatArray[2] = 3.3f;
        floatArray[3] = 4.4f;
        floatArray[4] = 5.5f;

        arrayFloatObjeto[0] = 6.6f;
        arrayFloatObjeto[1] = 7.7f;
        arrayFloatObjeto[2] = 8.8f;
        arrayFloatObjeto[3] = 9.9f;
        arrayFloatObjeto[4] = 10.1f;

        //double y Double
        doubleArray[0] = 11.11;
        doubleArray[1] = 12.12;
        doubleArray[2] = 13.13;
        doubleArray[3] = 14.14;
        doubleArray[4] = 15.15;

        arrayDoubleObjeto[0] = 16.16;
        arrayDoubleObjeto[1] = 17.17;
        arrayDoubleObjeto[2] = 18.18;
        arrayDoubleObjeto[3] = 19.19;
        arrayDoubleObjeto[4] = 20.20;

        //objeto y String
        objectArray[0] = "HOLA";
        objectArray[1] = 1;
        objectArray[2] = 3.14;
        objectArray[3] = true;
        objectArray[4] = "A";

        stringArray[0] = "HOLA";
        stringArray[1] = "MUNDO";
        stringArray[2] = "ESTO";
        stringArray[3] = "ES";
        stringArray[4] = "JAVA";

        /*
        d.Mostrar los valores de cada Arreglo
         */
        System.out.println("Valores en byte: " + Arrays.toString(byteArray));
        System.out.println("Valores en Byte: " + Arrays.toString(arrayByteObjeto));
        System.out.println("Valores en char: " + Arrays.toString(charArray));
        System.out.println("Valores en Character: " + Arrays.toString(arrayCharacterObjeto));
        System.out.println("Valores en short: " + Arrays.toString(shortArray));
        System.out.println("Valores en Short: " + Arrays.toString(arrayShortObjeto));
        System.out.println("Valores en int: " + Arrays.toString(intArray));
        System.out.println("Valores en Integer: " + Arrays.toString(arrayIntegerObjeto));
        System.out.println("Valores en long: " + Arrays.toString(longArray));
        System.out.println("Valores en Long: " + Arrays.toString(arrayLongObjeto));
        System.out.println("Valores en float: " + Arrays.toString(floatArray));
        System.out.println("Valores en Float: " + Arrays.toString(arrayFloatObjeto));
        System.out.println("Valores en double: " + Arrays.toString(doubleArray));
        System.out.println("Valores en Double: " + Arrays.toString(arrayDoubleObjeto));
        System.out.println("Valores en objeto: " + Arrays.toString(objectArray));
        System.out.println("Valores en stringArray: " + Arrays.toString(stringArray));

        /*
        e.Declarar y definir otro arreglo de tipo String en una variable llamada dataStructs, 
        e inicializarlo con los siguientes datos, usando la sintaxis de llaves.
        i.   Listas
        ii.  Colas
        iii. Pilas
        iv.  Mapas
        v.   Conjuntos

         */
        
        String[] dataStructs = {"Listas", "Colas", "Pilas", "Mapas", "Conjuntos"};
        
        /*
        f.	Declarar y definir otro arreglo de tipo String en una variable 
        llamada características, con 5 elementos.
        */
        
        String[] caracteristicas = new String[5];
        
        /*
        g.Ingresar los siguientes datos por teclado:
        i.	Simples, Circulares y Enlazadas
        ii.	Primero en entrar, Primero en Salir. Último en entrar, Primero en salir
        iii.	Primero en entrar, Último en salir
        iv.	Parejas de clave y valor
        v.	Elementos no repetidos

        */
        // Ingresar los datos por teclado
        for (int i = 0; i < caracteristicas.length; i++) {
            System.out.print("Ingrese la caracteristica " + (i + 1) + ": ");
            caracteristicas[i] = scanner.nextLine();
        }
        scanner.close();
        // Imprimimos las características
        System.out.println("Características:");
        for (String característica : caracteristicas) {
            System.out.println(característica);
        }
    }

}
