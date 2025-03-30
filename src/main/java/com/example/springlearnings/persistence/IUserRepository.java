package com.example.springlearnings.persistence;
import com.example.springlearnings.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface IUserRepository extends MongoRepository<User, ObjectId> {

    @Query(value = "{ 'username' : ?0 }")
    User findByUsername(String username);

    //boolean existsByUsername(String username);

    @Query(value = "{ 'username' : ?0 }", delete = true)
    void deleteByUsername(String username);
}
