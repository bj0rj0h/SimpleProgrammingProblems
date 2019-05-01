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
public class PrintAliceOrBobTests {

    @Parameter
    public String name;

    @Parameter(1)
    public String result;

    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {"Alice","Alice"},{"alice","Alice"},{"AlIcE","Alice"},
                {"Bob","Bob"},{"bob","Bob"},{"bOB","Bob"},
                {"Kalle", ElementaryService.NOT_ALICE_NOT_BOB_ERROR},{"", ElementaryService.NOT_ALICE_NOT_BOB_ERROR}
        });
    }

    private static ElementaryService elementaryService;

    @BeforeClass
    public static void setUp(){
        elementaryService = new ElementaryService(InputUtilFactory.getNewInstance());
    }

    @Test
    public void printIfAliceOrBob_Collection_AliceOrBobReturned(){

        InputStream in = new ByteArrayInputStream(name.getBytes());
        System.setIn(in);

        assertEquals(result, elementaryService.checkIfAliceOrBob(name));


    }

}
