import java.util.Random;


public class TileLongGrass extends Tile {
	
public static boolean available = false;
public static WildMonster currentWild;
public static final int CHANCE_OF_FINDING_MONSTER = 2;
	@Override
	public void stepOn(EntityPlayer entityPlayer, int x, int y) {
		System.out.println("----------------" );
		Random generator = new Random();
		int Identify = (generator.nextInt(MonsterData.monsters.length));
		
                if(generator.nextInt(CHANCE_OF_FINDING_MONSTER) == 0){
		         MonsterData.monsters[Identify].printMonster();
		        
                
                 currentWild = CreateWildMonster(MonsterData.monsters[Identify]);      
                 new Battle().start();
          
                 }
                 else
                System.out.println("No monster");
               
	}

	private WildMonster CreateWildMonster(Monster monster) {
		Random generator = new Random();
		int lvl = generator.nextInt(10);
		int hp = monster.hp;
		int atk = (monster.atk*lvl);
		int def = (monster.def*lvl);
		int spd = monster.spd;
		int x = 1;
		int y = 1;
		
		WildMonster wild = new  WildMonster(monster.name, monster.type, monster.tier, lvl, hp, atk, def, spd, x, y);
		wild.printWildMonster();
		available = true;
		return wild;
	}
	
	
	}