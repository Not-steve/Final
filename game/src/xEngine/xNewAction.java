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

public class xNewAction
{
	public String name;
	public String message;
	public String key;
	public String key2;
	public String key3;
	public boolean trigger;
	/*public void setup(String actionName, String Key, String output, boolean lock)
	{
		name = actionName;
		key = Key;
		message = output;
		key2 = "";
		key3 = "";
		trigger = lock;
	}
	public void setup(String actionName, String Key, String Key2, String output, boolean lock)
	{
		name = actionName;
		key = Key;
		key2 = Key2;
		message = output;
		key3 = "";
		trigger = lock;
	}*/
	public void setup(String actionName, String Key, String Key2, String Key3, String output, boolean lock)
	{
		name = actionName;
		key = Key;
		key2 = Key2;
		key3 = Key3;
		message = output;
		trigger = lock;
	}
	public String run(String input)
	{
		System.err.println(key);
		System.err.println(key2);
		System.err.println(key3);
		System.err.println(input);
		if(input.equals(key) || input.equals(key2) || input.equals(key3))
		{
			trigger = true;
			System.err.println("triggerSet");
			return message;
		}
		else
		{
			trigger = false;
			System.err.println("triggerNOTSet");
			return "You can't do that!";
		}
	}
}
