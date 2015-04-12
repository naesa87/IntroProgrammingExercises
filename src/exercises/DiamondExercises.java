package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class DiamondExercises {
    public static void main(String[] args) {
        DiamondExercises diamondExercise = new DiamondExercises();
        diamondExercise.drawIsoscelesTriangle(5);
        diamondExercise.drawDiamond(5);
        diamondExercise.drawDiamondWithName(5, "Naesa");
    }

    public void drawIsoscelesTriangle(int number){
        List<String> lines = getIsoscelesTriangleLines(number);
        for (String line: lines){
            System.out.println(line);
        }
    }

    public void drawDiamond(int number){
        List<String> lines = getIsoscelesTriangleLines(number);

        for(Iterator<String> starLines = lines.iterator(); starLines.hasNext(); ) {
            System.out.println( starLines.next());
        }

        for (ListIterator starLinesBackwards = lines.listIterator(lines.size()-1); starLinesBackwards.hasPrevious();){
            System.out.println(starLinesBackwards.previous());
        }
    }

    public void drawDiamondWithName(int number, String name){
        List<String> lines = getIsoscelesTriangleLines(number);
        lines.remove(lines.size()-1);
        for(Iterator<String> starLines = lines.iterator(); starLines.hasNext(); ) {
            System.out.println( starLines.next());
        }
        System.out.println(name);
        for (ListIterator starLinesBackwards = lines.listIterator(lines.size()); starLinesBackwards.hasPrevious();){
            System.out.println(starLinesBackwards.previous());
        }
    }

    private List<String> getIsoscelesTriangleLines(int number) {
        List<String> lines = new ArrayList<>();
        int totalStarsInWidestRow = (2*number)-1;

        for(int i=1; i<=number;i++){
            int numOfStarsInCurrentRow = (2*i)-1;

            String spaces = getSpacesBeforeAndAfterStars(totalStarsInWidestRow, numOfStarsInCurrentRow);
            String line = buildStarLine(numOfStarsInCurrentRow, spaces);
            lines.add(line);
        }
        return lines;
    }

    private String buildStarLine(int numOfStarsInCurrentRow, String spaces) {
        StringBuilder line = new StringBuilder();
        line.append(spaces);
        for (int j=0; j<numOfStarsInCurrentRow; j++){
            line.append("*");
        }
        line.append(spaces);
        return line.toString();
    }

    private String getSpacesBeforeAndAfterStars(int totalStarsInBottomRow, int numOfStarsInCurrentRow) {
        int numOfSpacesBeforeAndAfter = (totalStarsInBottomRow - numOfStarsInCurrentRow)/2 ;

        StringBuilder spacesBuilder = new StringBuilder();
        for (int j=0; j<numOfSpacesBeforeAndAfter; j++){
            spacesBuilder.append(" ");
        }
        return spacesBuilder.toString();
    }
}
