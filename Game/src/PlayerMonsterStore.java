public class PlayerMonsterStore {
	static CaughtMonster[] monsters;
	public PlayerMonsterStore()
	{
		monsters = new CaughtMonster[6];
	    monsters[0] = new CaughtMonster("Pikachu", "Electric", 1, 1, 10, 2, 2, 2, 0, "sprites/pikachuAlpha32.png", 5, 6);
	}
	/*public void catchWildMonster(WildMonster monster){
		int xp = 0;
		TileLongGrass.available = false;
		CaughtMonster caught = new CaughtMonster(monster.name, monster.type, monster.tier, monster.lvl, monster.hp, monster.atk, monster.def, monster.spd, xp);
		

	}*/
}