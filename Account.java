import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Account {
    private String username;
    public String getUsername() {
        return username;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Account a = new Account("Zyis-Wiscovitch");
        System.out.println(a.getUsername());
        a= new Account("PSmith");
        System.out.println(a.getUsername());
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
            
        }

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
