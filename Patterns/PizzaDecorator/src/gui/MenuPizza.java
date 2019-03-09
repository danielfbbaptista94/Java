package gui;

import classes.*;
import interfaces.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class MenuPizza extends javax.swing.JFrame {

    private PluginController plugins;
    private DefaultListModel options;
    ArrayList<String> selecionado = new ArrayList<>();
    
    public MenuPizza() {
        plugins = new PluginController();
        options = new DefaultListModel();
        
        initComponents();
    }

    public final String[] listarIngredientes()
    {
        String[] listaplugins = new String[this.plugins.getLoadedPlugins().size()];
        for (int i = 0; i < listaplugins.length; i++) 
        {
            listaplugins[i] = this.plugins.getLoadedPlugins().get(i);
        }
        return listaplugins;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListIngredientes = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListIngredientesEscolhidos = new javax.swing.JList<>();
        jLabelMenuPizza = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
	jListIngredientes.setModel(new javax.swing.AbstractListModel<String>(){
		String[] lista = listarIngredientes();
		public int getSize(){
			return lista.length;
		}
		public String getElementAt(int i)
		{
			return lista[i];
		}
	});
        jScrollPane1.setViewportView(jListIngredientes);

        jScrollPane2.setViewportView(jListIngredientesEscolhidos);

        jLabelMenuPizza.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelMenuPizza.setText("Menu Pizza");

        jButtonAdd.setText(">>");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonRemove.setText("<<");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabelMenuPizza)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonConfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExit)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMenuPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButtonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRemove)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar)
                    .addComponent(jButtonExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        options.addElement(jListIngredientes.getSelectedValue());
        selecionado.add(jListIngredientes.getSelectedValue());
        jListIngredientesEscolhidos.setModel(options);
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        if(!jListIngredientesEscolhidos.isSelectionEmpty())
        {
            options.removeElement(jListIngredientesEscolhidos.getSelectedValue());
            selecionado.remove(jListIngredientesEscolhidos.getSelectedIndex());
        }
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        IComponent ultimoIngrediente = new Tradicional();
        
        URL[] jars = new URL[jListIngredientesEscolhidos.getModel().getSize()];

        for (int i = 0; i < jListIngredientesEscolhidos.getModel().getSize(); i++) {
            try {
                jars[i] = (new File("./ingredientes/" + jListIngredientesEscolhidos.getModel().getElementAt(i))).toURL();
            } catch (MalformedURLException ex) {
                Logger.getLogger(MenuPizza.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        URLClassLoader ulc = new URLClassLoader(jars);
        for (int i = 0; i < jListIngredientesEscolhidos.getModel().getSize(); i++) {
            String nome = jListIngredientesEscolhidos.getModel().getElementAt(i);
            Decorator decorator = null;
            try {
               decorator = (Decorator) Class.forName(nome.toLowerCase()+"."+ nome, true, ulc).newInstance();
               decorator.setDecorator(ultimoIngrediente);
               ultimoIngrediente = decorator;
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(MenuPizza.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        ultimoIngrediente.assar();
        JOptionPane.showMessageDialog(null, "Pedido Confirmado");
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new MenuPizza().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JLabel jLabelMenuPizza;
    private javax.swing.JList<String> jListIngredientes;
    private javax.swing.JList<String> jListIngredientesEscolhidos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
