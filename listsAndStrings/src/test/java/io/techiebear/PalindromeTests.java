package io.techiebear;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PalindromeTests {


    @Parameter
    public String input;

    @Parameter(1)
    public boolean expected;

    private static ListService listService;

    @BeforeClass
    public static void setUp(){
        listService = new ListService();
    }

    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {"anna",true},{"bosse",false},{"aliyila",true},{"mmoinmge",false}
        });
    }

    @Test
    public void test(){
        assertEquals(expected,listService.isPalindrome(input));
    }

}
