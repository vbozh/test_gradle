import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C1Test {

    C1 c1 = new C1();

    @Test
    public void test() {
        assertTrue(c1.s.contains("s"));
    }

}