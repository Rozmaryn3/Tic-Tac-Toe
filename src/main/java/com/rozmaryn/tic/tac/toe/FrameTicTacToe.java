package com.rozmaryn.tic.tac.toe;

public class FrameTicTacToe extends javax.swing.JFrame {
    private boolean turno = true;
    private int[][] casillas = {{4, 7, 3}, {4, 5, 6}, {7, 8, 9}};;
    private int aux1 = 0;

    
    public FrameTicTacToe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt1 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        labelWinner = new javax.swing.JLabel();
        btRt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(367, 390));
        setMinimumSize(new java.awt.Dimension(367, 390));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });

        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });

        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });

        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });

        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        labelWinner.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 18)); // NOI18N
        labelWinner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelWinner.setText("jLabel1");
        labelWinner.setVisible(false);

        btRt.setText("REINICIAR");
        btRt.setVisible(false);
        btRt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelWinner, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btRt)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelWinner, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btRt)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        if(turno == true){
                bt1.setText("X");
                turno = false;
                bt1.setEnabled(false);
                casillas[0][0] = 1;
            }
        else {
            bt1.setText("O");
                turno = true;
                bt1.setEnabled(false);
                casillas[0][0] = 2;
        }
        for(int i = 0; i < 3; i++){
            if((casillas[0][i] == casillas[1][i] && 
               casillas[1][i] == casillas[2][i]) || (casillas[i][0] == casillas[i][1] &&
                    casillas[i][1] == casillas[i][2]) || (casillas[0][0] == casillas[1][1] && casillas[1][1] == casillas[2][2])
                    || (casillas[0][2] == casillas[1][1] && casillas[1][1] == casillas[2][0])
                    ){
                    labelWinner.setVisible(true);
                    labelWinner.setText("JUEGO TERMINADO");
                    bt1.setEnabled(false);bt6.setEnabled(false);
                    bt2.setEnabled(false);bt7.setEnabled(false);
                    bt3.setEnabled(false);bt8.setEnabled(false);
                    bt4.setEnabled(false);bt9.setEnabled(false);
                    bt5.setEnabled(false);
                    btRt.setVisible(true);
            }
        }
        
        aux1++;
        
        if(aux1 == 9){
            btRt.setVisible(true);
        }
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        if(turno == true){
                bt3.setText("X");
                turno = false;
                bt3.setEnabled(false);
                casillas[0][2] = 1;
            }
        else {
            bt3.setText("O");
                turno = true;
                bt3.setEnabled(false);
                casillas[0][2] = 2;
        }
        for(int i = 0; i < 3; i++){
            if((casillas[0][i] == casillas[1][i] && 
               casillas[1][i] == casillas[2][i]) || (casillas[i][0] == casillas[i][1] &&
                    casillas[i][1] == casillas[i][2]) || (casillas[0][0] == casillas[1][1] && casillas[1][1] == casillas[2][2])
                    || (casillas[0][2] == casillas[1][1] && casillas[1][1] == casillas[2][0])
                    ){
                    labelWinner.setText("JUEGO TERMINADO");
                    labelWinner.setVisible(true);
                    bt1.setEnabled(false);bt6.setEnabled(false);
                    bt2.setEnabled(false);bt7.setEnabled(false);
                    bt3.setEnabled(false);bt8.setEnabled(false);
                    bt4.setEnabled(false);bt9.setEnabled(false);
                    bt5.setEnabled(false);
                    btRt.setVisible(true);
            }
        }
        
        aux1++;
        
        if(aux1 == 9){
            btRt.setVisible(true);
        }
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        if(turno == true){
                bt4.setText("X");
                turno = false;
                bt4.setEnabled(false);
                casillas[1][0] = 1;
            }
        else {
            bt4.setText("O");
                turno = true;
                bt4.setEnabled(false);
                casillas[1][0] = 2;
        }
        for(int i = 0; i < 3; i++){
            if((casillas[0][i] == casillas[1][i] && 
               casillas[1][i] == casillas[2][i]) || (casillas[i][0] == casillas[i][1] &&
                    casillas[i][1] == casillas[i][2]) || (casillas[0][0] == casillas[1][1] && casillas[1][1] == casillas[2][2])
                    || (casillas[0][2] == casillas[1][1] && casillas[1][1] == casillas[2][0])
                    ){
                    labelWinner.setText("JUEGO TERMINADO");
                    labelWinner.setVisible(true);
                    bt1.setEnabled(false);bt6.setEnabled(false);
                    bt2.setEnabled(false);bt7.setEnabled(false);
                    bt3.setEnabled(false);bt8.setEnabled(false);
                    bt4.setEnabled(false);bt9.setEnabled(false);
                    bt5.setEnabled(false);
             btRt.setVisible(true);
            }
        }
        
        aux1++;
        
        if(aux1 == 9){
            btRt.setVisible(true);
        }
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        if(turno == true){
                bt5.setText("X");
                turno = false;
                bt5.setEnabled(false);
                casillas[1][1] = 1;
            }
        else {
            bt5.setText("O");
                turno = true;
                bt5.setEnabled(false);
                casillas[1][1] = 2;
        }
        for(int i = 0; i < 3; i++){
            if((casillas[0][i] == casillas[1][i] && 
               casillas[1][i] == casillas[2][i]) || (casillas[i][0] == casillas[i][1] &&
                    casillas[i][1] == casillas[i][2]) || (casillas[0][0] == casillas[1][1] && casillas[1][1] == casillas[2][2])
                    || (casillas[0][2] == casillas[1][1] && casillas[1][1] == casillas[2][0])
                    ){
                    labelWinner.setText("JUEGO TERMINADO");
                    labelWinner.setVisible(true);
                    bt1.setEnabled(false);bt6.setEnabled(false);
                    bt2.setEnabled(false);bt7.setEnabled(false);
                    bt3.setEnabled(false);bt8.setEnabled(false);
                    bt4.setEnabled(false);bt9.setEnabled(false);
                    bt5.setEnabled(false);
                       btRt.setVisible(true);
            }
        }
        
        aux1++;
        
        if(aux1 == 9){
            btRt.setVisible(true);
        }
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        if(turno == true){
                bt6.setText("X");
                turno = false;
                bt6.setEnabled(false);
                casillas[1][2] = 1;
            }
        else {
            bt6.setText("O");
                turno = true;
                bt6.setEnabled(false);
                casillas[1][2] = 2;
        }
        for(int i = 0; i < 3; i++){
            if((casillas[0][i] == casillas[1][i] && 
               casillas[1][i] == casillas[2][i]) || (casillas[i][0] == casillas[i][1] &&
                    casillas[i][1] == casillas[i][2]) || (casillas[0][0] == casillas[1][1] && casillas[1][1] == casillas[2][2])
                    || (casillas[0][2] == casillas[1][1] && casillas[1][1] == casillas[2][0])
                    ){
                    labelWinner.setText("JUEGO TERMINADO");
                    labelWinner.setVisible(true);
                    bt1.setEnabled(false);bt6.setEnabled(false);
                    bt2.setEnabled(false);bt7.setEnabled(false);
                    bt3.setEnabled(false);bt8.setEnabled(false);
                    bt4.setEnabled(false);bt9.setEnabled(false);
                    bt5.setEnabled(false);
              btRt.setVisible(true);
            }
        }
        
        aux1++;
        
        if(aux1 == 9){
            btRt.setVisible(true);
        }
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        if(turno == true){
                bt7.setText("X");
                turno = false;
                bt7.setEnabled(false);
                casillas[2][0] = 1;
            }
        else {
            bt7.setText("O");
                turno = true;
                bt7.setEnabled(false);
                casillas[2][0] = 2;
        }
        for(int i = 0; i < 3; i++){
            if((casillas[0][i] == casillas[1][i] && 
               casillas[1][i] == casillas[2][i]) || (casillas[i][0] == casillas[i][1] &&
                    casillas[i][1] == casillas[i][2]) || (casillas[0][0] == casillas[1][1] && casillas[1][1] == casillas[2][2])
                    || (casillas[0][2] == casillas[1][1] && casillas[1][1] == casillas[2][0])
                    ){
                    labelWinner.setText("JUEGO TERMINADO");
                    labelWinner.setVisible(true);
                    bt1.setEnabled(false);bt6.setEnabled(false);
                    bt2.setEnabled(false);bt7.setEnabled(false);
                    bt3.setEnabled(false);bt8.setEnabled(false);
                    bt4.setEnabled(false);bt9.setEnabled(false);
                    bt5.setEnabled(false);
             btRt.setVisible(true);
            }
        }
        
        aux1++;
        
        if(aux1 == 9){
            btRt.setVisible(true);
        }
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        if(turno == true){
                bt8.setText("X");
                turno = false;
                bt8.setEnabled(false);
                casillas[2][1] = 1;
            }
        else {
            bt8.setText("O");
                turno = true;
                bt8.setEnabled(false);
                casillas[2][1] = 2;
        }
        for(int i = 0; i < 3; i++){
            if((casillas[0][i] == casillas[1][i] && 
               casillas[1][i] == casillas[2][i]) || (casillas[i][0] == casillas[i][1] &&
                    casillas[i][1] == casillas[i][2]) || (casillas[0][0] == casillas[1][1] && casillas[1][1] == casillas[2][2])
                    || (casillas[0][2] == casillas[1][1] && casillas[1][1] == casillas[2][0])
                    ){
                    labelWinner.setText("JUEGO TERMINADO");
                    labelWinner.setVisible(true);
                    bt1.setEnabled(false);bt6.setEnabled(false);
                    bt2.setEnabled(false);bt7.setEnabled(false);
                    bt3.setEnabled(false);bt8.setEnabled(false);
                    bt4.setEnabled(false);bt9.setEnabled(false);
                    bt5.setEnabled(false);
              btRt.setVisible(true);
            }
        }
        
        aux1++;
        
        if(aux1 == 9){
            btRt.setVisible(true);
        }
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        if(turno == true){
                bt9.setText("X");
                turno = false;
                bt9.setEnabled(false);
                casillas[2][2] = 1;
            }
        else {
            bt9.setText("O");
                turno = true;
                bt9.setEnabled(false);
                casillas[2][2] = 2;
        }
        for(int i = 0; i < 3; i++){
            if((casillas[0][i] == casillas[1][i] && 
               casillas[1][i] == casillas[2][i]) || (casillas[i][0] == casillas[i][1] &&
                    casillas[i][1] == casillas[i][2]) || (casillas[0][0] == casillas[1][1] && casillas[1][1] == casillas[2][2])
                    || (casillas[0][2] == casillas[1][1] && casillas[1][1] == casillas[2][0])
                    ){
                    labelWinner.setText("JUEGO TERMINADO");
                    labelWinner.setVisible(true);
                    bt1.setEnabled(false);bt6.setEnabled(false);
                    bt2.setEnabled(false);bt7.setEnabled(false);
                    bt3.setEnabled(false);bt8.setEnabled(false);
                    bt4.setEnabled(false);bt9.setEnabled(false);
                    bt5.setEnabled(false);
              btRt.setVisible(true);
            }
        }
        
        aux1++;
        
        if(aux1 == 9){
            btRt.setVisible(true);
        }
    }//GEN-LAST:event_bt9ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        if(turno == true){
                bt2.setText("X");
                turno = false;
                bt2.setEnabled(false);
                casillas[0][1] = 1;
            }
        else {
            bt2.setText("O");
                turno = true;
                bt2.setEnabled(false);
                casillas[0][1] = 2;
        }
        for(int i = 0; i < 3; i++){
            if((casillas[0][i] == casillas[1][i] && 
               casillas[1][i] == casillas[2][i]) || (casillas[i][0] == casillas[i][1] &&
                    casillas[i][1] == casillas[i][2]) || (casillas[0][0] == casillas[1][1] && casillas[1][1] == casillas[2][2])
                    || (casillas[0][2] == casillas[1][1] && casillas[1][1] == casillas[2][0])
                    ){
                    labelWinner.setText("JUEGO TERMINADO");
                    labelWinner.setVisible(true);
                    bt1.setEnabled(false);bt6.setEnabled(false);
                    bt2.setEnabled(false);bt7.setEnabled(false);
                    bt3.setEnabled(false);bt8.setEnabled(false);
                    bt4.setEnabled(false);bt9.setEnabled(false);
                    bt5.setEnabled(false);
             btRt.setVisible(true);
            }
        }
        
        aux1++;
        
        if(aux1 == 9){
            btRt.setVisible(true);
        }
    }//GEN-LAST:event_bt2ActionPerformed

    private void btRtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRtActionPerformed
       aux1 = 0;
       bt1.setEnabled(true);bt6.setEnabled(true);
       bt2.setEnabled(true);bt7.setEnabled(true);
       bt3.setEnabled(true);bt8.setEnabled(true);
       bt4.setEnabled(true);bt9.setEnabled(true);
       bt5.setEnabled(true);
       
       bt1.setText("");bt4.setText("");bt7.setText("");
       bt2.setText("");bt5.setText("");bt8.setText("");
       bt3.setText("");bt6.setText("");bt9.setText("");
       
       int aux2 = 3;
       
       for(int i = 0; i < 3; i++){
           for(int j = 0; j < 3; j++){
               aux2++;
               casillas[i][j] = aux2;
           }
       }
       
       btRt.setVisible(false);
       labelWinner.setVisible(false);
    }//GEN-LAST:event_btRtActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameTicTacToe ventana = new FrameTicTacToe();
                ventana.setVisible(true);
            }            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btRt;
    private javax.swing.JLabel labelWinner;
    // End of variables declaration//GEN-END:variables
}
