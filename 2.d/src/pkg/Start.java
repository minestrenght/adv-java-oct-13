
package pkg;

import javax.swing.*;
import javax.swing.tree.*;


public class Start {

    public static void main(String[] args) {
        JFrame f = new JFrame("Subject Tree");
        DefaultMutableTreeNode n = new DefaultMutableTreeNode("Subjects");
        JTree t = new JTree(n);
        f.getContentPane().add(new JScrollPane(t));
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        n.add(new DefaultMutableTreeNode("Maths"));
        n.add(new DefaultMutableTreeNode("English"));
        t.setShowsRootHandles(true);
    }
    
}
