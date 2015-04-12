package exercises;


public class FizzBuzzExercise {
    public static void main(String[] args) {
        new FizzBuzzExercise().FizzBuzz();
    }

    public void FizzBuzz(){
        for (int i = 1; i <=100;i++){
            if (i%3==0 && i%5==0){
                print("FizzBuzz");
            }else if (i%3==0){
                print("Fizz");
            }else if (i%5==0){
                print("Buzz");
            }else{
                print(i+"");
            }

        }
    }

    private void print(String string){
        System.out.println(string);
    }
}
