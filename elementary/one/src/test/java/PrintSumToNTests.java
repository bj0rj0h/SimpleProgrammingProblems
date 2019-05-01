import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import io.techiebear.main.ElementaryService;
import io.techiebear.util.input.InputUtilFactory;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PrintSumToNTests {

    @Parameter
    public String n;

    @Parameter(1)
    public int result;

    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {"3\n",3},{"0\n",0},{"5\n",8},
                {"2\n",0},{"17\n",60},{"-1\n",0}
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

        assertEquals(result, elementaryService.fetchSumOfNumbersUpToN());


    }

}
