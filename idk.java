import java.util.Scanner;

public class idk {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a name:: ");
        String a = sc.nextLine();

        int count = 0;

        for(int i=0; i<a.length();i++){
            if(Character.isLetter(a.charAt(i))){
                count++;
            }
        }
        System.out.println(a);
        for (int j=0;j<count;j++){
            if(Character.isLetter(a.charAt(j))){
                System.out.println(a.charAt(j));
            }
        }

    }

    
}
