public class Arquivo implements Mensagem {
    private String arquivo;

    public Arquivo(String arquivo) {
		super();
        setArquivo(arquivo);
	}

    public String getArquivo() {
        return arquivo;
    }
    public void setArquivo(String arquivo){
        this.arquivo = arquivo;
    }

    public void exibir() {
        System.out.println("Exibir Arquivo "+arquivo);
    }
}
