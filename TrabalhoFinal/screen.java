package TrabalhoFinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class screen extends JFrame implements ActionListener {
    public static void main(String[] args) {

    }
    ImageIcon imagem = new ImageIcon(Objects.requireNonNull(getClass().getResource("2_resized (1).jpg")));
    JLabel label;



    public screen(){
        String [] args = new String[3];
        label= new JLabel(imagem);
        label.setBounds(0,0,800,500);
        label.setOpaque(true);
        label.setVisible(true);
        label.setBackground(Color.pink);



        setSize(800,500);
        setTitle("Psicológa Marta");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);


        JButton jButton = new JButton("Começar");
        jButton.setBounds(100,200,250,70);
        jButton.setFont(new Font("Arial",Font.ITALIC,40));
        jButton.setForeground(new Color(255, 255, 255));
        jButton.setBackground(new Color(94, 3, 131));
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                int[] answers = new int[2];
                String caminho = "src/TrabalhoFinal/fw";
                //new screen();

                pjfinal.printDialogs();

                pjfinal.performsDiagnosis(answers);

                new Imagem(caminho, 23);

                new pjfinal();

            }
        });


        JButton jButton2 = new JButton("Sair");
        jButton2.setBounds(500,200,250,70);
        jButton2.setFont(new Font("Arial",Font.ITALIC,40));
        jButton2.setForeground(new Color(255, 255, 255));
        jButton2.setBackground(new Color(94, 3, 131));

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(jButton);

        add(jButton2);

        jButton.addActionListener(this);

        jButton2.addActionListener(this);

        add(label);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

