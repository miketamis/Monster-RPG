
public class Battle {
	static int  WIDTH = 5;
	static int HEIGHT = 5;
	HexTile[][]hextiles = new HexTile[WIDTH][HEIGHT];
	
	CameraBattle camera;
	 public Battle(){
		 
		 for(int x = 0; x < WIDTH; x++)
			{
				for(int y = 0; y < HEIGHT; y++){
					hextiles[x][y] = new HexTile(x, y, x % 2 == 0);
					
				}
			}
		camera = new CameraBattle(this);
		
		Pokemon.game.camera = camera;
		camera.render();
		
	}
	public void start(WildMonster currentWild) {
		
		
		
	}

}
