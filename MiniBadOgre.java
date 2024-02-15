public class MiniBadOgre extends BadOgre{
    void revenge(Knight knight) {
        beat(knight);
    }
    void beat(Knight knight) {
        knight.energy = 1;
    }
}
