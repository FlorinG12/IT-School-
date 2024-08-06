package session_17_equals_hashcode_generics.challenge.challenge_15;

public class MyRepoTest {

    public static void main(String[] args) {
        MyRepository<Integer, String> myRepo = new MyRepository<>();
        myRepo.add(1, "My App");
        myRepo.add(2, "Android App");
        myRepo.add(3, "Calculator App");

        System.out.println(myRepo);
        System.out.println(myRepo.get(1));

        MyRepository<Integer, String> anotherRepo = new MyRepository<>();
        anotherRepo.add(1, "My App");
        anotherRepo.add(2, "Android App");
        anotherRepo.add(3, "Calculator App");

        System.out.println(myRepo.equals(anotherRepo));
        System.out.println(myRepo.hashCode() == anotherRepo.hashCode());
    }
}