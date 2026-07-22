public class StudentMarksFixed {
    public static void main(String[] args) {
        try {
            int marks = Integer.parseInt("xyz");
            int bonusMarks = 10;
            int total = marks + bonusMarks;

            System.out.println("Total Marks: " + total);
        } catch (NumberFormatException e) {
            System.out.println("Invalid marks entered. Please enter a number.");
            System.out.println("Using default marks: 50");

            int total = 50 + 10;
            System.out.println("Total Marks: " + total);
        }

        System.out.println("Result calculated successfully.");
    }
}