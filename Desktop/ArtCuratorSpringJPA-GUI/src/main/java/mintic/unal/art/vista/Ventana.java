/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.unal.art.vista;

import java.util.Optional;
import mintic.unal.art.ArtApplication;
import mintic.unal.art.SpringContext;
import mintic.unal.art.modelos.Serie;
import mintic.unal.art.repositorios.SerieRepositorio;

/**
 *
 * @author daniela
 */
public class Ventana extends javax.swing.JFrame {

   
    SerieRepositorio serieRepositorio;
    
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        
        String [] args = {};
        ArtApplication.runSpringServer(args);
         
        serieRepositorio = SpringContext.getBean(SerieRepositorio.class);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        btConsultar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfCosto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfTipo = new javax.swing.JTextField();
        btCrear = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        lbNotificaciones = new javax.swing.JLabel();
        btEliminar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        tfId = new javax.swing.JFormattedTextField();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("id");

        btConsultar.setText("Consultar Serie por id");
        btConsultar.setActionCommand("");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Capitulos");

        jLabel4.setText("Temporadas");

        tfTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTipoActionPerformed(evt);
            }
        });

        btCrear.setText("Crear");
        btCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearActionPerformed(evt);
            }
        });

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        btLimpiar.setText("Limpiar");
        btLimpiar.setToolTipText("");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        tfId.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(1, 1, 1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btGuardar))
                        .addGap(51, 51, 51)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbNotificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btLimpiar)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btConsultar)
                    .addComponent(btCrear)
                    .addComponent(btEliminar)
                    .addComponent(btLimpiar)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNotificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTipoActionPerformed
        
    }//GEN-LAST:event_tfTipoActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        if(!tfId.getText().equals("")){
            buscarPorId();
            tfId.setEnabled(true);
        }
        else{
            lbNotificaciones.setText("No ha digitado ningun id");
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearActionPerformed
        limpiarCamposParaCreacion();
    }//GEN-LAST:event_btCrearActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        crear();
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        if(!tfId.getText().equals("")){
            eliminar();
        }
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void tfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btCrear;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbNotificaciones;
    private javax.swing.JTextField tfCosto;
    private javax.swing.JFormattedTextField tfId;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTipo;
    // End of variables declaration//GEN-END:variables

    public void limpiarCamposParaCreacion(){
        tfId.setEnabled(false);
        btCrear.setEnabled(false);
        tfNombre.setText("");
        tfCosto.setText("");
        tfTipo.setText("");
        tfId.setText("");
        lbNotificaciones.setText("");
    }
    
    public void limpiarCampos(){
        tfId.setEnabled(true);
        btCrear.setEnabled(true);
        tfNombre.setText("");
        tfCosto.setText("");
        tfTipo.setText("");
        tfId.setText("");
        lbNotificaciones.setText("");
    }
    
    private void buscarPorId() {
        
        Long id = Long.parseLong(tfId.getText());
        Optional<Serie> optionalSerie = serieRepositorio.findById(id);
        if(optionalSerie.isPresent()){
            Serie serie = optionalSerie.get();
            tfNombre.setText(serie.getSerieNombre());
            tfCosto.setText(serie.getSerieTemp().toString());
            tfTipo.setText(serie.getSerieCap());
            
            
            lbNotificaciones.setText(
                    "La Serie: " + tfNombre.getText() + 
                            " ha sido correctamente buscada");
        }
        else{
            // Error cuando no existe el id
            lbNotificaciones.setText(
                    "La Serie: " + tfNombre.getText() + 
                            " no existe en la base de datos");
        }
    }

    private Serie obtenerDatosDeFormulario(){
        Serie serie = new Serie();
        serie.setSerieNombre(tfNombre.getText());
        serie.setSerieTemp(Long.parseLong(tfCosto.getText()));
        serie.setSerieCap(tfTipo.getText());
        return serie;
    }
    
    private void crear() {
        Serie serie = obtenerDatosDeFormulario();

        
//        String a = "";
//        a = a + "3";
//        a = a + "4";
        
        Long id;
        StringBuffer respuesta = new StringBuffer();
        if(tfId.getText().equals("")){
            id = null;
            respuesta.append("Se creó la Serie: ");
        }
        else{
            id = Long.parseLong(tfId.getText());
            respuesta.append("Se actualizó la Serie: ");
        }
         
        serie.setSerieId(id);
                
        try{
            serieRepositorio.save(serie); 
            respuesta.append(serie.getSerieId()); //
            tfId.setText(serie.getSerieId().toString());
            lbNotificaciones.setText(respuesta.toString());
        }
        catch(Exception e)
        {
            lbNotificaciones.setText("Ocurrio un error al guardar");
        }
       
    }
   
    public void eliminar(){
        Long id = Long.parseLong(tfId.getText());
        
        try{
            serieRepositorio.deleteById(id);
            lbNotificaciones.setText("Se eliminó la serie: " + id.toString());
        }
        catch(Exception e)
        {
            lbNotificaciones.setText("Ocurrio un error al eliminar");
        }
                
    }
}
