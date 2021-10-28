//package Practise;
//
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class StackTest {
//
//    Stack myStack;
//
//    @BeforeEach
//    void setUp() {
//        myStack = new Stack();
//    }
//
//    @AfterEach
//    void tearDown() {
//    }
//
//    @Test
//    void testThatMyStackCanBeCreated(){
//        assertNotNull(myStack);
//    }
//
//    @Test
//    void testThatMyStackCanAdd(){
//        myStack.push(3);
//        assertEquals(1,myStack.size());
//    }
//
//    @Test
//    void testThatMyStackCanAddMoreThan1(){
//        myStack.push(3);
//        myStack.push(3);
//        myStack.push(3);
//        myStack.push(3);
//        assertEquals(4,myStack.size());
//    }
//    @Test
//    void testThatMyStackCanbeEmpty(){
//        myStack.push(3);
//        myStack.push(3);
//        myStack.push(3);
//        myStack.push(3);
//        myStack.pop(3);
//        myStack.pop(3);
//        myStack.pop(3);
//        myStack.pop(3);
//        assertEquals(true,myStack.isEmpty());
//        assertTrue(myStack.isEmpty());
//    }
//    @Test
//
//    void removingFromAnEmptyCanThrowError(){
//        assertTrue(myStack.isEmpty());
//        assertThrows(Stack.UnderFlowException.class, myStack.pop());
//
//    }
//
//
//}
