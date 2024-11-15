package entities;

public class Student {
    public double note1;
    public double note2;
    public double note3;

    public double average() {
        return (note1 * 0.3) + (note2 * 0.35) + (note3 * 0.35);
    }

    public String approvalStatus() {
        if (average() >= 60.0) {
            return "PASS";
        } else {
            return "FAILED. MISSING " + String.format("%.2f", 60.0 - average()) + " POINTS";
        }
    }
}
