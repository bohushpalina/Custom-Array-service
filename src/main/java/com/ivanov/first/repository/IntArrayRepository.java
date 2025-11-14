package com.ivanov.first.repository;

import com.ivanov.first.entity.IntArray;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface IntArrayRepository {
  void save(IntArray array);
  boolean delete(long id);
  Optional<IntArray> findById(long id);
  List<IntArray> findAll();
  //List<IntArray> query(IntArraySpecification specification);
}
