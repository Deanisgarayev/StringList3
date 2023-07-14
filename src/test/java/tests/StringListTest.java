package tests;

import org.example.StringList;
import org.example.StringListImpl;
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

public class StringListTest {

    private StringList out = new StringListImpl();


    @Test
    public void ShouldThrowExceptionWhenVaItemIsNull() {
            assertThrows(NullItemException.class,
                    ()-> out.add(null));
        }

@Test
    public void validateSizeTest() {
//       (size == storage.length)
            assertThrows(StorageIsFullException.class,
                    ()-> out.add(1,"hey"));
    }
@Test
    public void ShouldThrowExceptionWhenVaIndexIsNull(int index) {
//         (index < 0 || size > index)
    out.add(0, "hey");
            assertThrows(InvalidIndexException.class,
                    () -> out.get(1));

    }


        @Test
        public void shouldBeEqualWhenAddItem() {
            out.add("Hello");
            assertEquals("Hello", out.get(0));
        }


        @Test
        public void shouldBeEqualWhenAddItemAndIndex() {
            out.add(0,"Hello");
            assertEquals("Hello", out.get(0));

        }
        @Test
        public void shouldBeEqualWhenSetItemAndIndex() {
            out.set(0, "Hello");
            assertEquals("Hello", out.get(0));
        }

        @Test
        public void  shouldBeEqualWhenRemoveItem() {
            out.add(0, "Hello");
            out.add(1, "hey");
            out.remove("hey");
            assertEquals("Hello", out.get(0));
        }

        @Test
        public void  shouldBeEqualWhenRemoveIndex() {
            out.add("Hello");
            out.add("hey");
            out.remove(1);
            assertEquals("Hello", out.get(0));
        }

        @Test
        public void  shouldBeEqualWhenContainsItem() {
            out.add("Hello");
            out.add("hey");
            assertTrue( out.contains("Hello"));
        }

        @Test
        public void shouldBeEqualWhenIndexOFItem() {
        assertEquals(-1,out.indexOF("hey"));
        }

        @Test
        public void shouldBeEqualWhenLastIndexOFItem () {
            out.add( "Hello");
            out.add("hey");
            out.add("HowdyDo");
            out.add( "whatsUp");
            assertEquals(0, out.lastIndexOF("Hello"));
        }

        @Test
        public void shouldBeEqualWhenGetIndex () {
            out.add( "Hello");
            out.add("hey");
            out.add("HowdyDo");
            out.add( "whatsUp");
            assertEquals("hey", out.get(1));
        }

        @Test
        public void shouldBeEqualsWhenStringListOtherList() {
            StringList another = new StringListImpl();
            another.add( "Hello");
            another.add("hey");
            out.add( "Hello");
            out.add("hey");
            assertTrue(another.equals(out));
        }
        @Test
        public void sizeTest() {
            out.add( "Hello");
        assertEquals(1, out.size());
        }


        @Test
        public void shouldBeEqualWhenIsEmpty() {
            out.add(0, "Hello");
            out.add(1, "hey");
            out.remove(1);
            assertFalse( out.isEmpty());
            }
        @Test
        public void shouldBeNullWhenClear() {
            out.add(0, "Hello");
            out.add(1, "hey");
            out.clear();
            assertEquals(null, out.get(0));
                }
        @Test
        public void shouldBeEqualWhenToArray() {
            List<String> list = new ArrayList<>();
            list.add( "Hello");
            list.toArray();
            assertEquals("Hello" , list.get(0));
        }
    }

