
public class Main {

    public static void main(String[] args) {

        GamePiece whiteQueen = new GamePiece();
        whiteQueen.setName("Queen");
        whiteQueen.setColor("White");
        System.out.print(whiteQueen.getColor());
        System.out.println(whiteQueen.getName());
        ///move unfrozen
        moveTest(whiteQueen);
        whiteQueen.move(1, 4);
        moveTest(whiteQueen);
        //move frozen
        whiteQueen.freeze();
        whiteQueen.move(2, -3);
        moveTest(whiteQueen);
        whiteQueen.unfreeze();
        whiteQueen.move(2, -3);
        moveTest(whiteQueen);

        //random numbers
        whiteQueen.unfreeze();

        whiteQueen.move(randomNum(), randomNum());
        moveTest(whiteQueen);

    }
    public static void moveTest(GamePiece whiteQueen){

        System.out.println("Frozen: "+ whiteQueen.getfrozen());
        System.out.println("x:"+whiteQueen.getPositionX()+"y:"+whiteQueen.getPositionY());


    };

    public static int randomNum(){
        int x = 1 + (int)(Math.random() * ((10 - 1) + 1));
        return x;
    }
    }


