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

public class xGlobe
{
	public xMap currentMap;
	public int x;
	public int y;
	public int z;
	public xNewAction[] actions;
	public int actionsSize;
	public xMap[][][] globe;
	public int invSize;
	public xItem[] inventory;
	xNewAction nullAction = new xNewAction();
	xItem nullItem = new xItem();

	public void newGlobe(int x1, int y1, int z1)
	{
		x = x1;
		y = y1;
		z = z1;
	}               
	public void setInv()                                
	{                                                   
		inventory = new xItem[invSize];                 
		for(int i = 0;i<invSize;i++)                    
		{                                               
			inventory[i] = nullItem;   
			nullItem.name = "";
			nullItem.desc = "";
		}                                               
	}                                                   
	public boolean searchInv(String key)                
	{                                                   
		for(int n = 1; n < invSize; n++)               
		{                                               
			if(inventory[n].name.equals(key))           
			{                                           
				return true;                            
			}                                           
		}                                               
		return false;                                   
	}                                                   
	public String printInv()                            
	{                                                   
		String inv = "Your inventory contains:\n...\n";
		for(int n = 1; n < invSize; n++)
		{
			String s = inventory[n].name;
			inv.concat(s);
			if(inventory[n].name.equals("null"))
			{
				inv.concat("");
			}
			else
			{
				inv.concat("\n");
			}
		}
		return inv;                                         
	}                                                   
	public int findOpenUnit()                           
	{                                                   
		for(int i = 1;i<invSize;i++)                    
		{                                               
			if(inventory[i].equals(nullItem))           
			{                                           
				return i;                               
			}                                           
		}                                               
		return 0;                                       
	}                                                   
	public void addToInv(xItem item)                    
	{                                                   
		if(findOpenUnit() != 0)                         
		{                                               
			inventory[findOpenUnit()] = item;           
		}                                               
	}                                                   
	public xItem returnItem(int i)
	{
		return inventory[i];
	}
	public int itemSpace(String key)
	{
		for(int n = 1; n < invSize; n++)               
		{                                               
			if(inventory[n].name.equals(key))           
			{                                           
				return n;                            
			}                                           
		}                                               
		return 0; 
	}
	public void nullify(int i)
	{
		inventory[i] = nullItem;
	}
	
	public void setActions()                                
	{                                                   
		actions = new xNewAction[actionsSize];                 
		for(int i = 0;i<actionsSize;i++)                    
		{                                               
			actions[i] = nullAction;   
			nullAction.setup("NullAction","nullKey1","nullKey2","nullKey3","This is the message",false);
		}                                               
	}                                                   
	public boolean searchActions(String key)                
	{                                                   
		for(int n = 1; n < actionsSize; n++)               
		{                                               
			if(actions[n].key.equals(key) || actions[n].key2.equals(key) || actions[n].key3.equals(key))           
			{                                           
				return true;                            
			}                                           
		}                                               
		return false;                                   
	}                                                                                                      
	public int findOpenActionUnit()                           
	{                                                   
		for(int i = 1;i<actionsSize;i++)                    
		{                                               
			if(actions[i].equals(nullAction))           
			{                                           
				return i;                               
			}                                           
		}                                               
		return 0;                                       
	}                                                   
	public void addToActions(xNewAction action)                    
	{                                                   
		if(findOpenActionUnit() != 0)                         
		{                                               
			actions[findOpenActionUnit()] = action;           
		}                                               
	}                                                   
	public xNewAction returnAction(int i)
	{
		return actions[i];
	}
	public int actionSpace(String key)
	{
		for(int n = 1; n < actionsSize; n++)               
		{                                               
			if(actions[n].key.equals(key) || actions[n].key2.equals(key) || actions[n].key3.equals(key))           
			{                                           
				return n;                            
			}                                           
		}                                               
		return 0; 
	}
}