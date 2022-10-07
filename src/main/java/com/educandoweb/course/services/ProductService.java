package com.educandoweb.course.services;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.CategoryRepository;
import com.educandoweb.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository pr;

    public List<Product> getAll(){
         return pr.findAll();
    }

    public Product getById(Long id){
        Optional<Product> obj = pr.findById(id);
        return obj.get();
    }


}
