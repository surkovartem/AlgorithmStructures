package com.artemsurkov.algorithmstructures.sprint1.valueFunction.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Класс для решения задачи "Значение функции".
 * Условие задачи лежит в README.md.
 * Внимательно читай условие задачи.
 * Свое решение обязательно проверь в ValueFuntionTest.
 */
public class ValueFunction {

  /**
   * Метод содержащий в себе алгоритм решения задачи.
   */
  public static int getAnswer(int a, int x, int b, int c) {
    return a * (x * x) + b * x + c;
  }

  /**
   * main класса ValueFunction.
   */
  public static void main(String[] args) throws IOException {

    StringBuilder output_result = new StringBuilder();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
    int a = Integer.parseInt(tokenizer.nextToken());
    int x = Integer.parseInt(tokenizer.nextToken());
    int b = Integer.parseInt(tokenizer.nextToken());
    int c = Integer.parseInt(tokenizer.nextToken());
    int answer = getAnswer(a, x, b, c);
    output_result.append(answer).append("\n");
    System.out.println(output_result.toString());
  }
}
