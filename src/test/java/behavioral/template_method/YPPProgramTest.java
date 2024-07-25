package behavioral.template_method;

import org.junit.jupiter.api.Test;


class YPPProgramTest {
    @Test
    void testYPP2() {
        YPPProgram ypp2 = new YPP2();
        ypp2.run();

    }

    @Test
    void testYPP3() {
        YPPProgram ypp3 = new YPP3();
        ypp3.run();
    }

}