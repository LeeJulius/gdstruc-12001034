package Julius;

public class SimpleHashTable {
    private StoredPlayer[] hashtable;

    public SimpleHashTable() {
        hashtable = new StoredPlayer[10];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void put(String key, Player value) {
        int hashedKey = hashKey(key);

        if (isOccupied(hashedKey)) {
            int stoppingIndex = hashedKey;

            if (hashedKey == hashtable.length - 1) hashedKey = 0;
            else hashedKey++;

            while (isOccupied(hashedKey) && hashedKey != stoppingIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if (isOccupied(hashedKey)) {
            System.out.println("Hashkey is Taken");
        }

        else {
            hashtable[hashedKey] = new StoredPlayer(key, value);
        }
    }

    public boolean isOccupied(int index) {
        return hashtable[index] != null;
    }

    public Player get (String key) {
        int hashedKey = findKey(key);

        if (hashedKey == -1) return null;
        return hashtable[hashedKey].value;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);

        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) return hashedKey;
        int stoppingIndex = hashedKey;

        if (hashedKey == hashtable.length - 1) hashedKey = 0;
        else hashedKey++;

        while (hashtable[hashedKey] != null && hashedKey != stoppingIndex && !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if (hashtable[hashedKey] != null && hashedKey != stoppingIndex) {
            return hashedKey;
        }
        return -1;
    }

    public void remove(String key) {
        int deleteKey = hashKey(key);

        if (isOccupied(deleteKey) && hashtable[deleteKey].key.equals(key)) hashtable[deleteKey] = null;

        int stoppingIndex = deleteKey;

        if (deleteKey == hashtable.length - 1) deleteKey = 0;
        else deleteKey++;

        while (hashtable[deleteKey] != null && deleteKey != stoppingIndex && !hashtable[deleteKey].key.equals(key)) {
            deleteKey = (deleteKey + 1) % hashtable.length;
        }

        if (hashtable[deleteKey] != null && deleteKey != stoppingIndex) {
            hashtable[deleteKey] = null;
        }

        int rehashedKey = 0;
        int maxSize = hashtable.length - 1;

        while (rehashedKey != maxSize || isOccupied(rehashedKey)) {

            if (isOccupied(rehashedKey) && hashKey(hashtable[rehashedKey].key) != rehashedKey && !isOccupied(hashKey(hashtable[rehashedKey].key))) {
                hashtable[hashKey(hashtable[rehashedKey].key)] = hashtable[rehashedKey];
                hashtable[rehashedKey] = null;
                rehashedKey--;
            }

            rehashedKey++;
        }
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] != null) {
                System.out.println("Element " + i + " " + hashtable[i].value);
            } else {
                System.out.println("Element " + i + " null");
            }
        }
    }
}
