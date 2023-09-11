public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int num = 100;
        while(num > 0){
            steps+=1;
            if(num % 2 == 0){
                num = num/2;
            }
            else{
                num-=1;
            }
        }
        System.out.print(steps);
    }
}
