package com.educandoweb.course.services;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository ur;

    public List<User> getAll(){
         return ur.findAll();
    }

    public User getById(Long id){
        Optional<User> obj = ur.findById(id);
        return obj.get();
    }


}
