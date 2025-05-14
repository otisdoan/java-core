public class TinhHieu implements TinhToan {
    @Override
    public String printFunction() {
        return "Day la ham tinh hieu";
    }

    @Override
    public int total(int a, int b) {
        return a - b;
    }
}
