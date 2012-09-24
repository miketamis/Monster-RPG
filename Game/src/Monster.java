public class Monster{
	String name;
        String type;
        int tier;	

	public Monster(String name,String Type,int Tier){
                this.type = Type;
                this.tier = Tier;
		this.name = name;
	}
	

public void printMonster(){
	      System.out.println("Found:"+ name );
	      System.out.println("Type:"+  type);
	      System.out.println("Tier:"+ tier);

}
	
}

