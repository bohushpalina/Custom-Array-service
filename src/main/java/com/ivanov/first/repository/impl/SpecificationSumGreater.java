package com.ivanov.first.repository.impl;

import com.ivanov.first.entity.IntArray;
import com.ivanov.first.repository.Specification;

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
