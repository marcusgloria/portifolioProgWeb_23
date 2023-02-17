package entities;

class User {
    private int id;
    private String nome;
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


}
