package services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.User;
import repositories.UserRepository;

@Service
public class UserService implements IUserService{
    
    @Autowired 
    private UserRepository userRepository;

    //Ler
    @Override
    public List < User > fetchUserslList(){

        return (List<User>)
            userRepository.findAll();

    }

    //Salvar
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    //Atualizar
    @Override
    public User updateUser(User user, Long id) {

        User depDB = userRepository.findById(id).get();
 
        if (Objects.nonNull(user.getNome()) && !"".equalsIgnoreCase( user.getNome())) {
            depDB.setNome(user.getNome());
        }
 
        if (Objects.nonNull(user.getEmail()) && !"".equalsIgnoreCase(user.getEmail())) {
            depDB.setEmail(user.getEmail());
        }
 
        if (Objects.nonNull(user.getTelefone()) && !"".equalsIgnoreCase(user.getTelefone())) {
            depDB.setTelefone(user.getTelefone());
        }

        if (Objects.nonNull(user.getPassword()) && !"".equalsIgnoreCase(user.getPassword())) {
            depDB.setPassword(user.getPassword());
        }
 
 
        return userRepository.save(depDB);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

}
