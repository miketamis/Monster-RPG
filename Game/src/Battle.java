
public class Battle {
	static int  WIDTH = 5;
	static int HEIGHT = 5;
	Tile[][]tiles = new Tile[WIDTH][HEIGHT];
	
	 public Battle(){
		for(int x = 0; x > WIDTH; x++)
		{
			for(int y = 0; y > HEIGHT; y++){
				tiles[x][y] = new Tile(x, y, x % 2 == 0);
				
			}
		}
	}

}
