// package 605-Can Place Flowers;

public class flowerPlacer {

    public static boolean isZero(int n) {
        if (n == 0) {
            return true;
        }
        return false;
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int flower = 0;

        for (int i = 0; i < len; i++) {
            if (len == 1) {
                if (flowerPlacer.isZero(flowerbed[i])) {
                    flower++;
                }
            } else if (i == 0) {
                if (flowerPlacer.isZero(flowerbed[i]) && flowerPlacer.isZero(flowerbed[i + 1])) {
                    flower++;
                    i = i + 1;
                }
            } else if (i == (len - 1)) {
                if (flowerPlacer.isZero(flowerbed[i - 1]) && flowerPlacer.isZero(flowerbed[i])) {
                    flower++;
                }
            } else if (i > 1) {
                if (flowerPlacer.isZero(flowerbed[i - 1]) && flowerPlacer.isZero(flowerbed[i])
                        && flowerPlacer.isZero(flowerbed[i + 1])) {
                    flower++;
                    i = i + 1;
                }
            }
        }
        if (n <= flower) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] flowerbeds = { 0, 0 };
        System.out.println(flowerPlacer.canPlaceFlowers(flowerbeds, 2));

    }
}
