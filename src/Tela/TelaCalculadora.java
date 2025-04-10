package Tela;

import java.awt.event.*;
import java.text.*;
import javax.swing.*;

public class TelaCalculadora extends javax.swing.JFrame {

    public TelaCalculadora() {
        initComponents();
        setTitle("Calculadora");
        configurarTeclado();
        setLocationRelativeTo(null);
    }

    public String operadorCalc;
    public Float numeroCalc1;
    public Float numeroCalc2;
    public boolean numeroNegativo = false;
    public String textoAtual;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jNumTela = new javax.swing.JLabel();
        jBotaoApagar = new javax.swing.JButton();
        jBotaoDivisao = new javax.swing.JButton();
        jBotaoMultiplicacao = new javax.swing.JButton();
        jBotaoSubtracao = new javax.swing.JButton();
        jBotaoSete = new javax.swing.JButton();
        jBotaoOito = new javax.swing.JButton();
        jBotaoNove = new javax.swing.JButton();
        jBotaoSoma = new javax.swing.JButton();
        jBotaoIgual = new javax.swing.JButton();
        jBotaoSeis = new javax.swing.JButton();
        jBotaoCinco = new javax.swing.JButton();
        jBotaoQuatro = new javax.swing.JButton();
        jBotaoUm = new javax.swing.JButton();
        jBotaoDois = new javax.swing.JButton();
        jBotaoTres = new javax.swing.JButton();
        jBotaoZero = new javax.swing.JButton();
        jBotaoVirgula = new javax.swing.JButton();
        jBotaoNegativo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jNumTela.setBackground(new java.awt.Color(0, 0, 0));
        jNumTela.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jNumTela.setForeground(new java.awt.Color(255, 255, 255));
        jNumTela.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jBotaoApagar.setBackground(new java.awt.Color(51, 51, 51));
        jBotaoApagar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBotaoApagar.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoApagar.setText("C");
        jBotaoApagar.setBorder(null);
        jBotaoApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoApagarActionPerformed(evt);
            }
        });

        jBotaoDivisao.setBackground(new java.awt.Color(51, 51, 51));
        jBotaoDivisao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBotaoDivisao.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoDivisao.setText("/");
        jBotaoDivisao.setBorder(null);
        jBotaoDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoDivisaoActionPerformed(evt);
            }
        });

        jBotaoMultiplicacao.setBackground(new java.awt.Color(51, 51, 51));
        jBotaoMultiplicacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBotaoMultiplicacao.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoMultiplicacao.setText("x");
        jBotaoMultiplicacao.setBorder(null);
        jBotaoMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoMultiplicacaoActionPerformed(evt);
            }
        });

        jBotaoSubtracao.setBackground(new java.awt.Color(51, 51, 51));
        jBotaoSubtracao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBotaoSubtracao.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoSubtracao.setText("-");
        jBotaoSubtracao.setBorder(null);
        jBotaoSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoSubtracaoActionPerformed(evt);
            }
        });

        jBotaoSete.setBackground(new java.awt.Color(102, 102, 102));
        jBotaoSete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBotaoSete.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoSete.setText("7");
        jBotaoSete.setBorder(null);
        jBotaoSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoSeteActionPerformed(evt);
            }
        });

        jBotaoOito.setBackground(new java.awt.Color(102, 102, 102));
        jBotaoOito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBotaoOito.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoOito.setText("8");
        jBotaoOito.setBorder(null);
        jBotaoOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoOitoActionPerformed(evt);
            }
        });

        jBotaoNove.setBackground(new java.awt.Color(102, 102, 102));
        jBotaoNove.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBotaoNove.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoNove.setText("9");
        jBotaoNove.setBorder(null);
        jBotaoNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoNoveActionPerformed(evt);
            }
        });

        jBotaoSoma.setBackground(new java.awt.Color(51, 51, 51));
        jBotaoSoma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBotaoSoma.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoSoma.setText("+");
        jBotaoSoma.setBorder(null);
        jBotaoSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoSomaActionPerformed(evt);
            }
        });

        jBotaoIgual.setBackground(new java.awt.Color(102, 204, 255));
        jBotaoIgual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBotaoIgual.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoIgual.setText("=");
        jBotaoIgual.setBorder(null);
        jBotaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoIgualActionPerformed(evt);
            }
        });

        jBotaoSeis.setBackground(new java.awt.Color(102, 102, 102));
        jBotaoSeis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBotaoSeis.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoSeis.setText("6");
        jBotaoSeis.setBorder(null);
        jBotaoSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoSeisActionPerformed(evt);
            }
        });

        jBotaoCinco.setBackground(new java.awt.Color(102, 102, 102));
        jBotaoCinco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBotaoCinco.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoCinco.setText("5");
        jBotaoCinco.setBorder(null);
        jBotaoCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoCincoActionPerformed(evt);
            }
        });

        jBotaoQuatro.setBackground(new java.awt.Color(102, 102, 102));
        jBotaoQuatro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBotaoQuatro.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoQuatro.setText("4");
        jBotaoQuatro.setBorder(null);
        jBotaoQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoQuatroActionPerformed(evt);
            }
        });

        jBotaoUm.setBackground(new java.awt.Color(102, 102, 102));
        jBotaoUm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBotaoUm.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoUm.setText("1");
        jBotaoUm.setBorder(null);
        jBotaoUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoUmActionPerformed(evt);
            }
        });

        jBotaoDois.setBackground(new java.awt.Color(102, 102, 102));
        jBotaoDois.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBotaoDois.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoDois.setText("2");
        jBotaoDois.setBorder(null);
        jBotaoDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoDoisActionPerformed(evt);
            }
        });

        jBotaoTres.setBackground(new java.awt.Color(102, 102, 102));
        jBotaoTres.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBotaoTres.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoTres.setText("3");
        jBotaoTres.setBorder(null);
        jBotaoTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoTresActionPerformed(evt);
            }
        });

        jBotaoZero.setBackground(new java.awt.Color(102, 102, 102));
        jBotaoZero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBotaoZero.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoZero.setText("0");
        jBotaoZero.setBorder(null);
        jBotaoZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoZeroActionPerformed(evt);
            }
        });

        jBotaoVirgula.setBackground(new java.awt.Color(102, 102, 102));
        jBotaoVirgula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBotaoVirgula.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoVirgula.setText(",");
        jBotaoVirgula.setBorder(null);
        jBotaoVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoVirgulaActionPerformed(evt);
            }
        });

        jBotaoNegativo.setBackground(new java.awt.Color(102, 102, 102));
        jBotaoNegativo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBotaoNegativo.setForeground(new java.awt.Color(255, 255, 255));
        jBotaoNegativo.setText("+/-");
        jBotaoNegativo.setBorder(null);
        jBotaoNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoNegativoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jNumTela, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBotaoApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBotaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBotaoMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBotaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBotaoSete, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBotaoOito, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBotaoNove, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBotaoQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBotaoCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBotaoSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBotaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBotaoUm, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBotaoNegativo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBotaoZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBotaoVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBotaoDois, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBotaoTres, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBotaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jNumTela, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotaoApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotaoMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotaoSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBotaoSete, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBotaoOito, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBotaoNove, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBotaoSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBotaoCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBotaoQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jBotaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBotaoUm, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBotaoDois, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBotaoTres, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBotaoZero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBotaoVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBotaoNegativo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jBotaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotaoDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoDivisaoActionPerformed
        // TODO add your handling code here:
        this.numeroCalc1 = Float.parseFloat(this.jNumTela.getText().replace(",", "."));
        this.operadorCalc = "/";
        this.jNumTela.setText("");
    }//GEN-LAST:event_jBotaoDivisaoActionPerformed

    private void jBotaoSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoSeteActionPerformed
        // TODO add your handling code here:
        textoAtual = jNumTela.getText();
        if (textoAtual.equals("-")) {
            jNumTela.setText("-7");
        } else {
            jNumTela.setText(textoAtual + "7");
        }
    }//GEN-LAST:event_jBotaoSeteActionPerformed

    private void jBotaoZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoZeroActionPerformed
        // TODO add your handling code here:
        textoAtual = jNumTela.getText();

        if (textoAtual.equals("0")) {
            return;
        }
        if (textoAtual.equals("-")) {
            jNumTela.setText("0");
        } else {
            jNumTela.setText(textoAtual + "0");
        }
    }//GEN-LAST:event_jBotaoZeroActionPerformed

    private void jBotaoVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoVirgulaActionPerformed
        // TODO add your handling code here:
        textoAtual = jNumTela.getText();
        if (!textoAtual.contains(",")) {
            if (textoAtual.isEmpty()) {
                jNumTela.setText("0,");
            } else {
                jNumTela.setText(textoAtual + ",");
            }
        }
    }//GEN-LAST:event_jBotaoVirgulaActionPerformed

    private void jBotaoUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoUmActionPerformed
        // TODO add your handling code here:
        textoAtual = jNumTela.getText();
        if (textoAtual.equals("-")) {
            jNumTela.setText("-1");
        } else {
            jNumTela.setText(textoAtual + "1");
        }
    }//GEN-LAST:event_jBotaoUmActionPerformed

    private void jBotaoDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoDoisActionPerformed
        // TODO add your handling code here:
        textoAtual = jNumTela.getText();
        if (textoAtual.equals("-")) {
            jNumTela.setText("-2");
        } else {
            jNumTela.setText(textoAtual + "2");
        }
    }//GEN-LAST:event_jBotaoDoisActionPerformed

    private void jBotaoTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoTresActionPerformed
        // TODO add your handling code here:
        textoAtual = jNumTela.getText();
        if (textoAtual.equals("-")) {
            jNumTela.setText("-3");
        } else {
            jNumTela.setText(textoAtual + "3");
        }
    }//GEN-LAST:event_jBotaoTresActionPerformed

    private void jBotaoQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoQuatroActionPerformed
        // TODO add your handling code here:
        textoAtual = jNumTela.getText();
        if (textoAtual.equals("-")) {
            jNumTela.setText("-4");
        } else {
            jNumTela.setText(textoAtual + "4");
        }
    }//GEN-LAST:event_jBotaoQuatroActionPerformed

    private void jBotaoCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoCincoActionPerformed
        // TODO add your handling code here:
        textoAtual = jNumTela.getText();
        if (textoAtual.equals("-")) {
            jNumTela.setText("-5");
        } else {
            jNumTela.setText(textoAtual + "5");
        }
    }//GEN-LAST:event_jBotaoCincoActionPerformed

    private void jBotaoSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoSeisActionPerformed
        // TODO add your handling code here:
        textoAtual = jNumTela.getText();
        if (textoAtual.equals("-")) {
            jNumTela.setText("-6");
        } else {
            jNumTela.setText(textoAtual + "6");
        }
    }//GEN-LAST:event_jBotaoSeisActionPerformed

    private void jBotaoOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoOitoActionPerformed
        // TODO add your handling code here:
        textoAtual = jNumTela.getText();
        if (textoAtual.equals("-")) {
            jNumTela.setText("-8");
        } else {
            jNumTela.setText(textoAtual + "8");
        }
    }//GEN-LAST:event_jBotaoOitoActionPerformed

    private void jBotaoNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoNoveActionPerformed
        // TODO add your handling code here:
        textoAtual = this.jNumTela.getText();
        if (textoAtual.equals("-")) {
            jNumTela.setText("-9");
        } else {
            jNumTela.setText(textoAtual + "9");
        }
    }//GEN-LAST:event_jBotaoNoveActionPerformed

    private void jBotaoApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoApagarActionPerformed
        // TODO add your handling code here:
        this.jNumTela.setText("");
    }//GEN-LAST:event_jBotaoApagarActionPerformed

    private void jBotaoMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoMultiplicacaoActionPerformed
        // TODO add your handling code here:
        this.numeroCalc1 = Float.parseFloat(this.jNumTela.getText().replace(",", "."));
        this.operadorCalc = "x";
        this.jNumTela.setText("");
    }//GEN-LAST:event_jBotaoMultiplicacaoActionPerformed

    private void jBotaoSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoSubtracaoActionPerformed
        // TODO add your handling code here:
        this.numeroCalc1 = Float.parseFloat(this.jNumTela.getText().replace(",", "."));
        this.operadorCalc = "-";
        this.jNumTela.setText("");
    }//GEN-LAST:event_jBotaoSubtracaoActionPerformed

    private void jBotaoSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoSomaActionPerformed
        // TODO add your handling code here:
        this.numeroCalc1 = Float.parseFloat(this.jNumTela.getText().replace(",", "."));
        this.operadorCalc = "+";
        this.jNumTela.setText("");
    }//GEN-LAST:event_jBotaoSomaActionPerformed
    /**
     * Realiza a operação matemática entre dois números com base no operador
     * selecionado.
     *
     * Este método é chamado quando o botão "=" é pressionado. Ele interpreta o
     * número atual exibido na tela como o segundo operando, realiza a operação
     * com o primeiro operando armazenado anteriormente e exibe o resultado
     * formatado.
     *
     * Caso a operação seja uma divisão por zero, é exibida a mensagem "Erro" na
     * tela, e a execução do método é interrompida.
     *
     * @param evt
     */
    private void jBotaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoIgualActionPerformed
        // TODO add your handling code here:
        DecimalFormat formato = new DecimalFormat("0.#####");
        this.numeroCalc2 = Float.parseFloat(this.jNumTela.getText().replace(",", "."));
        float resultado = 0;
        switch (this.operadorCalc) {
            case "+":
                resultado = this.numeroCalc1 + this.numeroCalc2;
                break;
            case "-":
                resultado = this.numeroCalc1 - this.numeroCalc2;
                break;
            case "x":
                resultado = this.numeroCalc1 * this.numeroCalc2;
                break;
            case "/":
                if (this.numeroCalc2 == 0) {
                    this.jNumTela.setText("Erro");
                    return;
                } else {
                    resultado = this.numeroCalc1 / this.numeroCalc2;
                }
                break;
        }
        jNumTela.setText(formato.format(resultado).replace(".", ","));
    }//GEN-LAST:event_jBotaoIgualActionPerformed

    private void jBotaoNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoNegativoActionPerformed
        numeroNegativo = !numeroNegativo; // inverte o sinal
        String texto = jNumTela.getText();
        if (numeroNegativo) {
            if (!texto.startsWith("-") && texto.isEmpty()) {
                jNumTela.setText("-");
            }
        } else {
            if (texto.equals("-")) {
                jNumTela.setText(""); // limpa o "-"
            }
        }
    }//GEN-LAST:event_jBotaoNegativoActionPerformed

    /**
     * Configura os atalhos do teclado para interação com a calculadora.
     *
     * Associa as teclas numéricas, operadores (+, -, *, /), tecla de igual (=
     * ou Enter), vírgula (ou ponto), tecla para inverter o sinal (N), limpar
     * (C) e backspace com as ações correspondentes da interface gráfica.
     *
     * O método utiliza {@code InputMap} e {@code ActionMap} do
     * {@code JRootPane} para registrar os atalhos mesmo quando os componentes
     * não estão em foco.
     */
    private void configurarTeclado() {
        JRootPane rootPane = this.getRootPane();
        InputMap inputMap = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = rootPane.getActionMap();
        for (int i = 0; i <= 9; i++) {
            int keyCode = KeyEvent.VK_0 + i;
            String numero = String.valueOf(i);
            inputMap.put(KeyStroke.getKeyStroke(keyCode, 0), numero);
            actionMap.put(numero, new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jNumTela.setText(jNumTela.getText() + numero);
                }
            });
        }

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, 0), "soma");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0), "soma");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, InputEvent.SHIFT_DOWN_MASK), "soma");
        actionMap.put("soma", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jBotaoSoma.doClick();
            }
        });

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, 0), "subtracao");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, 0), "subtracao");
        actionMap.put("subtracao", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jBotaoSubtracao.doClick();
            }
        });

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ASTERISK, 0), "multiplicacao");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_MULTIPLY, 0), "multiplicacao");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_8, InputEvent.SHIFT_DOWN_MASK), "multiplicacao");
        actionMap.put("multiplicacao", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jBotaoMultiplicacao.doClick();
            }
        });

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_SLASH, 0), "divisao");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DIVIDE, 0), "divisao");
        actionMap.put("divisao", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jBotaoDivisao.doClick();
            }
        });

        //Igual (= ou Enter)
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "igual");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, 0), "igual");
        actionMap.put("igual", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jBotaoIgual.doClick();
            }
        });

        //Negativo (tecla N)
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N, 0), "negativo");
        actionMap.put("negativo", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jBotaoNegativo.doClick();
            }
        });

        //Limpar (C)
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C, 0), "limpar");
        actionMap.put("limpar", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jBotaoApagar.doClick();
            }
        });

        //Vírgula ou Ponto
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_COMMA, 0), "virgula");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_PERIOD, 0), "virgula");
        actionMap.put("virgula", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jNumTela.getText().contains(",")) {
                    jNumTela.setText(jNumTela.getText() + ",");
                }
            }
        });

        //Backspace
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0), "backspace");
        actionMap.put("backspace", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoAtual = jNumTela.getText();
                if (!textoAtual.isEmpty()) {
                    jNumTela.setText(textoAtual.substring(0, textoAtual.length() - 1));
                }
            }
        });
    }

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
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotaoApagar;
    private javax.swing.JButton jBotaoCinco;
    private javax.swing.JButton jBotaoDivisao;
    private javax.swing.JButton jBotaoDois;
    private javax.swing.JButton jBotaoIgual;
    private javax.swing.JButton jBotaoMultiplicacao;
    private javax.swing.JButton jBotaoNegativo;
    private javax.swing.JButton jBotaoNove;
    private javax.swing.JButton jBotaoOito;
    private javax.swing.JButton jBotaoQuatro;
    private javax.swing.JButton jBotaoSeis;
    private javax.swing.JButton jBotaoSete;
    private javax.swing.JButton jBotaoSoma;
    private javax.swing.JButton jBotaoSubtracao;
    private javax.swing.JButton jBotaoTres;
    private javax.swing.JButton jBotaoUm;
    private javax.swing.JButton jBotaoVirgula;
    private javax.swing.JButton jBotaoZero;
    private javax.swing.JLabel jNumTela;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
