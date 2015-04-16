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

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MainClass
{
	public static xGlobe globe = new xGlobe();
	public static xMap mymap = new xMap();
	public static xPlayer pl = new xPlayer();
	public boolean firstView = true;
	//public static String input;
	public static void main(String args[])
	{	
		/////////////GUI SETUP/////////////
		xGui gui = new xGui("Game Window",globe,pl);
		gui.pack();
		gui.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		gui.setVisible(true);
		/////////////FINISHED!/////////////
		initMap(mymap);
	}
	//DO NOT EDIT//
	@SuppressWarnings("static-access")
	public static void initMap(xMap theMap)
	{
		theMap.newMap(20);
		theMap.mapname = "My map's name!";
		theMap.setMap(10,10,1);
		globe.newGlobe(10,10,10);
		//globe.globe[5][5][5] = mymap;
		globe.currentMap = theMap;
		pl.invSize = 50;
		pl.setInv();
	}
	///////////////
	@SuppressWarnings("static-access")
	public String doStuff(String input)
	{
		//System.err.println(" - " + mymap.xC + ", " + mymap.yC + ", " + mymap.zC + " - ");
		//Creating a new room called hotel:
		xRoom hotel = new xRoom();
		hotel.description = "You are in an old hotel room. To the north is a balcony overlooking the city.\n" +
				"There is a stairway leading down to the lobby of the hotel.";
		hotel.roomname = "Hotel Room";
		hotel.room();
		mymap.map[10][10][1] = hotel;
		hotel.setLeave("-*-",
				       "-D-",
				       "---");
		//DO NOT EDIT AFTER THIS POINT (In this method)//
		if(input.equals("north"))
		{
			if(mymap.map[mymap.xC][mymap.yC][mymap.zC].goNorth&mymap.map[mymap.xC][mymap.yC][mymap.zC].NLock)
			{
				firstView = true;
				mymap.goNorth(mymap.xC,mymap.yC,mymap.zC,true);
				return "";
			}
			else
			{
				return "\nYou can't go that way!\n\n";
			}
		}
		else if(input.equals("south"))
		{
			if(mymap.map[mymap.xC][mymap.yC][mymap.zC].goSouth&mymap.map[mymap.xC][mymap.yC][mymap.zC].SLock)
			{
				firstView = true;
				mymap.goSouth(mymap.xC,mymap.yC,mymap.zC,true);
				return "";
			}
			else
			{
				return "\nYou can't go that way!\n\n";
			}
		}
		else if(input.equals("east"))
		{
			if(mymap.map[mymap.xC][mymap.yC][mymap.zC].goEast&mymap.map[mymap.xC][mymap.yC][mymap.zC].ELock)
			{
				firstView = true;
				mymap.goEast(mymap.xC,mymap.yC,mymap.zC,true);
				return "";
			}
			else
			{
				return "\nYou can't go that way!\n\n";
			}
		}
		else if(input.equals("west"))
		{
			if(mymap.map[mymap.xC][mymap.yC][mymap.zC].goWest&mymap.map[mymap.xC][mymap.yC][mymap.zC].WLock)
			{
				firstView = true;
				mymap.goWest(mymap.xC,mymap.yC,mymap.zC,true);
				return "";
			}
			else
			{
				return "\nYou can't go that way!\n\n";
			}
		}
		else if(input.equals("up"))
		{
			if(mymap.map[mymap.xC][mymap.yC][mymap.zC].goUp&mymap.map[mymap.xC][mymap.yC][mymap.zC].UPLock)
			{
				firstView = true;
				mymap.goUp(mymap.xC,mymap.yC,mymap.zC,true);
				return "";
			}
			else
			{
				return "You can't go that way!\n\n";
			}
		}
		else if(input.equals("down"))
		{
			if(mymap.map[mymap.xC][mymap.yC][mymap.zC].goDown&mymap.map[mymap.xC][mymap.yC][mymap.zC].DOWNLock)
			{
				firstView = true;
				mymap.goDown(mymap.xC,mymap.yC,mymap.zC,true);
				return "";
			}
			else
			{
				return "You can't go that way!\n\n";
			}
		}
		else if(input.equals("nw"))
		{
			if(mymap.map[mymap.xC][mymap.yC][mymap.zC].goNW&mymap.map[mymap.xC][mymap.yC][mymap.zC].NWLock)
			{
				firstView = true;
				mymap.goNW(mymap.xC,mymap.yC,mymap.zC,true);
				return "";
			}
			else
			{
				return "\nYou can't go that way!\n\n";
			}
		}
		else if(input.equals("ne"))
		{
			if(mymap.map[mymap.xC][mymap.yC][mymap.zC].goNE&mymap.map[mymap.xC][mymap.yC][mymap.zC].NELock)
			{
				firstView = true;
				mymap.goNE(mymap.xC,mymap.yC,mymap.zC,true);
				return "";
			}
			else
			{
				return "\nYou can't go that way!\n\n";
			}
		}
		else if(input.equals("sw"))
		{
			if(mymap.map[mymap.xC][mymap.yC][mymap.zC].goSW&mymap.map[mymap.xC][mymap.yC][mymap.zC].SWLock)
			{
				firstView = true;
				mymap.goSW(mymap.xC,mymap.yC,mymap.zC,true);
				return "";
			}
			else
			{
				return "\nYou can't go that way!\n\n";
			}
		}
		else if(input.equals("se"))
		{
			if(mymap.map[mymap.xC][mymap.yC][mymap.zC].goSE&mymap.map[mymap.xC][mymap.yC][mymap.zC].SELock)
			{
				firstView = true;
				mymap.goSE(mymap.xC,mymap.yC,mymap.zC,true);
				return "";
			}
			else
			{
				return "\nYou can't go that way!\n\n";
			}
		}
		else if(input.equals("look"))
		{
			firstView = true;
			return "";
		}
		else if(input.equals(""))
		{
			return "\n";
		}
		else
		{
			return "error!";
		}
	}
	@SuppressWarnings("static-access")
	public String doStuffItem()
	{	
		//DO NOT DELETE//
		globe.invSize = 50;
		globe.setInv();
		globe.actionsSize = 50;
		globe.setActions();
		String output;
		StringBuffer sb = new StringBuffer();
		//EDIT AFTER THIS POINT//
		//Example item hotelKey:
		xItem hotelKey = new xItem();
		hotelKey.setItem("Hotel Key", "An old, rusty key", "can be held");
		hotelKey.location = "Hotel Room";
		globe.addToInv(hotelKey);
		if(hotelKey.location.equals(mymap.map[mymap.xC][mymap.yC][mymap.zC].roomname))
		{
			sb.append(hotelKey.name);
		}
		else
		{
			sb.append("");
		}
		//DO NOT EDIT AFTER HERE//
		output = sb.toString();
		return output;
	}
}
