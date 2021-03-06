import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Day28_RegexPatternsAndIntroToDatabase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        // create list
        ArrayList<String> names = new ArrayList<String>();
        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
                String firstName = firstMultipleInput[0];
                String emailID = firstMultipleInput[1];
                //if the email ends in "@gmail.com", add firstname to list.
                if(emailID.matches("^.*@gmail.com$")) {
                    names.add(firstName);
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        // sort list
        Collections.sort(names);
        // output list
        for(String name : names){
            System.out.println(name);
        }
        bufferedReader.close();
    }
}
