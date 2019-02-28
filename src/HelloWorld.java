/**
 * Created by Lukasz Madrzak on 2019-02-28.
 *
 * Lab Two & Three Solution
 *
 */
public class HelloWorld {

    int myX = 14;
    int myY = 7;

    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld();

        System.out.println(helloWorld.add());

        System.out.println(helloWorld.subtract());
    }

    public int add() {
        int x = 12;
        int y = 34;

        return x + y;

    }

    public int subtract() {

        return myX - myY;
    }

}
