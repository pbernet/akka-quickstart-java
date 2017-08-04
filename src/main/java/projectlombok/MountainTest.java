package projectlombok;

public class MountainTest {

    public static void main(String[] args) {

        Mountain myMountain = new Mountain("aName", 23.5, 23.6, "aCountry");
        System.out.println("Name: " + myMountain.getName() + " Country: " + myMountain.getCountry());

        Mountain copiedMountain = myMountain.withCountry("copyCountry");
        System.out.println("Copy: " +  copiedMountain);
    }
}