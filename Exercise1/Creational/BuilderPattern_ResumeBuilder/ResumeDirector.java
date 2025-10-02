public class ResumeDirector {
    private ResumeBuilder builder;

    public ResumeDirector(ResumeBuilder builder) {
        this.builder = builder;
    }

    public void constructResume(String name, String email, String phone, String experience, String education, String skills) {
        builder.setName(name);
        builder.setEmail(email);
        builder.setPhone(phone);
        builder.setExperience(experience);
        builder.setEducation(education);
        builder.setSkills(skills);
    }

    public Resume getResume() {
        return builder.build();
    }
}
