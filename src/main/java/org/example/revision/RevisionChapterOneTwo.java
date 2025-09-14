package org.example.revision;

import java.util.*;

public class RevisionChapterOneTwo {

    /*
        ## 🚀 Exercícios de **Busca Binária**

        1. **Busca simples em nomes**
        * Cria um array **ordenado** de Strings com nomes (ex: 10–20 nomes).
        * Implementa a busca binária para encontrar se o nome existe.
        * Retorna o índice ou `null` se não encontrar.

        2. **Contagem de comparações**
        * Modifica tua busca binária para contar quantos passos foram feitos até encontrar (ou não encontrar).
        * Exemplo: com 128 itens, no pior caso deve dar 7 passos.
    */

    public Integer buscaBinaria(String[] lista, String item) {
        int baixo = 0;
        int alto = lista.length - 1;
        int passos = 0;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            String chute = lista[meio];
            passos++;

            System.out.println("Passos: " + passos);

            int comparacao = chute.compareTo(item);

            System.out.println(chute.compareTo(item));

            if (comparacao == 0) {
                return meio; // achou o nome
            }

            if (comparacao < 0) {
                // chute vem antes do item → procura na metade direita
                baixo = meio + 1;
            } else {
                // chute vem depois do item → procura na metade esquerda
                alto = meio - 1;
            }
        }

        return null; // não achou
    }

    public Integer buscaBinaria2(Integer[] lista, Integer item) {
        int baixo = 0;
        int alto = lista.length - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = lista[meio];

            if (chute == item) {
                System.out.println("\n=========================================");
                System.out.println("Status");
                System.out.println("Baixo: " + baixo);
                System.out.println("Alto: " + alto);
                System.out.println("Meio: " + meio);
                System.out.println("\nAchou o item!");
                System.out.println("Chute: " + chute);
                System.out.println("Item: " + item);
                System.out.println("Meio achado: " + meio);
                System.out.println("=========================================");
                return meio;
            }

            if (chute < item) {
                System.out.println("\n=========================================");
                System.out.println("Status");
                System.out.println("Baixo: " + baixo);
                System.out.println("Alto: " + alto);
                System.out.println("Meio: " + meio);
                System.out.println("\nChutou muito baixo: ");
                System.out.println("Chute: " + chute);
                System.out.println("Item: " + item);
                baixo = meio + 1;
                System.out.println("Novo baixo: " + baixo);
                System.out.println("=========================================");
            }

            if (chute > item) {
                System.out.println("\n=========================================");
                System.out.println("Status");
                System.out.println("Baixo: " + baixo);
                System.out.println("Alto: " + alto);
                System.out.println("Meio: " + meio);
                System.out.println("\nChutou muito alto");
                System.out.println("Chute: " + chute);
                System.out.println("Item: " + item);
                alto = meio - 1;
                System.out.println("Novo alto: " + alto);
                System.out.println("=========================================");
            }
        }
        return null;
    }

    public Integer buscaBinaria3(String[] lista, String item) {
        int baixo = 0;
        int alto = lista.length - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            String chute = lista[meio];

            int comparacao = chute.compareTo(item);

            System.out.println("\n==========================");
            System.out.println("Retorno da comparação: " + comparacao);
            System.out.println("==========================");

            if (comparacao == 0) {
                System.out.println("\n==========================");
                System.out.println("Achou o item!");
                System.out.println("Item atual: " + item);
                System.out.println("==========================");
                return meio;
            }

            if (comparacao < 1) {
                System.out.println("\n==========================");
                System.out.println("Chutou baixo");
                System.out.println("Baixo: " + baixo);
                System.out.println("Item atual: " + item);
                baixo = meio + 1;
                System.out.println("Novo baixo: " + baixo);
                System.out.println("==========================");
            } else {
                System.out.println("\n==========================");
                System.out.println("Chutou alto");
                System.out.println("Alto: " + alto);
                System.out.println("Item atual: " + item);
                alto = meio - 1;
                System.out.println("Novo alto: " + alto);
                System.out.println("==========================");
            }
        }
        return null;
    }

    /*
      3. **Primeiro e último índice**
            * Em um array ordenado que pode ter elementos repetidos, implementa duas funções:
            * `buscarPrimeiro(int x)` → índice da primeira ocorrência de `x`.
            * `buscarUltimo(int x)` → índice da última ocorrência de `x`.
    */

    public int buscarPrimeiro(int[] arr, int item) {
        int baixo = 0, alto = arr.length - 1, resultado = -1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;

            if (arr[meio] == item) {
                resultado = meio;       // guarda possível resposta
                alto = meio - 1;        // continua à esquerda
            } else if (arr[meio] < item) {
                baixo = meio + 1;
            } else {
                alto = meio - 1;
            }
        }
        return resultado;
    }

    public int buscarUltimo(int[] arr, int item) {
        int baixo = 0, alto = arr.length - 1, resultado = -1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;

            if (arr[meio] == item) {
                resultado = meio;       // guarda possível resposta
                baixo = meio + 1;       // continua à direita
            } else if (arr[meio] < item) {
                baixo = meio + 1;
            } else {
                alto = meio - 1;
            }
        }
        return resultado;
    }

        /*
            4. **Maior elemento menor ou igual a X**
            * Busca o maior número que seja **≤ X** em um array ordenado.
            * Exemplo: `[2, 4, 6, 9]`, busca `7` → retorna `6`.
        */

    public Integer buscaMaiorMenorOuIgual(int[] arr, int item) {
        int baixo = 0;
        int alto = arr.length - 1;
        Integer resultado = null;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = arr[meio];

            if (chute == item) {
                return meio; // índice encontrado
            } else if (chute < item) {
                baixo = meio + 1;
            } else {
                alto = meio - 1;
            }
        }

        // Se não encontrar, quando a busca termina, a variável alto estará exatamente no índice do maior elemento menor ou igual a item (isso é uma propriedade clássica da busca binária).

        if (alto >= 0) {
            return alto;
        } else {
            return null; // nenhum elemento menor ou igual a item
        }
    }

    /*
     ## 🚀 Exercícios de **Ordenação por Seleção**

        5. **Ordenar array decrescente**
        * Altera o algoritmo de seleção para ordenar do maior para o menor.

        6. **Contar trocas**
        * Além de ordenar, conta quantas trocas de elementos foram feitas.
        * Isso ajuda a entender a eficiência (selection sort sempre faz `n` trocas, mas tu comprova).
    */

    public int indiceMaior(List<Integer> arr) {
        int maiorIndice = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(maiorIndice)) {
                maiorIndice = i;
            }
        }
        return maiorIndice;
    }

    // Ordena em ordem decrescente o próprio List e retorna quantas trocas foram feitas
    public int ordenacaoPorSelecaoDecrescenteComContador(List<Integer> arr) {
        if (arr == null) throw new IllegalArgumentException("Array não pode ser nulo");
        int n = arr.size();
        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            int maiorIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr.get(j) > arr.get(maiorIdx)) {
                    maiorIdx = j;
                }
            }
            if (maiorIdx != i) {
                Collections.swap(arr, i, maiorIdx);
                swaps++;
            }
        }

        return swaps;
    }

    public List<Integer> ordenacaoPorSelecaoDecrescente(List<Integer> arr) {
        List<Integer> novoArr = new ArrayList<>();

        while (!arr.isEmpty()) {
            int maiorIndice = indiceMaior(arr);
            novoArr.add(arr.remove(maiorIndice));
        }

        return novoArr;
    }

    /*
        7. **Ordenar nomes**
        * Usa `String[]` em vez de `Integer[]` e ordena alfabeticamente (usando `compareTo`).
    */

    public int buscaIndiceMenor(List<String> arr) {
        String menor = arr.get(0);
        int menorIndice = 0;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).compareTo(menor) < 0) {
                menor = arr.get(i);
                menorIndice = i;
            }
        }

        return menorIndice;
    }

    public List<String> ordenacaoPorSelecaoAlfabetica(List<String> arr) {
        List<String> novoArr = new ArrayList<>();

        while (!arr.isEmpty()) {
            int menorIndice = buscaIndiceMenor(arr);
            novoArr.add(arr.remove(menorIndice));
        }

        return novoArr;
    }

    /*
        8. **Ordenar parte do array**
        * Faz a função receber um intervalo `[i, j]` e ordenar só esse trecho do array.
     */


    /*
        ## 🚀 Exercícios que juntam **os dois**

        9. **Ordenar e depois buscar**
        * Recebe um array desordenado → aplica seleção para ordenar → aplica busca binária para achar um elemento.
     */

    public int buscaIndiceMenorFinal(List<Integer> arr) {
        int menor = arr.get(0);
        int menorIndice = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < menor) {
                menor = arr.get(i);
                menorIndice = i;
            }
        }
        return menorIndice;
    }

    public List<Integer> ordenarPorSelecaoFinal(List<Integer> arr) {
        List<Integer> novoArr = new ArrayList<>();
        while (!arr.isEmpty()) {
            int menorIndice = buscaIndiceMenorFinal(arr);
            novoArr.add(arr.remove(menorIndice));
        }
        return novoArr;
    }

    public int buscaBinariaFinal(List<Integer> arr, int item) {
        int baixo = 0;
        int alto = arr.size() - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = arr.get(meio);

            if (chute == item) {
                return meio; // índice encontrado
            } else if (chute < item) {
                baixo = meio + 1;
            } else {
                alto = meio - 1;
            }
        }
        return -1; // não encontrado
    }

    public int ordenarEBuscar(List<Integer> arr, int item) {
        List<Integer> ordenado = ordenarPorSelecaoFinal(new ArrayList<>(arr));
        System.out.println("Array ordenado: " + ordenado);

        int indice = buscaBinariaFinal(ordenado, item);
        if (indice >= 0) {
            System.out.println("Item " + item + " encontrado no índice " + indice);
        } else {
            System.out.println("Item " + item + " não encontrado");
        }

        return indice;
    }



    /*
        10. **Simular catálogo**
        * Cria uma lista de 20 "produtos" (nome + preço).
        * Ordena os produtos pelo preço usando seleção.
        * Implementa busca binária para encontrar um produto pelo preço.
    */


}


