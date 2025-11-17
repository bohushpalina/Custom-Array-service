package com.bohush.ft.observer;
import com.bohush.ft.entity.IntArray;

public class IntArrayEvent {
  private IntArray array;

  public IntArrayEvent(IntArray array) {
    this.array = array;
  }

  public IntArray getIntArray() {
    return array;
  }
}
