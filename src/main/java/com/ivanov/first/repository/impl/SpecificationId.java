package com.ivanov.first.repository.impl;
import com.ivanov.first.entity.IntArray;
import com.ivanov.first.repository.Specification;

public class SpecificationId implements Specification {
  private long id;

  public SpecificationId(long id)
  {
    this.id = id;
  }
  @Override
  public boolean specify(IntArray intArray) {
    return intArray.getIntArrayId() == id;
  }
}
