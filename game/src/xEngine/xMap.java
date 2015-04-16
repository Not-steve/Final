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

public class xMap
{
	public static xRoom[][][] map;
	public static int mapSize;
	public static int xC;
	public static int yC;
	public static int zC;
	public String mapname;

	public static void newMap(int x)
	{
		map = new xRoom[x][x][x];
		mapSize = x;
	}

	public void setMap(int x,int y,int z)
	{
		xC = x;
		yC = y;
		zC = z;
	}

	public void goNorth(int x, int y, int z, boolean canGo)
	{
		if(canGo && y > 1)
		{
			y -= 1;
			yC = y;
		}
		else
		{
			System.out.println("You can't go that way!");
		}
	}
	public void goSouth(int x, int y, int z, boolean canGo)
	{
		if(canGo && y < mapSize)
		{
			y += 1;
			yC = y;
		}
		else
		{
			String noExit = "You can't go that way!";
			System.out.println(noExit);
		}
	}
	public void goEast(int x, int y, int z, boolean canGo)
	{
		if(canGo && x < mapSize)
		{
			x += 1;
			xC = x;
		}
		else
		{
			String noExit = "You can't go that way!";
			System.out.println(noExit);
		}
	}
	public void goWest(int x, int y, int z, boolean canGo)
	{
		if(canGo && x > 1)
		{
			x -= 1;
			xC = x;
		}
		else
		{
			String noExit = "You can't go that way!";
			System.out.println(noExit);
		}
	}
	public void goNW(int x, int y, int z, boolean canGo)
	{
		if(canGo && y > 1 && x > 1)
		{
			x -= 1;
			y -= 1;
			xC = x;
			yC = y;
		}
		else
		{
			String noExit = "You can't go that way!";
			System.out.println(noExit);
		}
	}
	public void goNE(int x, int y, int z, boolean canGo)
	{
		if(canGo && y > 1 && x < mapSize)
		{
			x += 1;
			y -= 1;
			xC = x;
			yC = y;
		}
		else
		{
			String noExit = "You can't go that way!";
			System.out.println(noExit);
		}
	}
	public void goSW(int x, int y, int z, boolean canGo)
	{
		if(canGo && y < mapSize && x > 1)
		{
			y += 1;
			x -= 1;
			xC = x;
			yC = y;
		}
		else
		{
			String noExit = "You can't go that way!";
			System.out.println(noExit);
		}
	}
	public void goSE(int x, int y, int z, boolean canGo)
	{
		if(canGo && y < mapSize && x < mapSize)
		{
			y += 1;
			x += 1;
			xC = x;
			yC = y;
		}
		else
		{
			String noExit = "You can't go that way!";
			System.out.println(noExit);
		}
	}
	public void goUp(int x, int y, int z, boolean canGo)
	{
		if(canGo && z != 0)
		{
			z -= 1;
			zC = z;
		}
		else
		{
			String noExit = "You can't go that way!";
			System.out.println(noExit);
		}
	}
	public void goDown(int x, int y, int z, boolean canGo)
	{
		if(canGo && z != mapSize)
		{
			z += 1;
			zC = z;
		}
		else
		{
			String noExit = "You can't go that way!";
			System.out.println(noExit);
		}
	}
	public void setMap(String name, int size)
	{
		mapname = name;
		mapSize = size;
	}
}
