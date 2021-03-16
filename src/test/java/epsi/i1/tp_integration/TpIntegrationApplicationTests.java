package epsi.i1.tp_integration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TpIntegrationApplicationTests {

    @Test
    void testCalculer() {
        assertEquals(2,COVIDLib.addition(1,1));
    }

}
