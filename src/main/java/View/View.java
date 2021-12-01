package View;

import Controller.Controller;
import View.Themes.Themes;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class View extends javax.swing.JFrame implements MouseListener, ActionListener{

    private final Controller controller;
        
    public View(Controller c, String theme) {
        this.controller = c;
        try {
            UIManager.setLookAndFeel(theme);
        } catch (Exception e) {
            e.getMessage();
        }
        initComponents();
        initListeners();
        this.setVisible(true);
        this.setResizable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneBackground = new javax.swing.JPanel();
        paneDirectoryName = new javax.swing.JPanel();
        lblDirectoryName = new javax.swing.JLabel();
        paneImage = new javax.swing.JPanel();
        lblIconImage = new javax.swing.JLabel();
        paneButtons = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnLeft = new javax.swing.JButton();
        lblFileName = new javax.swing.JLabel();
        btnRight = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuItemFile = new javax.swing.JMenu();
        menuItemEdit = new javax.swing.JMenu();
        mnThemeFlatLight = new javax.swing.JMenuItem();
        mnThemeFlatDark = new javax.swing.JMenuItem();
        mnThemeFlatIntelliJ = new javax.swing.JMenuItem();
        mnThemeFlatDarcula = new javax.swing.JMenuItem();
        mnThemeIJAtomDark = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ImageViewer");
        setLocation(new java.awt.Point(1920, 0));

        lblDirectoryName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDirectoryName.setText("F:/Cosas/DirectorioConFotos");

        javax.swing.GroupLayout paneDirectoryNameLayout = new javax.swing.GroupLayout(paneDirectoryName);
        paneDirectoryName.setLayout(paneDirectoryNameLayout);
        paneDirectoryNameLayout.setHorizontalGroup(
            paneDirectoryNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDirectoryName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        paneDirectoryNameLayout.setVerticalGroup(
            paneDirectoryNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneDirectoryNameLayout.createSequentialGroup()
                .addComponent(lblDirectoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        paneImage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        paneImage.setVerifyInputWhenFocusTarget(false);

        lblIconImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconImage.setText("Imagen");

        javax.swing.GroupLayout paneImageLayout = new javax.swing.GroupLayout(paneImage);
        paneImage.setLayout(paneImageLayout);
        paneImageLayout.setHorizontalGroup(
            paneImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIconImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        paneImageLayout.setVerticalGroup(
            paneImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneImageLayout.createSequentialGroup()
                .addComponent(lblIconImage, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        btnLeft.setText("<<");

        lblFileName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFileName.setText("FileName");

        btnRight.setText(">>");

        javax.swing.GroupLayout paneButtonsLayout = new javax.swing.GroupLayout(paneButtons);
        paneButtons.setLayout(paneButtonsLayout);
        paneButtonsLayout.setHorizontalGroup(
            paneButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneButtonsLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFileName, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnRight, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        paneButtonsLayout.setVerticalGroup(
            paneButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneButtonsLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRight, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFileName))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout paneBackgroundLayout = new javax.swing.GroupLayout(paneBackground);
        paneBackground.setLayout(paneBackgroundLayout);
        paneBackgroundLayout.setHorizontalGroup(
            paneBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneDirectoryName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paneImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paneButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        paneBackgroundLayout.setVerticalGroup(
            paneBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneBackgroundLayout.createSequentialGroup()
                .addComponent(paneDirectoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paneImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(paneButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuItemFile.setText("Choose New File");
        menuBar.add(menuItemFile);

        menuItemEdit.setText("Change Theme");

        mnThemeFlatLight.setText("Flat Ligth");
        menuItemEdit.add(mnThemeFlatLight);

        mnThemeFlatDark.setText("Flat Dark");
        menuItemEdit.add(mnThemeFlatDark);

        mnThemeFlatIntelliJ.setText("Flat IntelliJ");
        menuItemEdit.add(mnThemeFlatIntelliJ);

        mnThemeFlatDarcula.setText("Flat Darcula");
        menuItemEdit.add(mnThemeFlatDarcula);

        mnThemeIJAtomDark.setText("IJ Atom Dark");
        menuItemEdit.add(mnThemeIJAtomDark);

        menuBar.add(menuItemEdit);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initListeners() {
        btnLeft.addMouseListener(this);
        btnRight.addMouseListener(this);
        menuItemEdit.addMouseListener(this);
        menuItemFile.addMouseListener(this);
        mnThemeFlatLight.addActionListener(this);
        mnThemeFlatDark.addActionListener(this);
        mnThemeFlatIntelliJ.addActionListener(this);
        mnThemeFlatDarcula.addActionListener(this);
        mnThemeIJAtomDark.addActionListener(this);
    }
    
    public void updateImage(String image){
        lblIconImage.setText("");
        ImageIcon imagen = new ImageIcon(image);
        Icon ico = new ImageIcon(imagen.getImage()
                .getScaledInstance(
                        lblIconImage.getWidth(), 
                        lblIconImage.getHeight(), 
                        Image.SCALE_DEFAULT));
        lblIconImage.setIcon(ico);
        this.repaint();
    }
    
    public void updateDirName(String name){
        lblDirectoryName.setText(name);
    }

    public void updateFileName(String name){
        lblFileName.setText(name);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnRight;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDirectoryName;
    private javax.swing.JLabel lblFileName;
    private javax.swing.JLabel lblIconImage;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuItemEdit;
    private javax.swing.JMenu menuItemFile;
    private javax.swing.JMenuItem mnThemeFlatDarcula;
    private javax.swing.JMenuItem mnThemeFlatDark;
    private javax.swing.JMenuItem mnThemeFlatIntelliJ;
    private javax.swing.JMenuItem mnThemeFlatLight;
    private javax.swing.JMenuItem mnThemeIJAtomDark;
    private javax.swing.JPanel paneBackground;
    private javax.swing.JPanel paneButtons;
    private javax.swing.JPanel paneDirectoryName;
    private javax.swing.JPanel paneImage;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource().equals(btnLeft)){
            controller.prevImage();
            System.out.println("Pressed left");
            
        }else if(e.getSource().equals(btnRight)){
            controller.nextImage();
            System.out.println("Pressed rigth");
            
        }else if(e.getSource().equals(menuItemFile)){
            controller.newDirectory();
            System.out.println("Pressed file");
            
        }else if(e.getSource().equals(menuItemEdit)){
            System.out.println("Pressed edit");
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(mnThemeFlatLight)){
            this.setVisible(false);
            this.dispose();
            controller.changeTheme(Themes.flatLight());
            System.out.println("Cosa ligth");
            
        }else if(e.getSource().equals(mnThemeFlatDark)){
            this.setVisible(false);
            this.dispose();
            controller.changeTheme(Themes.flatDark());
            System.out.println("Cosa dark");
            
        }else if(e.getSource().equals(mnThemeFlatIntelliJ)){
            this.setVisible(false);
            this.dispose();
            controller.changeTheme(Themes.flatIntelliJ());
            System.out.println("Cosa intllij");
            
        }else if(e.getSource().equals(mnThemeFlatDarcula)){
            this.setVisible(false);
            this.dispose();
            controller.changeTheme(Themes.flatDarcula());
            System.out.println("Cosa darcula");
            
        }else if(e.getSource().equals(mnThemeIJAtomDark)){
            this.setVisible(false);
            this.dispose();
            controller.changeTheme(Themes.iJAtomDark());
            System.out.println("Cosa atomdark");
            
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}
