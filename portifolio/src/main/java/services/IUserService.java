package services;

import java.util.List;
import java.util.Optional;

import entities.User;

public interface IUserService {

    List < User > findAll();

    User save(User user);

    Optional < User > findById(Long id);

    void delete(User user);
    
}
