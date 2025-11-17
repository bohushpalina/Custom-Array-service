package com.bohush.ft.repository.impl;
import com.bohush.ft.entity.IntArray;
import com.bohush.ft.repository.Specification;

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
