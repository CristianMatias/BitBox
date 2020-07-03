package View;

import Control.Control;
import Model.Item.Item;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Model.PriceReduction.Pricereduction;
import Model.User.Userlogin;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Cristian
 */
public class ViewImpl extends javax.swing.JFrame implements View{
    private static Control control;
    private String userName = null;
    private static List<Item> itemList;
    private static List<Userlogin> userList;
    
    /**
     * Creates new form ViewImpl
     * @param control
     */
    public ViewImpl(Control control) {
        ViewImpl.control = control;
        initComponents();
        prepareTable();
        createButton.setVisible(false);
    }
    
    public ViewImpl(Control control,String userName){
        initComponents();
        ViewImpl.control = control;
        this.userName = userName;
        loginButton.setText(userName);
        prepareTable();
        if(control.getUserlogin(userName).getType().equals("Admin")) prepareList();
    }
    
    protected static void prepareList(){
        tabbedPane.setEnabledAt(2, true);
        userList = control.readUsers();
        DefaultListModel listModel = new DefaultListModel();
        userList.forEach((user) -> {
            listModel.addElement(user.getUsername()+" - "+user.getType());
        });
        
        usersList.setModel(listModel);
    }
    
    protected static void prepareTable(){
        itemList = control.readItems();
        prepareTableItems((DefaultTableModel) itemTable.getModel());
        
    }
    
    private static void deleteRows(int rows, DefaultTableModel model){
        for (int i = rows - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }
    
    private static void prepareTableItems(DefaultTableModel model){
        deleteRows(model.getRowCount(), model);
        itemList.forEach((item) -> {
            Object[] row = new Object[6];
            
            row[0] = item.getCode();
            row[1] = item.getDescription();
            row[2] = preparePrices(item.getPrice(), item.getPricereduction());
            row[3] = item.getCreationdate();
            row[4] = item.getStateitem();
            row[5] = item.getUserlogin().getUsername();
            model.addRow(row);
        });
        itemTable.setModel(model);
    }
    
    protected static double preparePrices(double price, Pricereduction priceReduction){
        Date date = new Date(); 
        if(priceReduction != null){
            if(date.before(priceReduction.getEnddate()) && date.after(priceReduction.getStartdate()))
                return price - priceReduction.getReducedprice();
            else return price;
        }
        else return price;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        loginButton = new javax.swing.JButton();
        tabbedPane = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        supplierButton = new javax.swing.JButton();
        offertsButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        resultsPane = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        usersList = new javax.swing.JList<>();
        deleteUserButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        passField = new javax.swing.JPasswordField();
        roleCombo = new javax.swing.JComboBox<>();
        generateButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        exitButton = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        showItem = new javax.swing.JMenuItem();
        createButton = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginButton.setText("Log In");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Description", "Price (€)", "Date", "State", "Made by"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemTable.setColumnSelectionAllowed(true);
        itemTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(itemTable);
        itemTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (itemTable.getColumnModel().getColumnCount() > 0) {
            itemTable.getColumnModel().getColumn(1).setResizable(false);
        }

        tabbedPane.addTab("Items", jScrollPane1);

        supplierButton.setText("Cheapest Items per Supplier");
        supplierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierButtonActionPerformed(evt);
            }
        });

        offertsButton.setText("Suppliers with offerts");
        offertsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offertsButtonActionPerformed(evt);
            }
        });

        resultsPane.setEditable(false);
        resultsPane.setColumns(20);
        resultsPane.setRows(5);
        jScrollPane3.setViewportView(resultsPane);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(supplierButton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(offertsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(offertsButton)
                    .addComponent(supplierButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Querys", jPanel2);

        usersList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(usersList);

        deleteUserButton.setText("Delete");
        deleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Name - Role");

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        jLabel3.setText("Password");

        jLabel4.setText("Role");

        nameField.setEditable(false);

        passField.setEditable(false);

        roleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Normal" }));
        roleCombo.setEnabled(false);

        generateButton.setText("Generate Password");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saveButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(deleteUserButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(generateButton)))
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newButton))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveButton)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addComponent(generateButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(updateButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteUserButton)))))
                .addGap(110, 110, 110))
        );

        tabbedPane.addTab("Users", jPanel1);
        tabbedPane.setEnabledAt(2, false);

        exitButton.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        exitButton.add(jMenuItem1);

        jMenuBar1.add(exitButton);

        jMenu3.setText("Item");

        showItem.setText("Show Item");
        showItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showItemActionPerformed(evt);
            }
        });
        jMenu3.add(showItem);

        createButton.setText("Create Item");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        jMenu3.add(createButton);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Help");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tabbedPane))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        new Login(control).setVisible(true);
        this.setEnabled(false);
        this.setVisible(false);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    private void showItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showItemActionPerformed

        String[] items = new String[itemList.size()];
        for (int i = 0; i < items.length; i++) {
            items[i] = itemList.get(i).getDescription();
        }
        
        String code = (String) JOptionPane.showInputDialog(null, "Selecct the item code",
                    "Item Information", JOptionPane.DEFAULT_OPTION, null, items, items[0]);
    
        itemList.forEach((item) ->{
            if(code.equals(item.getDescription())) {
                new ItemFile(item, control, userName).setVisible(true);
            }
        });
    }//GEN-LAST:event_showItemActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        new ItemFile(control, userName).setVisible(true);
    }//GEN-LAST:event_createButtonActionPerformed

    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserButtonActionPerformed
        if(askConfirmation("Are you sure you want to delete the user?") == JOptionPane.OK_OPTION){
            if(getSelectedUser().getUsername().equals(userName))
                JOptionPane.showMessageDialog(null, "You can't delete yourself");
            else deleteUser();
        }
    }//GEN-LAST:event_deleteUserButtonActionPerformed

    private void deleteUser(){
        if(control.deleteUser(getSelectedUser())){
            JOptionPane.showMessageDialog(null, "User deleted");
            prepareList();
        }
        else JOptionPane.showMessageDialog(null, "Couldn't delete the user");
    }
    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        Userlogin userlogin = control.getUserlogin(nameField.getText());
        userlogin.setType(roleCombo.getSelectedItem()+"");
        userlogin.setPass(passField.getText());
        if(control.updateUser(userlogin))
            JOptionPane.showMessageDialog(null, "User updated");
        else JOptionPane.showMessageDialog(null, "Couldn't update the user");
    }//GEN-LAST:event_updateButtonActionPerformed

    private void usersListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersListMouseClicked
        Userlogin selectedUser = getSelectedUser();
        nameField.setText(selectedUser.getUsername());
        roleCombo.setSelectedItem(selectedUser.getType());
        passField.setText(selectedUser.getPass());
        if(control.getUserlogin(userName).getType().equals("Admin")) 
            roleCombo.setEnabled(true);
        if(selectedUser.getUsername().equals(userName))
            passField.setEditable(true);
        
        else passField.setEditable(false);
        
    }//GEN-LAST:event_usersListMouseClicked

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        String generatedPassword = generatePassword();
        JOptionPane.showMessageDialog(null, "The generated password is "+generatedPassword
            +"\nRemember change it as soon as possible");
        passField.setText(generatedPassword);
    }//GEN-LAST:event_generateButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        userlogin = new Userlogin();
        userlogin.setUsername(nameField.getText());
        userlogin.setPass(passField.getText());
        userlogin.setType(roleCombo.getSelectedItem()+"");
        if(control.saveUser(userlogin)) prepareList();
        else JOptionPane.showMessageDialog(null, "Couldn't add new user");
    }//GEN-LAST:event_saveButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        nameField.setEditable(true);
        passField.setEditable(true);
        roleCombo.setEnabled(true);
        nameField.setText("");
        passField.setText("");
    }//GEN-LAST:event_newButtonActionPerformed

    private void supplierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierButtonActionPerformed
        resultsPane.setText("List of suppliers associated to items whose price has been reduced\n\n");
        List<Object[]> results = control.getSupplierWithOfferts();
        results.forEach((result) -> {
            resultsPane.append("* Supplier: "+result[0]+" from "+result[1]+"\n");
        });
    }//GEN-LAST:event_supplierButtonActionPerformed

    private void offertsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offertsButtonActionPerformed
        resultsPane.setText("List of cheapest item per supplier\n\n");
        List<Object[]> results = control.getCheapestItems();
        
        results.forEach((result) -> {
            resultsPane.append("* Name: "+result[0]+" -> Item: "+result[1]+" "+result[2]+"€\n");
        });
    }//GEN-LAST:event_offertsButtonActionPerformed
     
    private String generatePassword() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
          .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
          .limit(targetStringLength)
          .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
          .toString();

        return generatedString;
    }
    
     private int askConfirmation(String message){
        return JOptionPane.showConfirmDialog(null, message, "Warning!", JOptionPane.YES_NO_OPTION);
    }
    
    private Userlogin userlogin;
    private Userlogin getSelectedUser(){
        String nameInfo = usersList.getSelectedValue();
        String[] name = nameInfo.split(" - ");
        
        userList.forEach((user) -> {
            if(user.getUsername().equals(name[0])) {
                userlogin = user;
            }
        });
        return userlogin;
    }
    
    @Override
    public void start() {
        this.setVisible(true);
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem createButton;
    private javax.swing.JButton deleteUserButton;
    private javax.swing.JMenu exitButton;
    private javax.swing.JButton generateButton;
    private static javax.swing.JTable itemTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton newButton;
    private javax.swing.JButton offertsButton;
    private javax.swing.JPasswordField passField;
    private javax.swing.JTextArea resultsPane;
    private javax.swing.JComboBox<String> roleCombo;
    private javax.swing.JButton saveButton;
    private javax.swing.JMenuItem showItem;
    private javax.swing.JButton supplierButton;
    private static javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JButton updateButton;
    private static javax.swing.JList<String> usersList;
    // End of variables declaration//GEN-END:variables
}
