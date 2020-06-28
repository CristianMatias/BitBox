/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Control.Control;
import Model.Item.Item;
import Model.PriceReduction.Pricereduction;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author Cristian
 */
public class ItemFIle extends javax.swing.JFrame {
    private final Control control;
    private final Item item;
    
    public ItemFIle(Item item, Control control) {
        initComponents();
        this.item = item;
        this.control = control;
        fillItemInformation();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
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
        jButton2 = new javax.swing.JButton();
        originalPrice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(700, 0));

        jButton3.setText("Discard changes");

        jButton4.setText("Remove Item");

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

        jButton2.setText("Save changes");

        originalPrice.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(12, 12, 12)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jLabel2))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(supplierField)
                            .addComponent(dateField))
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
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
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
                            .addComponent(jButton4)
                            .addComponent(jButton3)
                            .addComponent(jButton2)
                            .addComponent(creatorInfo))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void fillItemInformation() {
        nameField.setText(item.getDescription());
        dateField.setText(item.getCreationdate()+"");
        supplierField.setText(item.getSupplier().getName());
        if(getStateItem(item.getStateitem())) activeCheck.setSelected(true);
        else deactiveCheck.setSelected(false);
        creatorInfo.setText(creatorInfo.getText()+" "+item.getUserlogin().getUsername());
         prepareInformationPrices(item.getPrice(), item.getPricereduction());
    }

     private void prepareInformationPrices(double price, Pricereduction priceReduction){
         Date date = new Date(); 
        if(date.before(priceReduction.getEnddate()) && date.after(priceReduction.getStartdate())){
            offertInfo.setText(offertInfo.getText()+" "+priceReduction.getEnddate().getMonth()+"/"
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
    private javax.swing.JLabel creatorInfo;
    private javax.swing.JTextField dateField;
    private javax.swing.JCheckBox deactiveCheck;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField offertField;
    private javax.swing.JLabel offertInfo;
    private javax.swing.JLabel originalPrice;
    private javax.swing.JTextField supplierField;
    // End of variables declaration//GEN-END:variables

}
