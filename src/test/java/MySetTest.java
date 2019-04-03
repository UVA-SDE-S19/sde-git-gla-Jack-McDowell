import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class MySetTest {

    MySet set1, set2, empty;
    int[] vals1 = {3, 1, 9, 5};
    int[] vals2 = {3, 1, 9, 5, 7};

    @BeforeEach
    void setUp() {
	set1  = new MySet(vals1);
	set2  = new MySet(vals2);
	empty  = new MySet();
    }


    // This test has a silly error!  fix it!
    @Test
    //@Disabled
    void addToEmpty() {
	boolean result = empty.add(7);
        assertTrue(result);  // check return value
	assertTrue(empty.size() == 1 && empty.contains(7));  // check modified set is what we expect
    }

    // this test works!
    @Test
    //@Disabled
    void addListValuesToEmpty() {
	List<Integer> list1 = List.of(3, 1, 9, 5); // same values as in vals1 and set1
	boolean result = empty.addList(list1);
        assertTrue(result);  // check that return value is correct
	assertTrue(empty.size() == vals1.length);  // check that set is right size...
	for (int i : vals1) {  // ... and that it has the elements it should
	    assertTrue(empty.contains(i));
       }
    }

}
