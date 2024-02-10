package pl.touk.sputnik;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SquareNumberTest {
    @Test
    void shouldReturnSquareOfPositiveNumber() {
        // given
        int number = 5;
        squareNumber squareNumber = new squareNumber();

        // when
        int result = squareNumber.square(number);

        // then
        assertThat(result).isEqualTo(25);
    }
}