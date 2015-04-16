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

public class xCommand
{
	xAction a = new xAction();
	JTextArea text;

	public String examine()
	{
		String input = (String) JOptionPane.showInputDialog(
		        new JFrame(),
		        "Examine:",
		        "Examine", JOptionPane.INFORMATION_MESSAGE
		        );
		return input;
	}

	public String take()
	{
		String input = (String) JOptionPane.showInputDialog(
		        new JFrame(),
		        "Take:",
		        "Take", JOptionPane.INFORMATION_MESSAGE
		        );
		return input;
	}

	public String use()
	{
		String input = (String) JOptionPane.showInputDialog(
		        new JFrame(),
		        "Use:",
		        "Use", JOptionPane.INFORMATION_MESSAGE
		        );
		return input;
	}

	public String speak()
	{
		String input = (String) JOptionPane.showInputDialog(
		        new JFrame(),
		        "Speak to ___:",
		        "Speak", JOptionPane.INFORMATION_MESSAGE
		        );
		return input;
	}

	public String about()
	{
		String input = (String) JOptionPane.showInputDialog(
		        new JFrame(),
		        "About ___:",
		        "Speak", JOptionPane.INFORMATION_MESSAGE
		        );
		return input;
	}

	public String drop()
	{
		String input = (String) JOptionPane.showInputDialog(
		        new JFrame(),
		        "Drop:",
		        "Drop", JOptionPane.INFORMATION_MESSAGE
		        );
		return input;
	}

	public String eat()
	{
		String input = (String) JOptionPane.showInputDialog(
		        new JFrame(),
		        "Eat:",
		        "Eat", JOptionPane.INFORMATION_MESSAGE
		        );
		return input;
	}

	public String cast()
	{
		String input = (String) JOptionPane.showInputDialog(
		        new JFrame(),
		        "Cast:",
		        "Cast", JOptionPane.INFORMATION_MESSAGE
		        );
		return input;
	}

	public void setup(JTextArea text1)
	{
		text = text1;
	}
	public void popup(String input,xGlobe globe,xPlayer pl)
	{
		if(input.equals("Examine ___"))
		{
			a.examine(examine(),text,globe,pl);
		}
		else if(input.equals("Take item"))
		{
			a.take(take(),text,globe,pl);
		}
		else if(input.equals("Use item"))
		{
			a.use(use(),text,globe,pl);
		}
		else if(input.equals("Speak to ___ about ___"))
		{
			a.speak(speak(),about(),text,globe,pl);
		}
		else if(input.equals("Drop item"))
		{
			a.drop(drop(),text,globe,pl);
		}
		else if(input.equals("Eat ___"))
		{
			a.eat(eat(),text,globe,pl);
		}
		else if(input.equals("Cast spell"))
		{
			a.cast(cast(),text,globe,pl);
		}
		else
		{
			a.inventory(text,pl);
		}
	}
}