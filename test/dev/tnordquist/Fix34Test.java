package dev.tnordquist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Should pass the method parameters provided by the fix34 method")
class Fix34Test {

  private static final int[] INPUT_ARR_1 = {1, 3, 1, 4};
  private static final int[] EXPECTED_ARR_1 = {1, 3, 4, 1};
  private static final int[] INPUT_ARR_2 = {1, 3, 1, 4, 4, 3, 1};
  private static final int[] EXPECTED_ARR_2 = {1, 3, 4, 1, 1, 3, 4};
  private static final int[] INPUT_ARR_3 = {3, 2, 2, 4};
  private static final int[] EXPECTED_ARR_3 = {3, 4, 2, 2};
  private static final int[] INPUT_ARR_4 = {3, 4, 1};
  private static final int[] EXPECTED_ARR_4 = {3, 4, 1};
  @DisplayName("Should calculate the correct array output")
  @ParameterizedTest(name = "{index} => input={0}, output={1}")
  @MethodSource("fix34")
   void fix34(int[] input, int[] output) {
    assertEquals(output, Fix34.fix34(input));
  }

  private static Stream<Arguments> fix34() {
    return Stream.of(
        Arguments.of(INPUT_ARR_1, EXPECTED_ARR_1),
        Arguments.of(INPUT_ARR_2, EXPECTED_ARR_2),
        Arguments.of(INPUT_ARR_3, EXPECTED_ARR_3),
        Arguments.of(INPUT_ARR_4,EXPECTED_ARR_4)

    );

  }
}