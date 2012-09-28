import java.io.IOException;

import org.lwjgl.opengl.GL11;


public class WildMonster {
String name;
String type;
int tier;
int lvl;
int hp;
int atk;
int def;
int spd;
int id;
int x;
int y;
Object active;


public WildMonster(String Name, String Type, int Tier, int Lvl, int HP, int ATK, int DEF, int SPD, int X, int Y) {
	this.name = Name;
	this.type = Type;
	this.tier = Tier;
	this.lvl  = Lvl;
	this.hp = HP;
	this.atk = ATK;
	this.def = DEF;
	this.spd = SPD;
	this.x = X;
	this.y = Y;
}
public void printWildMonster(){
    System.out.println("GENERATED WILD MONSTER:");
    System.out.println("Name:"+ name );
    System.out.println("Type:"+  type);
    System.out.println("Lvl:"+ lvl);
    System.out.println("Stats:"+ "   HP:"+ hp + "   ATK:" + atk + "   DEF:" + def + "   SPD:" + spd);
    
}
	
	// TODO Auto-generated method stub
	
}
