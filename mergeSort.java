public class mergeSort {
    public static void mergeSort(int[] lista, int inicio, int fim) {
        //condição que divide a lista em sublista até 1
        if (fim - inicio > 1) {
            //divisão em sublistas e descobre o meio dela
            int meio = (fim + inicio)/2;
            //ordena o inicio ao meio da lista (1° parte)
            mergeSort(lista, inicio, meio);
            //ordena o meio ao fim (2° parte)
            mergeSort(lista, meio, fim);
            //chama a lista recurssivamente ordenada entre as duas partes da lista
            merge(lista, inicio, meio, fim);
        }
    }

    //função que combina e ordena as duas metades da lista
    public static void merge(int[] lista, int inicio, int meio, int fim) {
        //Listas temporárias do inicio ao meio e do meio ao fim
        int[] inicio_Meio = new int[meio - inicio];
        int[] meio_Fim = new int[fim - meio];

        //cópia do array (origem, origemPos, destino, destinoPos, cumprimento)
        System.arraycopy(lista, inicio, inicio_Meio, 0, meio - inicio);
        System.arraycopy(lista, meio, meio_Fim, 0, fim - meio);

        //indice de inicio cada array
        int topoListaInicio = 0, topoListaFim = 0;

        for (int i = inicio; i < fim; i++) {
            if (topoListaInicio >= inicio_Meio.length) {
                lista[i] = meio_Fim[topoListaFim];
                topoListaFim++;
                //faz uma leitura entre a ordenação de cada lista entre seus valores e o tamanho do array meio ao fim

            } else if (topoListaFim >= meio_Fim.length) {
                lista[i] = inicio_Meio[topoListaInicio];
                topoListaInicio++;
                //faz uma leitura entre a ordenação de cada lista entre seus valores e o tamanho do array do inicio ao meio

            } else if (inicio_Meio[topoListaInicio] <= meio_Fim[topoListaFim]) {
                lista[i] = inicio_Meio[topoListaInicio];
                topoListaInicio++;
                //se o número atual do inicio ao meio for menor ou igual ao do meio ao fim

            } else {
                lista[i] = meio_Fim[topoListaFim];
                topoListaFim++;
                //ae o número atual do meio ao fim for menor que o número do inicio ao meio
            }
        }
    }

    public static void main(String[] args) {
        //exemplo de listas
        int[] lista = {38, 47, 50, 10, 0, 3, 5};
        int[] listaReversa = {107, 88, 34, 23, 10, 8, 2};
        int[] listaOrdenada = {3, 6, 9, 12, 15, 18, 21};
        int[] listaPequena = {7, 1, 3};
        int[] listaNegativa = {-8, -4, -12, 0, -32, -2, -5};

        //imprime o lista não ordenada
        System.out.println("Lista Original:");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();

        //chama a função ordenando a lista
        mergeSort(lista, 0, lista.length);

        //imprime a lista ordenada
        System.out.println("\nLista Ordenada:");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }

        //imprime o lista não ordenada
        System.out.println("\n\nLista Reversa:");
        for (int i = 0; i < listaReversa.length; i++) {
            System.out.print(listaReversa[i] + " ");
        }
        System.out.println();

        //chama a função ordenando a lista
        mergeSort(listaReversa, 0, listaReversa.length);

        //imprime a lista ordenada
        System.out.println("\nLista Reversa Ordenada:");
        for (int i = 0; i < listaReversa.length; i++) {
            System.out.print(listaReversa[i] + " ");
        }

        //imprime o lista não ordenada
        System.out.println("\n\nLista já ordenada:");
        for (int i = 0; i < listaOrdenada.length; i++) {
            System.out.print(listaOrdenada[i] + " ");
        }
        System.out.println();

        //chama a função ordenando a lista
        mergeSort(listaOrdenada, 0, listaOrdenada.length);

        //imprime a lista ordenada
        System.out.println("\nLista Ordenada:");
        for (int i = 0; i < listaOrdenada.length; i++) {
            System.out.print(listaOrdenada[i] + " ");
        }

        //imprime o lista não ordenada
        System.out.println("\n\nLista Pequena:");
        for (int i = 0; i < listaPequena.length; i++) {
            System.out.print(listaPequena[i] + " ");
        }
        System.out.println();

        //chama a função ordenando a lista
        mergeSort(listaPequena, 0, listaPequena.length);

        //imprime a lista ordenada
        System.out.println("\nLista Pequena:");
        for (int i = 0; i < listaPequena.length; i++) {
            System.out.print(listaPequena[i] + " ");
        }

        //imprime o lista não ordenada
        System.out.println("\n\nLista Negativa:");
        for (int i = 0; i < listaNegativa.length; i++) {
            System.out.print(listaNegativa[i] + " ");
        }
        System.out.println();

        //chama a função ordenando a lista
        mergeSort(listaNegativa, 0, listaNegativa.length);

        //imprime a lista ordenada
        System.out.println("\nLista Negativa:");
        for (int i = 0; i < listaNegativa.length; i++) {
            System.out.print(listaNegativa[i] + " ");
        }
    }
}
