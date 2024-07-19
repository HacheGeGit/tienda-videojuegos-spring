package gm.iventarios.service;

import gm.iventarios.model.Product;

import java.util.List;

public interface IProductService {
    public List<Product> listProcuts();
    public Product SearchProductById(Integer Product);
    public void saveProduct(Product product);
    public void deleteProductById(Integer Product);
}
