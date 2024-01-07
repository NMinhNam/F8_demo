package com.example.demo.service.UserServiceImpl;

import com.example.demo.data.DataPayload;
import com.example.demo.entities.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplement implements UserService {

    DataPayload dataPayload = new DataPayload();

    @Override
    public List<User> getAllUsers() {
        return dataPayload.getAllUsers();
    }
}
