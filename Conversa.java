import java.util.ArrayList;

public class Conversa {
    private ArrayList<Mensagem> lstMsg = new ArrayList<Mensagem>();
    
    public Conversa() {
        System.out.println("Conversa iniciada");
    }

    public void enviarMensagem(Mensagem mensagem){
        lstMsg.add(mensagem);
        //System.out.println("Mensagem enviada: ");
        //mensagem.exibir();
    }

    public ArrayList<Mensagem> getLstMsg() {
        return lstMsg;
    }

    public void setLstMsg(ArrayList<Mensagem> lstMsg) {
        this.lstMsg = lstMsg;
    }

    public void mostrar(){
        //System.out.println("\nExibir Conversa");
        for (Mensagem i : lstMsg) {
            System.out.print("\n");
            i.exibir();
        }
    }
}
