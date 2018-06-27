package lesson12;

import java.util.*;

class ModelComparator implements Comparator<Cars>{
    public int compare(Cars s1,Cars s2){

        return s1.getCarModel().compareTo(s2.getCarModel());
    }
}