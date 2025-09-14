package org.example;

import org.example.chapterOne.BinarySearch;
import org.example.chapterTwo.OrdenationBySelection;
import org.example.revision.RevisionChapterOneTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        RevisionChapterOneTwo rv = new RevisionChapterOneTwo();
        BinarySearch bs = new BinarySearch();
        OrdenationBySelection os = new OrdenationBySelection();

        List<Integer> arr = new ArrayList<>(Arrays.asList(42, 7, 89, 15, 63, 28, 94, 3, 56, 71));
        Integer[] arr2 = {1, 7, 10, 15, 21, 28, 34, 40, 56, 71};

        String[] nomes = {
                "Mariana", "Felipe", "Ana", "Xavier", "Gabriela", "Thiago", "Olívia", "Vanessa",
                "Lucas", "Rafael", "Isabela", "Karen", "Nicolas", "Eduarda", "William", "Sofia",
                "Pedro", "Henrique", "Bruno", "Queila", "João", "Carla", "Diego", "Ursula"
        };

        List<String> names = new  ArrayList<>(Arrays.asList(nomes));

        System.out.println("resultado " + rv.ordenarEBuscar(arr, 15));

    }
}