
public class PlayerMonsterStore {
	public static void catchWildMonster(WildMonster monster){
		int xp = 0;
		TileLongGrass.available = false;
		CaughtMonster caught = new CaughtMonster(monster.name, monster.type, monster.tier, monster.lvl, monster.hp, monster.atk, monster.def, monster.spd, xp);
}
}