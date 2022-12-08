package com.artemsurkov.algorithmstructures.sprint1.valueFunction.test;

import static com.artemsurkov.algorithmstructures.sprint1.valueFunction.main.ValueFunction.getAnswer;
import static java.lang.System.out;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import org.opentest4j.AssertionFailedError;

/**
 * Тесты для решения задачки "Значение числа".
 * Time out у этой задачки равен - 400(мс).
 * p.s Обратите внимания, что даже если тест получил статус [OK]
 * вероятна ошиюка TL - time limited expected, что значит -
 * алгоритм превысил установленный лимит времени.
 */
@Timeout(value = 400, unit = TimeUnit.MILLISECONDS)
public class ValueFunctionTest {

  final private String OK = "Тест %s [OK].";
  final private String WA = """
      Тест %s [WA] Wrong Answer.
      Ответ неверен.
      Возможная причина: Ошибка в программе или неверный алгоритм.""";

  @Test
  @DisplayName("Тест 1")
  public void test_1() {
    int expected = -183;
    int actual = getAnswer(-8, -5, -2, 7);
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
    int expected = 40;
    int actual = getAnswer(8, 2, 9, -10);
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
    int expected = 348;
    int actual = getAnswer(9, -6, -4, 0);
    try {
      Assertions.assertEquals(expected, actual);
      out.printf((OK) + "%n", 3);
    } catch (AssertionFailedError assertionFailedError) {
      out.printf((WA) + "%n", 3);
      out.println(assertionFailedError.getMessage());
    }
  }

  @Test
  @DisplayName("Тест 4")
  public void test4() {
    int expected = 41;
    int actual = getAnswer(9, 2, -1, 7);
    try {
      Assertions.assertEquals(expected, actual);
      out.printf((OK) + "%n", 4);
    } catch (AssertionFailedError assertionFailedError) {
      out.printf((WA) + "%n", 4);
      out.println(assertionFailedError.getMessage());
    }
  }

  @Test
  @DisplayName("Тест 5")
  public void test5() {
    int expected = 260;
    int actual = getAnswer(2, -10, -5, 10);
    try {
      Assertions.assertEquals(expected, actual);
      out.printf((OK) + "%n", 5);
    } catch (AssertionFailedError assertionFailedError) {
      out.printf((WA) + "%n", 5);
      out.println(assertionFailedError.getMessage());
    }
  }

  @Test
  @DisplayName("Тест 6")
  public void test6() {
    int expected = 133;
    int actual = getAnswer(9, -4, 4, 5);
    try {
      Assertions.assertEquals(expected, actual);
      out.printf((OK) + "%n", 6);
    } catch (AssertionFailedError assertionFailedError) {
      out.printf((WA) + "%n", 6);
      out.println(assertionFailedError.getMessage());
    }
  }

  @Test
  @DisplayName("Тест 7")
  public void test7() {
    int expected = -38;
    int actual = getAnswer(-2, 6, 5, 4);
    try {
      Assertions.assertEquals(expected, actual);
      out.printf((OK) + "%n", 7);
    } catch (AssertionFailedError assertionFailedError) {
      out.printf((WA) + "%n", 7);
      out.println(assertionFailedError.getMessage());
    }
  }

  @Test
  @DisplayName("Тест 8")
  public void test8() {
    int expected = -510;
    int actual = getAnswer(-10, -7, 4, 8);
    try {
      Assertions.assertEquals(expected, actual);
      out.printf((OK) + "%n", 8);
    } catch (AssertionFailedError assertionFailedError) {
      out.printf((WA) + "%n", 8);
      out.println(assertionFailedError.getMessage());
    }
  }

  @Test
  @DisplayName("Тест 9")
  public void test9() {
    int expected = -102393069;
    int actual = getAnswer(-109, -968, 265, -933);
    try {
      Assertions.assertEquals(expected, actual);
      out.printf((OK) + "%n", 9);
    } catch (AssertionFailedError assertionFailedError) {
      out.printf((WA) + "%n", 9);
      out.println(assertionFailedError.getMessage());
    }
  }

  @Test
  @DisplayName("Тест 10")
  public void test10() {
    int expected = 109539955;
    int actual = getAnswer(635, 416, -842, -333);
    try {
      Assertions.assertEquals(expected, actual);
      out.printf((OK) + "%n", 10);
    } catch (AssertionFailedError assertionFailedError) {
      out.printf((WA) + "%n", 10);
      out.println(assertionFailedError.getMessage());
    }
  }

  @Test
  @DisplayName("Тест 11")
  public void test11() {
    int expected = -159746539;
    int actual = getAnswer(-794, 449, 722, 477);
    try {
      Assertions.assertEquals(expected, actual);
      out.printf((OK) + "%n", 11);
    } catch (AssertionFailedError assertionFailedError) {
      out.printf((WA) + "%n", 11);
      out.println(assertionFailedError.getMessage());
    }
  }

  @Test
  @DisplayName("Тест 12")
  public void test12() {
    int expected = -306499157;
    int actual = getAnswer(-731, -648, -696, -341);
    try {
      Assertions.assertEquals(expected, actual);
      out.printf((OK) + "%n", 12);
    } catch (AssertionFailedError assertionFailedError) {
      out.printf((WA) + "%n", 12);
      out.println(assertionFailedError.getMessage());
    }
  }

  @Test
  @DisplayName("Тест 13")
  public void test13() {
    int expected = -262447899;
    int actual = getAnswer(-731, 599, -276, 956);
    try {
      Assertions.assertEquals(expected, actual);
      out.printf((OK) + "%n", 13);
    } catch (AssertionFailedError assertionFailedError) {
      out.printf((WA) + "%n", 13);
      out.println(assertionFailedError.getMessage());
    }
  }

  @Test
  @DisplayName("Тест 14")
  public void test14() {
    int expected = 40;
    int actual = getAnswer(0, 5, 8, 0);
    try {
      Assertions.assertEquals(expected, actual);
      out.printf((OK) + "%n", 14);
    } catch (AssertionFailedError assertionFailedError) {
      out.printf((WA) + "%n", 14);
      out.println(assertionFailedError.getMessage());
    }
  }

  @Test
  @DisplayName("Тест 15")
  public void test15() {
    int expected = 0;
    int actual = getAnswer(0, 5, 0, 0);
    try {
      Assertions.assertEquals(expected, actual);
      out.printf((OK) + "%n", 15);
    } catch (AssertionFailedError assertionFailedError) {
      out.printf((WA) + "%n", 15);
      out.println(assertionFailedError.getMessage());
    }
  }

  @Test
  @DisplayName("Тест 16")
  public void test16() {
    int expected = 3;
    int actual = getAnswer(1, 1, 1, 1);
    try {
      Assertions.assertEquals(expected, actual);
      out.printf((OK) + "%n", 16);
    } catch (AssertionFailedError assertionFailedError) {
      out.printf((WA) + "%n", 16);
      out.println(assertionFailedError.getMessage());
    }
  }

  @Test
  @DisplayName("Тест 17")
  public void test17() {
    int expected = 2;
    int actual = getAnswer(1, 1, 1, 0);
    try {
      Assertions.assertEquals(expected, actual);
      out.printf((OK) + "%n", 17);
    } catch (AssertionFailedError assertionFailedError) {
      out.printf((WA) + "%n", 17);
      out.println(assertionFailedError.getMessage());
    }
  }

  @Test
  @DisplayName("Тест 18")
  public void test18() {
    int expected = 77;
    int actual = getAnswer(0, 1, 0, 77);
    try {
      Assertions.assertEquals(expected, actual);
      out.printf((OK) + "%n", 18);
    } catch (AssertionFailedError assertionFailedError) {
      out.printf((WA) + "%n", 18);
      out.println(assertionFailedError.getMessage());
    }
  }

  @Test
  @DisplayName("Тест 19")
  public void test19() {
    int expected = 77;
    int actual = getAnswer(0, 1, 0, 77);
    try {
      Assertions.assertEquals(expected, actual);
      out.printf((OK) + "%n", 19);
    } catch (AssertionFailedError assertionFailedError) {
      out.printf((WA) + "%n", 19);
      out.println(assertionFailedError.getMessage());
    }
  }
}
