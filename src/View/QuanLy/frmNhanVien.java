/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.QuanLy;

import DAO.QuanLy.NhanVienDAO;
import Model.NhanVien;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author latu2
 */
public class frmNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form frmNhanVien
     */
    public frmNhanVien() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtGioiTinh = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtMaCV = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtHoTenNV = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Địa chỉ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Thêm, sửa nhân viên");

        jLabel4.setText("Ngày sinh");

        jLabel5.setText("Giới tính");

        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã nhân viên");

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Actions-document-new-icon.png"))); // NOI18N
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel2.setText("Số điện thoại");

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Action-edit-icon.png"))); // NOI18N
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel7.setText("Mã chức vụ");

        jLabel8.setText("Họ tên nhân viên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel6))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel8)
                .addGap(67, 67, 67)
                .addComponent(txtHoTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(txtMaCV, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel8))
                    .addComponent(txtHoTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLuu)
                    .addComponent(btnThem)
                    .addComponent(btnSua)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        NhanVienDAO nvdao = new NhanVienDAO();
        NhanVien nv = new NhanVien();

        // Kiểm tra mã nhân viên
        if (txtMaNV.getText() != null && !txtMaNV.getText().trim().isEmpty()) {
            nv.setMaNV(txtMaNV.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống Mã Nhân viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kiểm tra họ tên nhân viên
        if (txtHoTenNV.getText() != null && !txtHoTenNV.getText().trim().isEmpty()) {
            nv.setHoTenNV(txtHoTenNV.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống Họ tên Nhân viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kiểm tra số điện thoại
        if (txtSdt.getText() != null && !txtSdt.getText().trim().isEmpty()) {
            nv.setSdt(txtSdt.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống Số điện thoại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kiểm tra địa chỉ
        if (txtDiaChi.getText() != null && !txtDiaChi.getText().trim().isEmpty()) {
            nv.setDiaChi(txtDiaChi.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống Địa chỉ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kiểm tra ngày sinh
        try {
            nv.setNgaySinh(new SimpleDateFormat("dd-MM-yyyy").parse(txtNgaySinh.getText()));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Định dạng ngày không hợp lệ. Vui lòng nhập theo định dạng dd-MM-yyyy.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kiểm tra giới tính
        if (txtGioiTinh.getText() != null && !txtGioiTinh.getText().trim().isEmpty()) {
            nv.setGioiTinh(txtGioiTinh.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống Giới tính!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kiểm tra mã chức vụ
        if (txtMaCV.getText() != null && !txtMaCV.getText().trim().isEmpty()) {
            nv.setMaCV(txtMaCV.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống Mã Chức vụ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Thêm nhân viên vào cơ sở dữ liệu
        int x = nvdao.addNhanVien(nv);
        if (x > 0) {
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        this.txtMaNV.setText("");
        this.txtHoTenNV.setText("");
        this.txtSdt.setText("");
        this.txtDiaChi.setText("");
        this.txtNgaySinh.setText("");
        this.txtGioiTinh.setText("");
        this.txtMaCV.setText("");
        this.txtMaNV.requestFocus();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        NhanVienDAO nvdao = new NhanVienDAO();
        NhanVien nv = new NhanVien();

        // Kiểm tra mã nhân viên
        if (txtMaNV.getText() != null && !txtMaNV.getText().trim().isEmpty()) {
            nv.setMaNV(txtMaNV.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống Mã Nhân viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kiểm tra họ tên nhân viên
        if (txtHoTenNV.getText() != null && !txtHoTenNV.getText().trim().isEmpty()) {
            nv.setHoTenNV(txtHoTenNV.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống Họ tên Nhân viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kiểm tra số điện thoại
        if (txtSdt.getText() != null && !txtSdt.getText().trim().isEmpty()) {
            nv.setSdt(txtSdt.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống Số điện thoại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kiểm tra địa chỉ
        if (txtDiaChi.getText() != null && !txtDiaChi.getText().trim().isEmpty()) {
            nv.setDiaChi(txtDiaChi.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống Địa chỉ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kiểm tra ngày sinh
        try {
            nv.setNgaySinh(new SimpleDateFormat("dd-MM-yyyy").parse(txtNgaySinh.getText()));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Định dạng ngày không hợp lệ. Vui lòng nhập theo định dạng dd-MM-yyyy.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kiểm tra giới tính
        if (txtGioiTinh.getText() != null && !txtGioiTinh.getText().trim().isEmpty()) {
            nv.setGioiTinh(txtGioiTinh.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống Giới tính!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Kiểm tra mã chức vụ
        if (txtMaCV.getText() != null && !txtMaCV.getText().trim().isEmpty()) {
            nv.setMaCV(txtMaCV.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Không thể để trống Mã Chức vụ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Cập nhật nhân viên trong cơ sở dữ liệu
        int x = nvdao.updateNhanVien(nv);
        if (x > 0) {
            JOptionPane.showMessageDialog(this, "Sửa thành công!");
        } else {
            JOptionPane.showMessageDialog(this, "Sửa thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmNhanVien().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtHoTenNV;
    private javax.swing.JTextField txtMaCV;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSdt;
    // End of variables declaration//GEN-END:variables
}
