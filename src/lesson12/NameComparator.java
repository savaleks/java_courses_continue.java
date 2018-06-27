package lesson12;

import java.util.*;

class NameComparator implements Comparator<Cars>{
    public int compare(Cars s1,Cars s2){
        return s1.getCarOwnerName().compareTo(s2.getCarOwnerName());
    }
}
