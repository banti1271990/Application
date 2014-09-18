import java.io.*;
import java.awt.datatransfer.*;
import java.awt.*;
import java.awt.event.*;
public class npadapp extends Frame
{
   Clipboard cBoard = getToolkit().getSystemClipboard();
   TextArea tArea;
    String fName;
    npadapp()
             {
                 gaListener gListen = new gaListener();
                 addWindowListener(gListen);
                
                 tArea = new TextArea();
                 add(tArea);

                 Menubar mBar = new MenuBar();
                 Menu fileMenu = new Menu("File");
                 
                 MenuItem nOption = new MenuItem("New");
                 MenuItem oOption = new MenuItem("Open");
                 MenuItem sOption = new MenuItem("Save");
                 MenuItem  cOption = new MenuItem("Close");

                 nOption.addActionListener(new Ne_option());
                 fileMenu.add(nOption);
                 oOption.addActionListener(new Ope_option());
                 fileMenu.add(oOption);         
                 sOption.addActionListener(new Sav_option());
                 fileMenu.add(sOption);
                 cOption.addActionListener(new Clos_option());
                 fileMenu.add(cOption);

                 mBar.add(fileMenu);

                 Menu editMenu = new Menu();
                 MenuItem cutOption = new MenuItem("Cut");
                 MenuItem copyOption = new MenuItem("Copy");
                 MenuItem pasteOption = new MenuItem("Paste");

                 cutOption.addActionListener(new Cu_option());
                 editMenu.add(cutOption);
                 copyOption.addActionListener(new Cop_option());
                 editMenu.add(copyOption);
                 pasteOption.addActionListener(new Past_Option());
                 editMenu.add(pasteOption);\

                 mBar.add(editMenu);
                 setMenuBar(mBar);
               setTitle("Notepad Made By Banti Kumar In Java ");
           }
             class gaListener extends WindowAdapter
             {
                 public void windowClosing(WindowEvent closeNotepad)
                  {
                        System.exit(0);
                   }
             }
             
             class Ne_option implements ActionListener
              {
                  public void actionPerformed(ActionEvent ne)
                   {
                       tArea.setText(" ");
                    }
                }
              class Ope_option implements ActionListener
               {
                   public void actionPerformed(ActionEvent ope)
                     {
                         Filedialog fDialog = new FileDialog(Notepad.this"Select a text file ",FileDialog.LOAD);
                         fDialog.show();
                         if(fDialog.getFile()!=null)
                          {
                               fName = fDialog.getDirectory()+fDialog.getFile();
                               setTitle(fName);
                               ReadFile();                 
                           }
                               tArea.requestFocus();
                     } 
                }
               class Clos_option implements ActionListener
                 {
                     public void actionPerformed(ActionEvent clos_e)
                     {
                        System.exit(0); 
                     }
                 }
               class Sav_option implements ActionListener
                 {
                     public void actionPerformed(ActionEvent sav_e)
                      {
                          Filedialog fDialog = new FileDialog(Notepad.this"save the text file with . extension",FileDialog.SAVE);
                          fDialog.show();
                          if(fDialog.getFile()!=null)
                           {
                               fName = fDialog.getDirectory()+fDialog.getFile();
                               setTitle(fName);
                               
                               try
                               {
                                       DataOutputStream dOutStream = new DataOutputstream(new FileOutputStream(fName));
                                       String oLine = tArea.getText();
                                       BufferedReader  bReader =  new BufferedReader(new StringReader(oLine));
                                       while((oLine=bReader.readLine())!=null)
                                       {
                                             dOutStream.writeBytes(oLine+"\r\n");
                                             dOutStream.close();
                                        }
                               }
                               catch(Exception ex)
                                {
                                   System.out.println("required file not found");
                                 }
                                   tArea.requestFocus()
                            }
                      }
                 } 
              void ReadFile()
               {
                    BufferedReader br;
                    Stringbuffer sBuffer = new StringBuffer();
                    try
                     {
                            br = new BufferedReader(new FileReader(fName));
                            String oLine;
                             while((oLine=br.readLine())!=null)
                              {
                                sBuffer.append(oLine+"\n");
                                tArea.setText(sBuffer.ToString());
                                 br.close();
                              } 
                      }
                       catch(IOException ioe)
                          {
                                 system.out.println(" Not Read afile");
                           }
                }                 
                    
             class Cu_option implements ActionListener
             {
                 public void actionPerformed(actionEvent cue)
                 {
                    String sText = tArea.getSelectedText();
                    StringSelection sSelection = new Stringselection(sText);
                    cBoard.setContents(sSelection,sSelection);
                     tArea.replaceRang(",tArea.getSelectionStart(),tArea.getSelectionend()); 
                 }
             }
         class Cop_option implements ActionListener
          {
              public void actionPerformed(ActionEvent cope)
               {
                 String  stext = tArea.getSelectedText();
                 StringSelection select = new StringSelection(stext);
                 cBoard.setContents(select,select);
               }
          }
       class Pas_option implements ActionListener
        {
           public void actionPerformed(ActionEventn pase)
            {
               Transferable ctransfer = cBoard.getContents(Notepad.this);
                try
                  {
                      String text = (String)ctransfer.getTransferData(DataFlavor.stringFlavor);
                      tArea.replaceRange(text,tArea.getselectionStart(),tArea.getSelectionEnd());

                  }
                   catch(Exception exc)
                    {
                         System.out.println("Not a String Flavor");
                    }
             }
        }
     public static void main(Sting args[])
      {
           npadapp n = new npadapp();
           n.setSize(600,600);
           n.setVisible(true);    
      }
 }