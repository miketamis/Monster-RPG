public class Monster{
	    String name;
        String type;
        int tier;	
        int hp;
        int atk;
        int def;
        int spd;

	public Monster(String name,String Type,int Tier, int HP, int ATK, int DEF, int SPD){
                this.type = Type;
                this.tier = Tier;
		        this.name = name;
		        this.spd = SPD;
		        this.atk = ATK;
		        this.def = DEF;
		        this.hp = HP;
	}
	

		// TODO Auto-generated constructor stub
	


public void printMonster(){
	      System.out.println("Found:"+ name );
	      System.out.println("Type:"+  type);
	      System.out.println("Tier:"+ tier);

}
	
}

