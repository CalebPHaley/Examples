import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CandidateQualitiesListener implements ItemListener
{
	// Initialization
  JFrame frame;
  JCheckBox qualityBox[] = new JCheckBox[6];
  JTextField textField;
  JLabel label;
  JPanel panel;
  CandidateQualitiesListener()
  {
	// Create Frame
    frame = new JFrame("Candidate Qualities");
    frame.setLayout(new GridLayout(3,3));
    panel = new JPanel();
    // Add box elements
    qualityBox[0] = new JCheckBox("Attention to Detail"); 
    qualityBox[1] = new JCheckBox("Strong Curiousity");
    qualityBox[2] = new JCheckBox("Adaptability");
    qualityBox[3] = new JCheckBox("Love of Learning"); 
    qualityBox[4] = new JCheckBox("Positive Attitude");
    qualityBox[5] = new JCheckBox("Business Sense");
    // Add listeners to boxes
    for(int i = 0; i<6; i++)
    {
       panel.add(qualityBox[i]);
       qualityBox[i].addItemListener(this);
    }
    // Create the text field
    textField = new JTextField(50);
    label = new JLabel("Select the important Candidate " +
         "Qualities that you look for : ", JLabel.CENTER);
    frame.add(label);  
    frame.add(panel);   
    frame.add(textField);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  	// Output User Selection
  public void itemStateChanged(ItemEvent ie)
  {
    String message="You have used: "; 
    for(int i=0; i<6; i++)
    {
     if(qualityBox[i].isSelected())
       message += qualityBox[i].getText() + ",  ";    
     
    }
    textField.setText(message);

   
  }
  	// Main
  public static void main(String[] args)
  {
    new CandidateQualitiesListener();
  }
}