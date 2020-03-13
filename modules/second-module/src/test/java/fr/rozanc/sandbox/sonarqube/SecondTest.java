package fr.rozanc.sandbox.sonarqube;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondTest {

    private ByteArrayOutputStream out;

    @BeforeEach
    void setUp() {
        out = new ByteArrayOutputStream();
    }

    @Test
    void should_print_hello() {
        final PrintStream stdout = System.out;
        try {
            System.setOut(new PrintStream(out));
            final HelloWorld helloWorld = new HelloWorld();
            helloWorld.sayHello();
            assertEquals("Hello World!" + System.lineSeparator(), out.toString());
        } finally {
            System.setOut(stdout);
        }
    }

    @Test
    void should_say_hello() {
        final HelloWorld helloWorld = new HelloWorld(new PrintStream(out));
        helloWorld.sayHello();
        assertEquals("Hello World!" + System.lineSeparator(), out.toString());
    }
}
