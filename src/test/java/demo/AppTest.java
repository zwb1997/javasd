package demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.hamcrest.collection.ArrayMatching;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test for simple App.
 */
@Slf4j
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testWithCopyWriteList() {
        CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>(new Integer[] { 1, 3, 5, 8 });

        Iterator<Integer> iterator = numbers.iterator();

        numbers.add(10);

        List<Integer> result = new LinkedList<>();

        assertTrue(
                ArrayMatching.arrayContainingInAnyOrder(new Integer[] { 1, 3, 5, 8, 10 })
                        .matches(numbers.toArray(new Integer[5])),
                "all match");
    }

    @Test
    public void testWithCopyWriteList2() {
        CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>(new Integer[] { 1, 3, 5, 8 });

        Iterator<Integer> iterator = numbers.iterator();

        numbers.add(10);

        List<Integer> result = new LinkedList<>();

        iterator.forEachRemaining(result::add);

     
        log.info("list -> [{}]", result.toString());

        Iterator<Integer> iterator2 = numbers.iterator();
        List<Integer> result2 = new LinkedList<>();

        iterator2.forEachRemaining(result2::add);

        log.info("list2 -> [{}]", result2.toString());
    }
}
