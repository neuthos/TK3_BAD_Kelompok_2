/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tk3_bad;


/**
 *
 * @author Annas
 */
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tk3_bad extends JFrame {
    private JLabel label1, label2, label3, label4;
    private JTextField user;
    private JPasswordField pass;
    private JButton masuk, keluar;
    private JCheckBox tampilpass;

    public Tk3_bad() {
        setTitle("Form Login");
        setLayout(null);

        label1 = new JLabel("Username:");
        label1.setBounds(50, 50, 80, 25);
        add(label1);

        user = new JTextField();
        user.setBounds(150, 50, 150, 25);
        add(user);

        label2 = new JLabel("Password:");
        label2.setBounds(50, 90, 80, 25);
        add(label2);

        pass = new JPasswordField();
        pass.setBounds(150, 90, 150, 25);
        add(pass);

        tampilpass = new JCheckBox("Tampilkan Password");
        tampilpass.setBounds(150, 130, 150, 25);
        add(tampilpass);

        label3 = new JLabel();
        label3.setBounds(50, 170, 250, 25);
        add(label3);
        
        label4 = new JLabel("Login User");
        label4.setBounds(140, 10, 80, 25);
        add(label4);

        masuk = new JButton("Masuk");
        masuk.setBounds(50, 210, 80, 25);
        add(masuk);
        masuk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = user.getText();
                String password = new String(pass.getPassword());
                label3.setText("Berhasil! Username: " + username + " Password: " + password);
            }
        });

        keluar = new JButton("Keluar");
        keluar.setBounds(200, 210, 80, 25);
        add(keluar);
        keluar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int confirmed = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (confirmed == JOptionPane.YES_OPTION) {
                    // Tutup program
                    System.exit(0);
                } else {
                    // Batal keluar
                }
            }
        });

        tampilpass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tampilpass.isSelected()) {
                    pass.setEchoChar((char) 0);
                } else {
                    pass.setEchoChar('*');
                }
            }
        });

        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Tk3_bad();
    }
}


