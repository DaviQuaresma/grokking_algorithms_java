package org.example.chapterTwo;

import java.util.ArrayList;
import java.util.List;

public class OrdenationBySelection {

    public Integer buscarMenor(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array não pode ser nulo ou vazio");
        }

        int menor = arr[0];
        int menor_indice = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < menor) {
                menor = arr[i];
                menor_indice = i;
            }
        }

        return menor_indice;
    }

    public List<Integer> ordenacaoPorSelecao(List<Integer> arr) {
        List<Integer> novoArr = new ArrayList<>();

        while (!arr.isEmpty()) {
            int menorIndice = buscarMenor(arr.toArray(new Integer[0]));
            novoArr.add(arr.remove(menorIndice));
        }

        return novoArr;
    }
}
