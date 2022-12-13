package TrabalhoFinal;
import javax.swing.*;
public class pjfinal {
    private static final int YES_NO_OPTION = 0;
    public static int[] answers = new int[10];

    public static void main(String[] args) {
        String caminho = "src/TrabalhoFinal/fw";
        new screen();
        //printDialogs();
        //performsDiagnosis(answers, caminho);
        // new Pfinal.Imagem(caminho, 9);

    }

    public static void printDialogs() {
        String name = JOptionPane.showInputDialog(null, """
               Olá! Eu sou a Marta, e iremos realizar uma consulta
                de rotina para uma avaliação.\s
               Qual o seu nome?""", "Apresentação", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Certo " + name + ", vamos começar.\n" +
                "Responda aos itens sobre as formas como você normalmente\n se comporta, sente ou age e descubra seu diagnóstico.", " ", JOptionPane.INFORMATION_MESSAGE);

        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");

        answers[0] = JOptionPane.showConfirmDialog(null, "Você sentiu desânimo frequentemente?",
                "PERGUNTA 01", YES_NO_OPTION);

        answers[1] = JOptionPane.showConfirmDialog(null, "As ideias passam pela sua cabeça\n e" +
                " atrapalham seu sono?", "PERGUNTA 02", YES_NO_OPTION);

        answers[2] = JOptionPane.showConfirmDialog(null, "O seu humor muda com frequência?",
                "PERGUNTA 03", YES_NO_OPTION);

        answers[3] = JOptionPane.showConfirmDialog(null, "Você tem sentimentos de inferioridade\n" +
                " ou baixa autoestima?", "PERGUNTA 04", YES_NO_OPTION);

        answers[4] = JOptionPane.showConfirmDialog(null, "Após ter feito algo importante,\n" +
                "você sente que poderia ter feito melhor?", "PERGUNTA 05", YES_NO_OPTION);

        answers[5] = JOptionPane.showConfirmDialog(null, """
               Você já se sentiu infeliz sem um
               bom motivo para isso?
               """, "PERGUNTA 06", YES_NO_OPTION);

        answers[6] = JOptionPane.showConfirmDialog(null, "Você se considera uma pessoa tensa,\n" +
                "nervosa ou ansiosa?", "PERGUNTA 07", YES_NO_OPTION);

        answers[7] = JOptionPane.showConfirmDialog(null, """
               Você adia tarefas com frequência,
               deixando para amanhã o que
               deveria fazer hoje?
               """, "PERGUNTA 08", YES_NO_OPTION);

        answers[8] = JOptionPane.showConfirmDialog(null, """
               Você sofre de insônia, pesadelos
               ou outros problemas para dormir?
               """, "PERGUNTA 09", YES_NO_OPTION);

        answers[9] = JOptionPane.showConfirmDialog(null, "Você se magoa quando outras pessoas\n" +
                "encontram falhas em você?", "PERGUNTA 10", YES_NO_OPTION);

    }

    public static void performsDiagnosis(int[] vector) {

        int count = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == JOptionPane.YES_NO_OPTION) count= count+ recursão(1);
        }
        System.out.println(count); //teste

        if (count <= 2) {
            JOptionPane.showMessageDialog(null, "Você não está propenso a desenvolver problemas emocionais\n" +
                    "Você lida bem com as dificudades do dia a dia!", "DIAGNÓSTICO", JOptionPane.INFORMATION_MESSAGE);

        } else if (count <= 5) {
            JOptionPane.showMessageDialog(null, "A sua saúde mental pode estar enfrentado problemas,\n" +
                    " é um momento de alerta, no qual voce deve buscar ajuda!", "DIAGNÓSTICO", JOptionPane.INFORMATION_MESSAGE);

        } else if (count <= 10) {
            JOptionPane.showMessageDialog(null, "A sua saúde mental se encotra em risco,\n" +
                    "conversar é sempre bom. Procure ajuda!", "DIAGNÓSTICO", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    public static void imprimiImage(String caminho, int num) {
         new Imagem(caminho, num);
    }
    public static int recursão (int num){
        if(num==0){
            return 1;
        }
        return  recursão(num-1) + 1;
    }
}