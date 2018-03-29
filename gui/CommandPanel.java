import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
;
import javax.swing.BoxLayout;

import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;

/*************************************************
* @author Gloire Rubambiza
* @since 03/10/2017
**************************************************/
public class CommandPanel extends JPanel {

  /** Objects of the class are now serializable. */
  private static final long serialVersionUID = 1L;

  /** The font for user commands the GUI. */
  private static final Font NORMAL_FONT =
  new Font("Cooper Black", Font.BOLD, 20);


  /** The panel for the commands. */
  private JPanel command;

  /** The panel for user input. */
  private InputPanel input;

  /** The array of action buttons. */
  private JButton nextEncryption, exit;


  /** The dimensions for the grid. */
  private final int col = 2, row = 1;

  /** The dimensions for the buttons. */
  private final int width = 200, height = 75;

  /*******************************************************
  * Instantiates the buttons to be used for user actions.
  *******************************************************/
  public CommandPanel () {

    super();

    command = new JPanel();
    input = new InputPanel();

    nextEncryption = new JButton("Next Encryption");
    nextEncryption.setPreferredSize(new Dimension(width,height));

    exit = new JButton("Exit");
    exit.setPreferredSize(new Dimension(width,height));

    setStandards();
    setLayout(new BorderLayout());
    add(nextEncryption, BorderLayout.WEST);
    add(exit, BorderLayout.EAST);
    add(input, BorderLayout.CENTER);

    // Define the layout.
    setPreferredSize(new Dimension(800,100));
    setVisible(true);
  }

  /**************************************
  * Sets some aesthetics for the panel.
  ***************************************/
  private void setStandards () {

    Border line = BorderFactory.createLineBorder(Color.WHITE, 2, true);
    nextEncryption.setFont(NORMAL_FONT);
    nextEncryption.setBorder(line);
    nextEncryption.setBackground(Color.GRAY);
    exit.setFont(NORMAL_FONT);
    exit.setBorder(line);
    exit.setForeground(Color.RED);
    input.setFont(NORMAL_FONT);
    input.setForeground(Color.GRAY);
  }

}
