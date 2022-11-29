package OyavyaServices.Oyavya_app.Components.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "Product")
public class Product {

    private String name;
    @Id
    private String id;
    private String description;
    private String price;
    private String category;
    private String image;

    public Product() {

    }

    public Product(String name, String id, String description, String price, String image, String category) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.price = price;
        this.image = image;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    

    @Override
    public String toString() {
        return "Product [name=" + name + ", id=" + id + ", description=" + description + ", price=" + price
                + ", categories=" + "]";
    }

}
