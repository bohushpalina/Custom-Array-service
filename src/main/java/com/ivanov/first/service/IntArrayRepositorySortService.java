package com.ivanov.first.service;

import com.ivanov.first.entity.IntArray;

import java.util.Comparator;
import java.util.List;

public interface IntArrayRepositorySortService {
  List<IntArray> sort(List<IntArray> list, Comparator<IntArray> comparator);
}
