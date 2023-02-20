package entities;

import java.util.Objects;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {

    private static final long serialVersionUID = -7569190958405559073L;

    private int id;
    private Strin
    g nome;
    private String email;
    private String telefone;
    private String password;


    public User(){
    }

    public User(int Id, String Nome, String Email, String Telefone, String Password){
        id=Id;
        nome=Nome;
        email=Email;
        telefone=Telefone;
        password=Password;

    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return id == user.id && Objects.equals(nome, user.nome) && Objects.equals(email, user.email) && Objects.equals(telefone, user.telefone) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email, telefone, password);
    }

}

