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
}
