import java.util.Scanner;

class Next {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num % 2 == 0){
            System.out.println(num+2);
        } else{
            System.out.println(num+1);
        }
    }
}
