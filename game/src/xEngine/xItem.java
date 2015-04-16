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

public class xItem
{
	public String name;
	public String desc;
	public xType type = new xType();
	public String location;

	public String returnDesc()
	{
		if(type.holdable)
		{
			return name;
		}
		else if(type.pushable)
		{
			return name;
		}
		else if(type.shelf)
		{
			return "on"+name;
		}
		else if(type.container)
		{
			return "in"+name;
		}
		else if(type.key)
		{
			return name;
		}
		else
		{
			return name;
		}
	}

	public void setItem(String itemName, String itemDesc, String itemType)
	{
		name = itemName;
		desc = itemDesc;
		type.setType(itemType);
	}
}
