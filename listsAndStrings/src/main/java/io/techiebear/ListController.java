package io.techiebear;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListController {



    public void go(){
        ListService listService = new ListService();
        List<Integer> list = new ArrayList<>();
        Random rn = new Random();

        for (int i = 0; i < 100; i++) {
            list.add(rn.nextInt());
        }
        int largest = listService.getLargestEl(list);
        System.out.println("Largest: " + largest);
    }
}
