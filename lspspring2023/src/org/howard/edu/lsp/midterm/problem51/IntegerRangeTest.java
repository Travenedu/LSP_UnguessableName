package org.howard.edu.lsp.midterm.problem51;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class IntegerRangeTest {

    @Test
    public void testContains(){
    IntegerRange range1 = new IntegerRange(0,20);
    IntegerRange range2 = new IntegerRange(0,30);

    assertTrue(range1.contains(5));
    assertTrue(range2.contains(5));
    assertFalse(range2.contains(-5));
    }

    @Test
    public void testOverlaps() throws EmptyRangeException{
        IntegerRange range1 = new IntegerRange(0,20);
        IntegerRange range2 = new IntegerRange(0,30);
        IntegerRange range3 = new IntegerRange(-20,-10);
        IntegerRange range4 = new IntegerRange(0,0);
        IntegerRange range5 = new IntegerRange(10,0);

        assertTrue(range1.overlaps(range2));
        assertTrue(range1.overlaps(range3));
        assertTrue(range2.overlaps(range3));

        EmptyRangeException thrown = assertThrows(EmptyRangeException.class, () -> {
            range4.overlaps(range5);
        });
    }

    @Test
    public void testSize(){
        IntegerRange range1 = new IntegerRange(0,20);
        IntegerRange range2 = new IntegerRange(0,30);
        IntegerRange range3 = new IntegerRange(-10,-1);
       
        assertEquals(21, range1.size());
        assertEquals(31, range2.size());
        assertEquals(10, range3.size());

    }
}