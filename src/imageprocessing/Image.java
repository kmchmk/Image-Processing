package imageprocessing;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author චානක මධුරංග
 */
public class Image extends javax.swing.JFrame {

    /**
     * Creates new form Image
     */
    JFileChooser filechooser;
    BufferedImage image = null;
    BufferedImage tempImage = null;
    int imageWidth = 0;
    int imageHeight = 0;

    int tempImageHeight = 0;
    int tempImageWidth = 0;

    public Image() {

        initComponents();
        filechooser = new JFileChooser("C:\\Users\\Chanaka\\Desktop");
        filechooser.addChoosableFileFilter(new FileNameExtensionFilter("JPG", "JPG", "JPEG"));
        filechooser.addChoosableFileFilter(new FileNameExtensionFilter("PNG", "PNG"));
        filechooser.addChoosableFileFilter(new FileNameExtensionFilter("GIF", "GIF"));
        int p = 8;
        //delete below later
        try {
            image = ImageIO.read(new File("C:\\Users\\Chanaka\\Desktop\\fb.jpg"));
            drawImage();
        } catch (Exception e) {
            System.out.println("Erroreee");
        }
    }//till

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocation(new java.awt.Point(0, 0));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        jScrollPane1.setMinimumSize(new java.awt.Dimension(0, 0));
        jScrollPane1.setViewportView(jLabel1);

        jScrollPane2.setMinimumSize(new java.awt.Dimension(0, 0));
        jScrollPane2.setViewportView(jLabel2);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Gray Scale (Avg)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Gray Scale (Best)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jLabel3.setText("Scale (Ratio)");

        jButton3.setText("Apply Changes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("open");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Save (B&W)");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Open (B&W)");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Bilinear");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextField1.setText("100");

        jTextField2.setText("100");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton3))
        );

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Save");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void drawImage() {
        imageWidth = image.getWidth();
        imageHeight = image.getHeight();
        jLabel1.setSize(imageWidth, imageHeight);
        jLabel1.setIcon(new ImageIcon(image));
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //for ease of testing

        if (filechooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            //System.out.println(filechooser.getSelectedFile());

            try {
                image = ImageIO.read(filechooser.getSelectedFile());
            } catch (IOException ex) {
                Logger.getLogger(Image.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //delete this and uncomment above code to open file chooser
        /*try {
         image = ImageIO.read(new File("C:\\Users\\Chanaka Maduranga\\Desktop\\Working\\fb.jpg"));
         } catch (IOException ex) {
         Logger.getLogger(Image.class.getName()).log(Level.SEVERE, null, ex);
         }*/
        //above
        try {
            //  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

            drawImage();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(filechooser, "This is not an image!", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange

    }//GEN-LAST:event_formPropertyChange

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        if (filechooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            String newImageExtention = filechooser.getFileFilter().getDescription();

            File newImagePath = new File(filechooser.getSelectedFile().toString() + "." + newImageExtention);
            try {
                ImageIO.write(image, newImageExtention, newImagePath);
            } catch (IOException ex) {
                Logger.getLogger(Image.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (image == null) {
            System.out.println("Load Image...");
        } else {
            tempImage = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_RGB);
            tempImageWidth = tempImage.getWidth();
            tempImageHeight = tempImage.getHeight();
            for (int i = 0; i < imageHeight; i++) {
                for (int j = 0; j < imageWidth; j++) {
                    Color color = new Color(image.getRGB(j, i));
                    int avg = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
                    String gray8bit = Integer.toBinaryString(avg);
                    for (int x = 0; gray8bit.length() < 8; x++) {
                        gray8bit = "0" + gray8bit;
                    }
                    String binaryGray = "11111111" + gray8bit + gray8bit + gray8bit;

                    int grayValue = new BigInteger(binaryGray, 2).intValue();
                    tempImage.setRGB(j, i, grayValue);
                }
            }
            jLabel2.setSize(tempImageWidth, tempImageHeight);
            jLabel2.setIcon(new ImageIcon(tempImage));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (image == null) {
            System.out.println("Load Image...");
        } else {
            tempImage = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_RGB);//new
            tempImageWidth = tempImage.getWidth();
            tempImageHeight = tempImage.getHeight();
            for (int i = 0; i < imageHeight; i++) {
                for (int j = 0; j < imageWidth; j++) {
                    Color color = new Color(image.getRGB(j, i));
                    int avg = (int) ((0.2126 * color.getRed()) + (0.7152 * color.getGreen()) + (0.0722 * color.getBlue())) / 3;
                    String gray8bit = Integer.toBinaryString(avg);
                    for (int x = 0; gray8bit.length() < 8; x++) {
                        gray8bit = "0" + gray8bit;
                    }
                    String binaryGray = "11111111" + gray8bit + gray8bit + gray8bit;

                    int grayValue = new BigInteger(binaryGray, 2).intValue();
                    tempImage.setRGB(j, i, grayValue);
                }
            }
            jLabel2.setSize(tempImageWidth, tempImageHeight);
            jLabel2.setIcon(new ImageIcon(tempImage));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged

        int scale = (int) jSpinner1.getValue();

        if (image == null) {
            System.out.println("Load Image...");
        } else {
            tempImage = new BufferedImage((imageWidth + scale - 1) / scale, (imageHeight + scale - 1) / scale, BufferedImage.TYPE_INT_RGB);//new
            tempImageWidth = tempImage.getWidth();
            tempImageHeight = tempImage.getHeight();
            for (int i = 0; i < imageHeight; i = i + scale) {
                for (int j = 0; j < imageWidth; j = j + scale) {
                    tempImage.setRGB(j / scale, i / scale, image.getRGB(j, i));
                }
            }
            jLabel2.setSize(tempImageWidth, tempImageHeight);
            jLabel2.setIcon(new ImageIcon(tempImage));
        }
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (tempImage == null) {
        } else {
            image = tempImage;
            drawImage();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    void save4bytePixel() {
//        byte[] byteArray = new byte[(imageHeight * imageWidth * 4) + 8];
        byte[] byteArray = new byte[(imageHeight * imageWidth * 3) + 8];
        byte[] width = ByteBuffer.allocate(4).putInt(imageWidth).array();
        byte[] height = ByteBuffer.allocate(4).putInt(imageHeight).array();

        for (int i = 0; i < 4; i++) {
            byteArray[i] = width[i];
            byteArray[i + 4] = height[i];
        }

        int p = 8;
        for (int i = 0; i < imageHeight; i++) {
            for (int j = 0; j < imageWidth; j++) {
                Color color = new Color(image.getRGB(j, i));
                byteArray[p] = (byte) (color.getRed() - 128);
                byteArray[p + 1] = (byte) (color.getGreen() - 128);
                byteArray[p + 2] = (byte) (color.getBlue() - 128);
                p = p + 3;
            }
        }

        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Chanaka\\Desktop\\xx.txt");
            fos.write(byteArray);
            fos.close();
        } catch (IOException ex) {
            Logger.getLogger(Image.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void open4bytePixel() {
        try {
            byte[] byteArray = Files.readAllBytes(Paths.get("C:\\Users\\Chanaka\\Desktop\\xx.txt"));
            int width = ByteBuffer.wrap(Arrays.copyOfRange(byteArray, 0, 4)).getInt();
            int height = ByteBuffer.wrap(Arrays.copyOfRange(byteArray, 4, 8)).getInt();
            BufferedImage anImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            int p = 8;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    anImage.setRGB(j, i, new Color(byteArray[p] + 128, byteArray[p + 1] + 128, byteArray[p + 2] + 128, 255).getRGB());
                    p = p + 3;
                }
            }
            image = anImage;
            drawImage();

        } catch (IOException ex) {
            Logger.getLogger(Image.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void save1bytePixel() {
        byte[] byteArray = new byte[(imageHeight * imageWidth) + 8];
        byte[] width = ByteBuffer.allocate(4).putInt(imageWidth).array();
        byte[] height = ByteBuffer.allocate(4).putInt(imageHeight).array();

        for (int i = 0; i < 4; i++) {
            byteArray[i] = width[i];
            byteArray[i + 4] = height[i];
        }

        int p = 8;
        for (int i = 0; i < imageHeight; i++) {
            for (int j = 0; j < imageWidth; j++) {
                Color color = new Color(image.getRGB(j, i));
                byteArray[p] = (byte) (color.getRed() - 128);
                p++;
            }
        }

        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Chanaka\\Desktop\\xx.txt");
            fos.write(byteArray);
            fos.close();
        } catch (IOException ex) {
            Logger.getLogger(Image.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void open1bytePixel() {
        try {
            byte[] byteArray = Files.readAllBytes(Paths.get("C:\\Users\\Chanaka\\Desktop\\xx.txt"));
            int width = ByteBuffer.wrap(Arrays.copyOfRange(byteArray, 0, 4)).getInt();
            int height = ByteBuffer.wrap(Arrays.copyOfRange(byteArray, 4, 8)).getInt();
            BufferedImage anImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            int p = 8;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    int colour = byteArray[p] + 128;
                    anImage.setRGB(j, i, new Color(colour, colour, colour, 255).getRGB());
                    p++;
                }
            }
            image = anImage;
            drawImage();

        } catch (IOException ex) {
            Logger.getLogger(Image.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void resizeBilinear(int w2, int h2) {
        //int[] temp = new int[w2 * h2];
        tempImage = new BufferedImage(w2, h2, BufferedImage.TYPE_INT_RGB);

        int a, b, c, d, x, y, index;
        Color leftDown, leftUp, rightDown, rightUp;
        float x_ratio = ((float) (imageWidth - 1)) / w2;
        float y_ratio = ((float) (imageHeight - 1)) / h2;
        float x_diff, y_diff, blue, red, green;
        int offset = 0;
        for (int i = 0; i < h2; i++) {
            for (int j = 0; j < w2; j++) {
                x = (int) (x_ratio * j);
                y = (int) (y_ratio * i);
                x_diff = (x_ratio * j) - x;
                y_diff = (y_ratio * i) - y;
                index = (y * imageWidth + x);

//                //
//                leftDown = new Color(image.getRGB(x, y));
//                rightDown = new Color(image.getRGB(x + 1, y));
//                leftUp = new Color(image.getRGB(x, y + 1));
//                rightUp = new Color(image.getRGB(x + 1, y + 1));
                leftUp = new Color(image.getRGB(x, y));
                rightUp = new Color(image.getRGB(x + 1, y));
                leftDown = new Color(image.getRGB(x, y + 1));
                rightDown = new Color(image.getRGB(x + 1, y + 1));

//                a = pixels[index];
//                b = pixels[index + 1];
//                c = pixels[index + imageWidth];
//                d = pixels[index + imageWidth + 1];
                // blue element
                // Yb = Ab(1-w)(1-h) + Bb(w)(1-h) + Cb(h)(1-w) + Db(wh)
                blue = leftUp.getBlue() * (1 - x_diff) * (1 - y_diff)
                        + rightUp.getBlue() * x_diff * (1 - y_diff)
                        + leftDown.getBlue() * (1 - x_diff) * y_diff
                        + rightDown.getBlue() * x_diff * y_diff;

//                blue = (a & 0xff) * (1 - x_diff) * (1 - y_diff) + (b & 0xff) * (x_diff) * (1 - y_diff)
//                        + (c & 0xff) * (y_diff) * (1 - x_diff) + (d & 0xff) * (x_diff * y_diff);
//                System.out.println("blue");
//                System.out.println(blue);
//                // green element
//                // Yg = Ag(1-w)(1-h) + Bg(w)(1-h) + Cg(h)(1-w) + Dg(wh)
//                green = ((a >> 8) & 0xff) * (1 - x_diff) * (1 - y_diff) + ((b >> 8) & 0xff) * (x_diff) * (1 - y_diff)
//                        + ((c >> 8) & 0xff) * (y_diff) * (1 - x_diff) + ((d >> 8) & 0xff) * (x_diff * y_diff);
green = leftUp.getGreen() * (1 - x_diff) * (1 - y_diff)
                        + rightUp.getGreen() * x_diff * (1 - y_diff)
                        + leftDown.getGreen() * (1 - x_diff) * y_diff
                        + rightDown.getGreen() * x_diff * y_diff;
//                System.out.println("green");
//                System.out.println(green);
//                // red element
//                // Yr = Ar(1-w)(1-h) + Br(w)(1-h) + Cr(h)(1-w) + Dr(wh)
//                red = ((a >> 16) & 0xff) * (1 - x_diff) * (1 - y_diff) + ((b >> 16) & 0xff) * (x_diff) * (1 - y_diff)
//                        + ((c >> 16) & 0xff) * (y_diff) * (1 - x_diff) + ((d >> 16) & 0xff) * (x_diff * y_diff);

red = leftUp.getRed() * (1 - x_diff) * (1 - y_diff)
                        + rightUp.getRed() * x_diff * (1 - y_diff)
                        + leftDown.getRed() * (1 - x_diff) * y_diff
                        + rightDown.getRed() * x_diff * y_diff;

//                System.out.println("red");
//                System.out.println(red);
                tempImage.setRGB(j, i, new Color((int) red, (int) green, (int) blue, 255).getRGB());
//                temp[offset++]
//                        = 0xff000000
//                        | // hardcode alpha
//                        ((((int) red) << 16) & 0xff0000)
//                        | ((((int) green) << 8) & 0xff00)
//                        | ((int) blue);
//            }
//        }
//        return temp;

                jLabel2.setSize(w2, h2);
                jLabel2.setIcon(new ImageIcon(tempImage));
            }
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        save4bytePixel();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        open4bytePixel();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        save1bytePixel();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        open1bytePixel();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        resizeBilinear(Integer.parseInt(jTextField1.getText()), Integer.parseInt(jTextField2.getText()));
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Image.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Image.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Image.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Image.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Image().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
