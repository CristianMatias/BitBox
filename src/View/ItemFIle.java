package View;

import Control.Control;
import Model.Item.Item;
import Model.PriceReduction.Pricereduction;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian
 */
public class ItemFIle extends javax.swing.JFrame {
    private final Control control;
    private String userName = null;
    private Item item = null;
    
    public ItemFIle(Item item, Control control, String userName) {
        initComponents();
        this.item = item;
        this.control = control;
        this.userName = userName;
        fillItemInformation();
        closeInformationUnchangable();
    }

    public ItemFIle(Control control) throws HeadlessException {
        this.control = control;
        initComponents();
        fillItemInformation();
    }
    
    private void closeInformationUnchangable(){
        codeField.setEditable(false);
        dateField.setEditable(false);
        if(userName == null){
            nameField.setEditable(false);
            offertField.setEditable(false);
            saveButton.setEnabled(false);
            removeButton.setEnabled(false);
            discardButton.setEnabled(false);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        discardButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        supplierField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        activeCheck = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        deactiveCheck = new javax.swing.JCheckBox();
        offertField = new javax.swing.JTextField();
        offertInfo = new javax.swing.JLabel();
        creatorInfo = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        originalPrice = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        codeField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(700, 0));

        discardButton.setText("Discard changes");
        discardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove Item");

        jLabel1.setText("Description");

        jLabel6.setText("Supplier");

        jLabel2.setText("Creation Date");

        jLabel7.setText("State");

        activeCheck.setForeground(new java.awt.Color(0, 204, 0));
        activeCheck.setText("Active");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chair.png"))); // NOI18N
        jButton1.setIcon(new ImageIcon("img/chair.png"));

        deactiveCheck.setForeground(new java.awt.Color(204, 0, 0));
        deactiveCheck.setText("Discontinued");

        offertInfo.setText("Offert Avalible until");

        creatorInfo.setText("Product added by");

        saveButton.setText("Save changes");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        originalPrice.setText("jLabel3");

        jLabel3.setText("Code");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(saveButton)
                        .addGap(18, 18, 18)
                        .addComponent(discardButton)
                        .addGap(12, 12, 12)
                        .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(creatorInfo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deactiveCheck)
                            .addComponent(activeCheck))))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(supplierField)
                            .addComponent(dateField)
                            .addComponent(codeField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(offertField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(originalPrice)
                        .addGap(8, 8, 8)
                        .addComponent(offertInfo)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(supplierField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addComponent(activeCheck))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deactiveCheck)
                            .addComponent(offertField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(36, 36, 36))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(offertInfo)
                                    .addComponent(originalPrice))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeButton)
                            .addComponent(discardButton)
                            .addComponent(saveButton)
                            .addComponent(creatorInfo))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void discardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardButtonActionPerformed
        fillItemInformation();
    }//GEN-LAST:event_discardButtonActionPerformed
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if(control.saveItem(updateInformation())) {
            JOptionPane.showMessageDialog(null, "Changes applied succesfully");
            this.dispose();
            ViewImpl.prepareTable();
        }
        else{
            JOptionPane.showMessageDialog(null, "Couldn't apply changes");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private Item updateInformation(){
        item.setDescription(nameField.getText());
        item.setPrice(Double.parseDouble(offertField.getText()));
        if(activeCheck.isSelected()) item.setStateitem("Active");
        else item.setStateitem("Discontinued");
        return item;
    }
    
    private Item getInformation() throws ParseException{
        Item newItem = new Item();
        newItem.setCode(Integer.parseInt(codeField.getText()));
        newItem.setDescription(nameField.getText());
        newItem.setCreationdate(new SimpleDateFormat("yyyy-MM-dd").parse(dateField.getText()));
        newItem.setPrice(Double.parseDouble(offertField.getText()));
        if(activeCheck.isSelected()) newItem.setStateitem("Active");
        else newItem.setStateitem("Discontinued");
        newItem.setSupplier(control.getSupplier(supplierField.getText()));
        newItem.setUserlogin(control.getUserlogin(userName));
        return newItem;
    }
    
     private void fillItemInformation() {
         codeField.setText(item.getCode()+"");
        nameField.setText(item.getDescription());
        dateField.setText(item.getCreationdate()+"");
        supplierField.setText(item.getSupplier().getName());
        if(getStateItem(item.getStateitem())) activeCheck.setSelected(true);
        else deactiveCheck.setSelected(false);
        creatorInfo.setText("Product added by "+item.getUserlogin().getUsername());
         prepareInformationPrices(item.getPrice(), item.getPricereduction());
    }

     private void prepareInformationPrices(double price, Pricereduction priceReduction){
         Date date = new Date(); 
        if(date.before(priceReduction.getEnddate()) && date.after(priceReduction.getStartdate())){
            offertInfo.setText("Offert Avalible until "+priceReduction.getEnddate().getMonth()+"/"
                    +priceReduction.getEnddate().getDay());
            offertField.setText((price - priceReduction.getReducedprice())+"");
            originalPrice.setText("<html><body><span style='text-decoration: line-through;'>"+price+"</span></body></html>");
        }
        else{
            offertInfo.setVisible(false);
            offertField.setText(price+"");
            originalPrice.setVisible(false);
        }
            
     }
     
    private boolean getStateItem(String state){
        return state.equals("Active");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox activeCheck;
    private javax.swing.JTextField codeField;
    private javax.swing.JLabel creatorInfo;
    private javax.swing.JTextField dateField;
    private javax.swing.JCheckBox deactiveCheck;
    private javax.swing.JButton discardButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField offertField;
    private javax.swing.JLabel offertInfo;
    private javax.swing.JLabel originalPrice;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField supplierField;
    // End of variables declaration//GEN-END:variables

}
