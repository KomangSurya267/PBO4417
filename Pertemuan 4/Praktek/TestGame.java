public class TestGame {
    public static void main(String[] args){
    GamePlayer hero = new GamePlayer();
    hero.setdimension(12,12);
    hero.setposition(10,220);
    System.out.println("Posisi Player: " + hero.getX() + "," + hero.getY());
    hero.Run(12);
    System.out.println("Posisi Player: " + hero.getX() + "," + hero.getY());
    GamePlayer hero2 = new GamePlayer();
    hero2.setdimension(12,32);
    hero2.setposition(10,10);

    GameEnemy  monster = new GameEnemy();
    monster.setdimension(12,32);
    monster.setposition(10,10);

    GameEnvironment scene = new GameEnvironment();
    scene.addPlayer(hero);
    scene.addPlayer(hero);
    scene.addPlayer(hero2);
    scene.getAllPlayer();
    scene.removePlayer(hero);
    scene.getAllPlayer();
    scene.addEnemy(monster);
    scene.Interaction();    
    }
}