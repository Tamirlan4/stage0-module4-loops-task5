package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int number = height;
        int count = -2;
        for (int i = 0; i < height; i++) {
            if (number <= 0){
                count = 2;
                number+=count;
                if(number == 1){
                    number++;
                }
                for (int n = 0; n < height; n++) {
                    if ((height - number) / 2 <= n && height - (height - number) / 2 - 1 >= n){
                        System.out.print("8");
                    }else {
                        System.out.print(" ");
                    }
                }
            }else {
                for (int j = 0; j < height; j++) {
                    if ((height - number) / 2 <= j && height - (height - number) / 2 - 1 >= j){
                        System.out.print("8");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            number += count;
            System.out.println();
        }
    }
}
