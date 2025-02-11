package com.capgemini.ai_driven_resume_screening_system_test;

import com.capgemini.ai_driven_resume_screening_system.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ResumeScreeningSystemTest {

    JobRole job1 = new SoftwareEngineerRole("Shamiksha", 10, "Software Engineer", 190000);
    Resume resumeList = new Resume();
    JobUtility utility = new JobUtility();

    @Test
    void ResumeScreeningTest(){
        resumeList.addResume(job1);
        assertEquals("Shamiksha", job1.getCandidateName());
    }
}
