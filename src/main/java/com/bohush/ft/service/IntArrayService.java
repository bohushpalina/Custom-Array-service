package com.bohush.ft.service;
import com.bohush.ft.entity.IntArray;
import java.util.function.IntPredicate;

public interface IntArrayService {
  int findMaxElement(IntArray intArray);
  int findMinElement(IntArray intArray);
  double findAverageValue(IntArray intArray);
  long findPositiveElementsCount(IntArray intArray);
  long findNegativeElementsCount(IntArray intArray);
  void replaceIf(IntArray array, IntPredicate condition, int newValue);
}
