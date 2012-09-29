public class Monster{
	    String name;
        String type;
        int tier;	
        int hp;
        int atk;
        int def;
        int spd;
        String sprite;
        int x;
        int y;
        
	public Monster(String name,String Type,int Tier, int HP, int ATK, int DEF, int SPD, String Sprite, int X, int Y){
                this.type = Type;
                this.tier = Tier;
		        this.name = name;
		        this.spd = SPD;
		        this.atk = ATK;
		        this.def = DEF;
		        this.hp = HP;
		        this.sprite = Sprite;
		        this.x = X;
		        this.y = Y;
	}
	

		// TODO Auto-generated constructor stub
	


public void printMonster(){
	      System.out.println("Found:"+ name );
	      System.out.println("Type:"+  type);
	      System.out.println("Tier:"+ tier);

}
	
}

