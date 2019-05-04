package io.techiebear;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListTest {

    private static List<Integer> list;
    private static ListService service;

    @BeforeClass
    public static void setUp(){
        list = List.of(1,2,4,400,300,399,142,156,354,324);
        service = new ListService();
    }

    @Test
    public void getLargest_listOf10_400(){

        int largest = service.getLargestEl(list);
        assertEquals(largest,400);
    }

    @Test
    public void reverse_unevenList_reversedList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list = service.reverse(list);
        assertEquals(3,list.get(0).intValue());

    }

    @Test
    public void reverse_evenList_reversedList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list = service.reverse(list);
        assertEquals(4,list.get(0).intValue());

    }

}
