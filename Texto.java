public class Texto implements Mensagem {
    private String msg;

    public Texto(String msg) {
        setMsg(msg);
        //System.out.println("Mensagem de texto: "+msg);
    }

    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void exibir(){
        System.out.println(msg);
    }
}
