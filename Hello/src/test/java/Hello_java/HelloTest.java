package Hello_java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

    @Test
    public void testGreet() {
        Hello_main hello = new Hello_main();
        String result = hello.greet("Jenkins");
        assertEquals("Hello, Jenkins!", result);
    }
}
