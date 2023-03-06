package services;

import java.util.List;
import entities.User;

public interface IUserService {

    //Ler 
    List < User > fetchUserslList();

    //Salvar 
    User saveUser(User user);

    //Atualizar
    User updateUser(User user, Long id);

    //Deletar
    void deleteUserById(Long id);
    
}
