public class Contato implements Mensagem {
    private Usuario usr;

    public Contato(Usuario usr) {
        super();
        setUsr(usr);
    }

    public Usuario getUsr() {
        return usr;
    }
    public void setUsr(Usuario usr) {
        this.usr = usr;
    }

    public void exibir(){
        System.out.println(usr.toString());
    }
}
