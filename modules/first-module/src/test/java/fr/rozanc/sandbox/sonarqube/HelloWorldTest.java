package fr.rozanc.sandbox.sonarqube;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    private HelloWorld helloWorld;

    private ByteArrayOutputStream out;

    @BeforeEach
    void setUp() {
        out = new ByteArrayOutputStream();
        helloWorld = new HelloWorld(new PrintStream(out));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Joe", "Obiwan"})
    void should_say_hello_to_someone(final String name) {
        helloWorld.sayHello(name);
        assertEquals("Hello " + name + "!" + System.lineSeparator(), out.toString());
    }
}