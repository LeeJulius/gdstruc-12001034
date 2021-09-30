package Julius;

public class Main {

    public static void main(String[] args) {

        SimpleHashTable hashtable = new SimpleHashTable();

        Player amanek = new Player(32, "AmaNEk", 343);
        Player jackz = new Player(2, "Jackz", 675);
        Player niko = new Player(43, "NiKo", 765);
        Player nexa = new Player(12, "nexa", 321);
        Player hunter = new Player(1, "huNter", 232);

        hashtable.put(amanek.getName(), amanek);
        hashtable.put(jackz.getName(), jackz);
        hashtable.put(niko.getName(), niko);
        hashtable.put(nexa.getName(), nexa);
        hashtable.put(hunter.getName(), hunter);

        System.out.println("Original Hashtable: ");
        hashtable.printHashtable();

        hashtable.remove("AmaNEk");

        System.out.println("\nNew Hashtable: ");
        hashtable.printHashtable();
    }
}
