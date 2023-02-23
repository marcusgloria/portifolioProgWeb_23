package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    User findByIdUser(String id);

    List<User> findByName(String nome);
}
