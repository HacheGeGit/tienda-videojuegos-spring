package gm.iventarios.repository;

import gm.iventarios.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository <Product, Integer>{
}
