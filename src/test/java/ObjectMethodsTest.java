import org.junit.jupiter.api.*;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ObjectMethodsTest {

    private class MyObject {

        public int number;

        public MyObject(int number) {
            this.number = number;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MyObject myObject = (MyObject) o;
            return number == myObject.number;
        }

        @Override
        public int hashCode() {
            return Objects.hash(number);
        }
    }

    @Test
    public void testHashCode(TestInfo testInfo) {
        System.out.println(testInfo.getTestMethod());

        int code1 = new MyObject(1).hashCode();
        int code2 = new MyObject(1).hashCode();
        assertEquals(code1, code2);
    }

    @Test
    public void testEquals(TestInfo testInfo) {
        System.out.println(testInfo.getTestMethod());

        MyObject object1 = new MyObject(1);
        MyObject object2 = new MyObject(1);
        assertEquals(object1.equals(object2), true);
    }

    @Test
    public void testEqualsObject(TestInfo testInfo) {
        System.out.println(testInfo.getTestMethod());

        Object object1 = new Object();
        Object object2 = new Object();
        assertEquals(object1.equals(object2), false);
    }


}