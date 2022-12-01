public class Programa {
    public static void main(String[] args) {
        Conversa conversa = new Conversa();

        conversa.enviarMensagem(new Texto("Bom dia meu amigo, voltei de férias ontem"));
        conversa.enviarMensagem(new Imagem("ferias.jpg"));
        conversa.enviarMensagem(new Texto("Abriu uma vaga na minha empresa, vou te mandar o contato"));
        conversa.enviarMensagem(new Contato(new Usuario("Arcos Dourados Ltda.", "contato@mcdonalds.com.br", "0800 70 70 100")));
        
        conversa.mostrar();
    }
}
