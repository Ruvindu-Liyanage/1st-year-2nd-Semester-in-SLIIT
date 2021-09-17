package Models;

public class Bicycle {

    private int Gear;
    private float Speed;

    public Bicycle(int Gear, float Speed) {

        this.Speed = Speed;
        this.Gear = Gear;
    }

    public void applyBrakes(double decrement) {
        this.Speed -= decrement;
    }

    public void speedup(double increment) {
        this.Speed += increment;
    }

    @Override
    public String toString() {
        return " Current Speed is " + this.Speed + " & Gear is " + this.Gear;
    }
}
