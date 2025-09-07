package org.example;

import org.example.chapterOne.BinarySearch;
import org.example.chapterTwo.OrdenationBySelection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        OrdenationBySelection ob = new OrdenationBySelection();

        List<Integer> arr = new ArrayList<>(Arrays.asList(42, 7, 89, 15, 63, 28, 94, 3, 56, 71));

        List<Integer> resultado = ob.ordenacaoPorSelecao(arr);

        System.out.println("result: " + resultado);

    }
}