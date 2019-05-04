package io.techiebear;

import java.util.List;

public class ListService {

    public int getLargestEl(List<Integer> someList) {

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < someList.size(); i++) {
            largest = someList.get(i) > largest ? someList.get(i) : largest;
        }
        return largest;

    }

    public List reverse(List list) {

        for (int i = 0; i < list.size() / 2; i++) {
            Object pos2 = list.get(list.size() - 1 - i);
            list.set(list.size() - i - 1, list.get(i));
            list.set(i, pos2);
        }

        return list;
    }

    public boolean hasElement(List list, Object val) {

        boolean result = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(val)){
                result =  true;
            }
        }
        return result;
    }
}
