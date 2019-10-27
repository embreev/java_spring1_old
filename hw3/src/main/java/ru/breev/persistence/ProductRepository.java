package ru.breev.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.breev.persistence.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> getAllByCategory_Id(Long categoryId);
}
