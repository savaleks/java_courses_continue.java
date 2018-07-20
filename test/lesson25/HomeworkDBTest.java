package lesson25;

import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class HomeworkDBTest {

    @Test
    public void testBuildQueryWithCriteria() {
        Map<String, String> criteria = new TreeMap<>();
        criteria.put("col1", "val1");
        assertEquals("SELECT * FROM users WHERE col1='val1'", HomeworkDB.buildQuery("users", criteria));

        criteria.put("col2", "val2");
        criteria.put("col3", "val3");
        assertEquals("SELECT * FROM users WHERE col1='val1' AND col2='val2' AND col3='val3'", HomeworkDB.buildQuery("users", criteria));
    }
}