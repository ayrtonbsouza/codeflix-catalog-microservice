package com.ayrtonsouza.codeflix.domain.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Genre extends BaseEntity {
  private String name;
  private List<Category> categories = new ArrayList<>();

  public Genre(String name) {
    super.generateUUID();
    this.setName(name);
  }

  public Genre(UUID id, String name) {
    super.setId(id);
    this.setName(name);
  }

  public Genre(String name, List<Category> categories) {
    super.generateUUID();
    this.setName(name);
    this.setCategories(categories);
  }

  public Genre(UUID id, String name, List<Category> categories) {
    super.setId(id);
    this.setName(name);
    this.setCategories(categories);
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

  public List<Category> getCategories() {
    return this.categories;
  }

  public void setCategories(List<Category> categories) {
    if (categories == null)
      throw new IllegalArgumentException("categories must not be null");
    this.categories = categories;
  }

  public void addCategory(Category category) {
    if (categories == null)
      throw new IllegalArgumentException("categories must not be null");
    this.categories.add(category);
  }

  public void removeCategory(Category category) {
    if (categories == null)
      throw new IllegalArgumentException("categories must not be null");
    this.categories.removeIf(c -> this.categories.contains(category));
  }
}
