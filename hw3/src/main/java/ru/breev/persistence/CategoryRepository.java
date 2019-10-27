package ru.breev.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.breev.persistence.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
