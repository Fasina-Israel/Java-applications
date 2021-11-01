package Stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack stack;
    @BeforeEach
    public void startEachWithThis() {
        stack = new Stack(5);
    }

    @Test

    void testThatThereIsStack(){
        assertNotNull(stack);
    }

    @Test

    void testThatYouCanAddToStack(){
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertEquals(3,stack.size());
    }

    @Test

    void testThatYouCanRemove(){
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        assertEquals(2,stack.size());
    }

    @Test
    void testThatStackCanBeEmpty(){
        stack.push(5);
        stack.pop();
        assertEquals(true,stack.isEmpty());
    }

    @Test
    void testThatStackCanBeFull(){
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(5);
        stack.push(5);
        assertEquals(true,stack.isFull());
    }



}