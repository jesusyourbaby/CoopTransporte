/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cooptransporte;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class verVentas extends javax.swing.JInternalFrame {
    
   
    String[] columnas = {"Nombre", "Cliente", "Destino", "Asiento", "Bus", "Fecha", "Hora", "Precio"};
// Aquí se debe usar jTable1, ya que es el componente real
    DefaultTableModel modelo = new DefaultTableModel(null, columnas){
            public boolean isCellEditable(int row, int column) {
                return false; // Ninguna celda será editable
            }
        };
    /**
     * Creates new form verVentas
     */
    public verVentas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setTitle("Boletos Vendidos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jToggleButton1.setText("Cancelar Boleto");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Asiento");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Bus");

        jLabel3.setText("Fecha de Viaje");

        fecha.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton1)
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:                                              
        String asientoIngresado = jTextField2.getText();
        String busIngresado = jTextField1.getText();

        // Formatear la fecha correctamente
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String fechaIngresada = dateFormat.format(fecha.getDate()).trim();
        String archivo = "datos/ventas.csv";
        
        List<String[]> filas = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                System.out.println(datos[3] + " ," + datos[4] + "," + datos[5]);
                // Verificar si la columna tiene el valor a cambiar
                if (!datos[3].equals(asientoIngresado) || !datos[4].equals(busIngresado) || !datos[5].equals(fechaIngresada)) {
                    filas.add(datos); //Cambiar el valor                   
                }
                 
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Escribir de nuevo el archivo con los cambios
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (String[] fila : filas) {
                bw.write(String.join(",", fila));
                bw.newLine(); // Escribir una nueva línea
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        modelo.setRowCount(0);
        cargarVentas();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

        // Método para cargar los boletos vendidos desde boletos.csv
        public void cargarVentas() {
        String archivoVentas = "datos/ventas.csv";  // Verifica que la ruta sea correcta
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoVentas))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(","); // Dividir por coma

                // Verificar que hay exactamente 7 elementos en cada línea
                    String nombre_cliente = datos[0];     // Cliente
                    String apellido_cliente = datos[1];     // Asiento
                    String ruta_destino = datos[2];   // Número de Bus
                    String numero_asiento = datos[3]; // Número de Venta
                    String numero_bus = datos[4];
                    String fecha_viaje = datos[5];
                    String hora_viaje = datos[6];
                    String precio_boleto = datos[7];

                    
                    modelo.addRow(new Object[]{nombre_cliente, apellido_cliente, ruta_destino, numero_asiento, numero_bus, fecha_viaje, hora_viaje, precio_boleto});
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                this,
                "Error al leer el archivo de ventas: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
        jTable1.setModel(modelo);
    }
        
    public void Ruta_Fecha(String fecha, String ruta){
        System.out.println(fecha+" ||| "+ruta);
        String archivoVentas = "datos/ventas.csv";  // Verifica que la ruta sea correcta
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoVentas))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(","); 
                
                if(datos[2].equals(ruta) && datos[5].equals(fecha)){
  
                    String nombre_cliente = datos[0];     // Cliente
                    String apellido_cliente = datos[1];     // Asiento
                    String ruta_destino = datos[2];   // Número de Bus
                    String numero_asiento = datos[3]; // Número de Venta
                    String numero_bus = datos[4];
                    String fecha_viaje = datos[5];
                    String hora_viaje = datos[6];
                    String precio_boleto = datos[7];

                    
                    modelo.addRow(new Object[]{nombre_cliente, apellido_cliente, ruta_destino, numero_asiento, numero_bus, fecha_viaje, hora_viaje, precio_boleto});
                }


            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                this,
                "Error al leer el archivo de ventas: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
        jTable1.setModel(modelo);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
