public class GameEnemy {
    double width;
    double height;
    int positionX;
    int positionY;

    public GameEnemy(){}
    public GameEnemy(double width, double height){}
    public GameEnemy(double width, double height, int positionX, int positionY){}
    public void setdimension(double width, double height){
        this.width = width;
        this.height = height;
    }
    public void setposition(int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public double getwidth(){
        return this.width;
    }
    public double getheight(){
        return this.height;
    }
    public int getX(){
        return this.positionX;
    }
    public int getY(){
        return this.positionY;
    }
    public void run(){
        System.out.println("Enemy is Running");
    }
}