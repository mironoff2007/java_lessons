import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExampleTest {

    @BeforeEach
    public void beforeEach(){
        System.out.println("before each");
    }

    @AfterEach
    public void after(){
        System.out.println("after each");
    }

    @BeforeAll
    static void beforeAll(){
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("after all");
    }

    @Test
    public void test1(TestInfo testInfo) {
        System.out.println(testInfo.getTestMethod());
        int result = 1 + 1;
        assertTrue(result == 2);
    }

    @Test
    public void test2(TestInfo testInfo) {
        System.out.println(testInfo.getTestMethod());
        String result = "yes";
        assertTrue(result.equals("yes"));
    }
}