package OOPS.Constructor;


class Square{

    int side;

    public Square() {

        this(5);
        //control goes to single parameterized constructor

    }
    public Square(int side){
        this.side = side;
    }

    void displayArea(){

        System.out.println(side*side);
    }

}
public class ConstructorChaining {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.displayArea();

    }
}
