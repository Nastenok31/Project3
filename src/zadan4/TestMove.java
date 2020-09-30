package zadan4;

public class TestMove {
    public static void main(String[] args){
        MovablePoint one = new MovablePoint(3,3,3,3);
        MovableCircle two = new MovableCircle(1,2,3,4,5);
        MovableRectangle three = new MovableRectangle(3,3,1,1,6,8);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
}
    }