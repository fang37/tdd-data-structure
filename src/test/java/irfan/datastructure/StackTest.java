package irfan.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StackTest {

    @Test
    void pop_shouldReturnNull_whenHaveNoData() {
        Stack stack = new Stack();
        Long result = stack.pop();
        Assertions.assertEquals(null, result);
    }

    @Test
    void pop_shouldReturnTheData_whenHaveOneData() {
        Stack stack = new Stack(List.of(1L));
        Long result = stack.pop();
        Assertions.assertEquals(1, result);
    }

    @Test
    void pop_shouldReturnTheLastData_whenHaveManyData() {
        Stack stack = new Stack(List.of(1L, 2L, 3L));
        Long result = stack.pop();
        Assertions.assertEquals(3, result);
    }

    @Test
    void push_shouldAddDataToStack_whenStackIsEmpty() {
        Stack stack = new Stack();
        stack.push(1L);
        Long result = stack.pop();
        Assertions.assertEquals(1, result);
    }

    @Test
    void size_shouldReturn_stackDataSize() {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack(List.of(1L, 2L, 3L));
        Integer result1 = stack1.size();
        Integer result2 = stack2.size();

        Assertions.assertEquals(0, result1);
        Assertions.assertEquals(3, result2);
    }

    @Test
    void push_shouldAddDataToStack_whenStackIsNotEmpty() {
        Stack stack = new Stack(List.of(1L, 2L));
        stack.push(3L);
        Integer size = stack.size();
        Long result = stack.pop();
        Assertions.assertEquals(3, size);
        Assertions.assertEquals(3, result);
    }

    @Test
    void pop_shouldReturnAndDeleteTheLastData_whenStackIsNotEmpty() {
        Stack stack = new Stack(List.of(1L, 2L));
        Long result = stack.pop();
        Integer size = stack.size();
        Assertions.assertEquals(2, result);
        Assertions.assertEquals(1, size);
    }
}
