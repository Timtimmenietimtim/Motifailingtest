package pandarole;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menue implements ActionListener {
    
    JFrame applikation;
    Container container;
    
    // Menüleiste
    JMenuBar menueLeiste;
    
    // Menüleiste Elemente
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
         
         // Menüleiste erzeugen
         menueLeiste = new JMenuBar();
         
         // Menüelemente erzeugen
         datei = new JMenu("Datei");
         hilfe = new JMenu("Hilfe");
         
         // Untermenüelemente erzeugen
         oeffnen = new JMenuItem("öffnen");
         oeffnen.addActionListener(this);
         beenden = new JMenuItem("beenden");
         beenden.addActionListener(this);
         faq = new JMenuItem("F.A.Q.");
         faq.addActionListener(this);
         about = new JMenuItem("Über");
         about.addActionListener(this);
         
         // Menüelemente hinzufügen
         menueLeiste.add(datei);
         menueLeiste.add(hilfe);
         
         // Untermenüelemente hinzufügen
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
              System.out.println("öffnen wurde angeklickt");
         }
         if (object.getSource() == beenden){
              System.out.println("beenden wurde angeklickt");
         }
         if (object.getSource() == faq){
              System.out.println("faq wurde angeklickt");
         }
         if (object.getSource() == about){
              System.out.println("über wurde angeklickt");
         }
    }
}