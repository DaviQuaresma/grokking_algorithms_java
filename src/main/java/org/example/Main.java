package org.example;

import org.example.chapterOne.BinarySearch;

public class Main {
    public static void main(String[] args) {

    BinarySearch bs = new BinarySearch();

    Integer[] lista_ordenada = {1, 3, 5, 7, 9};

    Integer result = bs.pesquisa_binaria(lista_ordenada, 9);

    System.out.println("Resultado da operação: " + result);
    }
}