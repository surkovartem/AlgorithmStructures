package com.artemsurkov.algorithmstructures.sprint1.evenNotEvenNumbers.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class EvenNotEvenNumbers {
  public static String isEven(int a, int b, int c) {
    if ((a % 2 == 0 && b % 2 == 0 && c % 2 == 0) ||
        (a % 2 != 0 && b % 2 != 0 && c % 2 != 0)) {
      return "YES";
    } else {
      return "NO";
    }
  }

  public static void main(String[] args) throws IOException {
    StringBuilder output_buffer = new StringBuilder();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
    int a = Integer.parseInt(tokenizer.nextToken());
    int b = Integer.parseInt(tokenizer.nextToken());
    int c = Integer.parseInt(tokenizer.nextToken());
    output_buffer.append(isEven(a, b, c)).append("\n");
    System.out.println(output_buffer);
  }
}
