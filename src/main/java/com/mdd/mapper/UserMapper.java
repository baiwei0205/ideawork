package com.mdd.mapper;


import com.mdd.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User getUser(int id);
}

