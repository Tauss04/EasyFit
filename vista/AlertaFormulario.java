package vista;

import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

public class AlertaFormulario {

    private final JPanel contentPanel = new JPanel();
    private JDialog ventanaAlerta;
    
    public AlertaFormulario() {
    	ventanaAlerta = new JDialog();
    	ventanaAlerta.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    	ventanaAlerta.setModalityType(JDialog.DEFAULT_MODALITY_TYPE);
        ventanaAlerta.setResizable(false);
        ventanaAlerta.setTitle("¡¡ALERTA!!");
        ventanaAlerta.setIconImage(Toolkit.getDefaultToolkit().getImage(AlertaFormulario.class.getResource("/imagenes/log.jpg")));
        ventanaAlerta.setSize(296, 253);
        ventanaAlerta.setLocationRelativeTo(null);
        ventanaAlerta.getContentPane().setLayout(new BorderLayout());
        contentPanel.setBackground(Color.BLACK);
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        ventanaAlerta.getContentPane().add(contentPanel, BorderLayout.WEST);
        GridBagLayout gbl_contentPanel = new GridBagLayout();
        gbl_contentPanel.columnWidths = new int[]{129, 0, 0, 0, 0, 0, 0, 176, 0};
        gbl_contentPanel.rowHeights = new int[]{45, 0, 0, 0, 0, 0};
        gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
        contentPanel.setLayout(gbl_contentPanel);
        {
            JTextPane txtpnAlerta = new JTextPane();
            txtpnAlerta.setEditable(false);
            txtpnAlerta.setBackground(Color.BLACK);
            txtpnAlerta.setForeground(Color.RED);
            txtpnAlerta.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 30));
            txtpnAlerta.setText("CUIDADO!!");
            GridBagConstraints gbc_txtpnAlerta = new GridBagConstraints();
            gbc_txtpnAlerta.gridwidth = 7;
            gbc_txtpnAlerta.insets = new Insets(0, 0, 5, 5);
            gbc_txtpnAlerta.gridx = 0;
            gbc_txtpnAlerta.gridy = 1;
            contentPanel.add(txtpnAlerta, gbc_txtpnAlerta);
        }
        {
            JTextPane txtpnCompletaElCampo = new JTextPane();
            txtpnCompletaElCampo.setEditable(false);
            txtpnCompletaElCampo.setFont(new Font("Tahoma", Font.PLAIN, 22));
            txtpnCompletaElCampo.setForeground(Color.WHITE);
            txtpnCompletaElCampo.setText("      Completa el campo ");
            txtpnCompletaElCampo.setBackground(Color.BLACK);
            GridBagConstraints gbc_txtpnCompletaElCampo = new GridBagConstraints();
            gbc_txtpnCompletaElCampo.gridwidth = 6;
            gbc_txtpnCompletaElCampo.fill = GridBagConstraints.HORIZONTAL;
            gbc_txtpnCompletaElCampo.insets = new Insets(0, 0, 5, 5);
            gbc_txtpnCompletaElCampo.gridx = 0;
            gbc_txtpnCompletaElCampo.gridy = 2;
            contentPanel.add(txtpnCompletaElCampo, gbc_txtpnCompletaElCampo);
        }
        {
            JTextPane txtpnCodigoPostal = new JTextPane();
            txtpnCodigoPostal.setForeground(Color.WHITE);
            txtpnCodigoPostal.setBackground(Color.BLACK);
            txtpnCodigoPostal.setFont(new Font("Tahoma", Font.PLAIN, 22));
            txtpnCodigoPostal.setText("          codigo Postal");
            GridBagConstraints gbc_txtpnCodigoPostal = new GridBagConstraints();
            gbc_txtpnCodigoPostal.gridwidth = 7;
            gbc_txtpnCodigoPostal.insets = new Insets(0, 0, 5, 5);
            gbc_txtpnCodigoPostal.fill = GridBagConstraints.BOTH;
            gbc_txtpnCodigoPostal.gridx = 0;
            gbc_txtpnCodigoPostal.gridy = 3;
            contentPanel.add(txtpnCodigoPostal, gbc_txtpnCodigoPostal);
        }
    }

    public void mostrar() {
        ventanaAlerta.setVisible(true);
    }

}

