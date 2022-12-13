package TrabalhoFinal;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class MinhaJanelaJava {

        public static void main(String[] args) {

            // obtem e coloca a imagem dentro de uma BufferedImage
            BufferedImage img = null;

            try {
                img = ImageIO.read(new File("99i.jpg"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Cria e configura o texto no JLabel
            JLabel label = new JLabel();
            label.setText("One Piece é legal!");
            label.setFont(new Font("Calibri", Font.BOLD, 120));
            label.setForeground(Color.white);
            label.setHorizontalTextPosition(JLabel.CENTER);

            // Cria e configura a janela
            JFrame janela = new JFrame();
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setSize(1280, 720);

            // Força a imagem a ficar do tamanho da janela
            assert img != null;
            Image dimg = img.getScaledInstance(janela.getWidth(), janela.getHeight(),
                    Image.SCALE_SMOOTH);

            ImageIcon imageIcon = new ImageIcon(dimg);
            label.setIcon(imageIcon);

            // mostra a janela e adiciona o label a ela
            janela.setVisible(true);
            janela.add(label);

        }

    }

