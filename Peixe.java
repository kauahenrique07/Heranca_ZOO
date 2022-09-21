package br.com.unipar.ex2.heranca.models;

public class Peixe extends Animal {

    private String caracteristicas;

    public String getCaracterísticas() {
        return caracteristicas;
    }

    public void setCaracterísticas(String características) {
        this.caracteristicas = características;
    }

    @Override
    public String toString() {
        return  "\nNome: " + super.getNome() + "\n"
                + "Comprimento: " + super.getComprimento() + " cm" + "\n" 
                + "Patas: " + super.getPatas() + "\n"
                + "Cor: " + super.getCor() + "\n"
                + "Ambiente: " + super.getAmbiente() + "\n"
                + "Velocidade: " + super.getVelocidade() + " m/s" + "\n"
                + "Característica: " + caracteristicas + "." + "\n"
                + "---------------------------------";
    }

}
