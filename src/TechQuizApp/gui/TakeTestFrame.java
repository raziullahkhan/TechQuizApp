/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.gui;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import TechQuizApp.dao.PerformanceDAO;
import TechQuizApp.dao.QuestionDAO;
import TechQuizApp.pojo.Answer;
import TechQuizApp.pojo.AnswerStore;
import TechQuizApp.pojo.Exam;
import TechQuizApp.pojo.Performance;
import TechQuizApp.pojo.Question;
import TechQuizApp.pojo.QuestionStore;
import TechQuizApp.pojo.UserProfile;

/**
 *
 * @author HP
 */

public class TakeTestFrame extends javax.swing.JFrame {

    /**
     * Creates new form TakeTestFrame
     */
    private Color oldColor;
    private int qno,pos=0;
    private QuestionStore qstore;
    private AnswerStore astore;
    private Exam exam;
    int m=0;
    public TakeTestFrame() {
        initComponents();
        setLocationRelativeTo(null);
        lblUsername.setText("Hello "+UserProfile.getUsername());
        oldColor=lblLogout.getForeground();
        qstore=new QuestionStore();
        astore=new AnswerStore();
        qno=1;
        lblQno.setText(lblQno.getText()+qno);
        jProgressBar1.setValue(120);
       
    }
    public TakeTestFrame(Exam exam){
        this(); 
        this.exam=exam;
        lblTitle.setText(exam.getLanguage().toUpperCase()+" PAPER");
        loadQuestion();
        showQuestion();
        TimeThread t=new TimeThread();
        t.start();
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
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblQno = new javax.swing.JLabel();
        jScroll = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        rbOption1 = new javax.swing.JRadioButton();
        rbOption2 = new javax.swing.JRadioButton();
        rbOption3 = new javax.swing.JRadioButton();
        rbOption4 = new javax.swing.JRadioButton();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 1, true));

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(122, 122, 0));
        lblTitle.setText("JAVA PAPER");

        lblUsername.setBackground(new java.awt.Color(255, 255, 255));
        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(102, 102, 0));

        lblLogout.setBackground(new java.awt.Color(255, 255, 255));
        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(102, 102, 0));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TechQuizApp/gui/images/GoodLuck.png"))); // NOI18N

        lblQno.setBackground(new java.awt.Color(255, 255, 255));
        lblQno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQno.setForeground(new java.awt.Color(102, 102, 0));
        lblQno.setText("Question no: ");

        jScroll.setBackground(new java.awt.Color(255, 255, 255));
        jScroll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 1, true));
        jScroll.setViewportBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 1, true));

        txtQuestion.setEditable(false);
        txtQuestion.setColumns(20);
        txtQuestion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtQuestion.setLineWrap(true);
        txtQuestion.setRows(5);
        txtQuestion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 0), 1, true));
        jScroll.setViewportView(txtQuestion);

        rbOption1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbOption1);
        rbOption1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbOption1.setText("Option 1");

        rbOption2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbOption2);
        rbOption2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbOption2.setText("Option 2");

        rbOption3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbOption3);
        rbOption3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbOption3.setText("Option 3");

        rbOption4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbOption4);
        rbOption4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbOption4.setText("Option 4");

        btnNext.setBackground(new java.awt.Color(102, 102, 0));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setBackground(new java.awt.Color(102, 102, 0));
        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(102, 102, 0));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDone.setBackground(new java.awt.Color(102, 102, 0));
        btnDone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDone.setForeground(new java.awt.Color(255, 255, 255));
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(0, 0, 51));
        jProgressBar1.setMaximum(30);
        jProgressBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jProgressBar1.setStringPainted(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addComponent(jLabel3))
                .addGap(245, 245, 245))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lblQno)
                        .addGap(26, 26, 26)
                        .addComponent(jScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbOption1)
                    .addComponent(rbOption3))
                .addGap(114, 114, 114)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbOption4)
                    .addComponent(rbOption2))
                .addGap(159, 159, 159))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogout)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQno))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOption1)
                    .addComponent(rbOption2))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOption3)
                    .addComponent(rbOption4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious)
                    .addComponent(btnCancel)
                    .addComponent(btnDone))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setForeground(Color.BLUE);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        lblLogout.setForeground(oldColor);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
       
        String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null){
            Question quest=qstore.getQuestionByQno(qno);
            String correctAnswer=quest.getCorrectAnswer();
            Answer ans=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
            Answer attempted=astore.getAnswerByQno(qno);
            if(attempted==null){
                astore.addAnswer(ans);
            }
            else{
                String prevAnswer=attempted.getChosenAnswer();
                if(prevAnswer.equals(chosenAnswer)==false){
                    int apos=astore.removeAnswer(attempted);
                    astore.setAnswerAt(apos, ans);
                }
            }
            
        }
        pos++;
        if(pos+1==qstore.getCount()){
            pos=0;
            
        }
        qno++;
        if(qno>qstore.getCount()){
            qno=1;
        }
        lblQno.setText("Question no:"+qno);
        showQuestion();
        
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null){
            Question quest=qstore.getQuestionByQno(qno);
            String correctAnswer=quest.getCorrectAnswer();
            Answer ans=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
            Answer attempted=astore.getAnswerByQno(qno);
            if(attempted==null){
                astore.addAnswer(ans);
            }
            else{
                String prevAnswer=attempted.getChosenAnswer();
                if(prevAnswer.equals(chosenAnswer)==false){
                    int apos=astore.removeAnswer(attempted);
                    astore.setAnswerAt(apos, ans);
                }
            }
            
        }
        pos--;
        if(pos<0){
            pos=qstore.getCount()-1;
        }
        qno--;
        if(qno<=0){
            qno=qstore.getCount();
        }
        lblQno.setText("Question no:"+qno);
        showQuestion();
        
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        m=m+1;
        PaperSelectionFrame paper=new PaperSelectionFrame();
        paper.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
       m=m+1;
        String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null){
            Question quest=qstore.getQuestionByQno(qno);
            String correctAnswer=quest.getCorrectAnswer();
            Answer ans=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
            Answer attempted=astore.getAnswerByQno(qno);
            if(attempted==null){
                astore.addAnswer(ans);
            }
            else{
                String prevAnswer=attempted.getChosenAnswer();
                if(prevAnswer.equals(chosenAnswer)==false){
                    int apos=astore.removeAnswer(attempted);
                    astore.setAnswerAt(apos, ans);
                }
            }
            
        }
        int right=0,wrong=0;
        for(Question quest:qstore.getAllQuestions()){
            int qno=quest.getQno();
            Answer ans=astore.getAnswerByQno(qno);
            if(ans==null)
                continue;
            String attemptedAnswer=ans.getChosenAnswer();
            String correctAnswer=ans.getCorrectAnswer();
            if(attemptedAnswer.equals(correctAnswer))
                ++right;
            else
                ++wrong;
        }
        StringBuilder sb=new StringBuilder();
        sb.append("\nRight Answer: "+right);
        sb.append("\nWrong Answer: "+wrong);
        sb.append("\nUnattempted: "+(qstore.getCount()-(right+wrong)));
        JOptionPane.showMessageDialog(null,sb.toString(),"Result!",JOptionPane.INFORMATION_MESSAGE);
        try{
            Performance perf=new Performance(exam.getExamId(),exam.getLanguage(),UserProfile.getUsername(),right,wrong,qstore.getCount()-(right+wrong),((double)right/qstore.getCount())*100);
            PerformanceDAO.addPerformance(perf);
             JOptionPane.showMessageDialog(null,"Result Saved.\nThank you for the test!","Done!",JOptionPane.INFORMATION_MESSAGE);
             StudentOptionsFrame student=new StudentOptionsFrame();
             student.setVisible(true);
             this.dispose();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error!","Take Test Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnDoneActionPerformed

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
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeTestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScroll;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JRadioButton rbOption1;
    private javax.swing.JRadioButton rbOption2;
    private javax.swing.JRadioButton rbOption3;
    private javax.swing.JRadioButton rbOption4;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
    private void loadQuestion(){
        try{
         ArrayList<Question> questionList=QuestionDAO.getQuestionsByExamId(exam.getExamId());
            for(Question q:questionList){
                qstore.addQuestion(q);
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error!","Take Test Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    private void showQuestion(){
        Question q=qstore.getQuestion(pos);
        buttonGroup1.clearSelection();
        txtQuestion.setText(q.getQuestion());
        rbOption1.setText(q.getAnswer1());
        rbOption2.setText(q.getAnswer2());
        rbOption3.setText(q.getAnswer3());
        rbOption4.setText(q.getAnswer4());
        Answer ans=astore.getAnswerByQno(qno);
        if(ans==null){
            return;
        }
        String str=ans.getChosenAnswer();
        switch(str){
            case "Answer1":
                rbOption1.setSelected(true);
                break;
            case "Answer2":
                rbOption2.setSelected(true);
                break;
            case "Answer3":
                rbOption3.setSelected(true);
                break;
            case "Answer4":
                rbOption4.setSelected(true);
                break;
        }
    }
    private String getUserAnswer(){
        if(rbOption1.isSelected())
            return "Answer1";
        else if(rbOption2.isSelected())
            return "Answer2";
        else if(rbOption3.isSelected())
            return "Answer3";
        else if(rbOption4.isSelected())
            return "Answer4";   
        else
             return null;
    }
     class TimeThread extends Thread{
        public void run(){
            int count=120;
            while(jProgressBar1.getValue()>jProgressBar1.getMinimum()){
            try{
                jProgressBar1.setValue((int)count);
                jProgressBar1.setString("Test will end in - "+(int)(count/60)+":"+(count%60));
                Thread.sleep(1000);
                count=count-1; 
                if(m>0){
                    return;
                }
            }
            catch(InterruptedException e){
                JOptionPane.showMessageDialog(null,"Exception in Thread:"+e,"Error!",JOptionPane.ERROR_MESSAGE);
            }
        }
            btnDone.doClick();
        }
    }
}