package com.bohush.ft.reader.impl;
import com.bohush.ft.reader.IntArrayReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class IntArrayReaderImpl implements IntArrayReader {

  @Override
  public List<String> readLines(String filePath) throws IOException {
    return Files.readAllLines(Paths.get(filePath));
  }
}
