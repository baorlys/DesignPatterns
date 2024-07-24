package structural.decorator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IPhoTest {
    IPho pho;
    @BeforeEach
    void setUp() {
        pho = new PhoChicken();
    }

    @Test
    // @DisplayName("Serving Pho with chicken")
    void testPhoChicken() {
        assertEquals("Serving Pho with chicken", pho.serve());
    }

    @Test
    // @DisplayName("Serving Pho with chicken and onion")
    void testPhoChickenOnion() {
        pho = new OnionDecorator(pho);
        assertEquals("Serving Pho with chicken with onion", pho.serve());
    }

    @Test
    // @DisplayName("Serving Pho with chicken and pepper")
    void testPhoChickenOnionBeef() {
        pho = new PepperDecorator(pho);
        assertEquals("Serving Pho with chicken with pepper", pho.serve());
    }
}