import java.io.IOException;

import org.lwjgl.opengl.GL11;


public class RenderEntityPlayer extends RenderEntity {
	public static final int GRID_SIZE = 16;
	public RenderEntityPlayer(Camera camera) {
		super(camera);
	}
	int getState(float Position)
	{
		if(Position%(GRID_SIZE*2)> GRID_SIZE*0.25 && Position%(GRID_SIZE*2) < GRID_SIZE*0.75)
			return 1;
		else if(Position%(GRID_SIZE*2)>GRID_SIZE* 1.25&&Position%(GRID_SIZE*2)<GRID_SIZE* 1.75)
			return 2;
		return 0;
	}
	
	@Override
	public void render(Entity entity,float offsetX ,float offsetY) {
		float x = entity.x;
		float y = entity.y;
		EntityPlayer player = (EntityPlayer) entity;
		//float rotation = ((EntityPlayer)entity).rotation;
		Texture texture = null;
		TextureLoader textloader = objCamera.textureLoader;
		try {
			texture = textloader.getTexture("sprites/ash.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// draw quad
		int state = 0;
	
		
		switch (player.rotation)
		{
		case UP:

			state = 6 + getState(player.y);
			http://pastebin.com/Uz0yW2KM
			break;
		case DOWN:
			state = 0  + getState(player.y);
			
			break;
		case LEFT:
			state = 3 + getState(player.x);
			break;
		case RIGHT:
			state = 9 + getState(player.x);

			break;
		}

		GL11.glPushMatrix();
		texture.bind();
		GL11.glColor3f(1,1,1);
		GL11.glBlendFunc( GL11.GL_SRC_ALPHA,GL11.GL_ONE_MINUS_SRC_ALPHA); 
		GL11.glEnable(GL11.GL_BLEND);  
		GL11.glBegin(GL11.GL_QUADS);
		
		GL11.glTexCoord2f((texture.getWidth()/12)*state, 0);
		GL11.glVertex2f(x - offsetX , y - 6- offsetY);
		GL11.glTexCoord2f((texture.getWidth()/12)*state, texture.getHeight());
		GL11.glVertex2f(x - offsetX, y + 22-6- offsetY);
		GL11.glTexCoord2f((texture.getWidth()/12)*state+texture.getWidth()/12, texture.getHeight());
		GL11.glVertex2f(x + 16 -offsetX,y + 22-6- offsetY);
		GL11.glTexCoord2f((texture.getWidth()/12)*state+texture.getWidth()/12, 0);
		GL11.glVertex2f(x + 16 - offsetX,y-6 - offsetY);
		
		GL11.glEnd();
		GL11.glPopMatrix();

	}

}
