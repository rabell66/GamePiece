public class GamePiece {

    private int positionX;
    private int positionY;
    private boolean frozen;
    private String color;
    private String name;

    public GamePiece() {
        positionX = 0;
        positionY = 0;
        frozen = false;
    }
     public void move(int positionX, int positionY){
            if(this.frozen == false){
        this.positionX = positionX;
        this.positionY = positionY;
            }else{
                return;
            }



    }
    public void freeze(){
         this.frozen = true;
    }

    public void unfreeze(){
        this.frozen = false;
    }





    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean getfrozen() {
        return frozen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}




