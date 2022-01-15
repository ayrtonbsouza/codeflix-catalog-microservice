package com.ayrtonsouza.codeflix.domain.entity;

import java.util.UUID;

public class Category {
  private UUID id;
  private String name;

  public Category() {
  }

  public Category(String name) {
  }

  public Category(UUID id, String name) {
  }

  public UUID getId() {
    return this.id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    if (name == null)
      throw new IllegalArgumentException("name must not be null");
    if (name.length() == 0)
      throw new IllegalArgumentException("name must not be empty");

    this.name = name;
  }
}
