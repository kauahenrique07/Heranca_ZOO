package br.unipar.ex2.heranca.main;

import br.com.unipar.ex2.heranca.models.Animal;
import br.com.unipar.ex2.heranca.models.Mamifero;
import br.com.unipar.ex2.heranca.models.Peixe;
import javax.swing.JOptionPane;

public class ZOO {

    public static void main(String[] args) {

        Animal camelo = new Animal();

        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        camelo.setPatas(4);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2.0);

        Peixe tubarao = new Peixe();

        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setPatas(0);
        tubarao.setCor("Cinzento");
        tubarao.setAmbiente("Mar");
        tubarao.setVelocidade(1.5);
        tubarao.setCaracterísticas("Barbatanas e cauda");

        Mamifero ursoDoCanada = new Mamifero();

        ursoDoCanada.setNome("Urso-do-canadá");
        ursoDoCanada.setComprimento(180);
        ursoDoCanada.setPatas(4);
        ursoDoCanada.setCor("Vermelho");
        ursoDoCanada.setAmbiente("Terra");
        ursoDoCanada.setVelocidade(0.5);
        ursoDoCanada.setAlimento("Mel");

        JOptionPane.showMessageDialog(null, "ZOO:"
                + "\n---------------------------------"
                + camelo.toString() + tubarao.toString()
                + ursoDoCanada.toString());

    }

}
