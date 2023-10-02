package main.cap2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumbersTest {

    private RomanNumbers romanNumbers;

    @BeforeEach
    public void init() {
        this.romanNumbers = new RomanNumbers();
    }

    @Test
    @DisplayName("Validar retorno para caracteres individuais utilizando conceito de classe de equivalência (quando um mesmo teste torna-se mais abrangente; menos específico)")
    public void shouldCorrespondentValueForIndivualInsertCaracters() {
        assertEquals(1, this.romanNumbers.translateRomanNumbers("I"));
        assertEquals(5, this.romanNumbers.translateRomanNumbers("V"));
    }

    @Test
    @DisplayName("Soma de múltiplos caracteres utilizando conceito de classe de equivalência")
    public void shouldCorrespondentValueForMultipleInsertsCaracters() {
        assertEquals(20, this.romanNumbers.translateRomanNumbers("XX"));
        assertEquals(15, this.romanNumbers.translateRomanNumbers("XV"));
    }

    @Test
    @DisplayName("Soma caracteres diferentes e subtrai quando necessário")
    public void shouldCorrespondentValueForArithmeticExpression() {
        assertEquals(9, this.romanNumbers.translateRomanNumbers("IX"));
        assertEquals(14, this.romanNumbers.translateRomanNumbers("XIV"));
    }

    @Test
    @DisplayName("Soma de diferentes inserts com múltiplos caracteres")
    public void shouldCorrespondetValueForMultiplesInserts() {
        assertEquals(19, romanNumbers.translateRomanNumbers("XIX"));
        assertEquals(36, romanNumbers.translateRomanNumbers("XXXVI"));
        assertEquals(58, romanNumbers.translateRomanNumbers("LVIII"));
    }
}