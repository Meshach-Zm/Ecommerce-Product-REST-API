package OyavyaServices.Oyavya_app.Components.Entities;

import java.io.IOException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import OyavyaServices.Oyavya_app.Components.Repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    // private Product product;

    public ProductService(ProductRepository productRepository ) {
        this.productRepository = productRepository;
        
    }

    public void saveFileToDB(MultipartFile file, String name, String description, String price, String category) {
          
        Product product = new Product();
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        
        if(fileName.contains("..")) {
         System.out.println("Not a valid file");
        }

        try {
            product.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
        } catch (IOException e) {

            e.printStackTrace();
        }

        product.setCategory(category);
        product.setDescription(description);
        product.setPrice(price);
        product.setName(name);

       productRepository.save(product);        

    }
}
