
public class WildMonster {
String name;
String type;
int tier;
int lvl;
int hp;
int atk;
int def;
int spd;

public WildMonster(String Name, String Type, int Tier, int Lvl, int HP, int ATK, int DEF, int SPD) {
	this.name = Name;
	this.type = Type;
	this.tier = Tier;
	this.lvl  = Lvl;
	this.hp = HP;
	this.atk = ATK;
	this.def = DEF;
	this.spd = SPD;
		// TODO Auto-generated constructor stub
	}
public void printWildMonster(){
    System.out.println("GENERATED WILD MONSTER:");
    System.out.println("Name:"+ name );
    System.out.println("Type:"+  type);
    System.out.println("Lvl:"+ lvl);
    System.out.println("Stats:"+ "   HP:"+ hp + "   ATK:" + atk + "   DEF:" + def + "   SPD:" + spd);
    
}}
