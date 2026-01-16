package it.lumanig.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BinarySearch {

    public static void main(String[] args) {
        String itemToSearch = "zzzz";

        List<String> notOrderedList = Arrays.asList("zorro", "prova", "test", "pippo", "pluto", "paperino", "zurigo", "Brindisi");
        List<String> orderedList = notOrderedList.stream().sorted().collect(Collectors.toList());

        Integer elementFound = search(orderedList, itemToSearch);

        System.out.println(orderedList);
        System.out.println(elementFound);
    }

    private static Integer search(List<String> listOfElements, String itemToSearch){

        int begin = 0;
        int end = listOfElements.size()-1;

        while(begin <= end){

            int middle = (begin + end) / 2;

            String middleElement = listOfElements.get(middle);

            if(middleElement.compareTo(itemToSearch) == 0)
                return middle;
            else if(middleElement.compareTo(itemToSearch) < 0)
                begin = middle + 1;
            else if(middleElement.compareTo(itemToSearch) > 0)
                end = middle - 1;
        }

        return null;
    }

}
