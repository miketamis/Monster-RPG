import java.util.ArrayList;
import java.util.Iterator;


public class EntityManger {

	MapSection objMapSection;
	ArrayList<Entity> Entities = new ArrayList<Entity>();
	
	public EntityManger(MapSection mapSection) {
		objMapSection = mapSection;
		
	}
	public void addEntity(Entity entity) {
		Entities.add(entity);
		
	}
	public void update(int delta)
	{
		Iterator i = Entities.iterator();
		  while(i.hasNext())
			  ((Entity) i.next()).update(delta);
			  
			  
	}
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return Entities.iterator();
	}

}
