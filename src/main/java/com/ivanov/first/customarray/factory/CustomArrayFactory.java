package com.ivanov.first.customarray.factory;
import com.ivanov.first.customarray.CustomArray;

public interface CustomArrayFactory {
  CustomArray create(long customArrayId, int size, int[] data);
}
