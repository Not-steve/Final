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

public class xType
{
	public boolean holdable;
	public boolean pushable;
	public boolean shelf;
	public boolean container;
	public boolean key;
	public boolean lock;
	public xItem[] holds;

	public void setType(String input)
	{
		if(input.equals("can be held"))
		{
			holdable = true;
		}
		else if(input.equals("can be pushed"))
		{
			pushable = true;
		}
		else if(input.equals("can support"))
		{
			shelf = true;
		}
		else if(input.equals("can hold"))
		{
			container = true;
		}
		else if(input.equals("can unlock"))
		{
			key = true;
		}
		else if(input.equals("locks"))
		{
			lock = true;
		}
		else
		{
			System.err.println("System Error, check xType and xItem");
		}
	}
}
