import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class Jacoco089Test {

    @Test
    public void test() throws Exception {
        Throwable.class.getDeclaredMethod("setCause", Throwable.class).setAccessible(true);
    }
}
