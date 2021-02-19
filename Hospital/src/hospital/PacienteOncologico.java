//     >> CLASSE ESPECIALIZADA <<

package hospital;

public final class PacienteOncologico extends Paciente{
    
    int quantidadeQuimioterapia;
    int quantidadeRadioterapia;
    
    //Métodos acesspres e modificadores da classe
    public int getQuantidadeQuimioterapia() {
        return quantidadeQuimioterapia;
    }

    public int getQuantidadeRadioterapia() {
        return quantidadeRadioterapia;
    }

    public void setQuantidadeQuimioterapia(int quantidadeQuimioterapia) {
        this.quantidadeQuimioterapia = quantidadeQuimioterapia;
    }

    public void setQuantidadeRadioterapia(int quantidadeRadioterapia) {
        this.quantidadeRadioterapia = quantidadeRadioterapia;
    }
    
    
    
    // Construtores
    public PacienteOncologico(String nome, String cpf, char tipo, char fator, float peso, float altura, int indiceGlicemico, int quimio, int radiot) {
        super(nome, cpf, tipo, fator, peso, altura, indiceGlicemico);
        
        this.setQuantidadeQuimioterapia(quimio);
        this.setQuantidadeRadioterapia(radiot);
 
    }
    
    
    public PacienteOncologico(String nome, String cpf, int quimio, int radiot)
    {
        super(nome,cpf);
        this.setQuantidadeQuimioterapia(quimio);
        this.setQuantidadeRadioterapia(radiot);
    }
    
    // Métodos
    @Override
    public float calcularIMC(){
        return (this.getPeso()/(this.getAltura() * this.getAltura())) * 0.85f; 
    }

    
}
