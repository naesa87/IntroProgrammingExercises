package exercises;

public class TriangleExercises {

    public static void main(String[] args) {
        TriangleExercises triangleExercise = new TriangleExercises();
        triangleExercise.easiestExerciseEver();
        triangleExercise.drawSeparator();
        triangleExercise.drawHorizontalLine(8);
        triangleExercise.drawSeparator();
        triangleExercise.drawVerticalLine(3);
        triangleExercise.drawSeparator();
        triangleExercise.drawRightTriangle(3);
        triangleExercise.drawSeparator();
    }

    public void easiestExerciseEver(){
        System.out.println("*");
    }

    public void drawHorizontalLine(int number){
        StringBuilder line = new StringBuilder();
        for (int i=0; i < number; i++){
            line.append("*");
        }
        System.out.println(line);
    }

    public void drawVerticalLine(int number){
        for (int i=0; i < number; i++){
            System.out.println("*");
        }
    }

    public void drawRightTriangle(int number){
        for (int i=0; i < number; i++){
            StringBuilder line = new StringBuilder();
            for  (int j=0; j <= i; j++){
                line.append("*");
            }
            System.out.println(line);
        }
    }

    public void drawSeparator(){
        System.out.println(" ------------------------------------- ");
    }
}

