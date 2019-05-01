import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import main.ElementaryService;
import util.input.InputUtilFactory;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PrintFactorialOfNTests {

    @Parameter
    public String n;

    @Parameter(1)
    public int result;

    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {"3\n",6},{"12\n",479001600},{"7\n",5040}
        });
    }

    private static ElementaryService elementaryService;

    @BeforeClass
    public static void setUp(){
        elementaryService = new ElementaryService(InputUtilFactory.getNewInstance());
    }

    @Test
    public void printIfAliceOrBob_Collection_AliceOrBobReturned(){

        InputStream in = new ByteArrayInputStream(n.getBytes());
        System.setIn(in);

        assertEquals(result, elementaryService.fetchMultipleOfNumbersUpToN());


    }

}
