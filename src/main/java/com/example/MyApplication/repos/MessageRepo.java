package com.example.MyApplication.repos;

import com.example.MyApplication.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Integer> {

}
