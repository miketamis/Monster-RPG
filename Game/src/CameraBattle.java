import java.io.IOException;

import org.lwjgl.opengl.GL11;


public class CameraBattle extends Camera {

	Battle objBattle;
	Texture texture = null;
	public CameraBattle(Battle battle) {
		
		try {
			texture = textureLoader.getTexture("sprites/ash.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		objBattle = battle;
	}
	@Override
	public void render() {
	for(int x = 0;x<5;x++)
	{
		for(int y = 0;y<5;y++)
		{
		
			renderHex(objBattle.hextiles[x][y]);
		}
	}
	}
	private void renderHex(HexTile hexTile) {
	
		GL11.glPushMatrix();
		texture.bind();
		GL11.glColor3f(1,1,1);
		GL11.glBlendFunc( GL11.GL_SRC_ALPHA,GL11.GL_ONE_MINUS_SRC_ALPHA); 
		GL11.glEnable(GL11.GL_BLEND);  
		GL11.glBegin(GL11.GL_QUADS);
		float y = (float) (hexTile.y + (hexTile.even ? 0:0.5));
		
		
		GL11.glTexCoord2f((texture.getWidth()/12), 0);
		GL11.glVertex2f(hexTile.x*16  , y*16 - 6);
		GL11.glTexCoord2f((texture.getWidth()/12), texture.getHeight());
		GL11.glVertex2f(hexTile.x*16 , y*16 + 22-6);
		GL11.glTexCoord2f((texture.getWidth()/12)+texture.getWidth()/12, texture.getHeight());
		GL11.glVertex2f(hexTile.x*16 + 16 ,y*16 + 22-6);
		GL11.glTexCoord2f((texture.getWidth()/12)+texture.getWidth()/12, 0);
		GL11.glVertex2f(hexTile.x*16 + 16 ,y*16-6 );
		
		GL11.glEnd();
		GL11.glPopMatrix();
		
	}
}


