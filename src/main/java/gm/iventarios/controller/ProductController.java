package gm.iventarios.controller;

import gm.iventarios.model.Product;
import gm.iventarios.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//http://localhost:8080/inventario-app
@RequestMapping("inventario-app/")
@CrossOrigin(value = "http://localhost:4200") // Puerto para peticiones front Angular
public class ProductController {
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;
    //http://localhost:8080/inventario-app/products
    @GetMapping("/products")
    public List<Product> getProducts(){
        List<Product> products = this.productService.listProcuts();
        logger.info("Products");
        products.forEach(product -> logger.info(product.toString()));
        return products;
    }

}
