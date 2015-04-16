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
public class xAction
{
	MainClass m = new MainClass();
	public void examine(String input, JTextArea text,xGlobe globe,xPlayer pl)
	{
		if(globe.searchInv(input))
		{
			text.append(globe.returnItem(globe.itemSpace(input)).desc + "\n");
		}
		else if(pl.searchInv(input))
		{
			text.append(pl.returnItem(pl.itemSpace(input)).desc + "\n");
		}
		else
		{
			text.append("I can't see that!\n");
		}
	}
	public void take(String input, JTextArea text,xGlobe globe,xPlayer pl)
	{
		if(globe.searchInv(input))
		{
			text.append("You take the " + globe.returnItem(globe.itemSpace(input)).name + "\n");
			pl.addToInv(globe.returnItem(globe.itemSpace(input)));
			globe.nullify(globe.itemSpace(input));
			globe.returnItem(globe.itemSpace(input)).location = "inv";
		}
		else if(pl.searchInv(input))
		{
			text.append("You already have that!\n");
		}
		else
		{
			text.append("I can't see that!");
		}
	}
	public void use(String input, JTextArea text,xGlobe globe,xPlayer pl)
	{
		if(pl.searchInv(input))
		{
			text.append(globe.returnAction(globe.actionSpace(input)).name);
			globe.returnAction(globe.actionSpace(input)).run(input);
			text.append(globe.returnAction(globe.actionSpace(input)).trigger?"true":"false");
		}
		else
		{
			text.append("You don't have that!");
		}
		text.append(input + "\n");
	}
	public void speak(String input, String input2, JTextArea text,xGlobe globe,xPlayer pl)
	{
		text.append(input + "\n");
		text.append(input2 + "\n");
	}
	public void drop(String input, JTextArea text,xGlobe globe,xPlayer pl)
	{
		if(pl.searchInv(input))
		{
			text.append("You drop the " + pl.returnItem(pl.itemSpace(input)).name +"\n");
			pl.nullify(pl.itemSpace(input));
			globe.returnItem(globe.itemSpace(input)).location = globe.currentMap.map[globe.currentMap.xC][globe.currentMap.yC][globe.currentMap.zC].roomname;	
		}
		else
		{
			text.append("You can't drop that. You don't have that!");
		}
	}
	public void eat(String input, JTextArea text,xGlobe globe,xPlayer pl)
	{
		text.append(input + "\n");
	}
	public void cast(String input, JTextArea text,xGlobe globe,xPlayer pl)
	{
		text.append(input + "\n");
	}
	public void inventory(JTextArea text,xPlayer pl)
	{
		String inv = "Your inventory contains:\n\n";
		text.append(inv);
		for(int n = 1; n < pl.invSize; n++)
		{
			String s = pl.inventory[n].name;
			text.append(s);
			if(pl.inventory[n].name.equals(""))
			{
				text.append("");
			}
			else
			{
				text.append("\n");
			}
		}
	}
}
