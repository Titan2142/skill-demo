import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class SkillDemoTest {
    @Test
    public void addition() {
        assertEquals(2, SkillDemo.add(1, 1));
    }

    @Transient
    public void add2() {
        assertEquals("second test", 3, SkillDemo.add(1, 2));
    }
}
