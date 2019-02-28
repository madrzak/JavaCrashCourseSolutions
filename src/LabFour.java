import java.util.Arrays;

/**
 * Created by Lukasz Madrzak on 2019-02-28.
 */
public class LabFour {

    int[] myNums = {1, 3, 7, 11, 13, 5};

    public static void main(String[] args) {

        LabFour labFour = new LabFour();
        labFour.usingAStream();

        labFour.usingStreamWithMethodReference();

    }

    public void usingAStream() {

        Arrays.stream(myNums).sorted()
                .forEach(value -> {
                    System.out.println(value);
                });

    }

    public void usingStreamWithMethodReference() {

        Arrays.stream(myNums).forEach(System.out::println);

    }


}
