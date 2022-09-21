package br.com.unipar.ex2.heranca.models;

public class Mamifero extends Animal {

    private String alimento;

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return  "\nNome: " + super.getNome() + "\n" 
                + "Comprimento: " + super.getComprimento() + " cm" + "\n"
                + "Patas: " + super.getPatas() + "\n"
                + "Cor: " + super.getCor() + "\n"
                + "Ambiente: " + super.getAmbiente() + "\n"
                + "Velocidade: " + super.getVelocidade() + " m/s" + "\n"
                + "Alimento: " + alimento + "\n"
                + "---------------------------------";
    }

}
