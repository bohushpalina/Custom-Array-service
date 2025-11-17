package com.bohush.ft.service;

import com.bohush.ft.entity.IntArray;

import java.util.Comparator;
import java.util.List;

public interface IntArrayRepositorySortService {
  List<IntArray> sort(List<IntArray> list, Comparator<IntArray> comparator);
}
