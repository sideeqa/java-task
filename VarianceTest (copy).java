import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;



    @Test
    public void testThatLengthIsChecked(){
    Variance variance = new Variance();
    int expectedLength = variance .getLength(numbers);
    int actualLength = 6;
    assertEquals(expectedLength, actualLength);
 }
