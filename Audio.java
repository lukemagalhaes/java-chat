public class Audio extends Arquivo {
    private String arquivo;

	public Audio(String arquivo) {
		super(arquivo);
	}

    public String getArquivo() {
        return arquivo;
    }
    public void setArquivo(String arquivo){
        this.arquivo = arquivo;
    }

    public void exibir() {
        System.out.println("audio: " + arquivo);
    }
}
