// Calculates False Positive Rate (FPR) given false positives and true negatives
public class Metrics {
    public static double calculateFPR(int falsePositives, int trueNegatives) {
        if (falsePositives + trueNegatives == 0) return 0;
        return (double) falsePositives / (falsePositives + trueNegatives);
    }

    public static void main(String[] args) {
        int fp = 5; // number of false positives
        int tn = 95; // number of true negatives
        double fpr = calculateFPR(fp, tn);
        System.out.println("FPR: " + fpr);
    }
}
