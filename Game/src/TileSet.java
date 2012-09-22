import java.io.IOException;

import org.lwjgl.opengl.GL11;


public class TileSet {
	Texture texture = null; 
	public TileSet(Camera camera, String string, int i, int j, int k, int l) {
		TextureLoader textloader = camera.textureLoader;
		try {
			texture = textloader.getTexture(string);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void drawTile(int x,int y,int f,int g)
	{
		GL11.glPushMatrix();
		texture.bind();
		GL11.glColor3f(1,1,1);
		float heightperpixel = (texture.getHeight()/texture.getImageHeight());
		float widthperpixel = (texture.getWidth()/texture.getImageWidth());
		
		GL11.glBegin(GL11.GL_QUADS);
		GL11.glTexCoord2f((y*16+ y + 1)*widthperpixel, (x*16+ x + 1)*heightperpixel);
		GL11.glVertex2f(f, g);
		GL11.glTexCoord2f((y*16+ y + 1)*widthperpixel, (x*16 + 16 + x + 1)*heightperpixel);
		GL11.glVertex2f(f, g + 16);
		GL11.glTexCoord2f((y*16 + 16+ y + 1)*widthperpixel,( x*16 + 16 + x + 1)*heightperpixel);
		GL11.glVertex2f(f + 16,g + 16);
		GL11.glTexCoord2f((y*16 + 16+ y + 1)*widthperpixel,( x*16 + x + 1)*heightperpixel);
		GL11.glVertex2f(f + 16,g);
		GL11.glEnd();
		GL11.glPopMatrix();
	}

}
