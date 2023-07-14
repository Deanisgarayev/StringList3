package tests;

import org.example.IntegerList;
import org.example.IntegerListImpl;
import org.example.exceptions.InvalidIndexException;
import org.example.exceptions.NullItemException;
import org.example.exceptions.StorageIsFullException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class IntegerListTest {

    private IntegerList out = new IntegerListImpl();


    @Test
    public void ShouldThrowExceptionWhenVaItemIsNull() {
        assertThrows(NullItemException.class,
                ()-> out.add(null));
    }

    @Test
    public void validateSizeTest() {

        assertThrows(StorageIsFullException.class,
                ()-> out.add(1,10));
    }
    @Test
    public void ShouldThrowExceptionWhenVaIndexIsNull(int index) {

        out.add(0, 10);
        assertThrows(InvalidIndexException.class,
                () -> out.get(1));

    }


    @Test
    public void shouldBeEqualWhenAddItem() {
        out.add(10);
        assertEquals(10, out.get(0));
    }


    @Test
    public void shouldBeEqualWhenAddItemAndIndex() {
        out.add(0,10);
        assertEquals(10, out.get(0));

    }
    @Test
    public void shouldBeEqualWhenSetItemAndIndex() {
        out.set(0, 10);
        assertEquals(10, out.get(0));
    }

    @Test
    public void  shouldBeEqualWhenRemoveItem() {
        out.add(0, 10);
        out.add(1, 20);
        out.remove(20);
        assertEquals(10, out.get(0));
    }

    @Test
    public void  shouldBeEqualWhenRemoveIndex() {
        out.add(10);
        out.add(20);
        out.remove(1);
        assertEquals(10, out.get(0));
    }

    @Test
    public void  shouldBeEqualWhenContainsItem() {
        out.add(10);
        out.add(20);
        assertTrue( out.contains(10));
    }

    @Test
    public void shouldBeEqualWhenIndexOFItem() {
        assertEquals(-1,out.indexOF(10));
    }

    @Test
    public void shouldBeEqualWhenLastIndexOFItem () {
        out.add( 10);
        out.add(20);
        assertEquals(0, out.lastIndexOF(10));
    }

    @Test
    public void shouldBeEqualWhenGetIndex () {
        out.add(10);
        out.add(20);
        assertEquals(20, out.get(1));
    }

    @Test
    public void shouldBeEqualsWhenIntegerListOtherList() {
        IntegerList another = new IntegerListImpl();
        another.add( 10);
        out.add( 10);
        assertTrue(another.equals(out));
    }
    @Test
    public void sizeTest() {
        out.add(10);
        assertEquals(1, out.size());
    }


    @Test
    public void shouldBeEqualWhenIsEmpty() {
        out.add(0, 10);
        assertFalse( out.isEmpty());
    }
    @Test
    public void shouldBeNullWhenClear() {
        out.add(0, 10);
        out.clear();
        assertEquals(0, out.size());
    }
    @Test
    public void shouldBeEqualWhenToArray() {
        List<Integer> list = new ArrayList<>();
        list.add( 10);
        list.toArray();
        assertEquals(10 , list.get(0));
    }
}

