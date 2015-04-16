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

public class xRoom
{
	public String roomname;
	public String description;
	public String fullDesc;
	public boolean goNorth;
	public boolean goSouth;
	public boolean goEast;
	public boolean goWest;
	public boolean goNW;
	public boolean goNE;
	public boolean goSW;
	public boolean goSE;
	public boolean goUp;
	public boolean goDown;
	public boolean NLock;
	public boolean SLock;
	public boolean ELock;
	public boolean WLock;
	public boolean NWLock;
	public boolean NELock;
	public boolean SWLock;
	public boolean SELock;
	public boolean UPLock;
	public boolean DOWNLock;
	public void room()
	{
		String var1 = roomname.concat("\n");
		String var2 = var1.concat(description);
		fullDesc = var2.concat("\n");
		NLock = true;
		SLock = true;
		ELock = true;
		WLock = true;
		NWLock = true;
		NELock = true;
		SWLock = true;
		SELock = true;
		UPLock = true;
		DOWNLock = true;
		
	}
	public void setLeave(String chart1, String chart2, String chart3)
	{
		String chartcase1 = "---";
		String chartcase2 = "*--";
		String chartcase3 = "**-";
		String chartcase4 = "*-*";
		String chartcase5 = "***";
		String chartcase6 = "-*-";
		String chartcase7 = "-**";
		String chartcase8 = "--*";
		
		String chartcase9 = "-X-";
		String chartcase10 = "*X-";
		String chartcase11 = "*X*";
		String chartcase12 = "-X*";
		String chartcase13 = "-U-";
		String chartcase14 = "*U-";
		String chartcase15 = "*U*";
		String chartcase16 = "-U*";
		String chartcase17 = "-D-";
		String chartcase18 = "*D-";
		String chartcase19 = "*D*";
		String chartcase20 = "-D*";
		String chartcase21 = "-O-";
		String chartcase22 = "*O-";
		String chartcase23 = "*O*";
		String chartcase24 = "-O*";
		
		
		if(chart1.equals(chartcase1))
		{
			goNorth = false;
			goNW = false;
			goNE = false;
		}
		else if(chart1.equals(chartcase2))
		{
			goNorth = false;
			goNW = true;
			goNE = false;
		}
		else if(chart1.equals(chartcase3))
		{
			goNorth = true;
			goNW = true;
			goNE = false;
		}
		else if(chart1.equals(chartcase4))
		{
			goNorth = false;
			goNW = true;
			goNE = true;
		}
		else if(chart1.equals(chartcase5))
		{
			goNorth = true;
			goNW = true;
			goNE = true;
		}
		else if(chart1.equals(chartcase6))
		{
			goNorth = true;
			goNW = false;
			goNE = false;
		}
		else if(chart1.equals(chartcase7))
		{
			goNorth = true;
			goNW = false;
			goNE = true;
		}
		else if(chart1.equals(chartcase8))
		{
			goNorth = false;
			goNW = false;
			goNE = true;
		}
		else 
		{System.err.println("Error defining directions (C1)");}
		
		
		//////
		
		
		if(chart2.equals(chartcase9))
		{
			goEast = false;
			goWest = false;
			goUp = false;
			goDown = false;
		}
		else if(chart2.equals(chartcase10))
		{
			goEast = false;
			goWest = true;
			goUp = false;
			goDown = false;
		}
		else if(chart2.equals(chartcase11))
		{
			goEast = true;
			goWest = true;
			goUp = false;
			goDown = false;
		}
		else if(chart2.equals(chartcase12))
		{
			goEast = true;
			goWest = false;
			goUp = false;
			goDown = false;
		}
		//////UP
		else if(chart2.equals(chartcase13))
		{
			goEast = false;
			goWest = false;
			goUp = true;
			goDown = false;
		}
		else if(chart2.equals(chartcase14))
		{
			goEast = false;
			goWest = true;
			goUp = true;
			goDown = false;
		}
		else if(chart2.equals(chartcase15))
		{
			goEast = true;
			goWest = true;
			goUp = true;
			goDown = false;
		}
		else if(chart2.equals(chartcase16))
		{
			goEast = true;
			goWest = false;
			goUp = true;
			goDown = false;
		}
		////////Down
		else if(chart2.equals(chartcase17))
		{
			goEast = false;
			goWest = false;
			goUp = false;
			goDown = true;
		}
		else if(chart2.equals(chartcase18))
		{
			goEast = false;
			goWest = true;
			goUp = false;
			goDown = true;
		}
		else if(chart2.equals(chartcase19))
		{
			goEast = true;
			goWest = true;
			goUp = false;
			goDown = true;
		}
		else if(chart2.equals(chartcase20))
		{
			goEast = true;
			goWest = false;
			goUp = false;
			goDown = true;
		}
		///////Open
		else if(chart2.equals(chartcase21))
		{
			goEast = false;
			goWest = false;
			goUp = true;
			goDown = true;
		}
		else if(chart2.equals(chartcase22))
		{
			goEast = false;
			goWest = true;
			goUp = true;
			goDown = true;
		}
		else if(chart2.equals(chartcase23))
		{
			goEast = true;
			goWest = true;
			goUp = true;
			goDown = true;
		}
		else if(chart2.equals(chartcase24))
		{
			goEast = true;
			goWest = false;
			goUp = true;
			goDown = true;
		}
		else 
		{System.err.println("Error defining directions (C2)");}
		
		
		/////
		
		
		if(chart3.equals(chartcase1))
		{
			goSouth = false;
			goSW = false;
			goSE = false;
		}
		else if(chart3.equals(chartcase2))
		{
			goSouth = false;
			goSW = true;
			goSE = false;
		}
		else if(chart3.equals(chartcase3))
		{
			goSouth = true;
			goSW = true;
			goSE = false;
		}
		else if(chart3.equals(chartcase4))
		{
			goSouth = false;
			goSW = true;
			goSE = true;
		}
		else if(chart3.equals(chartcase5))
		{
			goSouth = true;
			goSW = true;
			goSE = true;
		}
		else if(chart3.equals(chartcase6))
		{
			goSouth = true;
			goSW = false;
			goSE = false;
		}
		else if(chart3.equals(chartcase7))
		{
			goSouth = true;
			goSW = false;
			goSE = true;
		}
		else if(chart3.equals(chartcase8))
		{
			goSouth = false;
			goSW = false;
			goSE = true;
		}
		else 
		{System.err.println("Error defining directions (C3)");}
	}
	public void lock(String direction)
	{
		if(direction.equals("North"))
		{
			NLock = false;
		}
		else if(direction.equals("South"))
		{
			SLock = false;
		}
		else if(direction.equals("East"))
		{
			ELock = false;
		}
		else if(direction.equals("West"))
		{
			WLock = false;
		}
		else if(direction.equals("NW"))
		{
			NWLock = false;
		}
		else if(direction.equals("NE"))
		{
			NELock = false;
		}
		else if(direction.equals("SW"))
		{
			SWLock = false;
		}
		else if(direction.equals("SE"))
		{
			SELock = false;
		}
		else if(direction.equals("Up"))
		{
			UPLock = false;
		}
		else if(direction.equals("Down"))
		{
			DOWNLock = false;
		}
	}
}
