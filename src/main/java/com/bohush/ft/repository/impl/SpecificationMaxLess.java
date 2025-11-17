package com.bohush.ft.repository.impl;
import com.bohush.ft.entity.IntArray;
import com.bohush.ft.repository.Specification;

public class SpecificationMaxLess implements Specification {
  private int value;

  public SpecificationMaxLess(int value) {
    this.value = value;
  }

  @Override
  public boolean specify(IntArray intArray) {
    int[] data = intArray.getData();

    if (data.length == 0) {
      return false;
    }

    int max = data[0];
    for (int i : data) {
      if (i > max) {
        max = i;
      }
    }
    return max < value;
  }
}
