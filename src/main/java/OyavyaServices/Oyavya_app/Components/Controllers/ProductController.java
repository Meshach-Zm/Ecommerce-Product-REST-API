package OyavyaServices.Oyavya_app.Components.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import OyavyaServices.Oyavya_app.Components.Entities.Product;
import OyavyaServices.Oyavya_app.Components.Entities.ProductService;
import OyavyaServices.Oyavya_app.Components.Repositories.ProductRepository;

@Controller
public class ProductController {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    private ProductService productService; 

    public ProductController( ProductRepository productRepository, Product product) {
        this.productRepository = productRepository;
        
    }
      

       @GetMapping("/product-list.html")
       public String showProducts(Model model) {

        List<Product> products = productRepository.findAll();
        model.addAttribute("products", products);
        return "/product-list.html";
       }

       @PostMapping("/addproduct")
       public String saveProductToDB(

       @RequestParam("file") MultipartFile file, 
       @RequestParam("pname") String name,
       @RequestParam("price") String price,
       @RequestParam("description") String description,
       @RequestParam("category") String category)
       {

        productService.saveFileToDB(file, name, price, description, category);
        
        return "/add-product.html";
     }
        
     @GetMapping("/add-product.html")
     public String showAddProduct() {
        return "/add-product.html";
     }

        
   @GetMapping("/deleteProduct/{id}")
   public String deleteProduct(@PathVariable("id") String id){
    productRepository.deleteById(id);
    return "redirect:/product-list.html";
   }    
    
}
