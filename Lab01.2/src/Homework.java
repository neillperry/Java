



public class Homework {

    public void permutations(String combo) {
        // count the number of Xs in String
        long xCount = combo.chars().filter(ch -> ch == 'X').count();
        // count the number of Ys in String
        long yCount = combo.chars().filter(ch -> ch == 'Y').count();

        // escape condition one - three in a row
        if(combo.contains("XXX")) {
            System.out.println(combo);

        // escape condition two - three in a row
        } else if (combo.contains("YYY")) {
            System.out.println(combo);

         // escape condition three - a total of four
        } else if (xCount == 4 || yCount == 4) {
            System.out.println(combo);

         // otherwise, fork out two more
        } else {
            String addY = combo + "Y";
            String addX = combo + "X";
            permutations(addY);
            permutations(addX);
        }
    }


}
