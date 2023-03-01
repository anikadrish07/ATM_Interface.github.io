/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm_interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ANIK ADRISH MAJHI
 */
public class FastCash_Page extends javax.swing.JFrame {

    Connection con;
    /**
     * Creates new form Deposite_Page
     */
    public FastCash_Page() {
        initComponents();
    }
    
    String account;
    public FastCash_Page(String accountNum) {
        initComponents();
        account = accountNum;
        //lbl_account.setText(account);
        getBalance();
    }
   
    int oldBalance;
    private void getBalance(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_interface","root","");
            String sql = "select * from signup where account_no='"+account+"'";
            Statement stmt = con.createStatement();
            
            ResultSet rs=stmt.executeQuery(sql);
            if(rs.next()){
                oldBalance = rs.getInt(8);
                lbl_balance.setText(""+oldBalance);
            }else {
                //JOptionPane.showMessageDialog(this, "wrong username or password");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public int ReceiptNo(){
        int receiptNo = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_interface","root","");
           PreparedStatement st = con.prepareStatement("select max(id) from transaction");
           ResultSet rs = st.executeQuery();
           if(rs.next()==true){
               receiptNo=rs.getInt(1);
           }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return receiptNo+1;
    }
    
    
    String myDate;
    public void getDate(){
        Date d = new Date();
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
         myDate = format.format(d);
    }
    public void withdrawTransaction100(){
        int recieptNo=ReceiptNo();
        getDate();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_interface", "root", "");
            String sql = "insert into transaction values(?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, recieptNo);
            stmt.setString(2, account);
            stmt.setString(3, "DR");
            stmt.setString(4, myDate);
            stmt.setString(5, lbl_100.getText());
            stmt.setInt(6, oldBalance - 100);
            
            
            

            int i = stmt.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Record inserted");
            } else {
                JOptionPane.showMessageDialog(this, "Record not inserted");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void withdrawTransaction1000(){
        int recieptNo=ReceiptNo();
        getDate();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_interface", "root", "");
            String sql = "insert into transaction values(?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, recieptNo);
            stmt.setString(2, account);
            stmt.setString(3, "DR");
            stmt.setString(4, myDate);
            stmt.setString(5, lbl_1000.getText());
            stmt.setInt(6, oldBalance - 1000);
            
            
            

            int i = stmt.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Record inserted");
            } else {
                JOptionPane.showMessageDialog(this, "Record not inserted");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void withdrawTransaction500(){
        int recieptNo=ReceiptNo();
        getDate();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_interface", "root", "");
            String sql = "insert into transaction values(?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, recieptNo);
            stmt.setString(2, account);
            stmt.setString(3, "DR");
            stmt.setString(4, myDate);
            stmt.setString(5, lbl_500.getText());
            stmt.setInt(6, oldBalance - 500);
            
            
            

            int i = stmt.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Record inserted");
            } else {
                JOptionPane.showMessageDialog(this, "Record not inserted");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void withdrawTransaction2000(){
        int recieptNo=ReceiptNo();
        getDate();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_interface", "root", "");
            String sql = "insert into transaction values(?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, recieptNo);
            stmt.setString(2, account);
            stmt.setString(3, "DR");
            stmt.setString(4, myDate);
            stmt.setString(5, lbl_2000.getText());
            stmt.setInt(6, oldBalance - 2000);
            
            
            

            int i = stmt.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Record inserted");
            } else {
                JOptionPane.showMessageDialog(this, "Record not inserted");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void withdrawTransaction5000(){
        int recieptNo=ReceiptNo();
        getDate();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_interface", "root", "");
            String sql = "insert into transaction values(?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, recieptNo);
            stmt.setString(2, account);
            stmt.setString(3, "DR");
            stmt.setString(4, myDate);
            stmt.setString(5, lbl_5000.getText());
            stmt.setInt(6, oldBalance - 5000);
            
            
            

            int i = stmt.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Record inserted");
            } else {
                JOptionPane.showMessageDialog(this, "Record not inserted");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void withdrawTransaction10000(){
        int recieptNo=ReceiptNo();
        getDate();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_interface", "root", "");
            String sql = "insert into transaction values(?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, recieptNo);
            stmt.setString(2, account);
            stmt.setString(3, "DR");
            stmt.setString(4, myDate);
            stmt.setString(5, lbl_10000.getText());
            stmt.setInt(6, oldBalance - 10000);
            
            
            

            int i = stmt.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Record inserted");
            } else {
                JOptionPane.showMessageDialog(this, "Record not inserted");
            }

        } catch (Exception e) {
            e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_balance = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_1000 = new javax.swing.JLabel();
        lbl_500 = new javax.swing.JLabel();
        lbl_2000 = new javax.swing.JLabel();
        lbl_10000 = new javax.swing.JLabel();
        lbl_5000 = new javax.swing.JLabel();
        lbl_account5 = new javax.swing.JLabel();
        lbl_1 = new javax.swing.JLabel();
        lbl_100 = new javax.swing.JLabel();
        lbl_account6 = new javax.swing.JLabel();
        lbl_account7 = new javax.swing.JLabel();
        lbl_account8 = new javax.swing.JLabel();
        lbl_account9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_interface/atm icon/png-transparent-white-bank-illustration-online-banking-finance-icon-white-bank-building-building-black-white-cartoon.png"))); // NOI18N
        jLabel1.setText("WELCOME TO ATM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 40, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 130));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_balance.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lbl_balance.setForeground(new java.awt.Color(255, 255, 255));
        lbl_balance.setText("Balance :");
        jPanel2.add(lbl_balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 110, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FAST CASH");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 170, 40));

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 130, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 330, 20));

        lbl_1000.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lbl_1000.setForeground(new java.awt.Color(255, 255, 255));
        lbl_1000.setText("1000");
        lbl_1000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_1000MouseClicked(evt);
            }
        });
        jPanel2.add(lbl_1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, 40));

        lbl_500.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lbl_500.setForeground(new java.awt.Color(255, 255, 255));
        lbl_500.setText("500");
        lbl_500.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_500MouseClicked(evt);
            }
        });
        jPanel2.add(lbl_500, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 70, 40));

        lbl_2000.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lbl_2000.setForeground(new java.awt.Color(255, 255, 255));
        lbl_2000.setText("2000");
        lbl_2000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_2000MouseClicked(evt);
            }
        });
        jPanel2.add(lbl_2000, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 70, 40));

        lbl_10000.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lbl_10000.setForeground(new java.awt.Color(255, 255, 255));
        lbl_10000.setText("10000");
        lbl_10000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_10000MouseClicked(evt);
            }
        });
        jPanel2.add(lbl_10000, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 70, 40));

        lbl_5000.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lbl_5000.setForeground(new java.awt.Color(255, 255, 255));
        lbl_5000.setText("5000");
        lbl_5000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_5000MouseClicked(evt);
            }
        });
        jPanel2.add(lbl_5000, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 60, 40));

        lbl_account5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lbl_account5.setForeground(new java.awt.Color(255, 255, 255));
        lbl_account5.setText("Rs");
        lbl_account5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_account5MouseClicked(evt);
            }
        });
        jPanel2.add(lbl_account5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 30, 40));

        lbl_1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lbl_1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_1.setText("Rs ");
        lbl_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_1MouseClicked(evt);
            }
        });
        jPanel2.add(lbl_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 40));

        lbl_100.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lbl_100.setForeground(new java.awt.Color(255, 255, 255));
        lbl_100.setText("100");
        lbl_100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_100MouseClicked(evt);
            }
        });
        jPanel2.add(lbl_100, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, 40));

        lbl_account6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lbl_account6.setForeground(new java.awt.Color(255, 255, 255));
        lbl_account6.setText("Rs");
        lbl_account6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_account6MouseClicked(evt);
            }
        });
        jPanel2.add(lbl_account6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 30, 40));

        lbl_account7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lbl_account7.setForeground(new java.awt.Color(255, 255, 255));
        lbl_account7.setText("Rs");
        lbl_account7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_account7MouseClicked(evt);
            }
        });
        jPanel2.add(lbl_account7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 30, 40));

        lbl_account8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lbl_account8.setForeground(new java.awt.Color(255, 255, 255));
        lbl_account8.setText("Rs");
        lbl_account8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_account8MouseClicked(evt);
            }
        });
        jPanel2.add(lbl_account8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 30, 40));

        lbl_account9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lbl_account9.setForeground(new java.awt.Color(255, 255, 255));
        lbl_account9.setText("Rs");
        lbl_account9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_account9MouseClicked(evt);
            }
        });
        jPanel2.add(lbl_account9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 30, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 600, 430));

        setSize(new java.awt.Dimension(600, 555));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Home_Page home = new Home_Page(account);
            home.show();
            this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void lbl_1000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_1000MouseClicked
        if (oldBalance < 1000) {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_interface", "root", "");
                String sql = "update signup set balance=? where account_no=?";
                PreparedStatement stmt = con.prepareStatement(sql);

                stmt.setInt(1, oldBalance - 1000);
                stmt.setString(2, account);

                if (stmt.executeUpdate() == 1) {
                    JOptionPane.showMessageDialog(this, "please collect your cash");
                    lbl_balance.setText("" + (oldBalance - 1000));
                    withdrawTransaction1000();
                    
                    Login_Page s = new Login_Page();
                    s.setVisible(true);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(this, "can't withdrawl");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_lbl_1000MouseClicked

    private void lbl_500MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_500MouseClicked
        if (oldBalance < 500) {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_interface", "root", "");
                String sql = "update signup set balance=? where account_no=?";
                PreparedStatement stmt = con.prepareStatement(sql);

                stmt.setInt(1, oldBalance - 500);
                stmt.setString(2, account);

                if (stmt.executeUpdate() == 1) {
                    JOptionPane.showMessageDialog(this, "please collect your cash");
                    lbl_balance.setText("" + (oldBalance - 500));
                    withdrawTransaction500();
                    
                    Login_Page s = new Login_Page();
                    s.setVisible(true);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(this, "can't withdrawl");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_lbl_500MouseClicked

    private void lbl_account5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_account5MouseClicked
        
    }//GEN-LAST:event_lbl_account5MouseClicked

    private void lbl_2000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_2000MouseClicked
        if (oldBalance < 2000) {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_interface", "root", "");
                String sql = "update signup set balance=? where account_no=?";
                PreparedStatement stmt = con.prepareStatement(sql);

                stmt.setInt(1, oldBalance - 2000);
                stmt.setString(2, account);

                if (stmt.executeUpdate() == 1) {
                    JOptionPane.showMessageDialog(this, "please collect your cash");
                    lbl_balance.setText("" + (oldBalance - 2000));
                    withdrawTransaction2000();
                    
                    Login_Page s = new Login_Page();
                    s.setVisible(true);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(this, "can't withdrawl");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_lbl_2000MouseClicked

    private void lbl_5000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_5000MouseClicked
        if (oldBalance < 5000) {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_interface", "root", "");
                String sql = "update signup set balance=? where account_no=?";
                PreparedStatement stmt = con.prepareStatement(sql);

                stmt.setInt(1, oldBalance - 5000);
                stmt.setString(2, account);

                if (stmt.executeUpdate() == 1) {
                    JOptionPane.showMessageDialog(this, "please collect your cash");
                    lbl_balance.setText("" + (oldBalance - 5000));
                    withdrawTransaction5000();
                    
                    Login_Page s = new Login_Page();
                    s.setVisible(true);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(this, "can't withdrawl");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_lbl_5000MouseClicked

    private void lbl_10000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_10000MouseClicked
        if (oldBalance < 10000) {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_interface", "root", "");
                String sql = "update signup set balance=? where account_no=?";
                PreparedStatement stmt = con.prepareStatement(sql);

                stmt.setInt(1, oldBalance - 10000);
                stmt.setString(2, account);

                if (stmt.executeUpdate() == 1) {
                    JOptionPane.showMessageDialog(this, "please collect your cash");
                    lbl_balance.setText("" + (oldBalance - 10000));
                    withdrawTransaction10000();
                    
                    Login_Page s = new Login_Page();
                    s.setVisible(true);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(this, "can't withdrawl");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_lbl_10000MouseClicked

    private void lbl_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_1MouseClicked

    private void lbl_100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_100MouseClicked
        if (oldBalance < 100) {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_interface", "root", "");
                String sql = "update signup set balance=? where account_no=?";
                PreparedStatement stmt = con.prepareStatement(sql);

                stmt.setInt(1, oldBalance - 100);
                stmt.setString(2, account);

                if (stmt.executeUpdate() == 1) {
                    JOptionPane.showMessageDialog(this, "please collect your cash");
                    lbl_balance.setText("" + (oldBalance - 100));
                    withdrawTransaction100();
                    
                    Login_Page s = new Login_Page();
                    s.setVisible(true);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(this, "can't withdrawl");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_lbl_100MouseClicked

    private void lbl_account6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_account6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_account6MouseClicked

    private void lbl_account7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_account7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_account7MouseClicked

    private void lbl_account8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_account8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_account8MouseClicked

    private void lbl_account9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_account9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_account9MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FastCash_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastCash_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastCash_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastCash_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastCash_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_1;
    private javax.swing.JLabel lbl_100;
    private javax.swing.JLabel lbl_1000;
    private javax.swing.JLabel lbl_10000;
    private javax.swing.JLabel lbl_2000;
    private javax.swing.JLabel lbl_500;
    private javax.swing.JLabel lbl_5000;
    private javax.swing.JLabel lbl_account5;
    private javax.swing.JLabel lbl_account6;
    private javax.swing.JLabel lbl_account7;
    private javax.swing.JLabel lbl_account8;
    private javax.swing.JLabel lbl_account9;
    private javax.swing.JLabel lbl_balance;
    // End of variables declaration//GEN-END:variables
}
