package com.ivanov.first.customarray.factory.impl;
import com.ivanov.first.customarray.CustomArray;
import com.ivanov.first.customarray.factory.CustomArrayFactory;

public class CustomArrayFactoryImpl implements CustomArrayFactory {
  @Override
  public CustomArray create(long customArrayId, int size, int[] data) {
    return new CustomArray(customArrayId, size, data);
  }
}
