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

public class xPlayer
{
	public int invSize;
	public xItem[] inventory;
	xItem nullItem = new xItem();

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
}
