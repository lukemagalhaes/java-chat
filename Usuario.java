public class Usuario {
    private String nome, email, telefone;

    public Usuario(String nome, String email, String telefone) {
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString(){
        return "\n-------Informações de contato-------\n"+
        "Nome: "+nome+"\n"+
        "Email: "+email+"\n"+
        "Telefone: "+telefone;
    }
}
