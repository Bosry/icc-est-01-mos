class MetodosOrdenamiento {
    public int[] sortBySelection(int[] arreglo) {

        int tamanio = arreglo.length;
        // Recorrer el arreglo
        for (int i = 0; i < tamanio; i++) {

            int indice = i;
            for (int j = i + 1; j < tamanio; j++) {

                if (arreglo[j] < arreglo[indice]) {

                    indice = j;

                }
            }
            // Intercambio del indice encontrado por el primero
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;

        }
        return arreglo;
    }

    public void printArreglo(int[] arreglo) {

        int[] numeros = arreglo;

        for (int i = 0; i < numeros.length; i++) {

            int elemento = numeros[i];
            System.out.print(elemento + " ");

        }
    }
    public int[] sortBySelectionDes(int[] arreglo) {

        int tamanio = arreglo.length;
        // Recorrer el arreglo
        for (int i = 0; i < tamanio; i++) {

            int indice = i;
            for (int j = i + 1; j < tamanio; j++) {

                if (arreglo[j] > arreglo[indice]) {

                    indice = j;

                }
            }
            // Intercambio del indice encontrado por el primero
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;

        }
        return arreglo;
    }

    public void printArregloDes(int[] arreglo) {

        int[] numeros = arreglo;

        for (int i = 0; i < numeros.length; i++) {

            int elemento = numeros[i];
            System.out.print(elemento + " ");

        }
    }
    
}

