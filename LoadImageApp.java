/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/**
 * This class demonstrates how to load an Image from an external file
 */
public class LoadImageApp extends Component {

    BufferedImage img;

    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    public LoadImageApp(String c) {
        try {
            if(c.trim().toLowerCase().equals("red"))
            {
                img = ImageIO.read(new File("blobRed.png"));
            }
            else if(c.trim().toLowerCase().equals("orange"))
            {
                img = ImageIO.read(new File("blobOrange.png"));
            }
            else if(c.trim().toLowerCase().equals("yellow"))
            {
                img = ImageIO.read(new File("blobYellow.png"));
            }
            else if(c.trim().toLowerCase().equals("green"))
            {
                img = ImageIO.read(new File("blobGreen.png"));
            }
            else if(c.trim().toLowerCase().equals("blue"))
            {
                img = ImageIO.read(new File("blobBlue.png"));
            }
            else if(c.trim().toLowerCase().equals("purple"))
            {
                img = ImageIO.read(new File("blobPurple.png"));
            }
            else if(c.trim().toLowerCase().equals("pink"))
            {
                img = ImageIO.read(new File("blobPink.png"));
            }
            else if(c.trim().toLowerCase().equals("black"))
            {
                img = ImageIO.read(new File("blobBlack.png"));
            }
            else if(c.trim().toLowerCase().equals("white"))
            {
                img = ImageIO.read(new File("blobWhite.png"));
            }
            else if(c.trim().toLowerCase().equals("magenta"))
            {
                img = ImageIO.read(new File("blobMagenta.png"));
            }
            else if(c.trim().toLowerCase().equals("transparent"))
            {
                img = ImageIO.read(new File("blobTransparent.png"));
            }
            else
            {
                img = ImageIO.read(new File("blobTransparent.png"));
            }
        } catch (IOException e) {
        }

    }
    public LoadImageApp(String c, int a) {
        try {
            if(c.trim().toLowerCase().equals("red"))
            {
                img = ImageIO.read(new File("blobRedSmall.png"));
            }
            else if(c.trim().toLowerCase().equals("orange"))
            {
                img = ImageIO.read(new File("blobOrangeSmall.png"));
            }
            else if(c.trim().toLowerCase().equals("yellow"))
            {
                img = ImageIO.read(new File("blobYellowSmall.png"));
            }
            else if(c.trim().toLowerCase().equals("green"))
            {
                img = ImageIO.read(new File("blobGreenSmall.png"));
            }
            else if(c.trim().toLowerCase().equals("blue"))
            {
                img = ImageIO.read(new File("blobBlueSmall.png"));
            }
            else if(c.trim().toLowerCase().equals("purple"))
            {
                img = ImageIO.read(new File("blobPurpleSmall.png"));
            }
            else if(c.trim().toLowerCase().equals("pink"))
            {
                img = ImageIO.read(new File("blobPinkSmall.png"));
            }
            else if(c.trim().toLowerCase().equals("black"))
            {
                img = ImageIO.read(new File("blobBlackSmall.png"));
            }
            else if(c.trim().toLowerCase().equals("white"))
            {
                img = ImageIO.read(new File("blobWhiteSmall.png"));
            }
            else if(c.trim().toLowerCase().equals("magenta"))
            {
                img = ImageIO.read(new File("blobMagentaSmall.png"));
            }
            else if(c.trim().toLowerCase().equals("transparent"))
            {
                img = ImageIO.read(new File("blobTransparentSmall.png"));
            }
            else
            {
                img = ImageIO.read(new File("blobTransparentSmall.png"));
            }
        } catch (IOException e) {
        }

    }

    public Dimension getPreferredSize() {
        if (img == null) {
            return new Dimension(100,100);
        } else {
            return new Dimension(img.getWidth(null), img.getHeight(null));
        }
    }

    public static void viewImage(String c, String n) {

        JFrame f = new JFrame(n + "!");

        f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

        f.add(new LoadImageApp(c));
        f.pack();
        f.setVisible(true);
    }
    
    public static void viewImage2(String c, String n) {
        
        JFrame f = new JFrame(n + "!");

        f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

        f.add(new LoadImageApp(c, 1));
        f.pack();
        f.setVisible(true);
    }
}
