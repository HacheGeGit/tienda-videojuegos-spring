package gm.iventarios.service;

import gm.iventarios.model.Product;
import gm.iventarios.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> listProcuts() {
        return this.productRepo.findAll();
    }

    @Override
    public Product SearchProductById(Integer idProduct) {
        Product product = this.productRepo.findById(idProduct).orElse(null);
        return product;
    }

    @Override
    public void saveProduct(Product product) {
        this.productRepo.save(product);
    }

    @Override
    public void deleteProductById(Integer idProduct) {
        this.productRepo.deleteById(idProduct);
    }
}
