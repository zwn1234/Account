import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Account {
    private String username;
    public String getUsername() {
        return username;
    }
    public Account (String requestedName) throws FileNotFoundException {
        int num = 1;
        String possibleName = requestedName;
        while (!isAvailable(possibleName)) {
            possibleName = requestedName + num;
            num++;
        }
        username = possibleName;
    }

    public String getShortenedName() {
        String shortName = username;
        int hyphen = shortName.indexOf("-");
        while (hyphen > 0) {
<<<<<<< HEAD
            shortName = shortName.substring(0, hyphen - 1) + shortName.substring(hyphen + 1);
            hyphen = shortName.indexOf("-");
=======
            shortName = shortName.substring(0, hyphen - 1) + shortName.substring (hyphen + 1);
>>>>>>> 93fca4a5410bbc729131acf5bb395dbf418fadb0
        }
        return shortName;
    }
    public static boolean isAvailable(String str) throws FileNotFoundException {
        File f = new File("usernames.txt");
        java.util.Scanner s = new Scanner(f);
        while (s.hasNextLine()) {
            if (s.nextLine().equals(str))
                return false;
        }
        return true;
    }
    
}