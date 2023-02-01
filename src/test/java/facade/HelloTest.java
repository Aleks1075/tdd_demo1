package facade;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testHello() {
        System.out.println("Method to say hello");
        Hello hello = new Hello();
        String actual = hello.sayHello("Bob");
        String expected = "Hello, Bob";
        assertEquals(expected, actual);
    }

    @Test
    public void testWhenNull() {
        String nameNull = null;
        String expected = "Hello, my friend.";
        String result = Hello.sayHello(nameNull);
        assertEquals(expected, result);
    }

    @Test
    public void testUpperCase() {
        String nameUppercase = "JERRY";
        String expected = "HELLO, JERRY!";
        String result = Hello.sayHello(nameUppercase);
        assertEquals(expected, result);
    }

    @Test
    public void testWithTwoNames()
    {
        String [] names = {"Jill", "Jane"};
        String expected = "Hello, Jill and Jane";
        String result = Hello.sayHelloArray(names);
        assertEquals(expected, result);
    }

    @Test
    public void testWithThreeNames()
    {
        String [] names = {"Amy", "Brian", "Charlotte"};
        String expected = "Hello, Amy, Brian and Charlotte";
        String result = Hello.sayHelloArray(names);
        assertEquals(expected, result);
        System.out.println(result);
    }

    @Test
    public void testWithMixedNames() {
        String [] names = {"Amy", "BRIAN", "Charlotte"};
        String expected = "Hello, Amy and Charlotte. AND HELLO BRIAN!";
        String result = Hello.sayHelloMixedArray(names);
        assertEquals(expected, result);
        System.out.println(result);
    }

    @Test
    public void testWithStringCommas() {
        String [] names = {"Bob", "Charlie", "Dianne"};
        String expected = "Hello, Bob, Charlie, and Dianne.";
        String result = Hello.sayHelloStringCommas(names);
        assertEquals(expected, result);
        System.out.println(result);
    }

    @Test
    public void sayHelloEscapedArray() {
        String [] names = {"Bob", "\"Charlie, Dianne\""};
        String expected = "Hello, Bob and Charlie, Dianne.";
        String result = Hello.sayHelloEscapedArray(names);
        assertEquals(expected, result);
        System.out.println(result);
    }
}