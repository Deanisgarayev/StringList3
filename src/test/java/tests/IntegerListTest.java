package tests;

import org.example.IntegerList;
import org.example.IntegerListImpl;
import org.example.exceptions.NullItemException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class IntegerListTest {
    IntegerList out = new IntegerListImpl();

    @BeforeEach
    public void setUp() {
        IntegerList out = new IntegerListImpl();
    }
    @Test
    public void ShouldThrowExceptionWhenVaItemIsNull() {
            assertThrows(NullItemException.class,
                    ()-> out.add(null));
        }

//@Test
//    public void validateSizeTest() {
//        if (size == storage.length) {
//            throw new StorageIsFullException();
//        }
//    }
////@Test
//    public void ShouldThrowExceptionWhenVaIndexIsNull(int index) {
//        if (index < 0 || size > index) {
//            throw new InvalidIndexException();
//        }
//    }


        @Test
        public void shouldBeEqualWhenAddItem() {

            out.add(1);
            assertEquals("Hello", out.get(0));
        }


//        @Test
//        public void shouldBeEqualWhenAddItemAndIndex() {
//            Integer[] arrays = new Integer[]{"1"};
//            out.add(0,"1");
//            assertArrayEquals(arrays, out.get(1));

//        }
        @Test
        public void shouldBeEqualWhenSetItemAndIndex() {
        }

        @Test
        public void  shouldBeEqualWhenRemoveItem() {
        }

        @Test
        public void  shouldBeEqualWhenRemoveIndex() {
        }

        @Test
        public void  shouldBeEqualWhenContainsItem() {
        }

        @Test
        public void shouldBeEqualWhenIndexOFItem() {
        }

        @Test
        public void shouldBeEqualWhenLastIndexOFItem () {
        }

        @Test
        public void shouldBeEqualWhenGetIndex () {
        }

        @Test
        public void shouldBeEqualsWhenIntegerListOtherList() {
        }


        @Test
        public void shouldBeEqualWhenIsEmpty() {
            }
        @Test
        public void shouldBeNullWhenClear() {
                }
        @Test
        public void shouldBeEqualWhenToArray() {
        }
    }

