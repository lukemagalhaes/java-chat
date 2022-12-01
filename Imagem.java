public class Imagem extends Arquivo {
    private String arquivo;

    public Imagem(String arquivo) {
        super(arquivo);
        setArquivo(arquivo);
    }

    public String getArquivo() {
        return arquivo;
    }
    public void setArquivo(String arquivo){
        this.arquivo = arquivo;
    }

    public void exibir() {
        System.out.println("imagem: " + arquivo);
    }
}
