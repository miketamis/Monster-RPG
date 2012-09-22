
public class World {
	
	Pokemon pokemon;
	public static final int GRID_SIZE = 16;
	MapSection mapSections[] = new MapSection[4]; 
	/*
	 * 0,2
	 * 3,4
	 */
	EntityPlayer player;
	public Camera camera;
	public World(Pokemon game) {
		pokemon = game;
		for(int i = 0;i<4;i++)
		{
			 int[] mapstartx = {0,-10, 0 ,-10};
			 int[] mapstarty = {0, 0 ,-10,-10};
			mapSections[i] = new MapSection(this,mapstartx[i],mapstarty[i]);
		}
		player = new EntityPlayer(mapSections[1]);
		mapSections[1].entityManger.addEntity(player);
		camera = new Camera(this);
	}
	public void update(int delta) {
		for(int i = 0;i<4;i++)
			mapSections[i].update(delta);
		
	}
	int positivifiy(int a)
	{
		if ((a%10) < 0)
			return (a%10) + 10;
		return a%10;
	}
	public int getTile(int x_, int y_) {
		
		if(x_/10 == 0)
		{
			if(y_/10 == 0)
			{
			return mapSections[0].tileMap[positivifiy(x_)][positivifiy(y_)];
			}
			else if(y_/10 == -1)
			{
				
			return mapSections[1].tileMap[positivifiy(x_)][positivifiy(y_)];
			}
		}
		else if(x_/10 == -1)
		{
			
			if(y_/10 == 0)
			{
			return mapSections[2].tileMap[positivifiy(x_)][positivifiy(y_)];
			}
			else if(y_/10 == -1)
			{
				
			return mapSections[3].tileMap[positivifiy(x_)][positivifiy(y_)];
			}
			
		}
	
		return 6;
			
		
	}

}
