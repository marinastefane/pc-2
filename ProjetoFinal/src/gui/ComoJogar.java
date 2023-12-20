package gui;

/**
 *
 * @author Ana Clara Mendonça Franco, Marina Stefane Cândido Delfino, Matheus
 * Santos Barbosa, Pablo Alves Rufino
 */
public class ComoJogar extends javax.swing.JInternalFrame {

    public ComoJogar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);

        jPanel4.setBackground(new java.awt.Color(239, 255, 239));
        jPanel4.setPreferredSize(new java.awt.Dimension(556, 348));

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(234, 225, 246));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea3.setRows(5);
        jTextArea3.setText("Modo Única Palavra:\n1. Facil (4 Letras)\n2. Médio (5 Letras)\n3. Difícil (7 Letras)\n\nModo Duas Palavras:\n1. Facil (4 Letras)\n2. Médio (5 Letras)\n3. Difícil (7 Letras)");
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(234, 225, 246));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea4.setRows(5);
        jTextArea4.setText("Instruções Gerais:\nO Jogo da Forca é um jogo de palavras\nonde o objetivo é adivinhar a palavra oculta\nantes esgotar as tentativas.\nCada jogador pode escolher entre três níveis\nde dificuldade: Fácil, Médio e Difícil. O nível\ndeterminará o número de letras na palavra.\n\nFÁCIL:\nEscolha o modo fácil se estiver começando ou\nquiser um desafio leve. Você terá 6 tentativas.\nMÉDIO:\nOpte pelo nível médio se estiver buscando um\ndesafio moderado. Você terá 9 tentativas.\nDIFÍCIL:\nEscolha o nível difícil para um desafio avançado.\nVocê terá 11 tentativas.");
        jScrollPane4.setViewportView(jTextArea4);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Como Jogar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
}
