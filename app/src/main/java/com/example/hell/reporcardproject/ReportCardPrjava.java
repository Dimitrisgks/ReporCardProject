
package com.example.hell.reporcardproject;
// a report card with grades

public class ReportCardPrjava {


    //global constant that represents the number of lessons

    private int lessons = 8;

    // This is a global constant when there is no value on grade.
    public String Undefined = "Undefined Grade";

    // Constants for the grades
    public static final String Grade_A = "Perfect";

    public static final String Grade_B = "Great";

    public static final String Grade_C = "Good";

    public static final String Grade_D = "Borderline Pass";

    public static final String Grade_E = "Borderline Fail";

    public static final String Grade_F = "Bad" ;

    // Variables we gonna need for this like the student name etc
    private String studentName;
    private int studentID;
    private int studentSemester;

    //Grades for the lessons
    private String gradeMathematics;
    private String gradeDigitalDesign;
    private String gradeEnglish;
    private String gradeDataStructure;
    private String gradeScience;
    private String gradeRealAnalysis;
    private String gradeComputerArchitecture;
    private String gradeProceduralProgramming;

// here is the creation of the object report card which have most of the variables

    public ReportCardPrjava(String studentName, int studentID, int studentSemester, String gradeMathematics, String gradeDigitalDesign, String gradeEnglish, String gradeDataStructure, String gradeScience, String gradeRealAnalysis, String gradeComputerArchitectur,String gradeProceduralProgramming)
    {
        this.studentName = studentName;   // student name
        this.studentID = studentID;         //student id
        this.studentSemester = studentSemester; //the semester the student is currently at
        this.gradeMathematics = Undefined;   //grade for mathematics same goes for the other lessons
        this.gradeDigitalDesign = Undefined;
        this.gradeEnglish = Undefined;
        this.gradeDataStructure = Undefined;
        this.gradeScience = Undefined;
        this.gradeRealAnalysis = Undefined;
        this.gradeComputerArchitecture = Undefined;
        this.gradeProceduralProgramming=Undefined;
    }


//basically the place where we get the things we need studentname,studentid ,student semester and the grades for the lessons



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
//here is the place where we set the name for the students their id semster and their grades

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
    // Return of  the  object Report Card by using the toString method and a String Builder
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
