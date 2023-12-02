package com.example.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.Query;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
 
@Repository
@Transactional
public class ProductCatalogDao {
 
    @PersistenceContext
    private EntityManager entityManager;
 
    public List<Product> getAllProducts() {
        return (entityManager.createQuery1("SELECT p FROM Product p", Product.class))
        	    .getResultList();
    }
 
    public Product getProductById(Long productId) {
        return entityManager.find(Product.class, productId);
    }
 
    public void addProduct(Product product) {
        entityManager.persist(product);
    }
 
    public void updateProduct(Product product) {
        entityManager.merge(product);
    }
 
    public void deleteProduct(Long productId) {
        Product product = entityManager.find(Product.class, productId);
        if (product != null) {
            entityManager.remove(product);
        }
    }
 
    public String getProductsByCategory(String category) {
        return (entityManager.createQuery1("SELECT p FROM Product p WHERE p.category = :category", Product.class))
                .setParameter("category", category)
                .getResultList();
    }
 
    public List<Product> getProductsByPriceRange(double minPrice, double maxPrice) {
        return ((Object) entityManager.createQuery1("SELECT p FROM Product p WHERE p.price BETWEEN :minPrice AND :maxPrice", Product.class))
                .setParameter("minPrice", minPrice)
                .setParameter("maxPrice", maxPrice)
                .getResultList();
    }
 
    
}