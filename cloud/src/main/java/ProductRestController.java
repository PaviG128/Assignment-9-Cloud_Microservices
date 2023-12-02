package com.example.cloud;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.expression.ParseException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ProductRestController {
    
	@GetMapping
    public List<Product> listAll() {
    return prodService.listAll();
}
    @PostMapping
    public void saveProduct(@RequestBody Product product) {
    prodService.saveProduct(product);
}
    @GetMapping(value = "/{id}")
    public Product findById(@PathVariable("id") String id) {
    return prodService.findById(id);
}
    @DeleteMapping
    public void deleteProduct(@RequestBody Product product) {
    prodService.deleteProduct(product);
}
    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable("id") String id) {
    prodService.deleteById(id);
}
    @GetMapping(value = "/byName/{name}")
    public List<Product> findByName(@PathVariable("name") String name) {
    return prodService.findByName("%name" + "%");
}
    @GetMapping("/byNameSort/{name}/conf/{sortType}")
    public List<Product> findByAndSort(@PathVariable("name")String name,@PathVariable("sortType")String sortType ,Sort sort) {
    return prodService.findByAndSort("%"+name+"%", new Sort (Sort.Direction.ASC,sortType));
}
    @GetMapping("/byDate/{fromDate}/conf/{toDate}")
    public List<Product> findByDate(@PathVariable("fromDate") String fromDate, @PathVariable("toDate") String toDate) throws ParseException, java.text.ParseException {
    return prodService.findByDate(new SimpleDateFormat("yyyy-mmdd").parse(fromDate), new SimpleDateFormat("yyyy-mm-dd").parse(toDate));
}
    @GetMapping(value="/byPrice/{min}/conf/{max}")
    public List<Product> findByPrice(@PathVariable("min") double min, @PathVariable("max") double max) {
    return prodService.findByPrice(min, max);
}
}