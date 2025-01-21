/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cooptransporte;

import clases.venta;
import datos.datos_clase;
import interfaces.selecciona_boletos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class ventaNueva extends javax.swing.JInternalFrame implements selecciona_boletos {

    /**
     * Creates new form ventaNueva
     */
    
    JDesktopPane pr;

    public JTextField getAsiento() {
        return asiento;
    }

    public void setAsiento(JTextField asiento) {
        this.asiento = asiento;
    }
    
    

    public JDesktopPane getPr() {
        return pr;
    }

    public void setPr(JDesktopPane pr) {
        this.pr = pr;
    }
    
    public ventaNueva() {
        initComponents(); 
    }
    
    public void cargaCombo(){
        String archivo = "datos/buses.csv";
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            ArrayList<String> lista = new ArrayList<>();
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                lista.add(datos[0]); // Separar los datos por coma  
            }
            Collections.sort(lista);
            for (String opcion : lista) {
            comboBus.addItem(opcion);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        asiento = new javax.swing.JTextField();
        destino = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        comboBus = new javax.swing.JComboBox<>();
        fecha = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        hora = new javax.swing.JSpinner();

        setBorder(null);
        setClosable(true);
        setTitle("Venta de Boleto");
        setPreferredSize(new java.awt.Dimension(600, 300));

        jLabel1.setText("Nombre del Pasajero");

        jLabel2.setText("Apellido del Pasajero");

        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });

        jLabel3.setText("Numero del Asiento");

        jLabel4.setText("Numero de Bus");

        jLabel5.setText("Ruta del Destino");

        jLabel6.setText("Precio del Boleto");

        jLabel7.setText("Fecha");

        jLabel8.setText("Hora");

        asiento.setEditable(false);
        asiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asientoActionPerformed(evt);
            }
        });

        destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinoActionPerformed(evt);
            }
        });

        jButton1.setText("Finalizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        comboBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBusActionPerformed(evt);
            }
        });

        jButton2.setText("...");
        jButton2.setPreferredSize(new java.awt.Dimension(30, 20));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        hora.setModel(new javax.swing.SpinnerDateModel());
        hora.setEditor(new javax.swing.JSpinner.DateEditor(hora, "HH:mm"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(precio, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(comboBus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hora)
                            .addComponent(apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(destino)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(asiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(asiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(comboBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))))
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // Recoger los datos de la interfaz
        String nombrePasajero = nombre.getText(); // Campo para el nombre del pasajero
        String rutaDestino = precio.getText(); // Ruta seleccionada en un JComboBox
        String fechaHoraViaje = asiento.getText() + ", " + destino.getText(); // Fecha y hora del viaje
        String numeroAsientoText = asiento.getText(); // Número de asiento
        String precioText = precio.getText(); // Precio del boleto
        String numeroBusText = comboBus.getSelectedItem().toString(); // Número de bus

        // Validar que los campos no estén vacíos
        if (nombrePasajero.trim().isEmpty() || 
            rutaDestino.trim().isEmpty() || 
            fechaHoraViaje.trim().isEmpty() || 
            numeroAsientoText.trim().isEmpty() || 
            //precioText.trim().isEmpty() || 
            numeroBusText.trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, rellene todos los campos.");
            return;
        }
        
        //venta nuevaVenta = new venta(nombrePasajero, Integer.parseInt(numeroAsientoText), rutaDestino, fechaHoraViaje, Double.parseDouble(precioText), Integer.parseInt(numeroBusText));

        try {
            // Convertir los valores numéricos
            int numeroAsiento = Integer.parseInt(numeroAsientoText);
            //double precioBoleto = Double.parseDouble(precioText);
            int numeroBus = Integer.parseInt(numeroBusText);

            // Crear la instancia de venta
            venta nuevaVenta = new venta(nombrePasajero, numeroAsiento, rutaDestino, fechaHoraViaje, Double.parseDouble(precioText), numeroBus);

            // Guardar la venta en el archivo CSV
           guardarVentaEnArchivoCSV(nuevaVenta);

            // Mostrar mensaje de confirmación
            javax.swing.JOptionPane.showMessageDialog(this, "Venta registrada con éxito.");
        } catch (NumberFormatException e) {
            // Manejar errores de conversión de número
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, ingrese valores numéricos válidos para el asiento, precio y número de bus.");
        } catch (Exception e) {
            // Manejar cualquier otro error
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al registrar la venta. Intente de nuevo.");
            e.printStackTrace();
        }
    }  

    // Método para guardar la venta en archivo CSV
    public void guardarVentaEnArchivoCSV(venta venta) {
        // Definir el archivo CSV donde se guardarán las ventas
        String archivo = "datos/ventas.csv";
        
        try {
            // Crear un objeto FileWriter para abrir el archivo en modo de adición
            FileWriter writer = new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter(writer);
            
            // Escribir los datos de la venta en formato CSV (sin comillas)
            String linea = venta.getNombrePasajero() + "," +
                           venta.getNumeroAsiento() + "," +
                           venta.getRutaDestino() + "," +
                           venta.getFechaHoraViaje() + "," +
                           venta.getPrecioBoleto() + "," +
                           venta.getNumeroBus();
            
            // Escribir la línea en el archivo
            buffer.write(linea);
            buffer.newLine();  // Nueva línea para la siguiente venta
            
            // Cerrar el buffer y el escritor
            buffer.close();
            
        } catch (IOException e) {
            // Manejar errores al escribir en el archivo
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al guardar la venta.");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void asientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asientoActionPerformed

    private void destinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinoActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void comboBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBusActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String select = (String)comboBus.getSelectedItem();
        if(!select.equals("")){
            verAsientos va = new verAsientos();
            va.setBus(Integer.parseInt(select));
            va.cargarDatos();
            va.setListener(this);
            va.getSeleccionar().setEnabled(true);
            pr.add(va, javax.swing.JDesktopPane.PALETTE_LAYER);
            System.out.println("Se abrira la ventana");
            va.setVisible(true);
        }else{
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField asiento;
    private javax.swing.JComboBox<String> comboBus;
    private javax.swing.JTextField destino;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JSpinner hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precio;
    // End of variables declaration//GEN-END:variables

    @Override
    public void recibirBoletos(String boleto) {
         
        asiento.setText(boleto);
        
    }
}
