package calculadora_de_cuanto_te_quiero;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class CalculadoraAmor extends JFrame {

    private JTextField txtTuNombre;
    private JTextField txtSuNombre;
    private JLabel lblCompatibilidad;
    private JLabel lblGustas;
    private JLabel lblDejarDeQuerer;
    private JLabel lblMensaje;

    public CalculadoraAmor() {

        setTitle("💗 Calculadora del Amor 💗");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(255, 220, 230));

        JLabel titulo = new JLabel("💗 CALCULADORA DEL AMOR 💗");
        titulo.setBounds(85, 20, 350, 40);
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        panel.add(titulo);

        JLabel lblTuNombre = new JLabel("Tu nombre:");
        lblTuNombre.setBounds(70, 90, 100, 25);
        panel.add(lblTuNombre);

        txtTuNombre = new JTextField();
        txtTuNombre.setBounds(170, 90, 250, 30);
        panel.add(txtTuNombre);

        JLabel lblSuNombre = new JLabel("Nombre de pareja:");
        lblSuNombre.setBounds(70, 140, 100, 25);
        panel.add(lblSuNombre);

        txtSuNombre = new JTextField();
        txtSuNombre.setBounds(170, 140, 250, 30);
        panel.add(txtSuNombre);

        JButton btnCalcular = new JButton("CALCULAR ❤️");
        btnCalcular.setBounds(150, 190, 200, 40);
        panel.add(btnCalcular);

        lblCompatibilidad = new JLabel("💘 Compatibilidad: ---");
        lblCompatibilidad.setBounds(80, 260, 350, 30);
        lblCompatibilidad.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(lblCompatibilidad);

        lblGustas = new JLabel("💕 Probabilidad de que me gustes: ---");
        lblGustas.setBounds(80, 300, 380, 30);
        lblGustas.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(lblGustas);

        lblDejarDeQuerer = new JLabel("💔 Probabilidad de dejar de quererte: ---");
        lblDejarDeQuerer.setBounds(80, 340, 380, 30);
        lblDejarDeQuerer.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(lblDejarDeQuerer);

        lblMensaje = new JLabel("💕 Esperando resultados...");
        lblMensaje.setBounds(60, 390, 400, 40);
        lblMensaje.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(lblMensaje);

        JButton btnLimpiar = new JButton("Intentar otra vez");
        btnLimpiar.setBounds(160, 440, 180, 30);
        panel.add(btnLimpiar);

        // BOTÓN CALCULAR
        btnCalcular.addActionListener(e -> calcularAmor());

        // BOTÓN LIMPIAR
        btnLimpiar.addActionListener(e -> {
            txtTuNombre.setText("");
            txtSuNombre.setText("");

            lblCompatibilidad.setText("💘 Compatibilidad: ---");
            lblGustas.setText("💕 Probabilidad de que me gustes: ---");
            lblDejarDeQuerer.setText(
                    "💔 Probabilidad de dejar de quererte: ---"
            );
            lblMensaje.setText("💕 Esperando resultados...");
        });

        add(panel);
    }

    private void calcularAmor() {

        String tuNombre = txtTuNombre.getText().trim();
        String suNombre = txtSuNombre.getText().trim();

        if (tuNombre.isEmpty() || suNombre.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Primero escribe los dos nombres ❤️",
                    "Faltan datos",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        Random random = new Random();

        // Resultado completamente falso 😂
        int compatibilidad = 100;

        // Porcentaje exagerado a propósito
        int probabilidadGustas = 999999 + random.nextInt(100000);

        lblCompatibilidad.setText(
                "💘 Compatibilidad: " + compatibilidad + "%"
        );

        lblGustas.setText(
                "💕 Probabilidad de que me gustes: "
                + probabilidadGustas + "%"
        );

        lblDejarDeQuerer.setText(
                "💔 Probabilidad de dejar de quererte: ERROR 404"
        );

        String[] mensajes = {
            "El algoritmo determinó que ya valí madres contigo. ❤️",
            "Error: eres demasiado increíble para calcularlo. 💕",
            "100% compatible. La ciencia no puede explicarlo. 🧪❤️",
            "Se detectó una cantidad peligrosa de enamoramiento. 🚨💕",
            "El sistema concluye que me gustas demasiado. ❤️",
            "ERROR: demasiados sentimientos encontrados. 💗"
        };

        String mensaje = mensajes[random.nextInt(mensajes.length)];

        lblMensaje.setText(mensaje);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            CalculadoraAmor ventana = new CalculadoraAmor();
            ventana.setVisible(true);
        });
    }
}