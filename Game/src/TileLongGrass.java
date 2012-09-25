import java.util.Random;


public class TileLongGrass extends Tile {

public static final int CHANCE_OF_FINDING_MONSTER = 2;

	@Override
	public void stepOn(EntityPlayer entityPlayer, int x, int y) {
		System.out.println("----------------" );
		Random generator = new Random();
		int Identify = (generator.nextInt(MonsterData.monsters.length));
		
                if(generator.nextInt(CHANCE_OF_FINDING_MONSTER) == 0){
		         MonsterData.monsters[Identify].printMonster();
                 CreateWildMonster(MonsterData.monsters[Identify]);               
                 }
                 else
                System.out.println("No monster");
               
	}

	private void CreateWildMonster(Monster monster) {
		Random generator = new Random();
		int lvl = generator.nextInt(10);
		WildMonster wild = new WildMonster(monster.name, monster.type, monster.tier, lvl);
		wild.printWildMonster();
	}
}