import java.awt.*;
import javax.swing.*;

public class TesteBotao extends JFrame {
    JButton botaoTextoImagem, botaoTexto, botaoImagem;
    ImageIcon icone;

     public TesteBotao() {
        super("Projeto TesteBotao");

        Container tela = getContentPane();
        setLayout(null);

        
        icone = new ImageIcon("Certo.png");

        
        
        botaoTextoImagem = new JButton("Abrir", icone);
        botaoTextoImagem.setBounds(50, 20, 150, 40);

        
        botaoTexto = new JButton("Procurar");
        botaoTexto.setBounds(50, 80, 150, 40);

        
        botaoImagem = new JButton(icone);
        botaoImagem.setBounds(50, 140, 150, 40);

        tela.add(botaoTextoImagem);
        tela.add(botaoTexto);
        tela.add(botaoImagem);

        setSize(250, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String args[]) {
        TesteBotao app = new TesteBotao();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}