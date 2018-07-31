package lt.baltictalents;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCreatorTest {
    private StringCreator creator;

    @Before
    public void setUp() throws Exception {
        creator = new StringCreator();
    }

    @Test
    public void testCreate(){
        assertEquals("abc", creator.create("ab", "c"));
        assertEquals("null", creator.create("null", ""));
    }

}