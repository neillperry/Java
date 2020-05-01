



public class Homework {
    private String thing = "";



    public void permutations(String combo) {
        long xCount = combo.chars().filter(ch -> ch == 'X').count();
        long yCount = combo.chars().filter(ch -> ch == 'Y').count();

        if(combo.contains("XXX")) {
            System.out.println(combo);
        } else if (combo.contains("YYY")) {
            System.out.println(combo);
        } else if (xCount == 4 || yCount == 4) {
            System.out.println(combo);
        } else {
            String addY = combo + "Y";
            String addX = combo + "X";
            permutations(addY);
            permutations(addX);
        }
    }


}
