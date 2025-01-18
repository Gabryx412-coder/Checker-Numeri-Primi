import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
import javax.swing.Timer;

public class SuperAdvancedPrimeChecker {

    // Funzione per verificare se un numero è primo
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Funzione per calcolare i fattori di un numero
    public static List<Integer> getFactors(int number) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

    // Funzione per calcolare il fattoriale
    public static long factorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // Funzione per calcolare la somma dei numeri da 1 a n
    public static long sumUpTo(int number) {
        return (long) number * (number + 1) / 2;
    }

    // Funzione per calcolare se un numero è perfetto
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    // Funzione per verificare se un numero è palindromo
    public static boolean isPalindrome(int number) {
        String numStr = Integer.toString(number);
        String reversed = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(reversed);
    }

    // Funzione per creare l'interfaccia grafica
    public static void createAndShowGUI() {
        // Creazione della finestra principale
        JFrame frame = new JFrame("Super Verifica Numeri e Operazioni");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 600);
        frame.setLocationRelativeTo(null); // Centra la finestra
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);

        // Imposta il colore di sfondo principale
        frame.getContentPane().setBackground(new Color(240, 240, 240));

        // Pannello centrale con effetti di bordi arrotondati e sfondo colorato
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(55, 58, 60));
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        frame.add(mainPanel, BorderLayout.CENTER);

        // Titolo
        JLabel titleLabel = new JLabel("Super Verifica e Operazioni Matematiche", JLabel.CENTER);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        mainPanel.add(titleLabel);
        mainPanel.add(Box.createVerticalStrut(10));

        // Pannello per l'input
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        inputPanel.setBackground(new Color(55, 58, 60));

        JLabel numberLabel = new JLabel("Inserisci un numero:");
        numberLabel.setForeground(Color.WHITE);
        numberLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        inputPanel.add(numberLabel);

        JTextField numberField = new JTextField(10);
        numberField.setFont(new Font("Arial", Font.PLAIN, 16));
        numberField.setPreferredSize(new Dimension(120, 30));
        numberField.setBackground(new Color(230, 230, 230));
        numberField.setBorder(new LineBorder(new Color(150, 150, 150), 2, true));
        inputPanel.add(numberField);

        mainPanel.add(inputPanel);
        mainPanel.add(Box.createVerticalStrut(20));

        // Combo box per selezionare l'operazione
        String[] operations = {
            "Verifica se è Primo", "Fattori del Numero", "Fattoriale", "Somma dei Numeri", "Verifica se è Perfetto", "Verifica se è Palindromo"
        };
        JComboBox<String> operationsComboBox = new JComboBox<>(operations);
        operationsComboBox.setFont(new Font("Arial", Font.PLAIN, 14));
        operationsComboBox.setPreferredSize(new Dimension(200, 30));
        operationsComboBox.setBackground(new Color(230, 230, 230));
        mainPanel.add(operationsComboBox);
        mainPanel.add(Box.createVerticalStrut(20));

        // Bottone di esecuzione con icona
        JButton executeButton = new JButton("Esegui Operazione");
        executeButton.setFont(new Font("Arial", Font.BOLD, 14));
        executeButton.setForeground(Color.WHITE);
        executeButton.setBackground(new Color(50, 150, 255));
        executeButton.setFocusPainted(false);
        executeButton.setBorder(new LineBorder(new Color(50, 150, 255), 2, true));
        executeButton.setPreferredSize(new Dimension(180, 40));
        executeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        mainPanel.add(executeButton);

        // Pannello per i risultati
        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        resultPanel.setBackground(new Color(55, 58, 60));

        JLabel resultLabel = new JLabel("");
        resultLabel.setForeground(Color.WHITE);
        resultLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        resultPanel.add(resultLabel);

        // Barra di progresso
        JProgressBar progressBar = new JProgressBar();
        progressBar.setIndeterminate(true);
        progressBar.setBackground(new Color(230, 230, 230));
        progressBar.setForeground(new Color(50, 150, 255));
        progressBar.setPreferredSize(new Dimension(300, 10));
        resultPanel.add(progressBar);

        mainPanel.add(resultPanel);

        // Azione del bottone
        executeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ottieni il numero dal campo di testo
                String input = numberField.getText();
                try {
                    int number = Integer.parseInt(input);

                    // Mostra la barra di progressione
                    progressBar.setVisible(true);
                    resultLabel.setText("Esecuzione...");
                    resultPanel.repaint();

                    // Simula un ritardo per l'elaborazione
                    Executors.newSingleThreadExecutor().submit(() -> {
                        try {
                            // Ritardo per simulare l'elaborazione
                            Thread.sleep(2000);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }

                        String operation = (String) operationsComboBox.getSelectedItem();
                        String resultText = "";

                        // Esegui l'operazione selezionata
                        switch (operation) {
                            case "Verifica se è Primo":
                                resultText = isPrime(number) ? number + " è un numero primo." : number + " non è un numero primo.";
                                break;
                            case "Fattori del Numero":
                                List<Integer> factors = getFactors(number);
                                resultText = "Fattori: " + factors.toString();
                                break;
                            case "Fattoriale":
                                resultText = "Fattoriale di " + number + " è: " + factorial(number);
                                break;
                            case "Somma dei Numeri":
                                resultText = "Somma dei numeri da 1 a " + number + " è: " + sumUpTo(number);
                                break;
                            case "Verifica se è Perfetto":
                                resultText = isPerfect(number) ? number + " è un numero perfetto." : number + " non è un numero perfetto.";
                                break;
                            case "Verifica se è Palindromo":
                                resultText = isPalindrome(number) ? number + " è un numero palindromo." : number + " non è un numero palindromo.";
                                break;
                        }

                        // Modifica la GUI per mostrare il risultato
                        SwingUtilities.invokeLater(() -> {
                            resultLabel.setText(resultText);
                            progressBar.setVisible(false);
                        });
                    });

                } catch (NumberFormatException ex) {
                    resultLabel.setText("Errore: Inserisci un numero valido.");
                }
            }
        });

        // Mostra la finestra
        frame.setVisible(true);
    }

    // Metodo principale per avviare l'applicazione
    public static void main(String[] args) {
        // Esegui il codice in modo sicuro nel thread dell'interfaccia utente
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
}
