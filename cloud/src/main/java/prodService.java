package com.example.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
 
@Service
public class prodService {
 
    @Autowired
    private ProductCatalogDao productCatalogDao;
 
    public List<Product> getAllProducts() {
        return productCatalogDao.getAllProducts();
    }
 
    public Product getProductById(Long productId) {
        return productCatalogDao.getProductById(productId);
    }

	public static void saveProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	public static List<Product> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Product findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void deleteProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	public static List<Product> findByDate(Date parse, Date parse2) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<Product> findByPrice(double min, double max) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<Product> findByAndSort(String string, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<Product> findByName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}
 
   
}
