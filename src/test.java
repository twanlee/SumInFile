import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Enter your path source: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        SumInFile readFile = new SumInFile();
        readFile.readFileText(path);
    }
}
