public class DetailedResumeBuilder implements ResumeBuilder {
    private String name;
    private String email;
    private String phone;
    private String experience;
    private String education;
    private String skills;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public void setSkills(String skills) {
        this.skills = skills;
    }

    @Override
    public Resume build() {
        return new Resume(name, email, phone, experience, education, skills);
    }
}
