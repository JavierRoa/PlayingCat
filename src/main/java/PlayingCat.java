public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }
    private static boolean isCatPlaying(boolean summer, int temperature) {
        // Primera condición:(es verano y la temperatura está entre 35 y 45?)
        // Segunda condición: (NO es veran y la temperatura está entre 25 y 35?)
        return (summer && (temperature>=35 && temperature<=45) ||
                (!summer && (temperature>=25 && temperature<=35)));
    }
}
