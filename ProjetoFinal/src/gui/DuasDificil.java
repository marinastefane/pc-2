package gui;

import dominio.Jogo;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Ana Clara Mendonça Franco, Marina Stefane Cândido Delfino, Matheus
 * Santos Barbosa, Pablo Alves Rufino
 */
public class DuasDificil extends javax.swing.JInternalFrame {

    public DuasDificil() {
        initComponents();
        letrinhas = new JTextField[7];
        letrinhas[0] = jTextField19;
        letrinhas[1] = jTextField20;
        letrinhas[2] = jTextField21;
        letrinhas[3] = jTextField15;
        letrinhas[4] = jTextField16;
        letrinhas[5] = jTextField17;
        letrinhas[6] = jTextField18;

        letrinhas2 = new JTextField[7];
        letrinhas2[0] = jTextField26;
        letrinhas2[1] = jTextField27;
        letrinhas2[2] = jTextField28;
        letrinhas2[3] = jTextField22;
        letrinhas2[4] = jTextField23;
        letrinhas2[5] = jTextField24;
        letrinhas2[6] = jTextField25;

        alfabeto = new JButton[27];
        alfabeto[0] = jButton1;
        alfabeto[1] = jButton2;
        alfabeto[2] = jButton3;
        alfabeto[3] = jButton4;
        alfabeto[4] = jButton5;
        alfabeto[5] = jButton6;
        alfabeto[6] = jButton7;
        alfabeto[7] = jButton8;
        alfabeto[8] = jButton9;
        alfabeto[9] = jButton10;
        alfabeto[10] = jButton11;
        alfabeto[11] = jButton12;
        alfabeto[12] = jButton13;
        alfabeto[13] = jButton14;
        alfabeto[14] = jButton15;
        alfabeto[15] = jButton16;
        alfabeto[16] = jButton17;
        alfabeto[17] = jButton18;
        alfabeto[18] = jButton19;
        alfabeto[19] = jButton20;
        alfabeto[20] = jButton21;
        alfabeto[21] = jButton22;
        alfabeto[22] = jButton23;
        alfabeto[23] = jButton24;
        alfabeto[24] = jButton25;
        alfabeto[25] = jButton26;
        alfabeto[26] = jButton27;

        //estabelesce q tem palavra2, tem 11 tentativas, o retorno tem 7 de tamanho e o retorno2 tem 7 de tamanho tbm
        jogo = new Jogo("", 11, 7, 7);
        jogo.sorteiaPalavra("palavras7letras", 1); //sorteia palavra 1
        jogo.sorteiaPalavra("palavras7letras", 2); //sorteia palavra 2
    }

    private void menNovoJogo() {
        JOptionPane.showMessageDialog(this, "Um novo jogo será iniciado!", "NOVO JOGO", JOptionPane.INFORMATION_MESSAGE);

    }

    private void endGame() {
        if (todasLetrasAdivinhadas() && todasLetrasAdivinhadas2()) {
            JOptionPane.showMessageDialog(this, "Parabennsss, jogo concluído!! \nVoce acertou as palavras " + this.jogo.getPalavra() + ", " + this.jogo.getPalavra2() + " " + "\nfaltando " + this.jogo.getTentativas() + " tentativas!", "WE ARE CHAMPIONS", JOptionPane.INFORMATION_MESSAGE);
            menNovoJogo();
            novoJogo();
        } else if (jogo.getTentativas() <= 0) {
            JOptionPane.showMessageDialog(this, "Tente de Novo! \nVoce não acertou as palavras " + this.jogo.getPalavra() + ", " + this.jogo.getPalavra2() + "!", "MORTO", JOptionPane.WARNING_MESSAGE);
            menNovoJogo();
            novoJogo();
        }
    }

    private boolean todasLetrasAdivinhadas() {
        for (JTextField letraTextField : letrinhas) {
            if (letraTextField.getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private boolean todasLetrasAdivinhadas2() {
        for (JTextField letraTextField2 : letrinhas2) {
            if (letraTextField2.getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public void reiniciaTentativas() {
        numTent.setText(String.valueOf(jogo.getTentativas()));
    }

    public void habilitaBotoes(boolean habilitar) {
        for (JButton botao : alfabeto) {
            botao.setEnabled(habilitar);
        }
    }

    public void limparText() {
        jTextField19.setText("");
        jTextField20.setText("");
        jTextField21.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");

        jTextField26.setText("");
        jTextField27.setText("");
        jTextField28.setText("");
        jTextField22.setText("");
        jTextField23.setText("");
        jTextField24.setText("");
        jTextField25.setText("");
    }

    public void novoJogo() {
        limparText();
        habilitaBotoes(true);
        jogo = new Jogo("", 11, 7, 7);
        jogo.sorteiaPalavra("palavras7letras", 1);
        jogo.sorteiaPalavra("palavras7letras", 2);
        reiniciaTentativas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        numTent = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BotaoNovoJogo = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();

        setClosable(true);
        setTitle("MODO DIFÍCIL");

        jPanel1.setBackground(new java.awt.Color(239, 255, 239));
        jPanel1.setPreferredSize(new java.awt.Dimension(556, 348));

        jPanel4.setBackground(new java.awt.Color(239, 255, 239));

        jButton2.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton2.setText("W");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton3.setText("E");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton4.setText("R");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton5.setText("T");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton6.setText("Y");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton7.setText("U");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton8.setText("I");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton9.setText("O");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton10.setText("P");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton11.setText("S");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton12.setText("D");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton13.setText("F");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton14.setText("G");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton15.setText("H");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton16.setText("J");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton17.setText("K");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton18.setText("L");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton21.setText("C");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton22.setText("V");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton23.setText("B");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton24.setText("N");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton25.setText("M");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton26.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton26.setText("Z");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton27.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton27.setText("X");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton1.setText("Q");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton20.setText("A");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton19.setText("Ç");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoDasLetras(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButton26)
                        .addGap(18, 18, 18)
                        .addComponent(jButton27)
                        .addGap(18, 18, 18)
                        .addComponent(jButton21)
                        .addGap(18, 18, 18)
                        .addComponent(jButton22)
                        .addGap(18, 18, 18)
                        .addComponent(jButton23)
                        .addGap(18, 18, 18)
                        .addComponent(jButton24)
                        .addGap(18, 18, 18)
                        .addComponent(jButton25))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton19)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton10, jButton11, jButton12, jButton13, jButton14, jButton15, jButton16, jButton17, jButton18, jButton19, jButton2, jButton20, jButton21, jButton22, jButton23, jButton24, jButton25, jButton26, jButton27, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton15)
                    .addComponent(jButton16)
                    .addComponent(jButton17)
                    .addComponent(jButton18)
                    .addComponent(jButton19))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton27)
                    .addComponent(jButton21)
                    .addComponent(jButton26)
                    .addComponent(jButton22)
                    .addComponent(jButton23)
                    .addComponent(jButton24)
                    .addComponent(jButton25))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        numTent.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        numTent.setText("11");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("tentativas!");

        BotaoNovoJogo.setBackground(new java.awt.Color(234, 225, 246));
        BotaoNovoJogo.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        BotaoNovoJogo.setText("Novo Jogo");
        BotaoNovoJogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoNovoJogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CliqueBotaoNovoJogo(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Cambria", 1, 19)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("JOGO DA FORCA - MODO DIFÍCIL");

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setText("Você tem ");

        jPanel5.setBackground(new java.awt.Color(234, 225, 246));
        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTextField15.setEditable(false);
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField16.setEditable(false);
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField17.setEditable(false);
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField18.setEditable(false);
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField19.setEditable(false);
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });

        jTextField20.setEditable(false);
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField21.setEditable(false);
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(234, 225, 246));
        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTextField22.setEditable(false);
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField23.setEditable(false);
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField24.setEditable(false);
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField25.setEditable(false);
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField26.setEditable(false);
        jTextField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField27.setEditable(false);
        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField28.setEditable(false);
        jTextField28.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(jLabel1)
                                .addGap(11, 11, 11)
                                .addComponent(numTent)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(BotaoNovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(Titulo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numTent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)))
                .addGap(14, 14, 14)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoNovoJogo)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AcaoDasLetras(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcaoDasLetras
        String face = ((JButton) evt.getSource()).getText();
        ((JButton) evt.getSource()).setEnabled(false);

        jogo.verificaLetra(face);
        numTent.setText(String.valueOf(jogo.getTentativas()));
        for (int i = 0; i < jogo.getPosicoes().getPosicoesPalavra1().length; i++) {
            if (jogo.getPosicoes().getPosicoesPalavra1()[i] == 1) {
                letrinhas[i].setText(letrinhas[i].getText() + face);
            }
        }
        for (int j = 0; j < jogo.getPosicoes().getPosicoesPalavra2().length; j++) {
            if (jogo.getPosicoes().getPosicoesPalavra2()[j] == 1) {
                letrinhas2[j].setText(letrinhas2[j].getText() + face);
            }
        }
        jogo.getPosicoes().apagaPosicoes(1);
        jogo.getPosicoes().apagaPosicoes(2);
        endGame();
    }//GEN-LAST:event_AcaoDasLetras

    private void CliqueBotaoNovoJogo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CliqueBotaoNovoJogo
        novoJogo();
    }//GEN-LAST:event_CliqueBotaoNovoJogo

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private Jogo jogo;
    private JTextField[] letrinhas;
    private JTextField[] letrinhas2;
    private JButton[] alfabeto;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoNovoJogo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JLabel numTent;
    // End of variables declaration//GEN-END:variables
}
