package DataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    List myArrayList;

    @BeforeEach
    public void startEachTestWith() {
        myArrayList = new ArrayList();
    }

    @Test
    public void arrayListCanBeCreated() {
        List myArrayList = new ArrayList();
        assertNotNull(myArrayList);
    }

    @Test
    public void newArrayListIsEmptyTest() {
        List myArrayList = new ArrayList();
        assertTrue(myArrayList.isEmpty());
    }
    @Test

    public void addElement_ArrayListShouldNotBeEmpty() {
        //when
        myArrayList.add(34);
        //assert
        assertFalse(myArrayList.isEmpty());
    }

    @Test

    public void addXRemoveX_ArrayListShouldBeEmpty() {
        //when
        myArrayList.add(34);
        myArrayList.remove(34);
        //assert
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void addXAndY_removeY_arrayShouldNotBeEmpty() {
        //when
        myArrayList.add(34);
        myArrayList.add(45);
        myArrayList.remove(45);
        //assert
        assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void removeFromEmptyArrayList_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> myArrayList.remove(23));
    }

    @Test
    public void addElement_arrayListSizeincreases() {
        myArrayList.add(34);
        assertEquals(1, myArrayList.size());
    }

    @Test
    public void addTwoElements_arrayListSizeIncreases() {
        myArrayList.add(34);
        myArrayList.add(45);
        assertEquals(2, myArrayList.size());
    }

    @Test
    public void replaceElementInArrayList() {
        myArrayList.add(34);
        myArrayList.add(94, 0);
        assertEquals(94, myArrayList.get(0));
    }

    @Test
    public void addThreeElement_getSecondByIndex() {
        myArrayList.add(34);
        myArrayList.add(32);
        myArrayList.add(99);

        assertEquals(32, myArrayList.get(1));
    }

    @Test
    public void getTheIndexOfElement() {
        myArrayList.add(34);
        myArrayList.add(45);
        myArrayList.add(90);

        assertEquals(0, myArrayList.getIndexOf(32));
    }

    @Test

    public void addXYZ_removeY_ZShouldBeAfterX(){
        myArrayList.add(34);
        myArrayList.add(32);
        myArrayList.add(39);
        assertEquals(32,myArrayList.get(1));
        myArrayList.remove(32);
        assertEquals(39,myArrayList.get(1));
        assertEquals(2,myArrayList.size());
        myArrayList.add(21);
        assertEquals(3,myArrayList.size());
        assertEquals(21,myArrayList.get(2));
        System.out.println(myArrayList.get(2));



    }
    @Test

    public void testThatAfterDeletingAnObjectTheNextOneReplaceTheIndex(){
        assertEquals(6,myArrayList.getCapacity());
        myArrayList.add(34);
        myArrayList.add(32);
        myArrayList.add(99);
       assertEquals(32, myArrayList.get(1));
       myArrayList.remove(32);
       assertEquals(99,myArrayList.get(1));
       assertEquals(2,myArrayList.size());
        myArrayList.add(21);
        assertEquals(3,myArrayList.size());
        assertEquals(21,myArrayList.get(2));
        System.out.println(myArrayList);
    }
}
