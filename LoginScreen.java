import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame {
    
 //CONSTRUCTOR 
    public LoginScreen() {
        // Configuramos la ventana (JFrame)
        setTitle("Agenda Básica - Inicio");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Centra la ventana en la pantalla

        // Panel para los botones
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1, 10, 10)); // 2 filas, 1 columna, 10px de espacio

        // Crear botones
        JButton btnRegistro = new JButton("Registrarse");
        JButton btnLogin = new JButton("Iniciar Sesión");

        // Añadir botones al panel
        panel.add(btnRegistro);
        panel.add(btnLogin);

        // Añadir el panel a la ventana
        add(panel);

        // Mostrar la ventana
        setVisible(true);

        // Acción para el botón "Registrarse"
        btnRegistro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí llamaremos a la ventana de registro
                mostrarRegistro();
            }
        });

        // Acción para el botón "Iniciar Sesión"
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí llamaremos a la ventana de login
                mostrarLogin();
            }
        });
    }

    // Método para mostrar la ventana de registro
    private void mostrarRegistro() {
        JOptionPane.showMessageDialog(this, "Ventana de Registro (por implementar)");
        // Aquí más adelante vamos a abrir la pantalla de registro
    }

    // Método para mostrar la ventana de login
    private void mostrarLogin() {
        JOptionPane.showMessageDialog(this, "Ventana de Login (por implementar)");
        // Aquí más adelante vamos a abrir la pantalla de inicio de sesión
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        new LoginScreen();  // Crear y mostrar la pantalla de inicio
    }
    
}
