package com.example.demo.data;


import com.example.demo.entities.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

public class DataPayload {

    public List<User> getAllUsers(){
        return Arrays.asList(
                User.builder().userId(1).userName("Hà Huy Trí").age(22).description("DevOps").build(),
                User.builder().userId(2).userName("Huỳnh Hữu Thức").age(22).description("Tester").build(),
                User.builder().userId(3).userName("Phạm Như Quỳnh").age(22).description("Developer").build()
        );
    }


}
