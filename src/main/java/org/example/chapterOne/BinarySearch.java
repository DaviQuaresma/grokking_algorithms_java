package org.example.chapterOne;

public class BinarySearch {

    public Integer pesquisa_binaria(Integer[] lista_ordenada, Integer item) {
        int baixo = 0;
        int alto = lista_ordenada.length - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = lista_ordenada[meio];

            if (chute == item) {
                System.out.println("Item encontrado no índice: " + meio);
                return meio; // retorno do índice
            }

            if (chute < item) {
                baixo = meio + 1;
                System.out.println("Chutou muito baixo, novo baixo: " + baixo);
            } else {
                alto = meio - 1;
                System.out.println("Chutou muito alto, novo alto: " + alto);
            }
        }

        System.out.println("Item não encontrado!");
        return null;
    }
}
