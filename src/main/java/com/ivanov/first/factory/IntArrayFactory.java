package com.ivanov.first.factory;
import com.ivanov.first.intarray.IntArray;
import com.ivanov.first.exception.IntArrayException;

public interface IntArrayFactory {
  IntArray create(long customArrayId, int size, int[] data) throws IntArrayException;
}
