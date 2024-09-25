package ie.atu.week2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();

    public List<Product> getAllProducts() {
        return products;
    }

    public Product addProduct(Product product) {
        for (Product p : products) {
            if (p.getId() == product.getId()) {
                throw new IllegalArgumentException("Product id already exists");
            }
        }
        products.add(product);
        return product;
    }

    public Product updateProduct(Product product) {
        for (Product pro : products) {
            if (pro.getId() == product.getId()) {
                pro.setName(product.getName());
                pro.setPrice(product.getPrice());
                return pro;
            }
        }

        return null;
    }

    public void deleteProduct(int id) {
        products.removeIf(pro -> pro.getId() == id);
    }
}
