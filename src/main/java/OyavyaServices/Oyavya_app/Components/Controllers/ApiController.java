package OyavyaServices.Oyavya_app.Components.Controllers;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import OyavyaServices.Oyavya_app.Components.Entities.Product;
import OyavyaServices.Oyavya_app.Components.Repositories.ProductRepository;

@RestController
public class ApiController {

    private ProductRepository productRepository;

    public ApiController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @CrossOrigin
    @GetMapping("/products")
    public List<Product> product() {
        return productRepository.findAll();
    }

}
    
