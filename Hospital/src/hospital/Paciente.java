package hospital;

/** @author jessica */

public final class Paciente implements ITiposDePaciente{
    
    //Esqueleto da classe
    protected String nome;
    protected String cpf;
    protected char tipo;
    protected char fator;
    protected float peso;
    protected float altura;
    
    protected int indiceGlicemico;
    
    
    // Getters e Setters (Métodos acessores e modificadores)
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public char getTipo() {
        return tipo;
    }

    public char getFator() {
        return fator;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public int getIndiceGlicemico() {
        return indiceGlicemico;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public void setFator(char fator) {
        this.fator = fator;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setIndiceGlicemico(int indiceGlicemico) {
        this.indiceGlicemico = indiceGlicemico;
    }
    
    // Construtor
    public Paciente(String nome, String cpf, char tipo, char fator, float peso, float altura, int indiceGlicemico)
    {
    this.setNome(nome);
    this.setCpf(cpf);
    this.setTipo(tipo);
    this.setFator(fator);
    this.setPeso(peso);
    this.setAltura(altura);
    this.setIndiceGlicemico(indiceGlicemico);
    

    }

    
    //Método para calculo do IMC
    public float calcularIMC()
    {
        return this.getPeso()/(this.getAltura()*this.getAltura());
    }
    
    @Override
    public String toString(){
        
        return "Nome: "+this.getNome()+ "    CPF: "+this.getCpf();
    
    }

    @Override
    public boolean removerExame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean adicionarExame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

