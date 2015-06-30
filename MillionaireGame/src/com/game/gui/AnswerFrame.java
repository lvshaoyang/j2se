/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.game.gui;

import com.game.entity.Question;
import com.game.util.DbHelper;
import com.game.util.WindowUtil;
import java.awt.FontMetrics;
import java.awt.Window;
import java.util.List;

/**
 *
 * @author perfecking
 */
public class AnswerFrame extends javax.swing.JFrame {

    private String username = null;
    private String category = null;
    private int score = 0;
    private int index = 0;
    private List<Question> list = null;

    /**
     * Creates new form AnswerFrame
     */
    public AnswerFrame() {
        initComponents();
    }

    public AnswerFrame(String username, String category) {
        this.username = username;
        this.category = category;
        initComponents();
        this.setTitle("WHO WANTS TO BE A MILLIONAIRE!");
        jrb_a.setSelected(true);
        jl_username.setText(username);
        list = DbHelper.getQuestions(category);
        updatePanel();
    }
//    update panel

    private void updatePanel() {
        Question question = list.get(index);
        String text = (index + 1) + ". " + question.getQuestion();
        StringBuilder builder = new StringBuilder("<html>");
        int size = text.length()%50==0?text.length()/50:text.length()/50+1;
        int i;
        for(i=0;i<size-1;i++){
            builder.append(text.substring(i*50, i*50+50)+"<br />");
        }
        builder.append(text.substring(i*50, text.length()));
        builder.append("</html>");
        jLabel1.setText(builder.toString());
        jrb_a.setText(question.getA());
        jrb_b.setText(question.getB());
        jrb_c.setText(question.getC());
        jrb_d.setText(question.getD());
        jl_grade.setText(score + "");
    }

    private String getSelection() {
        String answer = "a";
        if (jrb_b.isSelected()) {
            answer = "b";
        } else if (jrb_c.isSelected()) {
            answer = "c";
        } else if (jrb_d.isSelected()) {
            answer = "d";
        }
        return answer;
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
        answerBackgroundPanel1 = new com.game.gui.AnswerBackgroundPanel();
        jb_next = new javax.swing.JButton();
        jb_exit = new javax.swing.JButton();
        jl_grade__ = new javax.swing.JLabel();
        jl_username_ = new javax.swing.JLabel();
        jl_username = new javax.swing.JLabel();
        jl_grade = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jrb_a = new javax.swing.JRadioButton();
        jrb_b = new javax.swing.JRadioButton();
        jrb_c = new javax.swing.JRadioButton();
        jrb_d = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1030, 669));

        answerBackgroundPanel1.setPreferredSize(new java.awt.Dimension(1100, 669));

        jb_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/game/icons/next.png"))); // NOI18N
        jb_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_nextActionPerformed(evt);
            }
        });

        jb_exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\perfecking\\Documents\\NetBeansProjects\\MillionaireGame\\resources\\exit.jpg")); // NOI18N
        jb_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_exitActionPerformed(evt);
            }
        });

        jl_grade__.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jl_grade__.setForeground(new java.awt.Color(255, 255, 255));
        jl_grade__.setText("Grade");

        jl_username_.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jl_username_.setForeground(new java.awt.Color(255, 255, 255));
        jl_username_.setText("Player");

        jl_username.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jl_username.setForeground(new java.awt.Color(255, 255, 255));
        jl_username.setText("Perfecking");

        jl_grade.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jl_grade.setForeground(new java.awt.Color(255, 255, 255));
        jl_grade.setText("60");

        jLabel1.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("jLabel1");

        buttonGroup1.add(jrb_a);
        jrb_a.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jrb_a.setForeground(new java.awt.Color(255, 255, 255));
        jrb_a.setText("jRadioButton1");

        buttonGroup1.add(jrb_b);
        jrb_b.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jrb_b.setForeground(new java.awt.Color(255, 255, 255));
        jrb_b.setText("jRadioButton2");

        buttonGroup1.add(jrb_c);
        jrb_c.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jrb_c.setForeground(new java.awt.Color(255, 255, 255));
        jrb_c.setText("jRadioButton3");

        buttonGroup1.add(jrb_d);
        jrb_d.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jrb_d.setForeground(new java.awt.Color(255, 255, 255));
        jrb_d.setText("jRadioButton4");

        javax.swing.GroupLayout answerBackgroundPanel1Layout = new javax.swing.GroupLayout(answerBackgroundPanel1);
        answerBackgroundPanel1.setLayout(answerBackgroundPanel1Layout);
        answerBackgroundPanel1Layout.setHorizontalGroup(
            answerBackgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answerBackgroundPanel1Layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jb_next)
                .addGap(156, 156, 156)
                .addComponent(jb_exit)
                .addContainerGap(297, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, answerBackgroundPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addGroup(answerBackgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_b)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrb_a)
                    .addComponent(jrb_c)
                    .addComponent(jrb_d))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(answerBackgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(answerBackgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, answerBackgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_grade, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, answerBackgroundPanel1Layout.createSequentialGroup()
                            .addComponent(jl_username_, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)))
                    .addComponent(jl_grade__, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );
        answerBackgroundPanel1Layout.setVerticalGroup(
            answerBackgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, answerBackgroundPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jl_username_, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jl_grade__, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_grade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addGroup(answerBackgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_exit)
                    .addComponent(jb_next))
                .addGap(22, 22, 22))
            .addGroup(answerBackgroundPanel1Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jrb_a)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_b)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_c)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_d)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(answerBackgroundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(answerBackgroundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jb_exitActionPerformed

    private void jb_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_nextActionPerformed
        // TODO add your handling code here:
        Question question = list.get(index);
        if(question.getAnswer().equals(getSelection())){
            if(index==2){
                score+=20;
                updatePanel();
                RecordDialog dialog = new RecordDialog(this,true,username, score, category);
                WindowUtil.centre(dialog);
                dialog.setResizable(false);
                dialog.setVisible(true);
            }else{
                score+=20;
                index++;
                updatePanel();
            }
        }else {
            RecordDialog dialog = new RecordDialog(this,true,username, score, category);
            WindowUtil.centre(dialog);
            dialog.setResizable(false);
            dialog.setVisible(true);
        }
    }//GEN-LAST:event_jb_nextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.game.gui.AnswerBackgroundPanel answerBackgroundPanel1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jb_exit;
    private javax.swing.JButton jb_next;
    private javax.swing.JLabel jl_grade;
    private javax.swing.JLabel jl_grade__;
    private javax.swing.JLabel jl_username;
    private javax.swing.JLabel jl_username_;
    private javax.swing.JRadioButton jrb_a;
    private javax.swing.JRadioButton jrb_b;
    private javax.swing.JRadioButton jrb_c;
    private javax.swing.JRadioButton jrb_d;
    // End of variables declaration//GEN-END:variables
}
