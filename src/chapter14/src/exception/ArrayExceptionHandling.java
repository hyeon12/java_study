package exception;

public class ArrayExceptionHandling {
    public static void main(String[] args) {
        int[] arr = new int[5];

        try{
            for(int i = 0; i <= 5; i++){
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
}
