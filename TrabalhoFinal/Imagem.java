package TrabalhoFinal;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Random;

public class Imagem extends JFrame {
    ImageIcon imagem = new ImageIcon(Objects.requireNonNull(getClass().getResource("1_resized.jpg")));
    JLabel label;

    public Imagem(String caminho,int a ) {
        setTitle("Biscoito da Sorte");
        label = new JLabel(imagem);
        add(label);
        setSize(1920, 1080);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setVisible(true);

        // Cria e configura o texto no JLabel

        label.setText( biscSorte(caminho, a ));
        label.setFont(new Font("Helvetica", Font.BOLD, 30));
        label.setForeground(Color.black);
        label.setHorizontalTextPosition(JLabel.CENTER);
    }

    public static String biscSorte(String caminho, int valor) {
        String frases = null;
        Random ale = new Random();
        int aleatorio = ale.nextInt(valor);
        try {
            FileReader fw = new FileReader(caminho);
            BufferedReader bufferedReader = new BufferedReader(fw);
            ale = new Random();
            frases = Files.readAllLines(Paths.get(caminho)).get(aleatorio);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {

        }
        return frases;
    }
}