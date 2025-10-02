public class Course implements Cloneable {
    private String courseName;
    private String instructor;
    private int duration; // in hours
    private double price;

    public Course(String courseName, String instructor, int duration, double price) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.duration = duration;
        this.price = price;
    }

    // Clone method for prototype pattern
    @Override
    public Course clone() {
        try {
            return (Course) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Course: " + courseName + ", Instructor: " + instructor + ", Duration: " + duration + " hours, Price: $" + price;
    }

    // Getters and setters if needed
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
