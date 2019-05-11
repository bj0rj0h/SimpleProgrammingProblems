package io.techiebear;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListTest {

    private static List<Integer> list;
    private static List<Integer> emptyList;
    private static ListService service;

    @BeforeClass
    public static void setUp(){
        emptyList = new ArrayList<>();
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

    @Test
    public void reverse_evenListOfStrings_reversedList(){
        List list = new ArrayList<>();
        list.add("Björn");
        list.add("Mr");
        list.add("Hello");
        list = service.reverse(list);
        assertEquals("Hello",list.get(0));

    }

    @Test
    public void hasElement_evenListOfStrings_true(){
        List list = new ArrayList<>();
        list.add("Björn");
        list.add("Mr");
        list.add("Hello");
        boolean result = service.hasElement(list,"Mr");
        assertEquals(true,result);

    }

    @Test
    public void reverse_evenListOfIntegers_true(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        boolean result = service.hasElement(list,3);
        assertEquals(true,result);

    }

    @Test
    public void reverse_evenListOfIntegers_false(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        boolean result = service.hasElement(list,5);
        assertEquals(false,result);

    }

    @Test
    public void returnOddsAsList_evenListOfIntegers_listOfOdds(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List result = service.returnOddsAsList(list);
        assertEquals(2,result.get(0));

    }

    @Test
    public void calculateRunningTotals_evenListOfIntegers_listOfRunningTotals(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List result = service.calculateRunningTotals(list);
        assertEquals(6,result.get(2));

    }

    @Test
    public void calculateSumWithFor_listOfIntegers_sumIs2082(){
        int result = service.calculateSumWithFor(list);
        assertEquals(2082,result);
    }

    @Test
    public void calculateSumWithWhile_listOfIntegers_sumIs2082(){
        int result = service.calculateSumWithWhile(list);
        assertEquals(2082,result);
    }

    @Test
    public void calculateSumWithRecursion_listOfIntegers_sumIs2082(){
        int result = service.calculateSumWithRecursion(list);
        assertEquals(2082,result);
    }

    @Test
    public void calculateSumWithFor_emptyList_sumIs0(){
        int result = service.calculateSumWithFor(emptyList);
        assertEquals(0,result);
    }

    @Test
    public void calculateSumWithWhile_emptyList_sumIs0(){
        int result = service.calculateSumWithWhile(emptyList);
        assertEquals(0,result);
    }

    @Test
    public void calculateSumWithRecursion_emptyList_sumIs0(){
        int result = service.calculateSumWithRecursion(emptyList);
        assertEquals(0,result);
    }

    @Test
    public void calculateSumWithFor_null_sumIs0(){
        int result = service.calculateSumWithFor(null);
        assertEquals(0,result);
    }

    @Test
    public void calculateSumWithWhile_null_sumIs0(){
        int result = service.calculateSumWithWhile(null);
        assertEquals(0,result);
    }

    @Test
    public void calculateSumWithRecursion_null_sumIs0(){
        int result = service.calculateSumWithRecursion(null);
        assertEquals(0,result);
    }

}
