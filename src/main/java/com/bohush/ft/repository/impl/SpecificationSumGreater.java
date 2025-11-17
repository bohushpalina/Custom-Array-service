package com.bohush.ft.repository.impl;

import com.bohush.ft.entity.IntArray;
import com.bohush.ft.repository.Specification;

public class SpecificationSumGreater implements Specification {

  private int value;

  public SpecificationSumGreater(int value) {
    this.value = value;
  }

  @Override
  public boolean specify(IntArray intArray) {
    int[] data = intArray.getData();
    int sum = 0;

    for (int i : data) {
      sum += i;
    }

    return sum > value;
  }
}
