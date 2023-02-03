//Que algoritmos usas en tu vida cotidiana? Piensas que podrias escribir un programa para hacerlos mas eficientes?


//programa con el algoritmo de ordenamiento de burbuja de la forma recursiva
import java.util.Scanner;
public class pregunta1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[5];
        int n = arreglo.length;
        System.out.println("Ingrese los numeros del arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = sc.nextInt();
        }
        burbuja(arreglo, n);
        System.out.println("Arreglo ordenado");
        imprimir(arreglo);
        sc.close();
    }

    static void burbuja(int arreglo[], int n) {
        
        // Caso base
        if (n == 1)
            return;

        // Recorrer el arreglo de 0 a n-1
        // y comparar los elementos
        for (int i = 0; i < n - 1; i++)
            if (arreglo[i] > arreglo[i + 1]) {

                // Intercambiar si el elemento
                // encontrado es mayor que el siguiente
                int temp = arreglo[i];
                arreglo[i] = arreglo[i + 1];
                arreglo[i + 1] = temp;
            }

        // Llamada recursiva para el arreglo
        // de 0 a n-1
        burbuja(arreglo, n - 1);
        
    }

    // Funcion para imprimir el arreglo
    static void imprimir(int arreglo[]) {
        int n = arreglo.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arreglo[i] + " ");
        System.out.println();
    }
}

//programa que muestre los numeros proimos del 1 al 100
/*import java.util.Scanner;
public class pregunta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
        sc.close();
    }

    public static boolean esPrimo(int num) {
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != num)) {
            if (num % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }
}*/






