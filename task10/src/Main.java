public class Main {

    public static void searchingForElementInArray(String element){
        int index = -1;
        try {
            String [] array = new String[]{"pen","table","close","open"};
            boolean flag = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(element)){
                    System.out.printf("Найден элемент с индексом %s: " +array[i]+"\n", i);
                    flag = true;
                    break;
                }
            }
            if (!flag){
                throw new Error("Элемент отсутвует в массиве");
            }
        }
        catch (Error er){
            System.out.println(er.getMessage());
        }



    }

    public static void main(String[] args) {
        searchingForElementInArray("table");
        searchingForElementInArray("ta");
    }
}
