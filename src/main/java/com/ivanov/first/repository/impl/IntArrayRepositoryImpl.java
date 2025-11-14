package com.ivanov.first.repository.impl;
import com.ivanov.first.entity.IntArray;
import com.ivanov.first.repository.IntArrayRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class IntArrayRepositoryImpl implements IntArrayRepository {
  private final List<IntArray> storage = new ArrayList<>();

  @Override
  public void save(IntArray array) {
    storage.add(array);
  }

  @Override
  public boolean delete(long id) {
    return storage.removeIf(arr -> arr.getIntArrayId() == id);
  }

  @Override
  public Optional<IntArray> findById(long id) {
    for (IntArray array : storage) {
      if (array.getIntArrayId() == id) {
        return Optional.of(array);
      }
    }
    return Optional.empty();
  }

  @Override
  public List<IntArray> findAll() {
    return new ArrayList<>(storage);
  }
}
