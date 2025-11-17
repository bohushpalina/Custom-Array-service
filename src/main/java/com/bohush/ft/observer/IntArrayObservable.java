package com.bohush.ft.observer;

public interface IntArrayObservable {
  void attach(IntArrayObserver observer);
  void detach(IntArrayObserver observer);
  void notifyObservers();
}
