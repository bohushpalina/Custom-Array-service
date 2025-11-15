package com.ivanov.first.repository;
import com.ivanov.first.entity.IntArray;

public interface Specification {
  boolean specify(IntArray intArray);
}
