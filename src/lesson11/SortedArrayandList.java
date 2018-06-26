package lesson11;

import java.util.*;

//namu darbas su paaiskinimais.

public class SortedArrayandList {
    public static void main(String[] args) {
        int[] arr = {-3, 5, 6, 4, 5};
        System.out.println("Sorting:" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After: " + Arrays.toString(arr));

        List<Integer> arrList = new ArrayList<>();

        for(int i : arr){
            arrList.add(i);
        }
        Collections.shuffle(arrList); //surikioja atsitiktiniu budu.
        System.out.println("List before: " + arrList);

        Collections.sort(arrList, Comparator.reverseOrder());
        System.out.println("After sorting: " + arrList);
    }

}
