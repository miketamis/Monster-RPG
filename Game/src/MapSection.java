import java.util.Random;


public class MapSection {
	 EntityManger entityManger;
	 int mapXSize = 40;
	 int mapYSize = 40;
	public int[][] tileMap;
	public int[][] tileBlockMap;
	public Tile[] tiles = {null,new TileLongGrass(),null};
	Random rand = new Random();
	public MapSection(World world) {
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
	public boolean MoveOver(int x, int y) {
		// TODO Auto-generated method stub
		return tileBlockMap[x][y] != 2;
	}
	public void stepOn(EntityPlayer entityPlayer, int x, int y) {
		Tile tile = tiles[tileBlockMap[x][y]];
		if (tile != null)
		tile.stepOn(entityPlayer,x,y);
		
	}

}
