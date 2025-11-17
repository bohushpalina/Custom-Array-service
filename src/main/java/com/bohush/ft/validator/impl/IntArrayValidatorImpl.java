package com.bohush.ft.validator.impl;
import com.bohush.ft.validator.IntArrayValidator;

public class IntArrayValidatorImpl implements IntArrayValidator {
  private static final String VALID_PATTERN = "^[\\s\\d;,-]+$";

  @Override
  public boolean isValid(String line) {
    if (line == null || line.isBlank()) {
      return false;
    }
    return line.matches("[0-9; ,\\-]+");
  }
}
