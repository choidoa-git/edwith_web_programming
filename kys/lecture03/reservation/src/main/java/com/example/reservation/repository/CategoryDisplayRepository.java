package com.example.reservation.repository;

import com.example.reservation.domain.CategoryDisplay;

import java.util.List;
import java.util.Optional;

public interface CategoryDisplayRepository {
    List<CategoryDisplay> selectCategory(Integer category_id);
    List<CategoryDisplay> allCategoryDisplay();
}
