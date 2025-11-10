package com.ivanov.first.service.impl;
import com.ivanov.first.customarray.IntArray;
import com.ivanov.first.service.IntArrayService;
import java.util.function.IntPredicate;

public class IntArrayServiceImpl implements IntArrayService {

  @Override
  public int findMaxElement(IntArray intArray) {
    int size = intArray.getSize();
    int[] data = intArray.getData();

    int max = data[0];
    for (int i = 0; i < size; ++i)
    {
      if (data[i] > max)
      {
        max = data[i];
      }
    }
    return max;
  }

  @Override
  public int findMinElement(IntArray intArray) {
    int size = intArray.getSize();
    int[] data = intArray.getData();

    int min = data[0];
    for (int i = 0; i < size; ++i)
    {
      if (data[i] < min)
      {
        min = data[i];
      }
    }
    return min;
  }

  @Override
  public double findAverageValue(IntArray intArray) {
    int size = intArray.getSize();
    int[] data = intArray.getData();

    double sum = 0;
    for (int i = 0; i < size; ++i)
    {
      sum += data[i];
    }
    return sum / size;
  }

  @Override
  public int findPositiveElementsCount(IntArray intArray) {
    int size = intArray.getSize();
    int[] data = intArray.getData();

    int count = 0;
    for (int i = 0; i < size; ++i)
    {
      if (data[i] > 0)
      {
        count += 1;
      }
    }
    return count;
  }

  @Override
  public int findNegativeElementsCount(IntArray intArray) {
    int size = intArray.getSize();
    int[] data = intArray.getData();

    int count = 0;
    for (int i = 0; i < size; ++i)
    {
      if (data[i] < 0)
      {
        count += 1;
      }
    }
    return count;
  }

  @Override
  public void replaceIf(IntArray array, IntPredicate condition, int newValue) {
    int[] data = array.getData();
    int size = array.getSize();

    for (int i = 0; i < size; i++) {
      if (condition.test(data[i])) {
        data[i] = newValue;
      }
    }
  }
}
