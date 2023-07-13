package tests;

import org.example.StringList;
import org.example.StringListImpl;
import org.example.exceptions.NullItemException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StringListTest {
    StringList out = new StringListImpl();

    @BeforeEach
    public void setUp() {
        StringList out = new StringListImpl();
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

            out.add("Hello");
            assertEquals("Hello", out.get(0));
        }


        @Test
        public void shouldBeEqualWhenAddItemAndIndex() {
            String[] arrays = new String[]{"1"};
            out.add(0,"1");
            assertArrayEquals(arrays, out.get(1));

        }
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
        public void shouldBeEqualsWhenStringListOtherList() {
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

