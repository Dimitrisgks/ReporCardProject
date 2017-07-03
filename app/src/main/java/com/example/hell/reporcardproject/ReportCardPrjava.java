
package com.example.hell.reporcardproject;
/**
 * Created by Hell on 7/3/2017.
 */

public class ReportCardPrjava {




    private int subjects = 8;


    public String Undefined = "Undefined Grade";


    public static final String Grade_A = "Perfect";

    public static final String Grade_B = "Great";

    public static final String Grade_C = "Good";

    public static final String Grade_D = "Borderline Pass";

    public static final String Grade_E = "Borderline Fail";

    public static final String Grade_F = "Bad" ;

    private String Results;

    private String studentName;
    private int studentID;
    private int studentSemester;


    private String gradeMathematics;
    private String gradeDigitalDesign;
    private String gradeEnglish;
    private String gradeDataStructure;
    private String gradeScience;
    private String gradeRealAnalysis;
    private String gradeComputerArchitecture;
    private String gradeProceduralProgramming;



    public ReportCardPrjava(String studentName, int studentID, int studentSemester, String gradeMathematics, String gradeDigitalDesign, String gradeEnglish, String gradeDataStructure, String gradeScience, String gradeRealAnalysis, String gradeComputerArchitectur,String gradeProceduralProgramming)
    {
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentSemester = studentSemester;
        this.gradeMathematics = Undefined;
        this.gradeDigitalDesign = Undefined;
        this.gradeEnglish = Undefined;
        this.gradeDataStructure = Undefined;
        this.gradeScience = Undefined;
        this.gradeRealAnalysis = Undefined;
        this.gradeComputerArchitecture = Undefined;
        this.gradeProceduralProgramming=Undefined;
    }





    public String getstudentName()
    {
        return studentName;
    }
    public int getstudentSemester()
    {
        return studentSemester;
    }
    public int getstudentID()
    {
        return studentID;
    }
    public String getgradeMathematics()
    {
        return gradeMathematics;
    }
    public String getgradeDigitalDesign()
    {
        return gradeDigitalDesign;
    }
    public String getgradeEnglish()
    {
        return gradeEnglish;
    }
    public String getgradeDataStructure()
    {
        return gradeDataStructure;
    }
    public String getgradeScience()
    {
        return gradeScience;
    }
    public String getgradeRealAnalysis()
    {
        return gradeRealAnalysis;
    }
    public String getgradeComputerArchitecture()
    {
        return gradeComputerArchitecture;
    }
    public String getgradeProceduralProgramming()
    {
        return gradeProceduralProgramming;
    }
//

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }
    public void setStudentID(int studentID)
    {
        this.studentID = studentID;
    }
    public void setStudentSenester(int studentSemester)
    {
        this.studentSemester = studentSemester;
    }


    public void setGradeMathematics(String gradeMathematics)
    {
        this.gradeMathematics = gradeMathematics;
    }
    public void setGradeDigitalDesign(String gradeDigitalDesign)
    {
        this.gradeDigitalDesign = gradeDigitalDesign;
    }
    public void setGradeEnglish(String gradeEnglish)
    {
        this.gradeEnglish = gradeEnglish;
    }
    public void setGradeDataStructure(String gradeDataStructure)
    {
        this.gradeDataStructure = gradeDataStructure;
    }
    public void setGradeScience(String gradeScience)
    {
        this.gradeScience = gradeScience;
    }
    public void setGradeRealAnalysis(String gradeRealAnalysis)
    {
        this.gradeRealAnalysis = gradeRealAnalysis;
    }
    public void setGradeComputerArchitecture(String gradeComputerArchitecture)
    {
        this.gradeComputerArchitecture = gradeComputerArchitecture;
    }

    public void setGradeProceduralProgramming(String gradeProceduralProgramming)
    {
        this.gradeProceduralProgramming = gradeProceduralProgramming;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Student Name: ");
        builder.append(studentName);
        builder.append("Student ID: ");
        builder.append(studentID);
        builder.append("Student Semester: ");
        builder.append(studentSemester);
        builder.append("Mathematics Grade: ");
        builder.append(gradeMathematics);
        builder.append("DigitalDesign Grade: ");
        builder.append(gradeDigitalDesign);
        builder.append("English Grade: ");
        builder.append(gradeEnglish);
        builder.append("DataStructure Grade: ");
        builder.append(gradeDataStructure);
        builder.append("Science Grade: ");
        builder.append(gradeScience);
        builder.append("RealAnalysis Grade: ");
        builder.append(gradeRealAnalysis);
        builder.append("ComputerArchitecture Grade: ");
        builder.append(gradeComputerArchitecture);
        builder.append("ProceduralProgramming Grade: ");
        builder.append(gradeProceduralProgramming);
        return builder.toString();
    }
}
