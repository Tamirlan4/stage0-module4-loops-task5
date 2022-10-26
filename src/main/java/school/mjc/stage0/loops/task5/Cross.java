package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            if( i+ 1 == sideLength % 2 + sideLength / 2){
                for (int j = 0; j < sideLength; j++) {
                    System.out.print("8");
                }
                System.out.println();
                continue;
            }
            for (int j = 0; j < sideLength; j++) {
                if (sideLength % 2 + sideLength / 2 == j + 1){
                    System.out.print("8");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
