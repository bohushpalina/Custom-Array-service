package com.bohush.ft.service;
import com.bohush.ft.entity.IntArray;
import com.bohush.ft.exception.IntArrayException;

public interface IntArraySortService {
  IntArray bubbleSort(IntArray intArray) throws IntArrayException;
  IntArray shakeSort(IntArray intArray) throws IntArrayException;
  IntArray mergeSort(IntArray intArray) throws IntArrayException;
}
