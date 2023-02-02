// Haz hecho alguna vez un algoritmo para un programa? Que hacia? Era correcto y eficiente?


//codigo de java para el algoritmo de ordenamiento de burbuja de la forma recursiva 

class pregunta3 {

    public static void main(String[] args) {
        int[] arreglo = { 5, 1, 4, 2, 8 };
        int n = arreglo.length;
        burbuja(arreglo, n);
        System.out.println("Arreglo ordenado");
        imprimir(arreglo);
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

