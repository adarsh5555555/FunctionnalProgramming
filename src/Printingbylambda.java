import java.util.List;
import java.util.function.Consumer;

public class Printingbylambda {
    public static void main(String[] args) {
        List <String> myList = List.of("adarsh " ,"is ","the ","perfect ","coder ","ever ","existed");
        myList.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s);
            }
        });
        System.out.println("\nby using lambda");
        myList.stream().forEach(a-> System.out.print(a));
    }
}
