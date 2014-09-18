import javax.swing.tree.*;
import javax.swing.*;
import java.awt.*;
public class prog2 extends JFrame
{
 JTree jt;
 JScrollPane jsp;
 public prog2()
 {
  DefaultMutableTreeNode top = new DefaultMutableTreeNode("DAVIM");
  DefaultMutableTreeNode it = new DefaultMutableTreeNode("Information Technology");
  DefaultMutableTreeNode bca = new DefaultMutableTreeNode("BCA");
  DefaultMutableTreeNode mca = new DefaultMutableTreeNode("MCA");
  DefaultMutableTreeNode mgt = new DefaultMutableTreeNode("Management");
  DefaultMutableTreeNode bba = new DefaultMutableTreeNode("BBA");
  DefaultMutableTreeNode mba = new DefaultMutableTreeNode("MBA");
  top.add(it);
  it.add(bca);
  it.add(mca);
  top.add(mgt);
  mgt.add(bba);
  mgt.add(mba);
  jt = new JTree(top);
  int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
  int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
  jsp=new JScrollPane(jt,v,h);
  Container c=getContentPane();
  c.add(jsp);
 }
 public static void main(String args[])
 {
  prog2 p = new prog2();
  p.setSize(900,900);
  p.setVisible(true);
  p.setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
}
