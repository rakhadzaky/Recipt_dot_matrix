/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipt_dot_matrix;
import simple.escp.Template;
import simple.escp.json.JsonTemplate;
import simple.escp.swing.PrintPreviewPane;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Immelman
 */
public class Recipt_Dot_Matrix extends JFrame {
    static MainView mainView;
    static Menu menuView;

    /**
     * @param args the command line arguments
     */
    public Recipt_Dot_Matrix(){
        super("Latihan");
        
        Template template  = null;
        try {
            template = new JsonTemplate(Recipt_Dot_Matrix.class.getResourceAsStream("template.json"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        PrintPreviewPane preview = new PrintPreviewPane(template, null, this.mainView.getRecipt());
        setLayout(new BorderLayout());
        add(preview, BorderLayout.CENTER);
 
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        System.out.println("run");
        menuView = new Menu();
        menuView.setVisible(true);
    }
    
}
