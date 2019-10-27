package ru.breev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class ProductRepo {

    @Autowired
    private List<Product> productList = new ArrayList<>();
    
    private void addProduct (Product product) {
        this.productList.add(product);
    }

    @RequestMapping(value="/products", method = RequestMethod.GET)
    public String getAllProducts (Model uiModel) {
          uiModel.addAttribute("products", productList);
        return "products";
    }

    public Product getProductById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
