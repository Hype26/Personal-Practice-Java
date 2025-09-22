package MITOpenCourse;

public class FooCorporation {
    public static void basePayCalculator(double basePay, int hoursWorked) {

        double getPaid;
        if (basePay < 8 || hoursWorked > 60) {
            System.out.println("Error");
        }

        else {
            if (hoursWorked > 40) {
                int overTimeHours = hoursWorked - 40;
                getPaid = (basePay * (hoursWorked - overTimeHours) ) +
                        ( (1.5 * basePay) * overTimeHours);
            } else {
                getPaid = basePay * hoursWorked;
            }
            System.out.printf("Wage for this employee is: $%.2f %n", getPaid);
        }
    }

    public static void main(String[] arguments) {

        int[] timeWorked = {35, 47, 73};
        double[] salary = {7.5, 8.2, 10.0};

        for (int i = 0; i < timeWorked.length; i++) {
            basePayCalculator(salary[i], timeWorked[i]);
        }
    }
}
