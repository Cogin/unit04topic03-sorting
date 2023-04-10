import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class StringListSortTest {
    @Test
    public void testSelectionSort() {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "g", "f", "e", "h", "i", "j"));
        StringListSort.SelectionSort(list);
        assertEquals(list, new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j")));
    }
    @Test
    public void testInsertionSort() {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("b", "a", "c", "d", "g", "f", "e", "h", "i", "j"));
        StringListSort.InsertionSort(list);
        assertEquals(list, new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j")));
    }
}
