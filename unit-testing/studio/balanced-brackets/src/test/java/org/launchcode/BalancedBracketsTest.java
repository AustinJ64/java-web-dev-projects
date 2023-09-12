package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    //1
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //2
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //3
    @Test
    public void nonBracketChars() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("string"));
    }

    //4
    @Test
    public void reverseBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    //5
    @Test
    public void bracketsInBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    //6
    @Test
    public void singleLeftBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    //7
    @Test
    public void singleRightBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    //8
    @Test
    public void multipleBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    //9
    @Test
    public void multipleRightBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    //10
    @Test
    public void notNestedMultiple() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    //11
    @Test
    public void concat() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("string" + "string"));
    }

    //12
    @Test
    public void nestedNotNested() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]] []"));
    }

    //13
    @Test
    public void stringFirst() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("string[]"));
    }
}