/*
 * Java Text Based Game Engine v0.0.1
 * (c) 2011 Nathaniel Hoffman
 * Java Text Based Game Engine
 * The following is protected as part of the license stated in the License.txt file located in this release.
 * It is included as part of the Library.
 * 
 * Changelog:
 * Pre-Alpha
 * v0.0.1 - Initial release.
 */

package xEngine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class xGui extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1337L;
	JTextField xInput;
	JTextArea xOutput;
	JLabel labelA = new JLabel(">>");
	JButton north = new JButton("North");
	JButton south = new JButton("South");
	JButton east = new JButton("East");
	JButton west = new JButton("West");
	JButton nw = new JButton("NW");
	JButton ne = new JButton("NE");
	JButton sw = new JButton("SW");
	JButton se = new JButton("SE");
	JButton wait = new JButton("Wait");
	JButton up = new JButton("Up");
	JButton down = new JButton("Down");

	public xGui(String x,xGlobe globe,xPlayer pl)
	{
		super(x);
		int insetx = 200;
		int insety = 100;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(insetx, insety, screenSize.width - insetx,screenSize.height - insety*2);
		gui(globe,pl);
	}
	public void gui(xGlobe globe1,xPlayer pl1)
	{
		final xGlobe globe = globe1;
		final xPlayer pl = pl1;
		xInput = new JTextField(20);
		xInput.addActionListener(this);
		xOutput = new JTextArea(5, 20);
		xOutput.setCaretPosition(xOutput.getDocument()
				.getLength());
		xOutput.setEditable(false);
		JScrollPane xScroll = new JScrollPane(xOutput,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagLayout gridBag = new GridBagLayout();
		Container panel = getContentPane();
		panel.setLayout(gridBag);
		
		GridBagConstraints gridOutput = new GridBagConstraints();
		gridOutput.gridx=1;
		gridOutput.gridy=0;
		gridOutput.weightx = 1.0;
		gridOutput.weighty = 1.0;
		gridOutput.gridwidth = 6;
		gridOutput.ipady = 400;
		gridOutput.ipadx = 600;
		panel.add(xScroll,gridOutput);
		
		GridBagConstraints gridInput = new GridBagConstraints();
		gridInput.gridwidth = GridBagConstraints.REMAINDER;
		gridInput.fill = GridBagConstraints.HORIZONTAL;
		gridInput.gridx = 1;
		gridInput.gridy = 1;
		panel.add(xInput,gridInput);
		
		GridBagConstraints gridLabelA = new GridBagConstraints();
		gridLabelA.gridx = 0;
		gridLabelA.gridy = 1;
		panel.add(labelA,gridLabelA);
		
		//////////////
		
		GridBagConstraints gridButtonN = new GridBagConstraints();
		gridButtonN.gridx = 2;
		gridButtonN.gridy = 3;
		north.setMnemonic(KeyEvent.VK_W);
		north.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				xInput.setText("north");
				xInput.selectAll();
			}
		});
		panel.add(north,gridButtonN);
		
		GridBagConstraints gridButtonS = new GridBagConstraints();
		gridButtonS.gridx = 2;
		gridButtonS.gridy = 5;
		south.setMnemonic(KeyEvent.VK_X);
		south.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				xInput.setText("south");
				xInput.selectAll();
			}
		});
		panel.add(south,gridButtonS);
		
		GridBagConstraints gridButtonE = new GridBagConstraints();
		gridButtonE.gridx = 3;
		gridButtonE.gridy = 4;
		east.setMnemonic(KeyEvent.VK_D);
		east.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				xInput.setText("east");
				xInput.selectAll();
			}
		});
		panel.add(east,gridButtonE);
		
		GridBagConstraints gridButtonW = new GridBagConstraints();
		gridButtonW.gridx = 1;
		gridButtonW.gridy = 4;
		west.setMnemonic(KeyEvent.VK_A);
		west.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				xInput.setText("west");
				xInput.selectAll();
			}
		});
		panel.add(west,gridButtonW);
		////////
		GridBagConstraints gridButtonNW = new GridBagConstraints();
		gridButtonNW.gridx = 1;
		gridButtonNW.gridy = 3;
		nw.setMnemonic(KeyEvent.VK_Q);
		nw.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				xInput.setText("nw");
				xInput.selectAll();
			}
		});
		panel.add(nw,gridButtonNW);
		
		GridBagConstraints gridButtonNE = new GridBagConstraints();
		gridButtonNE.gridx = 3;
		gridButtonNE.gridy = 3;
		ne.setMnemonic(KeyEvent.VK_E);
		ne.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				xInput.setText("ne");
				xInput.selectAll();
			}
		});
		panel.add(ne,gridButtonNE);
		
		GridBagConstraints gridButtonSW = new GridBagConstraints();
		gridButtonSW.gridx = 1;
		gridButtonSW.gridy = 5;
		sw.setMnemonic(KeyEvent.VK_Z);
		sw.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				xInput.setText("sw");
				xInput.selectAll();
			}
		});
		panel.add(sw,gridButtonSW);
		
		GridBagConstraints gridButtonSE = new GridBagConstraints();
		gridButtonSE.gridx = 3;
		gridButtonSE.gridy = 5;
		se.setMnemonic(KeyEvent.VK_C);
		se.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				xInput.setText("se");
				xInput.selectAll();
			}
		});
		panel.add(se,gridButtonSE);
		
		GridBagConstraints gridButtonWait = new GridBagConstraints();
		gridButtonWait.gridx = 2;
		gridButtonWait.gridy = 4;
		wait.setMnemonic(KeyEvent.VK_S);
		wait.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				xInput.setText("wait");
				xInput.selectAll();
			}
		});
		panel.add(wait,gridButtonWait);
		
		GridBagConstraints gridButtonUp = new GridBagConstraints();
		gridButtonUp.gridx = 4;
		gridButtonUp.gridy = 3;
		up.setMnemonic(KeyEvent.VK_R);
		up.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				xInput.setText("up");
				xInput.selectAll();
			}
		});
		panel.add(up,gridButtonUp);
		
		GridBagConstraints gridButtonDown = new GridBagConstraints();
		gridButtonDown.gridx = 4;
		gridButtonDown.gridy = 4;
		down.setMnemonic(KeyEvent.VK_F);
		down.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				xInput.setText("down");
				xInput.selectAll();
			}
		});
		panel.add(down,gridButtonDown);
		
		
//////////////
		String list_commands[] = {
				"Examine ___",
				"Take item",
				"Use item",
				"Speak to ___ about ___",
				"Drop item",
				"Eat ___",
				"Cast spell",
				"Show inventory"
				};
		final JComboBox commands = new JComboBox(list_commands);
		GridBagConstraints commandBox = new GridBagConstraints();
		commandBox.gridx = 6;
		commandBox.gridy = 3;
		panel.add(commands,commandBox);
		JButton go = new JButton("Go");
		GridBagConstraints gridGo = new GridBagConstraints();
		gridGo.gridx = 6;
		gridGo.gridy = 5;
		panel.add(go,gridGo);
		final xCommand c = new xCommand();
		c.setup(xOutput);
		go.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmboitem = (String)commands.getSelectedItem();
				c.popup(cmboitem,globe,pl);
			}
		});
	}
	public void actionPerformed(ActionEvent evt) {
		MainClass myMainClass = new MainClass();
		String text = xInput.getText();
		xOutput.append(text+"\n");
		xOutput.append(myMainClass.doStuff(text));
		xOutput.append(xMap.map[xMap.xC][xMap.yC][xMap.zC].roomname + "\n");
		if(myMainClass.firstView)
		{
			xOutput.append(xMap.map[xMap.xC][xMap.yC][xMap.zC].description);
			myMainClass.firstView = false;
		}
		xOutput.append("\nYou see " + myMainClass.doStuffItem() + ".");
		xOutput.append("\n\n>> ");
		xInput.selectAll();
	}
}
