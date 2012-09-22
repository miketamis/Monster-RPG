import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Camera {
	Map entityRenderMap = new HashMap();
	EntityManger objEntityManger;
	public TextureLoader textureLoader;
	public MapSection objMapSection;
	TileSet tile;
	int viewXSize = 26;
	int viewYSize = 22;
	EntityPlayer player;
	float x,y;
	public Camera(MapSection mapSection) {
		objEntityManger = mapSection.entityManger;
		objMapSection = mapSection;
		player = new EntityPlayer(objMapSection);
		objEntityManger.addEntity(player);
		textureLoader = new TextureLoader();
		tile = new TileSet(this,"sprites/Pokemon_tileset.png",1,1,16,16);
		entityRenderMap.put(EntityPlayer.class,new RenderEntityPlayer(this));
	}
	public RenderEntity getEntityClassRenderObject(Class class1)
	{
		RenderEntity render = (RenderEntity)entityRenderMap.get(class1);
		if(render == null && class1 != (Entity.class))
		{
			render = getEntityClassRenderObject(class1.getSuperclass());
			entityRenderMap.put(class1, render);
		}
		return render;
	}

	public void render() {
		
		
		x = player.x - viewXSize*8;
		y = player.y - viewYSize*8;
		if(x < 0) x = 0;
		if(y < 0) y = 0;
		if(x > objMapSection.mapXSize*16 - viewXSize*16) x = objMapSection.mapXSize*16 - viewXSize*16;
		if(y > objMapSection.mapYSize*16 - viewYSize*16) y = objMapSection.mapYSize*16 - viewYSize*16;
		
		for(int x_ = (int) Math.floor(x/16);x_ < viewXSize + Math.floor(x/16);x_++)
		{
			for(int y_ = (int) Math.floor(y/16);y_ < viewYSize + Math.floor(y/16);y_++)
			{

				tile.drawTile(0,objMapSection.tileMap[x_][y_],(int)(x_*16-x),(int)(y_*16-y));
			}

		}

		Iterator i = objEntityManger.getIterator();
		while(i.hasNext())
			RenderEntity(((Entity) i.next()),x,y);			

	}
	private void RenderEntity(Entity entity, float x2, float y2) {

		getEntityClassRenderObject(entity.getClass()).render(entity,x2,y2);
	}

}
