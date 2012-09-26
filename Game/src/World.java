
public class World {
	
	Pokemon pokemon;

	MapSection mapSection; 
	public CameraMap camera;
	public World(Pokemon game) {
		pokemon = game;
		mapSection = new MapSection(this);

		camera = new CameraMap(mapSection);
	}
	public void update(int delta) {
		mapSection.update(delta);
		
	}

}
