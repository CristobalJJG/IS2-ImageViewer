package View;

import Controller.Controller;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class View extends javax.swing.JFrame implements MouseListener{

    private final Controller controller;
        
    public View(Controller c) {
        this.controller = c;
        initComponents();
        initActionListeners();
        this.setVisible(true);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneBackground = new javax.swing.JPanel();
        paneDirectory = new javax.swing.JPanel();
        lblDirectoryName = new javax.swing.JLabel();
        paneImage = new javax.swing.JPanel();
        lblIconImage = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        paneButtons = new javax.swing.JPanel();
        btnRight = new javax.swing.JButton();
        btnLeft = new javax.swing.JButton();
        lblFileName = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuItemFile = new javax.swing.JMenu();
        menuItemEdit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ImageViewer");
        setLocation(new java.awt.Point(1920, 0));

        lblDirectoryName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDirectoryName.setText("C:/Cosa/Directorio");

        javax.swing.GroupLayout paneDirectoryLayout = new javax.swing.GroupLayout(paneDirectory);
        paneDirectory.setLayout(paneDirectoryLayout);
        paneDirectoryLayout.setHorizontalGroup(
            paneDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneDirectoryLayout.createSequentialGroup()
                .addComponent(lblDirectoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        paneDirectoryLayout.setVerticalGroup(
            paneDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneDirectoryLayout.createSequentialGroup()
                .addComponent(lblDirectoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        lblIconImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout paneImageLayout = new javax.swing.GroupLayout(paneImage);
        paneImage.setLayout(paneImageLayout);
        paneImageLayout.setHorizontalGroup(
            paneImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIconImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        paneImageLayout.setVerticalGroup(
            paneImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconImage, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout paneBackgroundLayout = new javax.swing.GroupLayout(paneBackground);
        paneBackground.setLayout(paneBackgroundLayout);
        paneBackgroundLayout.setHorizontalGroup(
            paneBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paneImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(paneBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        paneBackgroundLayout.setVerticalGroup(
            paneBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneBackgroundLayout.createSequentialGroup()
                .addComponent(paneDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnRight.setText(">>");

        btnLeft.setText("<<");

        lblFileName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFileName.setText("ImageName");

        javax.swing.GroupLayout paneButtonsLayout = new javax.swing.GroupLayout(paneButtons);
        paneButtons.setLayout(paneButtonsLayout);
        paneButtonsLayout.setHorizontalGroup(
            paneButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneButtonsLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(btnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFileName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnRight, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        paneButtonsLayout.setVerticalGroup(
            paneButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRight, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFileName))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        menuItemFile.setText("File");
        menuBar.add(menuItemFile);

        menuItemEdit.setText("Edit");
        menuBar.add(menuItemEdit);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(paneButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paneButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initActionListeners() {
        btnLeft.addMouseListener(this);
        btnRight.addMouseListener(this);
        menuItemEdit.addMouseListener(this);
        menuItemFile.addMouseListener(this);
    }
    
    public void updateImage(String image){
        ImageIcon imagen = new ImageIcon(image);
        Icon ico = new ImageIcon(imagen.getImage()
                .getScaledInstance(
                        lblIconImage.getWidth(), 
                        lblIconImage.getHeight(), 
                        Image.SCALE_DEFAULT));
        lblIconImage.setIcon(ico);
        lblIconImage.repaint();
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
    private javax.swing.JPanel paneBackground;
    private javax.swing.JPanel paneButtons;
    private javax.swing.JPanel paneDirectory;
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
            
            System.out.println("Pressed file");
            
        }else if(e.getSource().equals(menuItemEdit)){
            System.out.println("Pressed edit");
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
