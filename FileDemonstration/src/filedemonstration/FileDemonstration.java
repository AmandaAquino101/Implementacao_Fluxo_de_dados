
package filedemonstration;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFrame;
public class FileDemonstration {
private JTextField[] texto=new JTextField[5];
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        
        //System.out.print("Enter file or directory name: ");
        
        //analyzePath(input.nextLine())
        
        String input = JOptionPane.showInputDialog("Enter file or directory name: ");
        
        analyzePath(input);
    }
    public static void analyzePath(String path){
        File name = new File(path);
        
        
        if(name.exists()){
            String b = name.getName();
            String c = " exists" ;
            String d = b+c;
            JOptionPane.showMessageDialog(null, d, "Existe dentro da máquina?", JOptionPane.INFORMATION_MESSAGE);
            
            if(name.isFile()){
                 b = " is a file";
                 JOptionPane.showMessageDialog(null, b, "É um arquivo?", JOptionPane.INFORMATION_MESSAGE);
            }else{
                b = " is not a file";
                JOptionPane.showMessageDialog(null, b, "É um arquivo?", JOptionPane.INFORMATION_MESSAGE);
            }
            
            if(name.isDirectory()){
                b = " is a directory";
                JOptionPane.showMessageDialog(null, b, "É um diretório?", JOptionPane.INFORMATION_MESSAGE);
            }else{
                b = " is not a directory";
                JOptionPane.showMessageDialog(null, b, "É um diretório?", JOptionPane.INFORMATION_MESSAGE);
            }
            
            if(name.isAbsolute()){
                b = "is absolute path";
                JOptionPane.showMessageDialog(null, b, "É um caminho absoluto?", JOptionPane.INFORMATION_MESSAGE);
            }else{
                b = "is not absolute path";
                JOptionPane.showMessageDialog(null, b, "É um caminho absoluto?", JOptionPane.INFORMATION_MESSAGE);
            }
            
            JOptionPane.showMessageDialog(null, "Last modified: "+name.lastModified(), "Última modificação", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Lenght: "+name.length(), "G", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Path: "+name.getPath(), "Caminho", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Absolute path: "+name.getAbsolutePath(), "Caminho absoluto", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Parent: "+name.getAbsolutePath(), "Origem", JOptionPane.INFORMATION_MESSAGE);
            c = " ";
            if(name.isDirectory()){
                String[] directory = name.list();
                JOptionPane.showMessageDialog(null,"\n\nDirectory contents:\n");
                
                for(String directoryName : directory)
                    JOptionPane.showMessageDialog(null,directoryName+ " ", "conteúdo do diretório ", JOptionPane.INFORMATION_MESSAGE);
            }
            
            
                    
        }else{
           
            JOptionPane.showMessageDialog(null, name.getName()+" Não existe ", "I", JOptionPane.INFORMATION_MESSAGE);
            //System.out.printf("%s %s", path, " does not exist.");
        }
    }
    
}
