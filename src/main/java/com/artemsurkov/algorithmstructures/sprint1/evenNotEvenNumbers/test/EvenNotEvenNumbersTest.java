package com.artemsurkov.algorithmstructures.sprint1.evenNotEvenNumbers.test;

import static com.artemsurkov.algorithmstructures.sprint1.evenNotEvenNumbers.main.EvenNotEvenNumbers.isEven;
import static java.lang.System.out;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import org.opentest4j.AssertionFailedError;

/**
 * Тесты для решения задачки "Четное/не четное".
 * Time out у этой задачки равен - 1(с).
 * p.s Обратите внимания, что даже если тест получил статус [OK]
 * вероятна ошиюка TL - time limited expected, что значит -
 * алгоритм превысил установленный лимит времени.
 */
@Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
public class EvenNotEvenNumbersTest {

  final private String OK = "Тест %s [OK].";
  final private String WA = """
      Тест %s [WA] Wrong Answer.
      Ответ неверен.
      Возможная причина: Ошибка в программе или неверный алгоритм.""";

  @Test
  @DisplayName("Тест 1")
  public void test_1() {
    String expected = "NO";
    String actual = isEven(1, 2, -3);
    try {
      Assertions.assertEquals(expected, actual);
      out.printf((OK) + "%n", 1);
    } catch (AssertionFailedError assertionFailedError) {
      out.printf((WA) + "%n", 1);
      out.println(assertionFailedError.getMessage());
    }
  }

  @Test
  @DisplayName("Тест 2")
  public void test2() {
    String expected = "YES";
    String actual = isEven(7, 11, 7);
    try {
      Assertions.assertEquals(expected, actual);
      out.printf((OK) + "%n", 2);
    } catch (AssertionFailedError assertionFailedError) {
      out.printf((WA) + "%n", 2);
      out.println(assertionFailedError.getMessage());
    }
  }

  @Test
  @DisplayName("Тест 3")
  public void test3() {
    String expected = "YES";
    String actual = isEven(6, -2, 0);
    try {
      Assertions.assertEquals(expected, actual);
      out.printf((OK) + "%n", 3);
    } catch (AssertionFailedError assertionFailedError) {
      out.printf((WA) + "%n", 3);
      out.println(assertionFailedError.getMessage());
    }
  }

}
