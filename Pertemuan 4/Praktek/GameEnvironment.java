import java.lang.reflect.Array;
import java.util.ArrayList;

public class GameEnvironment{
    private double width;
    private double height;
    private ArrayList<GamePlayer> arrPlayer = new ArrayList<GamePlayer>();
    private ArrayList<GameEnemy> arrEnemy = new ArrayList<GameEnemy>();

    public GameEnvironment(){    
    }

    GameEnvironment(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void addPlayer(GamePlayer Player){
        GamePlayer newPlayer = new GamePlayer();
        arrPlayer.add(newPlayer);
    }

    public void removePlayer(GamePlayer Player){
        GamePlayer rmvPlayer = new GamePlayer();
        arrPlayer.remove(rmvPlayer);
    }

    public void getAllPlayer(){
        System.out.println("All Player : " + arrPlayer);
    }

    public void addEnemy(GameEnemy Enemy){
        GameEnemy newEnemy = new GameEnemy();
        arrEnemy.add(newEnemy);
    }

    public void removeEnemy(GameEnemy Enemy){
        GameEnemy rmvEnemy = new GameEnemy();
        arrEnemy.remove(rmvEnemy);
    }

    public void getAllEnemy(){
        System.out.println("All Enemy : " + arrEnemy);
    }

    public void Interaction(){
        if (arrPlayer == null || arrEnemy == null){
            System.out.println("Player or Enemy not sets");
        }
        for (int i = 0; i < arrPlayer.size(); i++){
            for (int j = 0; j < arrEnemy.size(); j++){
                arrEnemy.size();
                if(arrPlayer.get(i).getY() != arrEnemy.get(j).getY()){
                    System.out.println("Player : " + arrPlayer.get(i) + "and Enemy : " + arrEnemy.get(j));
                }
                if(EuclideanDistance(arrPlayer.get(i).getX(),arrPlayer.get(i).getY(),arrEnemy.get(j).getX(),arrEnemy.get(j).getY())<2){
					System.out.println("Player: "+arrPlayer.get(i)+" Attacked");
					System.out.println("Enemy: "+arrEnemy.get(j)+" loses");
					removeEnemy(arrEnemy.get(j));
				}
                else{
                    System.out.println(" --> Player " + arrPlayer.get(i));
                    arrPlayer.get(i).Run((int)Math.ceil(Math.random()*10));
                    System.out.println(" Current position = " + arrPlayer.get(i).getX() + " <-- ");
                }  
            }
        }
    }

    public static int EuclideanDistance(int x1, int y1, int x2, int y2){
        return (int)Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
    }
}