/**
 * Created by Lukasz Madrzak on 06/02/2019.
 */
public class LabFive {

    public static void main(String[] args) {

        var name = "Jenny \n";

        System.out.println(name.repeat(5));

        System.out.println(name.isBlank());

        var anotherName = "   Sunny     ";
        System.out.println(anotherName.strip());

        var manyLines = " Venus \n Mars \n Earth";
        manyLines.lines().map(s -> s.strip()).forEach(System.out::println);
    }
}
