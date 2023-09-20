public class ChristmasTree {

    public String getSpaces(int amountSpaces) {
        String space = "";
        for (int i = 0; i < amountSpaces; i++)
            space = space + " ";
        return space;
    }

    public String getLayer(int length, int amountSpaces) {
        String fullLayer = getSpaces(amountSpaces) + "+";
        for (int i = 0; i < length - 2; i++){
            fullLayer += "_";
        }
        fullLayer += "+";
        return fullLayer;
    }

    public void printTree(int height){
        int numberOfSpaces = height;
        System.out.println(getSpaces(height) + "*");
        for (int i = 1; i <= height; i++){
            numberOfSpaces--;
            System.out.println(getLayer( (i * 2 + 1), numberOfSpaces));
        }
        System.out.println(getSpaces(height - 1) + "||");
    }
}
