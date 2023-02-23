package resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping(value = "/usuario")
    public List<User> Get() {
        return userService.findAll();
    }

    @GetMapping(value = "/usuario/{id}")
    public ResponseEntity<User> getById(@PathVariable(value = "id") long id) {
        
        Optional<User> user = userService.findById(id);
        if(user.isPresent())
            return new ResponseEntity<>(user.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @PostMapping(value = "/usuario")
    public User post(@RequestBody User user) {

        return userService.save(user);

    }

    @DeleteMapping(value = "/usuario/{id}")
    public ResponseEntity<Object> delete(@PathVariable(value = "id") long id) {

        Optional<User> user  = userService.findById(id);
        if(user.isPresent()){
            userService.delete(user.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/pessoa/{id}")
    public ResponseEntity<User> put(@PathVariable(value = "id") long id, @RequestBody User newUser) {

        Optional<User> oldUser = userService.findById(id);
        if(oldUser.isPresent()){
            User user = oldUser.get();
            if (newUser.getNome() != null)
                user.setNome(newUser.getNome());
            if (newUser.getEmail() != null)
                user.setEmail(newUser.getEmail());
            if (newUser.getTelefone() != null)
                user.setTelefone(newUser.getTelefone());
            if (newUser.getPassword() != null)
                user.setPassword(newUser.getPassword());
            userService.save(user);
            return new ResponseEntity<>(user, HttpStatus.OK);

        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
