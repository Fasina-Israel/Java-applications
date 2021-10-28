package FashDataStructure;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    List myArrayList;

    @BeforeEach
    void setUp() {
        myArrayList = new ArrayList();
    }

    @AfterEach
    void tearDown() {
    }

    @Test

    void testThatArrayListCanBeCreated(){
        myArrayList = new ArrayList();
        assertNotNull(myArrayList);
    }

    @Test

    void newArrayListIsEmpty(){
        myArrayList = new ArrayList();
        assertTrue(myArrayList.isEmpty());
    }

    @Test

    void testThatArrayListCanAdd(){
        myArrayList.add(23);
        myArrayList.add(2);
        myArrayList.add(2);
        myArrayList.add(2);
        myArrayList.add(2);
        myArrayList.add(2);
        myArrayList.add(2);
        assertEquals(7,myArrayList.size());

    }
    @Test
    void testThatWeCanDoubleTheCapacity(){
        myArrayList.add(23);
        myArrayList.add(2);
        myArrayList.add(2);
        myArrayList.add(2);
        myArrayList.add(2);
        myArrayList.add(2);
        myArrayList.add(2);
        assertEquals(12, myArrayList.getCapacity());

    }
}