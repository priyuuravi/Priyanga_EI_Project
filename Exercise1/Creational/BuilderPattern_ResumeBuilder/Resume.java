public class Resume {
    private String name;
    private String email;
    private String phone;
    private String experience;
    private String education;
    private String skills;

    public Resume(String name, String email, String phone, String experience, String education, String skills) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.experience = experience;
        this.education = education;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Resume:\nName: " + name + "\nEmail: " + email + "\nPhone: " + phone +
               "\nExperience: " + experience + "\nEducation: " + education + "\nSkills: " + skills;
    }
}
