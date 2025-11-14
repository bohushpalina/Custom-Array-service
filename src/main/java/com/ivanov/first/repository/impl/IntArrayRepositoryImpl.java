package com.ivanov.first.repository.impl;
import com.ivanov.first.entity.IntArray;
import com.ivanov.first.repository.IntArrayRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class IntArrayRepositoryImpl implements IntArrayRepository {
  private static final Logger log = LogManager.getLogger();
  private final List<IntArray> storage = new ArrayList<>();

  @Override
  public void save(IntArray array) {
    storage.add(array);
    log.info("Saving IntArray with id={}", array.getIntArrayId());
  }

  @Override
  public boolean delete(long id) {
    boolean removed = storage.removeIf(arr -> arr.getIntArrayId() == id);

    if (removed) {
      log.info("IntArray with id={} deleted successfully", id);
    } else {
      log.info("IntArray with id={} not found for deletion", id);
    }
    return removed;
  }

  @Override
  public Optional<IntArray> findById(long id) {
    for (IntArray array : storage) {
      if (array.getIntArrayId() == id) {
        log.info("IntArray with id={} found", id);
        return Optional.of(array);
      }
    }
    log.info("IntArray with id={} not found", id);
    return Optional.empty();
  }

  @Override
  public List<IntArray> findAll() {
    log.info("Fetching all IntArrays (count={})", storage.size());
    return new ArrayList<>(storage);
  }
}
