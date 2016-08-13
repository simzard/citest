package dk.simonsteinaa.citest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void helloWorldTest() {
        assertEquals(5, 3 + 2);
    }

    @Test
    public void thisWillFailTest() {
        assertEquals(true, false);
    }
}