import java.io.IOException;

import org.lwjgl.opengl.GL11;


public class RenderEntityPlayer extends RenderEntity {
	public static final int GRID_SIZE = 16;
	public static final int[] FRAMES = {0, 1, 1, 0, 0, 2, 2, 0};
	public static final int LEFT_OFFSET = 3;
	public static final int RIGHT_OFFSET = 9;
	public static final int UP_OFFSET = 6;
	public static final int DOWN_OFFSET = 0;
	public RenderEntityPlayer(Camera camera) {
		super(camera);
	}
	int getState(float Position)
	{
		return FRAMES[(int) (Position%(GRID_SIZE*2)/4)];
		
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

			state = UP_OFFSET + getState(player.y);
			break;
		case DOWN:
			state = DOWN_OFFSET  + getState(player.y);
			
			break;
		case LEFT:
			state = LEFT_OFFSET + getState(player.x);
			break;
		case RIGHT:
			state = RIGHT_OFFSET + getState(player.x);

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
