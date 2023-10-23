package niecoomne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

//PDF export
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.util.IOUtils;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.util.Units;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xwpf.usermodel.ParagraphAlignment;


import com.itextpdf.text.Image;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;



import java.io.*;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        JFrame frame = new JFrame("Aplikácia niečo o mne a mojej tvorbe"); // vytvorime okno
        frame.setMinimumSize(new Dimension(1600, 900));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ked kliknem na X na okne (cize vo frame) tak sa zatvori standardne
        frame.setLocationRelativeTo(null); // vycentrovanie okna
        frame.setResizable(false); // Zakazame zmenu velkosti okna


        // JFrame by mal obsahovat panel, teda container JPanel
        JPanel panel = new JPanel();
        panel.setLayout(null); // layout pre panel bude null, cize prazdny


        frame.setContentPane(panel); // my dany panel pridame do frame


        File f = new File("foto_ja.png");
        JLabel imgLabel = new JLabel(new ImageIcon(f.getName()));
        imgLabel.setBounds(50, 53, 116, 116); // x, y, sirka, vyska
        panel.add(imgLabel);


        // JText
        JLabel hyperlink_www = new JLabel("<html><font color='red'><b>pavere.sk</b></font></html>");
        hyperlink_www.setForeground(Color.RED.darker());
        hyperlink_www.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        hyperlink_www.setBounds(105, 170, 120, 20); // x, y, sirka, vyska
        panel.add(hyperlink_www);


        hyperlink_www.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.pavere.sk/tvorba"));
                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // the mouse has entered the label
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // the mouse has exited the label
            }
        });

        // JText
        JLabel hyperlink = new JLabel("<html><font color='white'><b>Anton</b></font></html>");
        hyperlink.setForeground(Color.BLUE.darker());
        hyperlink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        hyperlink.setBounds(50, 170, 120, 20); // x, y, sirka, vyska
        panel.add(hyperlink);



        hyperlink.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.instagram.com/antonkostrab/"));
                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // the mouse has entered the label
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // the mouse has exited the label
            }
        });




        JTextArea textArea = new JTextArea("Ahoj. Volám sa Anton som  z Prešova pracujem ako webdesigner a na tento kurz som sa prihlasil aby som rozšíril vedomosti a zručnosti Už počas štúdia na strednej škole som inklinoval  ku grafike a videu. Popri štúdiu na VŠ som pôsobil ako exterý lektor v súkromnej vzdelávacej inštitúcii.\n" +
                " \nOd roku 2011 som začal pracovať v reklamnej oblasti, kde som naplno využil prax, zručnosti v oblasti spracovania printovej grafiky, videa, prezentácii ako aj implementácie a podporu rôznych programov pre operačne systémy Windows, macOS  a Linux, ktoré sa používaju v oblasti DTP ."); // popisok

        textArea.setBounds(190,50,500,450); // x, y, sirka, vyska
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setForeground(Color.WHITE);
        textArea.setBackground(Color.BLACK);
        textArea.setEditable(false);
        textArea.setOpaque(false);
        panel.add(textArea);
        panel.setVisible(true);

        File f2 = new File("almishop.jpg");
        JLabel imgLabel2 = new JLabel(new ImageIcon(f2.getName()));
        imgLabel2.setBounds(50, 253, 495, 462); // x, y, sirka, vyska
        panel.add(imgLabel2);

// JText
        JLabel hyperlink3 = new JLabel("<html><font color='white'><b>almishop.sk</b></font></html>");
        hyperlink3.setForeground(Color.BLUE.darker());
        hyperlink3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        hyperlink3.setBounds(50, 720, 120, 20); // x, y, sirka, vyska
        panel.add(hyperlink3);



        hyperlink3.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://almishop.sk"));
                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // the mouse has entered the label
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // the mouse has exited the label
            }
        });



        File f10= new File("organize.jpg");
        JLabel imgLabel10 = new JLabel(new ImageIcon(f10.getName()));
        imgLabel10.setBounds(800, 40, 495, 231); // x, y, sirka, vyska
        panel.add(imgLabel10);

// JText
        JLabel hyperlink11 = new JLabel("<html><font color='white'><b>organize.sk</b></font></html>");
        hyperlink11.setForeground(Color.BLUE.darker());
        hyperlink11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        hyperlink11.setBounds(800, 280, 120, 20); // x, y, sirka, vyska
        panel.add(hyperlink11);



        hyperlink11.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://organize.sk"));
                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // the mouse has entered the label
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // the mouse has exited the label
            }
        });




        JButton btnCancel = new JButton("OK");
        btnCancel.setBounds(780, 833, 80, 20);


        File f3 = new File("pozadie.jpg");
        JLabel imgLabel3 = new JLabel(new ImageIcon(f3.getName()));
        imgLabel3.setBounds(0, -100, 1600, 900); // x, y, sirka, vyska
        panel.add(imgLabel3);

     /*   JButton btnOk = new JButton("Vypiš!"); // tlacidlo
        btnOk.setBounds(100, 100, 80, 20); // x, y, sirka, vyska


        btnOk.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField.getText());
                labelText.setText( textField.getText() );


            }
        });
        panel.add(btnOk);*/







        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                // Výstup HTML kódu
                System.out.println(hyperlink);

                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });
        panel.add(btnCancel);


        // display it
        frame.pack();
        frame.setVisible(true);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ahoj. Volám sa Anton som  z Prešova pracujem ako webdesigner a na tento kurz som sa prihlasil aby som rozšíril vedomosti a zručnosti Už počas štúdia na strednej škole som inklinoval  ku grafike a videu.\nPopri štúdiu na VŠ som pôsobil ako exterý lektor v súkromnej vzdelávacej inštitúcii.\n" +
                " \nOd roku 2011 som začal pracovať v reklamnej oblasti, kde som naplno využil prax, zručnosti v oblasti spracovania printovej grafiky, videa, prezentácii ako aj implementácie a podporu rôznych programov pre operačne systémy \nWindows, macOS  a Linux, ktoré sa používaju v oblasti DTP .");
                /*System.out.println(textField.getText());
                labelText.setText(textField.getText());*/

//
        String url = "https://pavere.sk/tvorba";

        // Generování HTML kódu s hypertextovým odkazem
        String hyperlink0 =  url   ;

        System.out.println(hyperlink0);

        System.out.println("\nVyberte typ dokumentu, niečo o mne ktorý chcete vytvoriť \nVýber  volieb: (PDF - voľba 1 , DOCX - voľba 2 ):");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("1")) {
            createPDF();
        } else if (choice.equals("2")) {
            createDOCX();
        } else {
            System.out.println("Neplatná voľba. Vyberte si z PDF(1), DOCX(2).");
        }

        scanner.close();

    }

    public static void createPDF() {
        Document document = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Niečo_o_mne.pdf"));
            document.open();

            // Písmo s podporou diakritiky
            BaseFont baseFont = BaseFont.createFont("arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font font = new Font(baseFont, 14);


            // Add an image to the document
            Image image = Image.getInstance("foto_ja.png");
            // You can specify the position and size of the image using setAbsolutePosition and scaleToFit
            image.setAbsolutePosition(50, 680); // X, Y coordinates
            image.scaleToFit(116, 116); // Width and Height

            // Prida text s diakritikou do PDF
            Paragraph paragraph = new Paragraph("Ahoj. Volám sa Anton som  z Prešova pracujem ako webdesigner a na tento kurz som sa prihlasil aby som rozšíril vedomosti a zručnosti Už počas štúdia na strednej škole som inklinoval  ku grafike a videu.\nPopri štúdiu na VŠ som pôsobil ako exterý lektor v súkromnej vzdelávacej inštitúcii.\n \nOd roku 2011 som začal pracovať v reklamnej oblasti, kde som naplno využil prax, zručnosti v oblasti spracovania printovej grafiky, videa, prezentácii ako aj implementácie a podporu rôznych programov pre operačne systémy \nWindows, macOS  a Linux, ktoré sa používaju v oblasti DTP.", font);
            /*document.add(paragraph);*/
            // Set the top margin (spacing before the paragraph, adjust the value as needed)
            paragraph.setSpacingBefore(20); // 20 points of spacing before the paragraph

            // Set the left margin (indentation from the left, adjust the value as needed)
            paragraph.setIndentationLeft(150); // 50 points of indentation from the left
            paragraph.setAlignment(Paragraph.ALIGN_JUSTIFIED);

            document.add(paragraph);

            document.add(image);
            document.close();
            writer.close();

            System.out.println("PDF bol úspešne vytvorený.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createDOCX() {
        try {
            XWPFDocument document = new XWPFDocument();
            FileOutputStream fos = new FileOutputStream("Niečo_o_mne.docx");







            // Vytvor odsek a spustite text s diakritikou
            XWPFParagraph paragraph = document.createParagraph();
            XWPFRun run = paragraph.createRun();

            // font pre docx
            run.setFontFamily("Arial");

            // velkost

            run.setFontSize(13);
            run.setBold(true);





            run.setText("Ahoj. Volám sa Anton som  z Prešova pracujem ako webdesigner a na tento kurz som sa prihlasil aby som rozšíril vedomosti a zručnosti Už počas štúdia na strednej škole som inklinoval  ku grafike a videu.\nPopri štúdiu na VŠ som pôsobil ako exterý lektor v súkromnej vzdelávacej inštitúcii.\n \nOd roku 2011 som začal pracovať v reklamnej oblasti, kde som naplno využil prax, zručnosti v oblasti spracovania printovej grafiky, videa, prezentácii ako aj implementácie a podporu rôznych programov pre operačne systémy \nWindows, macOS  a Linux, ktoré sa používaju v oblasti DTP . ");


            paragraph.setAlignment(ParagraphAlignment.BOTH);

            document.write(fos);
            fos.close();

            System.out.println("DOCX bol úspešne vytvorený.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
