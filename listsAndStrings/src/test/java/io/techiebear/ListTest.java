package io.techiebear;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ListTest {

    public static List<Integer> list;

    @BeforeClass
    public static void setUp(){
        list = List.of(1,2,4,400,300,399,142,156,354,324);
    }

    @Test
    public void getLargest_listOf10_400(){
        ListService service = new ListService();
        int largest = service.getLargestEl(list);
        assertEquals(largest,400);
    }
    
}
