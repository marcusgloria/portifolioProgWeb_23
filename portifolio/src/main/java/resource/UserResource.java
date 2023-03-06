package resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


import entities.User;
import services.UserService;

@RestController
public class UserResource {
    
    @Autowired
    private UserService userService; 

    @GetMapping(value = "/usuarios")
    public List<User>  fetchUserList(){
        return userService.fetchUserslList();
    }

    @PostMapping("/usuarios")
    public User saveUser(@RequestBody User user) {

        return userService.saveUser(user);

    }

    @DeleteMapping("/usuarios/{id}")
    public String deleteUserById(@PathVariable("id") long id) {

        userService.deleteUserById(id);
        return "Excluido com Sucesso!";
    
    }

    @PutMapping("/usuarios/{id}")
    public User updateUser(@RequestBody User user,@PathVariable("id") Long id){
        return userService.updateUser(user, id);
    }


}
