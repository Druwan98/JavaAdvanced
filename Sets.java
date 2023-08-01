package JavaAdvanced;

import java.util.*;

public class Sets {
    public static void main(String[] args) {

    //ARRAYLIST
        List<String> ingredientsList = new ArrayList<>();
            ingredientsList.add("Tomato");
            ingredientsList.add("Lettuce");
            ingredientsList.add("Carrot");
            ingredientsList.add("Tomato");
            ingredientsList.add("Tomato");
        System.out.println("'ArrayList' = " + ingredientsList);

    //SETS=  Gli insiemi(sets) sono una collezione di elementi unici, il che significa che non possono contenere duplicati.
    //      Se provi ad aggiungere lo stesso elemento più di una volta, verrà considerato solo una volta nel set.

    //HASHSET = implementazione più comune dell'interfaccia 'Set' in Java
        Set<String> ingredientsHashSet = new HashSet<>();
            ingredientsHashSet.add("Tomato");
            ingredientsHashSet.add("Lettuce");
            ingredientsHashSet.add("Carrot");
            ingredientsHashSet.add("Tomato");
            ingredientsHashSet.add("Tomato");
        System.out.println("'HashSet' = " + ingredientsHashSet + " = implementazione più comune dell'interfaccia 'Set' in Java.");

    //TREESET = mette in ordine alfabetico/numerico
        Set<String> ingredientsTreeSet = new TreeSet<>();
            ingredientsTreeSet.add("2: Tomato");
            ingredientsTreeSet.add("1: Lettuce");
            ingredientsTreeSet.add("3: Carrot");
            ingredientsTreeSet.add("Tomato");
            ingredientsTreeSet.add("Lettuce");
            ingredientsTreeSet.add("Carrot");
        System.out.println("'TreeSet' = " + ingredientsTreeSet + " = mette in ordine alfabetico/numerico.");

    //Il loop fori non funziona con gli Insiemi:
        System.out.println("//Il loop 'for i' non funziona con gli Insiemi:");
        List<String> ingredientsListForI = new ArrayList<>();
        ingredientsListForI.add("Tomato");
        ingredientsListForI.add("Lettuce");
        ingredientsListForI.add("Carrot");
        for (int i = 0; i < ingredientsListForI.size(); i++) {
        System.out.println("For i = " + ingredientsListForI);
        }

    //Invece il ciclo for normale non ha problemi:
        System.out.println("//Invece il loop 'for' non ha problemi:");
        List<String> ingredientsListFor = new ArrayList<>();
        ingredientsListFor.add("Tomato");
        ingredientsListFor.add("Lettuce");
        ingredientsListFor.add("Carrot");
        for (String ingredients: ingredientsListFor) {
            System.out.println("For = " + ingredients);
        }

    //Utilizzo di 'Collections.sort()'
        System.out.println("//Utilizzo di 'Collections.sort()': ");
        List<String> ingredientsListSort = new ArrayList<>();
        ingredientsListSort.add("Tomato");
        ingredientsListSort.add("Lettuce");
        ingredientsListSort.add("Carrot");
        ingredientsListSort.add("Tomato");
        ingredientsListSort.add("Tomato");
        Collections.sort(ingredientsListSort);
        for (String ingredientsSort: ingredientsListSort) {
            System.out.println(".sort = " + ingredientsSort);
        }






System.out.println("\n");
    //import java.util.HashSet;
//import java.util.Set;

        //public class EsempioSet {
            //public static void main(String[] args) {

                // Creazione di un set di stringhe
                Set<String> set = new HashSet<>();

                // Aggiunta di elementi al set
                set.add("Apple");
                set.add("Banana");
                set.add("Orange");
                set.add("Apple"); // Questo elemento viene ignorato poiché è già presente
                System.out.println("Set = " + set);

                // Verifica se un elemento è presente nel set = '.contains(...)'
                boolean containsBanana = set.contains("Banana");
                System.out.println("Il set contiene 'Banana'? " + containsBanana); // Output: true

                // Dimensione del set = '.size()'
                int size3 = set.size();
                System.out.println("Dimensione del set: " + size3); // Output: 3


                // Rimozione di un elemento dal set = '.remove(...)
                boolean removed = set.remove("Orange");
                System.out.println("Rimozione di Orange dal set: " + removed); // Output: true

                // Dimensione del set = '.size()'
                int size2 = set.size();
                System.out.println("Dimensione del set: " + size2); // Output: 2

                // Verifica se il set è vuoto = '.isEmpty()'
                boolean isEmpty = set.isEmpty();
                System.out.println("Il set è vuoto? " + isEmpty); // Output: false

                // Svuotamento del set = '.clear()'
                set.clear();
                System.out.println("Il set è vuoto dopo averlo svuotato? " + set.isEmpty()); // Output: true

                // Verifica se il set è realmente vuoto
                boolean isReallyEmpty = set.isEmpty();
                System.out.println("Il set è realmente vuoto? " + isReallyEmpty); // Output: true
            }
        }






