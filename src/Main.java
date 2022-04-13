public class Main {

    public static void main(String[] args) {
	// write your code here
        HoorayList<String> ourNames = new HoorayList<>();
        ourNames.add("Jorge");
        ourNames.add("Haylee");
        ourNames.add("Zynthia");
        ourNames.add("Paulding");
        ourNames.add("Tressah");
        ourNames.add("JC");
        ourNames.add("Cory");


        System.out.println(ourNames);
        ourNames.remove(3);
        // or ourNames.remove("Paulding");

        System.out.println(ourNames);

    }
}
