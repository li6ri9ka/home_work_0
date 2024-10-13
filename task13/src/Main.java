import java.util.ArrayList;

public class Main {

    public static void  returningTheValueByIndex(int index, ArrayList<String> list){
        try {
            if(index >  list.size()){
                throw new IndexOutOfBoundsException("Вы вышли за рамки списка");
            }
            else {
                System.out.println(list.get(index));
            }
        }
        catch (IndexOutOfBoundsException in){
            System.out.println(in.getMessage());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(){{
            add("1");
            add("2");
            add("3");
        }};

        returningTheValueByIndex(1, list);
    }
}
