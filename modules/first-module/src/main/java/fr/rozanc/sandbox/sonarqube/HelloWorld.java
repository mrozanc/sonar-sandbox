package fr.rozanc.sandbox.sonarqube;

import java.io.PrintStream;

public class HelloWorld {

    private final PrintStream out;

    public HelloWorld() {
        this(System.out);
    }

    public HelloWorld(final PrintStream out) {
        this.out = out;
    }

    public void sayHello() {
        sayHello("World");
    }

    public void sayHello(final String name) {
        out.println("Hello " + name + "!");
    }
}
