package com.ivanov.first.repository;
import com.ivanov.first.entity.IntArray;

import java.util.*;

public interface IntArrayRepository {
  void save(IntArray array);
  boolean delete(long id);
  Optional<IntArray> findById(long id);
  List<IntArray> findAll();
  //List<IntArray> query(IntArraySpecification specification);
}
