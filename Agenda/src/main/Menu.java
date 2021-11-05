
package main;


import ds.desktop.notify.DesktopNotify;
import java.util.HashMap;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.awt.*;
import java.util.Calendar;
import rojeru_san.componentes.RSLabelFecha;
import rojeru_san.componentes.RSLabelHora;


public class Menu extends javax.swing.JFrame {
    
      public DefaultListModel modelo = new DefaultListModel();
      public DefaultListModel modelo1 = new DefaultListModel();
      public DefaultListModel modelo2 = new DefaultListModel();
      public DefaultListModel limpia = new DefaultListModel();
      
      Set<Integer> keys = Main.agenda.keySet();
      
      Archivos saveContenido = new Archivos();
      Archivos saveFecha = new Archivos();
      Archivos saveHora = new Archivos();
      Archivos cargar = new Archivos();
      Archivos saveDia = new Archivos();
      Archivos saveMes = new Archivos();
      Archivos saveAnio = new Archivos();
      
      
      private TrayIcon iconoTray;
      private SystemTray iconoSis;
           
     
    public Menu() {
        
        initComponents();
        limpiarLista();
        archNombre();
        caragaAutomatica();
        instanciarTray();
        this.setLocationRelativeTo(null);
    }
    
    public void notificacion(Image icon, String info)
    {
        DesktopNotify.showDesktopMessage("Agenda de Eventos", info , DesktopNotify.INFORMATION,icon,null,7000);
    }
      
    public void archNombre()
    {
         saveContenido.setNombre("Evento");
         saveFecha.setNombre("Fecha");
         saveHora.setNombre("Hora");
         saveAnio.setNombre("Anio");
         saveDia.setNombre("Dia");
         saveMes.setNombre("Mes");
    }
    
    public void instanciarTray()
    {
        iconoTray = new  TrayIcon(getIconImage(),"Tooltip del icono",popMenu);
        iconoTray.setImageAutoSize(true);
        iconoSis = SystemTray.getSystemTray();
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("main/editar.png"));
        return retValue;
    }
    
   
    public void caragaAutomatica(){
      
       for( Integer key = 0 ; key < Main.agenda.size();key++) {
           if(Main.agenda.get(key) != null){
                modelo.addElement(Main.agenda.get(key).getContenido());
           }
       }
       jLEvento.setModel(modelo);
       
       for( Integer key = 0 ; key < Main.agenda.size();key++) {
           if(Main.agenda.get(key) != null){
                modelo1.addElement(Main.agenda.get(key).getHora());
           }
       }
       jLHora.setModel(modelo1);
       
       for( Integer key = 0 ; key < Main.agenda.size();key++) {
           if(Main.agenda.get(key) != null){ 
                modelo2.addElement(Main.agenda.get(key).getFecha());
           }
       }
       jLFecha.setModel(modelo2);
       
   }
    
   
    public void limpiarLista(){
        modelo.removeAllElements();
        modelo2.removeAllElements();
        modelo1.removeAllElements();
        jLEvento.removeAll();
        jLHora.removeAll();
        jLFecha.removeAll();
    }
   
   public int calculaFechaEvento(String diaS,String mesS, String anioS)
    {
       int dia = Integer.parseInt(diaS);
       int mes = Integer.parseInt(mesS);
       int anio = Integer.parseInt(anioS);
       
       Calendar evento = Calendar.getInstance();
       evento.set(anio,mes,dia);
       evento.set(Calendar.HOUR,0);
       evento.set(Calendar.HOUR_OF_DAY,0);
       evento.set(Calendar.MINUTE,0);
       evento.set(Calendar.SECOND,0);
       
       Calendar actual = Calendar.getInstance();

       actual.set(Calendar.HOUR,0);
       actual.set(Calendar.HOUR_OF_DAY,0);
       actual.set(Calendar.MINUTE,0);
       actual.set(Calendar.SECOND,0);
       
       long actualms = actual.getTimeInMillis();
       long eventoms = evento.getTimeInMillis();
       
       int dias =(int) ((eventoms - actualms)/(1000*60*60*24));
       
       
        return dias;
    }   
   
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popMenu = new java.awt.PopupMenu();
        Agenda = new java.awt.MenuItem();
        salir = new java.awt.MenuItem();
        jPanel1 = new javax.swing.JPanel();
        rSFecha1 = new rojeru_san.componentes.RSLabelFecha();
        rSHora = new rojeru_san.componentes.RSLabelHora();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLEvento = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLFecha = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLHora = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbNuevo = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        popMenu.setLabel("popupMenu1");

        Agenda.setLabel("Abrir Agenda");
        Agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendaActionPerformed(evt);
            }
        });
        popMenu.add(Agenda);

        salir.setLabel("Cerrar programa");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        popMenu.add(salir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda");
        setIconImage(getIconImage());

        rSFecha1.setForeground(new java.awt.Color(0, 0, 0));

        rSHora.setForeground(new java.awt.Color(0, 0, 0));

        jLEvento.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jLEvento.setAutoscrolls(false);
        jLEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jLEvento);

        jScrollPane2.setViewportView(jLFecha);

        jScrollPane3.setViewportView(jLHora);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        jLabel1.setText("Hora - 24hrs.");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        jLabel2.setText("Fecha");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        jLabel3.setText("Evento");

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel4.setText("Agenda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbNuevo)
                                .addGap(46, 46, 46)
                                .addComponent(jbModificar)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jbEliminar)))
                        .addGap(0, 104, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rSFecha1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(rSHora, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(527, 527, 527)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rSFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        dispose();
        Formulario form = new Formulario();
        form.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

       Formulario form = new Formulario();
       form.setjLevento("Modificar Evento");
       
       try{
           Integer select = jLEvento.getMaxSelectionIndex();
           
           Main.seleccionado = select;
         
           if(0<=select){
              
               Main.fechaTemp = Main.agenda.get(select).getFecha();
               Main.anio = Main.agenda.get(select).getAnio();
               Main.mes = Main.agenda.get(select).getMes();
               Main.dia = Main.agenda.get(select).getDia();
               this.setVisible(false);
               form.setVisible(true);
               form.botonModificar_estado(true);
               form.fechaModificar_estado(true);
               form.botonAceptar_estado(false);
               form.chooserAlendar_Estado(false);
               form.jtFechaGuardada.setText(Main.fechaTemp);
               form.jtHora.setText(Main.agenda.get(select).getHora());
               form.jtContenido.setText(Main.agenda.get(select).getContenido());
               
           }
           else{
                JOptionPane.showMessageDialog(null, "Error: Seleccione un Evento");
           } 
            
       }
       catch(EnumConstantNotPresentException e){
           JOptionPane.showMessageDialog(null, "Error: antes de try");
       }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
       try{
           Integer select = jLEvento.getSelectedIndex();
           Integer i=0;
           HashMap <Integer,Pendiente> temp = new HashMap<Integer,Pendiente>();
          
           int f = 0;
           if(select>=0){
               modelo.removeAllElements();
               modelo.removeAllElements();
               modelo2.removeAllElements();
               
               if(Main.agenda.containsKey(select+1)){
                    Main.agenda.remove(select);
                    
                    for(f = select; f < Main.ultimo;f++){   
                        temp.put(i,Main.agenda.get(f+1));
                        Main.agenda.remove(f+1);
                        Main.agenda.put(f,temp.get(i));
                        
                    }
                   
                   Main.ultimo = Main.agenda.size();
               }
               else{
                   Main.agenda.remove(select);
                   Main.ultimo--;
               }
            
           }
           else{
                JOptionPane.showMessageDialog(null, "Error: Selecciones un Evento");
           } 
            cargar.eliminarArchivo("Anio");
            cargar.eliminarArchivo("Dia");
            cargar.eliminarArchivo("Mes");
            cargar.eliminarArchivo("Evento");
            cargar.eliminarArchivo("Fecha");
            cargar.eliminarArchivo("Hora");
            
           
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
           limpiarLista();
           caragaAutomatica();
           
           
            
       }
       catch(EnumConstantNotPresentException e){
           JOptionPane.showMessageDialog(null, "Error: Selecciones un Evento");
       }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed

        try
        {
            if(SystemTray.isSupported())
            {
               
                iconoSis.add(iconoTray);
                this.setVisible(false);
               
                
                
            }   
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void AgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendaActionPerformed
        
        iconoSis.remove(iconoTray);
//      this.initComponents();
        this.limpiarLista();
        this.caragaAutomatica();
        this.setVisible(true);
    }//GEN-LAST:event_AgendaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       Main.agenda.clear();
      
       System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.MenuItem Agenda;
    private javax.swing.JList<String> jLEvento;
    private javax.swing.JList<String> jLFecha;
    private javax.swing.JList<String> jLHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private java.awt.PopupMenu popMenu;
    private rojeru_san.componentes.RSLabelFecha rSFecha1;
    private rojeru_san.componentes.RSLabelHora rSHora;
    private java.awt.MenuItem salir;
    // End of variables declaration//GEN-END:variables

    public RSLabelFecha getrSFecha1() {
        return rSFecha1;
    }

  

    public void setrSHora(RSLabelHora rSHora) {
        this.rSHora = rSHora;
    }
}
