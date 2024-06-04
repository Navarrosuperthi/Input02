import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Não precisa colocar nada aqui, só uma mensagem", // Ira aparecer uma mensagem escrita isso que esta entre as aspas
                "WhatsApp",
                0);

        
        String Input1 = (String)JOptionPane.showInputDialog(null,
                "Isso é uma pergunta?",
                "Caixa de dialogo",
                2,
                null,
                null,
                "Fale algo aqui.");
        
        
        String[] acceptableValues = {"Escolha 1", "Escolha 2", " Escolha 3"}; // serao dados 3 opçoes de escolhas para ser selecionadas
        String Input2 = (String)JOptionPane.showInputDialog(null,
                "Isso e uma pergunta?",
                "Caixa de dialogo",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
