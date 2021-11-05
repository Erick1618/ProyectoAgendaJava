
package main;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Formulario extends javax.swing.JFrame {
      Menu menu = new  Menu();
      Pendiente nuevo = new Pendiente();
      Archivos saveContenido = new Archivos();
      Archivos saveFecha = new Archivos();
      Archivos saveHora = new Archivos();
      Archivos cargar = new Archivos();
      Calendar calendario = Calendar.getInstance();
      Calendar po = Calendar.getInstance();
      Archivos saveDia = new Archivos();
      Archivos saveMes = new Archivos();
      Archivos saveAnio = new Archivos();
      
    public Formulario() {
        initComponents();
        botonModificar_estado(false);
        fechaModificar_estado(false);
        archNombre();
        this.setLocationRelativeTo(null);
    }
 
    public void archNombre(){
         saveContenido.setNombre("Evento");
         saveFecha.setNombre("Fecha");
         saveHora.setNombre("Hora");
         saveAnio.setNombre("Anio");
         saveDia.setNombre("Dia");
         saveMes.setNombre("Mes");
                 
    }
    
   public void  chooserAlendar_Estado(boolean estado){
       rsFecha.setEnabled(estado);
   }
   
   public void botonModificar_estado(boolean estado){
        jbModificarForm.setVisible(estado);
  
    }
   
   public void fechaModificar_estado(boolean estado){
        jtFechaGuardada.setVisible(estado);
        jBActivaFecha.setVisible(estado);
        jLMFecha.setVisible(estado);
        
    }
     
   public void botonAceptar_estado(boolean estado){
        jbAceptar.setVisible(estado);
    }
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbCancelar = new javax.swing.JButton();
        jLevento = new javax.swing.JLabel();
        jtHora = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtContenido = new javax.swing.JTextArea();
        jbAceptar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLFecha = new javax.swing.JLabel();
        jbModificarForm = new javax.swing.JButton();
        jBActivaFecha = new javax.swing.JButton();
        jLMFecha = new javax.swing.JLabel();
        rsFecha = new com.toedter.calendar.JDateChooser();
        jtFechaGuardada = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jLevento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLevento.setText("Nuevo Evento");

        jtContenido.setColumns(20);
        jtContenido.setRows(5);
        jScrollPane1.setViewportView(jtContenido);

        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("Detalles del Evento");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("Hora");

        jLabel5.setText("Formato de Hora : 24hrs.");

        jLabel6.setText("Agenda");

        jLFecha.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLFecha.setText("Fecha");

        jbModificarForm.setText("Modificar");
        jbModificarForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarFormActionPerformed(evt);
            }
        });

        jBActivaFecha.setText("Activar Fecha");
        jBActivaFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActivaFechaActionPerformed(evt);
            }
        });

        jLMFecha.setText("¿Desea Modificar la Fecha?");

        jtFechaGuardada.setForeground(new java.awt.Color(0, 0, 0));
        jtFechaGuardada.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtFechaGuardada.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jbCancelar)
                            .addGap(35, 35, 35)
                            .addComponent(jbModificarForm)
                            .addGap(27, 27, 27)
                            .addComponent(jbAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4)
                                        .addComponent(jtHora)
                                        .addComponent(jLabel3)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                        .addComponent(jLFecha)
                                        .addComponent(rsFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(97, 97, 97)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(107, 107, 107)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtFechaGuardada)
                                        .addComponent(jBActivaFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGap(29, 29, 29)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLMFecha))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLevento)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(14, 14, 14)
                .addComponent(jLevento)
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(17, 17, 17)
                .addComponent(jLFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rsFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLMFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jtFechaGuardada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBActivaFecha)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbAceptar)
                    .addComponent(jbModificarForm))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        dispose();
        menu.limpiarLista();
        menu.caragaAutomatica();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

    public void eliminaDatos(){
       Main.agenda.remove(Main.seleccionado).getContenido();
       Main.agenda.remove(Main.seleccionado).getFecha();
       Main.agenda.remove(Main.seleccionado).getHora(); 
       Main.agenda.remove(Main.seleccionado); 
    }
    
    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        
       
       
        String formtoFecha = "dd MMMM yyyy";
        Date fecha = rsFecha.getDate();      
        SimpleDateFormat formato = new SimpleDateFormat(formtoFecha);
        
        if(calendario.compareTo(rsFecha.getCalendar())== -1)
          {    
               po = rsFecha.getCalendar();
               int a = po.get(Calendar.YEAR);
               String an = Integer.toString(a);
               int m =  po.get(Calendar.MONTH);
               String me = Integer.toString(m);
               int d =  po.get(Calendar.DAY_OF_MONTH);
               String di = Integer.toString(d);
               
               nuevo.setAnio(an);
               nuevo.setDia(di);
               nuevo.setMes(me);
               nuevo.setHora(jtHora.getText());
               nuevo.setContenido(jtContenido.getText());
               nuevo.setId(Main.ultimo);
               nuevo.setFecha(formato.format(fecha));
               Main.agenda.put(Main.ultimo,nuevo);
               Main.ultimo++;

               cargar.eliminarArchivo("Evento");
               cargar.eliminarArchivo("Fecha");
               cargar.eliminarArchivo("Hora");
               cargar.eliminarArchivo("Anio");
               cargar.eliminarArchivo("Dia");
               cargar.eliminarArchivo("Mes");


               for(Integer j=0; j < Main.ultimo; j++){
                   if(Main.agenda.get(j) != null){
                        saveContenido.generarArchivo(Main.agenda.get(j).getContenido());
                        saveFecha.generarArchivo(Main.agenda.get(j).getFecha());
                        saveHora.generarArchivo(Main.agenda.get(j).getHora());
                        saveAnio.generarArchivo(Main.agenda.get(j).getAnio());
                        saveDia.generarArchivo(Main.agenda.get(j).getDia());
                        saveMes.generarArchivo(Main.agenda.get(j).getMes());
                    }

                }
                dispose();
                
                menu.setVisible(true);
                menu.limpiarLista();
                menu.caragaAutomatica();
          }
          else
          {
           JOptionPane.showMessageDialog(null, "Seleccione una Fecha posterior a la actual");
          }
        
        
        
    }//GEN-LAST:event_jbAceptarActionPerformed

    private void jbModificarFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarFormActionPerformed
 
        String formtoFecha = "dd MMMM yyyy";
        Date fecha = rsFecha.getDate();
        SimpleDateFormat formato = new SimpleDateFormat(formtoFecha); 
        int i = 1;
       
       
            
            nuevo.setHora(jtHora.getText());
            nuevo.setContenido(jtContenido.getText());
            nuevo.setId(Main.ultimo);
            if(rsFecha.getDate() != null) { i=2; }
            
            switch(i)
            {
                case 1:
                        nuevo.setFecha(Main.fechaTemp);
                        nuevo.setAnio(Main.anio);
                        nuevo.setDia(Main.dia);
                        nuevo.setMes(Main.mes);
                        Main.agenda.put(Main.seleccionado,nuevo);


                        cargar.eliminarArchivo("Evento");
                        cargar.eliminarArchivo("Fecha");
                        cargar.eliminarArchivo("Hora");
                        cargar.eliminarArchivo("Anio");
                        cargar.eliminarArchivo("Dia");
                        cargar.eliminarArchivo("Mes");

                        for(Integer j=0; j < Main.ultimo; j++){
                            if(Main.agenda.get(j) != null){
                                 saveContenido.generarArchivo(Main.agenda.get(j).getContenido());
                                 saveFecha.generarArchivo(Main.agenda.get(j).getFecha());
                                 saveHora.generarArchivo(Main.agenda.get(j).getHora());
                                 saveAnio.generarArchivo(Main.agenda.get(j).getAnio());
                                 saveDia.generarArchivo(Main.agenda.get(j).getDia());
                                 saveMes.generarArchivo(Main.agenda.get(j).getMes());
                            }

                        }
                        dispose();
                        this.setVisible(false);
                        menu.setVisible(true);
                        menu.limpiarLista();
                        menu.caragaAutomatica(); break;
                    
                case 2:
                    if(calendario.compareTo(rsFecha.getCalendar())== -1){
                       
                        po = rsFecha.getCalendar();
                        int a = po.get(Calendar.YEAR);
                        String an = Integer.toString(a);
                        int m =  po.get(Calendar.MONTH);
                        String me = Integer.toString(m);
                        int d =  po.get(Calendar.DAY_OF_MONTH);
                        String di = Integer.toString(d);

                        nuevo.setAnio(an);
                        nuevo.setDia(di);
                        nuevo.setMes(me);
                        nuevo.setFecha(formato.format(fecha));
                        Main.agenda.put(Main.seleccionado,nuevo);

                        cargar.eliminarArchivo("Evento");
                        cargar.eliminarArchivo("Fecha");
                        cargar.eliminarArchivo("Hora");
                        cargar.eliminarArchivo("Anio");
                        cargar.eliminarArchivo("Dia");
                        cargar.eliminarArchivo("Mes");

                        for(Integer j=0; j < Main.ultimo; j++){
                          if(Main.agenda.get(j) != null){
                              
                               saveContenido.generarArchivo(Main.agenda.get(j).getContenido());
                               saveFecha.generarArchivo(Main.agenda.get(j).getFecha());
                               saveHora.generarArchivo(Main.agenda.get(j).getHora());
                               saveAnio.generarArchivo(Main.agenda.get(j).getAnio());
                               saveDia.generarArchivo(Main.agenda.get(j).getDia());
                               saveMes.generarArchivo(Main.agenda.get(j).getMes());
                            }

                        }
                        dispose();
                        this.setVisible(false);
                        menu.setVisible(true);
                        menu.limpiarLista();
                        menu.caragaAutomatica();

                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Seleccione una Fecha posterior a la actual");
                        } break;
            }
            
                
            
           
           
            
      
    }//GEN-LAST:event_jbModificarFormActionPerformed

    private void jBActivaFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActivaFechaActionPerformed
       
       fechaModificar_estado(false);
       chooserAlendar_Estado(true);
       
    }//GEN-LAST:event_jBActivaFechaActionPerformed

    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActivaFecha;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLMFecha;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLevento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAceptar;
    public javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbModificarForm;
    public javax.swing.JTextArea jtContenido;
    public javax.swing.JTextField jtFechaGuardada;
    public transient javax.swing.JTextField jtHora;
    private com.toedter.calendar.JDateChooser rsFecha;
    // End of variables declaration//GEN-END:variables

    
    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLevento() {
        return jLevento;
    }

    public void setjLevento(String jLevento) {
        this.jLevento.setText(jLevento);
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JButton getJbAceptar() {
        return jbAceptar;
    }

    public void setJbAceptar(JButton jbAceptar) {
        this.jbAceptar = jbAceptar;
    }

    public JButton getJbCancelar() {
        return jbCancelar;
    }

    public void setJbCancelar(JButton jbCancelar) {
        this.jbCancelar = jbCancelar;
    }

    public JTextArea getJtContenido() {
        return jtContenido;
    }

    public void setJtContenido(JTextArea jtContenido) {
        this.jtContenido = jtContenido;
    }

    public JTextField getJtHora() {
        return jtHora;
    }

    public void setJtHora(JTextField jtHora) {
        this.jtHora = jtHora;
    }
}

