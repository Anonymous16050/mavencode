package Github11;
	
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class  GitpullTest{

    @Test
    public void testHello() {
        String message = "Hello Jenkins!";
        System.out.println(message);  // You can see this in the Jenkins console
        assertEquals("Hello Jenkins!", message);
    }
}
