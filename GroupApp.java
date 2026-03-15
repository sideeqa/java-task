import java.util.Scanner;

public class GroupApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = input.nextInt();
        input.nextLine();

        String[] names = new String[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter name: ");
            names[i] = input.nextLine();
        }

        System.out.print("Enter number of groups: ");
        int groups = input.nextInt();

        int index = 0;

        for(int g = 1; g <= groups; g++){
            System.out.println("Group " + g + ":");

            for(int j = index; j < n; j += groups){
                System.out.println(names[j]);
            }
        }
    }
}
