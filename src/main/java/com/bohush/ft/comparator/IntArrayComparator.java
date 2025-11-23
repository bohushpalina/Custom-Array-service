package com.bohush.ft.comparator;

import com.bohush.ft.entity.IntArray;
import java.util.Comparator;

public enum IntArrayComparator implements Comparator<IntArray> {
  ID {
    @Override
    public int compare(IntArray o1, IntArray o2) {
      return Long.compare(o1.getIntArrayId(), o2.getIntArrayId());
    }
  },
  SIZE {
    @Override
    public int compare(IntArray o1, IntArray o2) {
      return Integer.compare(o1.getSize(), o2.getSize());
    }
  };

  @Override
  public abstract int compare(IntArray o1, IntArray o2);
}