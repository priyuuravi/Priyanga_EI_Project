public interface ResumeBuilder {
    void setName(String name);
    void setEmail(String email);
    void setPhone(String phone);
    void setExperience(String experience);
    void setEducation(String education);
    void setSkills(String skills);
    Resume build();
}
