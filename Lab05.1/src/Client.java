/*
*     Driver code for the Television class
 */

public class Client {

    public static void main(String[] args) {
        Television tele = new Television();
        tele.setBrand("Duff");
        tele.setVolume(4);
        System.out.println(tele.toString());
    }


}
