package irfan.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StackTest {

    @Test
    void pop_shouldReturnNull_whenHaveNoData() {
        Stack stack = new Stack();
        Object result = stack.pop();
        Assertions.assertEquals(null, result);
    }

    @Test
    void pop_shouldReturnTheData_whenHaveOneData() {
        Stack stack = new Stack(List.of(1L));
        Object result = stack.pop();
        Assertions.assertEquals(1L, result);
    }

    @Test
    void pop_shouldReturnTheLastData_whenHaveManyData() {
        Stack stack = new Stack(List.of(1L, 2L, 3L));
        Object result = stack.pop();
        Assertions.assertEquals(3L, result);
    }

    @Test
    void push_shouldAddDataToStack_whenStackIsEmpty() {
        Stack stack = new Stack();
        stack.push(1L);
        Object result = stack.pop();
        Assertions.assertEquals(1L, result);
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
        Object result = stack.pop();
        Assertions.assertEquals(3, size);
        Assertions.assertEquals(3L, result);
    }

    @Test
    void pop_shouldReturnAndDeleteTheLastData_whenStackIsNotEmpty() {
        Stack stack = new Stack(List.of(1L, 2L));
        Object result = stack.pop();
        Integer size = stack.size();
        Assertions.assertEquals(2L, result);
        Assertions.assertEquals(1, size);
    }

    @Test
    void peek_shouldReturnLastDataWithoutDeleteIt_whenStackIsNotEmpty() {
        Stack stack = new Stack(List.of(1L, 2L, 3L));
        Object result = stack.peek();
        Integer size = stack.size();
        Assertions.assertEquals(3L, result);
        Assertions.assertEquals(3, size);
    }

    @Test
    void peek_shouldReturnNull_whenStackIsEmpty() {
        Stack stack = new Stack();
        Object result = stack.peek();
        Assertions.assertEquals(null, result);
    }

    @Test
    void clear_shouldDeleteAllData_whenStackIsNotEmpty() {
        Stack stack = new Stack(List.of(1L, 2L, 3L, 4L, 5L));
        stack.clear();
        Integer result = stack.size();
        Assertions.assertEquals(0, result);
    }

    @Test
    void clear_shouldNotError_whenStackIsEmpty() {
        Stack stack = new Stack();
        stack.clear();
        Integer result = stack.size();
        Assertions.assertEquals(0, result);
    }

    @Test
    void stack_shouldReceiveGenericDataType() {
        Stack<String> stackString = new Stack();
        Stack<Integer> stackInteger = new Stack();
        Stack<Boolean> stackBoolean = new Stack();

        Assertions.assertNotNull(stackString);
        Assertions.assertNotNull(stackInteger);
        Assertions.assertNotNull(stackBoolean);
    }

    @Test
    void push_shouldReceiveTheInitiatedDataType() {
        Stack<String> stackString = new Stack();
        Stack<Integer> stackInteger = new Stack();
        Stack<Boolean> stackBoolean = new Stack();

        stackString.push("first");
        stackInteger.push(1);
        stackBoolean.push(true);

        String result1 = stackString.peek();
        Integer result2 = stackInteger.peek();
        Boolean result3 = stackBoolean.peek();

        Assertions.assertEquals("first", result1);
        Assertions.assertEquals(1, result2);
        Assertions.assertEquals(true, result3);
    }

    @Test
    void pop_shouldReturnTheInitiatedDataType() {
        Stack<String> stackString = new Stack();
        Stack<Integer> stackInteger = new Stack();
        Stack<Boolean> stackBoolean = new Stack();

        stackString.push("first");
        stackInteger.push(1);
        stackBoolean.push(true);

        String result1 = stackString.pop();
        Integer result2 = stackInteger.pop();
        Boolean result3 = stackBoolean.pop();

        Assertions.assertEquals("first", result1);
        Assertions.assertEquals(1, result2);
        Assertions.assertEquals(true, result3);
    }
}
