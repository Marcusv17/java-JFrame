import javax.swing.*;
import java.awt.*;

public class CadastroCliente extends JFrame {

    JLabel titulo;
    JLabel lblNome, lblCpf, lblRg, lblEndereco, lblCidade, lblEstado, lblCep;

    JTextField txtNome, txtCpf, txtRg, txtEndereco, txtCidade, txtEstado, txtCep;

    public CadastroCliente() {

        super("Cadastro de Cliente");

        Container tela = getContentPane();
        tela.setLayout(null);
        
        titulo = new JLabel("Cadastro de Cliente");
        titulo.setForeground(Color.RED);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        titulo.setBounds(120, 10, 200, 30);
        
        lblNome = new JLabel("Nome");
        lblCpf = new JLabel("CPF");
        lblRg = new JLabel("RG");
        lblEndereco = new JLabel("Endereço");
        lblCidade = new JLabel("Cidade");
        lblEstado = new JLabel("Estado");
        lblCep = new JLabel("CEP:");
        
        txtNome = new JTextField();
        txtCpf = new JTextField();
        txtRg = new JTextField();
        txtEndereco = new JTextField();
        txtCidade = new JTextField();
        txtEstado = new JTextField();
        txtCep = new JTextField();
        
        lblNome.setBounds(50, 50, 100, 20);
        txtNome.setBounds(50, 70, 300, 25);

        lblCpf.setBounds(50, 100, 100, 20);
        txtCpf.setBounds(50, 120, 150, 25);

        lblRg.setBounds(50, 150, 100, 20);
        txtRg.setBounds(50, 170, 150, 25);

        lblEndereco.setBounds(50, 200, 100, 20);
        txtEndereco.setBounds(50, 220, 300, 25);

        lblCidade.setBounds(50, 250, 100, 20);
        txtCidade.setBounds(50, 270, 250, 25);

        lblEstado.setBounds(50, 300, 100, 20);
        txtEstado.setBounds(50, 320, 200, 25);

        lblCep.setBounds(50, 350, 100, 20);
        txtCep.setBounds(50, 370, 120, 25);

        tela.add(titulo);

        tela.add(lblNome);
        tela.add(txtNome);

        tela.add(lblCpf);
        tela.add(txtCpf);

        tela.add(lblRg);
        tela.add(txtRg);

        tela.add(lblEndereco);
        tela.add(txtEndereco);

        tela.add(lblCidade);
        tela.add(txtCidade);

        tela.add(lblEstado);
        tela.add(txtEstado);

        tela.add(lblCep);
        tela.add(txtCep);

        setSize(420, 480);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        CadastroCliente app = new CadastroCliente();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}