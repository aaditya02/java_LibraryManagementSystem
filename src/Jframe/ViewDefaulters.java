/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Jframe;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.table.TableModel;

/**
 *
 * @author Aaditya
 */
public class ViewDefaulters extends javax.swing.JFrame {

    /**
     * Creates new form ViewRecords
     */
    public ViewDefaulters() {
        initComponents();
        setDetailsToTable();
    }

        public void setDetailsToTable()
    {
        long due=System.currentTimeMillis();
        java.sql.Date today=new java.sql.Date(due);
        try
        {
            Connection con=DBConnection.getConnection();
            PreparedStatement pst=con.prepareStatement("select * from issue_book_details where duedate < ? and status =?");
            pst.setDate(1, today);
            pst.setString(2,  "pending");
            ResultSet rst=pst.executeQuery();
            while(rst.next())
            {
                int issue_id=rst.getInt("id");
                int book_id=rst.getInt("bookid");
                String book_name=rst.getString("bookname");
                String student_name=rst.getString("studentname");
                Date issue_date=rst.getDate("issuedate");
                Date due_date=rst.getDate("duedate");
                String status=rst.getString("status");
                Object obj[]= {issue_id,book_id,book_name,student_name,issue_date,due_date,status}; 
                DefaultTableModel model=(DefaultTableModel)tbl_issueddetails.getModel();
                model.addRow(obj);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void clearTable()
    {
        DefaultTableModel model=(DefaultTableModel)tbl_issueddetails.getModel();
        model.setRowCount(0);
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
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_issueddetails = new rojeru_san.complementos.RSTableMetro();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_bookid = new javax.swing.JLabel();
        lbl_issueid = new javax.swing.JLabel();
        lbl_status = new javax.swing.JLabel();
        lbl_bookname = new javax.swing.JLabel();
        lbl_studentname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1540, 280));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 51, 102));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-return-35.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        jPanel4.setBackground(new java.awt.Color(255, 51, 102));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/x-mark-24.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 0, 70, 40));

        jLabel22.setBackground(new java.awt.Color(234, 67, 53));
        jLabel22.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8-thief-75.png"))); // NOI18N
        jLabel22.setText("   DEFAULTER DETAILS");
        jLabel22.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 430, 130));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 190));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_issueddetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Issue ID", "Book ID", "Book Name", "Student Name", "Issue Date", "Return Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_issueddetails.setColorBackgoundHead(new java.awt.Color(255, 153, 51));
        tbl_issueddetails.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tbl_issueddetails.setColorFilasForeground1(new java.awt.Color(102, 102, 255));
        tbl_issueddetails.setColorFilasForeground2(new java.awt.Color(102, 102, 255));
        tbl_issueddetails.setColorForegroundHead(new java.awt.Color(51, 51, 51));
        tbl_issueddetails.setColorSelBackgound(new java.awt.Color(255, 102, 102));
        tbl_issueddetails.setFont(new java.awt.Font("Yu Gothic Light", 0, 25)); // NOI18N
        tbl_issueddetails.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        tbl_issueddetails.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbl_issueddetails.setRowHeight(35);
        tbl_issueddetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_issueddetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_issueddetails);
        if (tbl_issueddetails.getColumnModel().getColumnCount() > 0) {
            tbl_issueddetails.getColumnModel().getColumn(0).setPreferredWidth(20);
            tbl_issueddetails.getColumnModel().getColumn(1).setPreferredWidth(20);
            tbl_issueddetails.getColumnModel().getColumn(2).setPreferredWidth(90);
            tbl_issueddetails.getColumnModel().getColumn(3).setPreferredWidth(90);
            tbl_issueddetails.getColumnModel().getColumn(6).setPreferredWidth(35);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 990, 230));

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8-address-book-40 (1).png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 180, 40, 40));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8-id-40.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 80, 50, 40));

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Issue ID");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 50, 170, 30));

        jLabel10.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Book ID");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 150, 170, 30));

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8-book-40.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 290, 40, 40));

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Book Name");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 260, 170, 30));

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Student Name");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 360, 170, 30));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8-student-40.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 390, 40, 40));

        jLabel14.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8-status-40.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 490, 40, 40));

        jLabel15.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Status");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 460, 170, 30));

        lbl_bookid.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lbl_bookid.setForeground(java.awt.Color.red);
        lbl_bookid.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_bookid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.red));
        jPanel2.add(lbl_bookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 190, 230, 30));

        lbl_issueid.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lbl_issueid.setForeground(java.awt.Color.red);
        lbl_issueid.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_issueid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.red));
        jPanel2.add(lbl_issueid, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 90, 230, 30));

        lbl_status.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lbl_status.setForeground(java.awt.Color.red);
        lbl_status.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_status.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.red));
        jPanel2.add(lbl_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 500, 230, 30));

        lbl_bookname.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lbl_bookname.setForeground(java.awt.Color.red);
        lbl_bookname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_bookname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.red));
        jPanel2.add(lbl_bookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 300, 230, 30));

        lbl_studentname.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lbl_studentname.setForeground(java.awt.Color.red);
        lbl_studentname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_studentname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.red));
        jPanel2.add(lbl_studentname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 400, 230, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/kisspng-digital-library-flat-design-medical-library-5addfbd03b8638.6510559915244973602438.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 430, 310));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/kc1b_p6ah_230614 (1).jpg"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 430, 290));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 1540, 640));

        setSize(new java.awt.Dimension(1540, 830));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_issueddetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_issueddetailsMouseClicked
        int rowno= tbl_issueddetails.getSelectedRow();
        TableModel model=tbl_issueddetails.getModel();
        lbl_issueid.setText(model.getValueAt(rowno, 0).toString());
        lbl_bookid.setText(model.getValueAt(rowno, 1).toString());
        lbl_bookname.setText(model.getValueAt(rowno, 2).toString());
        lbl_studentname.setText(model.getValueAt(rowno, 3).toString());
        lbl_status.setText(model.getValueAt(rowno, 6).toString());
    }//GEN-LAST:event_tbl_issueddetailsMouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked

    }//GEN-LAST:event_jPanel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        HomePage home= new HomePage();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        HomePage home= new HomePage();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(ViewDefaulters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDefaulters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDefaulters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDefaulters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDefaulters().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_bookid;
    private javax.swing.JLabel lbl_bookname;
    private javax.swing.JLabel lbl_issueid;
    private javax.swing.JLabel lbl_status;
    private javax.swing.JLabel lbl_studentname;
    private rojeru_san.complementos.RSTableMetro tbl_issueddetails;
    // End of variables declaration//GEN-END:variables
}
