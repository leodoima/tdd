package main.cap2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumbersTest {

    @Test
    @DisplayName("Teste de números romanos individuais utilizando valor I")
    public void shouldOneWithInsertI() {
        RomanNumbers romanNumbers = new RomanNumbers();
        int integerNumber = romanNumbers.translateRomanNumbers("I");

        assertEquals(1, integerNumber);
    }

    @Test
    @DisplayName("Teste de números romanos individuais utilizando valor V")
    public void shouldFiveWithInsertV() {
        RomanNumbers romanNumbers = new RomanNumbers();
        int integerNumber = romanNumbers.translateRomanNumbers("V");

        assertEquals(5, integerNumber);
    }

    @Test
    @DisplayName("Soma caracteres de mesmo tipo que estejam em duplicidade")
    public void shouldTwentyWithDoubleX() {
        RomanNumbers romanNumbers = new RomanNumbers();
        int integerNumber = romanNumbers.translateRomanNumbers("XX");

        assertEquals(20, integerNumber);
    }

    @Test
    @DisplayName("Soma caracteres diferentes")
    public void shouldFifteenWithXV() {
        RomanNumbers romanNumbers = new RomanNumbers();
        int integerNumber = romanNumbers.translateRomanNumbers("XV");

        assertEquals(15, integerNumber);
    }

    @Test
    @DisplayName("Soma caracteres diferentes e subtrai quando necessário")
    public void shouldNineWithIX() {
        RomanNumbers romanNumbers = new RomanNumbers();
        int integerNumber = romanNumbers.translateRomanNumbers("IX");

        assertEquals(9, integerNumber);
    }

    @Test
    @DisplayName("Soma de caracteres diferentes e repetidos")
    public void shouldFiftyEightWithLVIII() {
        RomanNumbers romanNumbers = new RomanNumbers();
        int integerNumber = romanNumbers.translateRomanNumbers("LVIII");

        assertEquals(58, integerNumber);
    }
}