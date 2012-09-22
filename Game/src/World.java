
public class World {
	
	Pokemon pokemon;

	MapSection mapSection; 
	public Camera camera;
	public World(Pokemon game) {
		pokemon = game;
		mapSection = new MapSection(this);

		camera = new Camera(mapSection);
	}
	public void update(int delta) {
		mapSection.update(delta);
		
	}

}
