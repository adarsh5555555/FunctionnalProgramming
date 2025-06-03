import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConcatenateStringByFuctionlal {
    public static void main(String[] args) {
        List<String>myList = List.of("adarsh is the ","perfect coder ","ever existed ",
                "in computer history","ganda","bad");
        System.out.println("by using functional programming\n ");
        myList.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s.length()>=10){
                   return true;
                }else{
                    return false;
                }
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s);
            }
        });
        System.out.println("\n");
        System.out.println("by using lambda in functional programming\n");
        myList.stream().filter(s-> (s.length() >= 10) ? true : false)
                .forEach(s-> System.out.print(s));
    }
}
