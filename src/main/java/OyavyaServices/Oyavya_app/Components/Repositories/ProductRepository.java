package OyavyaServices.Oyavya_app.Components.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import OyavyaServices.Oyavya_app.Components.Entities.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
