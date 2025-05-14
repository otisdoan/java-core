public class TinhTong implements TinhToan {
    @Override
    public String printFunction() {
        return "Day la ham tinh tong";
    }

    @Override
    public int total(int a, int b) {
        return a + b;
    }
}
