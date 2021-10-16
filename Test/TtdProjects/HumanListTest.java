package TtdProjects;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class HumanListTest {

    HumanList human;

    @BeforeEach
    void setUp() {
        human = new HumanList();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatHumanHasNames() {
        human.setNames("john");
        human.setNames("favour");
        human.setNames("jerry");
        assertEquals(3, human.getNames().size());
    }

    @Test
    void testThatHumanNamesCanBeRemoved() {
        human.setNames("john");
        human.setNames("favour");
        human.setNames("jerry");
        assertEquals(3, human.getNames().size());
        human.removeNames(2);
        assertEquals(2, human.getNames().size());
    }

    @Test
    void testThatHumanCanModifyNames() {
        human.setNames("john");
        human.setNames("favour");
        human.setNames("jerry");
        assertEquals(3, human.getNames().size());
        human.removeNames(2);
        assertEquals(2, human.getNames().size());
        human.modifyNames(1,"Toye");


    }
    @Test

    void testThatNamesCanBeDeleted(){
        human.setNames("john");
        human.setNames("favour");
        human.setNames("jerry");
        assertEquals(3, human.getNames().size());
        human.removeNames(2);
        assertEquals(2, human.getNames().size());
        human.modifyNames(1,"Toye");
        human.deleteNames(1);
        assertEquals(1,human.getNames().size());

    }

    @Test

    void testThatNamesCanBeFound(){
        human.setNames("biola");
        human.setNames("fola");
        human.setNames("bryan");
        human.setNames("schmeicel");
        human.setNames("kim");
        human.setNames("Bayo");
        human.setNames("Segun");
        assertEquals("bryan",human.findItem("bryan"));
    }
}

