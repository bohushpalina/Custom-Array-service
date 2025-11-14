package com.ivanov.first.service.impl;
import com.ivanov.first.entity.IntArray;
import com.ivanov.first.repository.IntArrayRepository;
import com.ivanov.first.service.IntArrayRepositorySortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IntArrayRepositorySortServiceImpl implements IntArrayRepositorySortService {
  private static final Logger log = LogManager.getLogger();

  @Override
  public List<IntArray> sort(List<IntArray> list, Comparator<IntArray> comparator) {
    List<IntArray> copy = new ArrayList<>(list);
    copy.sort(comparator);
    log.info("Repository sorted by comparator={}", comparator);
    return copy;
  }
}
