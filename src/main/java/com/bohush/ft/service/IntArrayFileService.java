package com.bohush.ft.service;
import com.bohush.ft.entity.IntArray;
import com.bohush.ft.exception.IntArrayException;

import java.io.IOException;
import java.util.ArrayList;

public interface IntArrayFileService{
  ArrayList<IntArray> readArraysFromFile(String filePath) throws IOException, IntArrayException;
}
