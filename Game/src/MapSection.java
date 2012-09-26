import java.util.Random;


public class MapSection {
	 EntityManger entityManger;
	 int mapXSize = 10;
	 int mapYSize = 10;
	 int x,y;
	public int[][] tileMap;
	public int[][] tileBlockMap;
	public Tile[] tiles = {null,new TileLongGrass(),null};
	Random rand = new Random();
	World objWorld;
	public MapSection(World world, int mapstartx, int mapstarty) {
		x = mapstartx;
		y = mapstarty;
		objWorld = world;
		tileMap = new int[mapXSize][mapYSize];
		tileBlockMap = new int[mapXSize][mapYSize];
		
		for(int x = 0;x < mapXSize;x++)
		{
			for(int y = 0;y < mapYSize;y++)
			{
				int randint = rand.nextInt(3);
				tileMap[x][y] = 6 + randint;
				tileBlockMap[x][y] = randint;
			}
				
		}
		entityManger = new EntityManger(this);
		
		
	}
	public void update(int delta) {
		entityManger.update(delta);
	}

	

}
