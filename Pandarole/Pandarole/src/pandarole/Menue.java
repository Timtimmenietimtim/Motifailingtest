package pandarole;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menue implements ActionListener {
    
    JFrame applikation;
    Container container;
    
    // Men�leiste
    JMenuBar menueLeiste;
    
    // Men�leiste Elemente
    JMenu datei;
    JMenu hilfe;
    
    // Datei
    JMenuItem oeffnen;
    JMenuItem beenden;
    
    // Hilfe
    JMenuItem faq;
    JMenuItem about;

    // Textfeld
    JTextArea textarea;
    
    public Menue() {
         applikation = new JFrame("JMenuBar Beispiel");
         container = applikation.getContentPane();
         
         // Men�leiste erzeugen
         menueLeiste = new JMenuBar();
         
         // Men�elemente erzeugen
         datei = new JMenu("Datei");
         hilfe = new JMenu("Hilfe");
         
         // Untermen�elemente erzeugen
         oeffnen = new JMenuItem("�ffnen");
         oeffnen.addActionListener(this);
         beenden = new JMenuItem("beenden");
         beenden.addActionListener(this);
         faq = new JMenuItem("F.A.Q.");
         faq.addActionListener(this);
         about = new JMenuItem("�ber");
         about.addActionListener(this);
         
         // Men�elemente hinzuf�gen
         menueLeiste.add(datei);
         menueLeiste.add(hilfe);
         
         // Untermen�elemente hinzuf�gen
         datei.add(oeffnen);
         datei.add(beenden);
         hilfe.add(faq);
         hilfe.add(about);

         // Textfeld erzeugen
         textarea = new JTextArea();          
         
         applikation.add(menueLeiste, BorderLayout.NORTH);
         applikation.add(new JScrollPane(textarea), BorderLayout.CENTER);

         applikation.setExtendedState(applikation.MAXIMIZED_BOTH);
         applikation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         applikation.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent object) {
         if (object.getSource() == oeffnen){
              System.out.println("�ffnen wurde angeklickt");
         }
         if (object.getSource() == beenden){
              System.out.println("beenden wurde angeklickt");
         }
         if (object.getSource() == faq){
              System.out.println("faq wurde angeklickt");
         }
         if (object.getSource() == about){
              System.out.println("�ber wurde angeklickt");
         }
    }
}