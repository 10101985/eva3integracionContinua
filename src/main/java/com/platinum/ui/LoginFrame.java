package com.platinum.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginFrame() {
        setTitle("Banco Platinum - Inicio de Sesión");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10));

        JLabel usernameLabel = new JLabel("Usuario:");
        usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Iniciar Sesión");

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);
                

               
                // Llamamos al método de inicio de sesión y verificamos las credenciales
                boolean loginSuccess = performLogin(username, password);
                

                // Mostramos el mensaje según el resultado del inicio de sesión
                if (loginSuccess) {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Inicio de sesión exitoso");
                    // Puedes abrir la siguiente ventana o realizar otras acciones
                } else {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Credenciales incorrectas");
                }
            }
        });

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);

        add(panel);
        setVisible(true);
    }

    // Método que realiza la lógica de inicio de sesión
    private boolean performLogin(String username, String password) {
        // Aquí deberías implementar tu lógica de verificación de credenciales
        // Puedes consultar la base de datos o realizar cualquier otra validación
        
        // Ejemplo básico: usuario "admin" con contraseña "123456"
        return username.equals("admin") && password.equals("123456");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginFrame());
    }
}
