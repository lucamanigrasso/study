package it.lumanig.algorithms;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LinearSearch {

    public static void main(String[] args) {

        String stringToSearch = "zurigo";

        List<String> notOrderedList = Arrays.asList("zorro", "prova", "test", "pippo", "pluto", "paperino", "zurigo", "Brindisi");
        List<String> orderedList = notOrderedList.stream().sorted().collect(Collectors.toList());

        System.out.println("Lavorando sulla seguente lista " + orderedList + " con " + orderedList.size() + " elementi.");

        for(int i=0; i<orderedList.size(); i++){

            String element = orderedList.get(i);

            if(element.equals(stringToSearch)){
                System.out.println("Element found: " + element + " with " + (i+1) + " steps.");
            }
        }
    }
}
