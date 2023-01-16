package com.jap.marksevaluation;

public class OakBridgeSchool
{
    // This function takes as input the marks of all subjects and returns a total marks of each of the students
    public int[] calculateTotalMarks(int [] math,int science[], int[] english, int[] language,int[] social)
    {int[] totalMarks=new int[math.length];
        for (int i=0;i<math.length;i++)
        {
            totalMarks[i]=math[i]+science[i]+english[i]+language[i]+social[i];
        }
        return totalMarks;
    }
    // This function takes as input the total marks of each student and return
    // the average total marks of each student
    public int[] calculateAverageTotalMarks(int[] totalMarks)
    {int[] averagetotalmarks=new int[totalMarks.length];

        for(int i=0;i< totalMarks.length;i++)
        {
            averagetotalmarks[i]=totalMarks[i]/5;
        }
        return averagetotalmarks;
    }
    // This function takes as input the math marks and returns the average score by all students
    public int calculateAverageMathMarks (int[] math)
    { int averagemath=0,sum=0;
        for (int i=0;i<math.length;i++)
        {
            sum=sum+math[i];
        }averagemath=sum/math.length;
       return averagemath;
    }
    // This function takes as input the science marks and returns the average score by all students
    public int calculateAverageScienceMarks (int[] science)
    {int averagescience=0,sum=0;
        for (int i=0;i<science.length;i++)
        {
           sum=sum+science[i];
        }averagescience=sum/science.length;
        return averagescience;
    }
    // This function takes as input the social marks and returns the average score by all students
    public int calculateAverageSocialMarks (int[] social)
    {int averagesocial=0,sum=0;
        for (int i=0;i<social.length;i++)
        {
            sum=sum+social[i];
        }averagesocial=sum/social.length;
        return averagesocial;
    }
    // This function takes as input the language marks and returns the average score by all students
    public int calculateAverageLanguageMarks (int[] language)
    {int averagelanguage=0,sum=0;
        for (int i=0;i<language.length;i++)
        {
            sum=sum+language[i];
        }averagelanguage=sum/language.length;
        return averagelanguage;
    }
    // This function takes as input the english marks and returns the average score by all students
    public int calculateAverageEnglishMarks (int[] english)
    {int averageenglish=0,sum=0;
        for (int i=0;i<english.length;i++)
        {
            sum=sum+english[i];
        }averageenglish=sum/english.length;
       return averageenglish;
    }
    // This function takes as input the total marks of each student and the student names
    // and returns the name os the top scorer
    public String findTopScorer(int[] totalMarks,String [] studentNames)
    {
        int highest=0;
        String highscorer="abc";
        for (int i=0;i< totalMarks.length;i++)
        {
            if (highest<totalMarks[i])
            {highest=totalMarks[i];}
        }
        for (int i=0;i< studentNames.length;i++)
        {
            if (totalMarks[i]==highest)
            {highscorer=studentNames[i];}
        }
        //return the name of  the top scorer , extract the name from the studentNames array
        return highscorer;
    }
    // This function takes as input all the marks in subjects and returns
    // as an array of 1 and 0 the passed and failed student status
    // 1 - pass
    // 0 - fail
    public int[] isPassed(int [] math,int science[], int[] social, int[] language,int[] english)
    {int[] passFailStatus=new int[science.length];
        for(int i=0;i<math.length;i++)
    {
        if ((math[i]>=35) && (science[i]>=35) && (social[i]>=35) && (language[i]>=35) && (english[i]>=35) )
        {
            passFailStatus[i]=1;
        }else passFailStatus[i]=0;
    }
        return passFailStatus;
    }
    // This function takes as input the pass fail status array and student names
    // and returns the names of failed students who need to re appear for the exam
    public String[] listOfStudentsToReAppearForExam(int [] passFailStatus,String studentNames[])
    {         int j=0,count=0;
        for (int i=0;i< passFailStatus.length;i++)
        {
            if (passFailStatus[i]==0)
            {
                count=count+1;
            }
        }
        String[] listofFail= new String[count];
        for (int i=0;i< passFailStatus.length;i++)
        {
            if (passFailStatus[i]==0)
            {
               listofFail[j]=studentNames[i];
               j++;
            }

        }
        return listofFail;
    }
    // This function takes as input the pass fail status array and student names
    // and returns the names of passed students

    public String[] listOfStudentsPassedTheExam(int [] studentIndex,String studentNames[])
    {       int j=0,count=0;
        for (int i=0;i< studentIndex.length;i++)
        {
            if (studentIndex[i]==1)
            {
                count=count+1;
            }
        }
        String[] listofpass= new String[count];
        for (int i=0;i< studentIndex.length;i++)
        {
            if (studentIndex[i]==1)
            {
                listofpass[j]=studentNames[i];
                j++;
            }

        }
        return listofpass;
    }
    // This function takes as input the average total marks of students
    // and returns the grade accordingly

    public char[] generateGrades(int [] averageTotalMarks)
    { char[] grade=new char[averageTotalMarks.length];
        for (int i=0;i<averageTotalMarks.length;i++)
        {
            if (averageTotalMarks[i]>=90)
            {grade[i]='A';}
           else if (averageTotalMarks[i] >= 80 && averageTotalMarks[i] <=89)
            {grade[i]='B';}
            else if (averageTotalMarks[i]>= 70 && averageTotalMarks[i] <= 79)
            {grade[i]='C';}
            else if (averageTotalMarks[i]>= 60 && averageTotalMarks[i]<= 69)
            {grade[i]='D';}
           else if (averageTotalMarks[i]>= 50 && averageTotalMarks[i]<= 59)
            {grade[i]='E';}
           else  if (averageTotalMarks[i]<50)
            {grade[i]='F';}
        }
        return grade;
    }

    //This function takes the total marks of students and roll numbers abd returns the roll nos
    // in sorted order of total marks from smallest score to highest score

    public int[] sortByTotalMarks(int[] totalMarks,int [] rollNos)
    {
        int n = totalMarks.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (totalMarks[j] > totalMarks[j + 1]) {
                    int temp = totalMarks[j];
                    totalMarks[j] = totalMarks[j + 1];
                    totalMarks[j + 1] = temp;


                    int count = rollNos[j];
                    rollNos[j] = rollNos[j + 1];
                    rollNos[j + 1] = count;

                }
        System.out.println("The sorted list of Total marks : ");
        System.out.println("Roll no."+"    TotalMarks");
        System.out.println("---------------------");
            for (int i=0;i< totalMarks.length;i++)
            {
                System.out.print(rollNos[i]+"       ");
                System.out.println(totalMarks[i]);
            }

        return rollNos;
    }

    public static void main(String[] args) {
        String [] studentNames = new String[]{"Abe", "Gary", "Chloe", "Dave", "Fara", "Harry", "Ira", "Jack", "Jim", "Joel", "Kevin", "Larry", "Levin", "Malcolm", "Navya", "Nathan", "Noel", "Oliver", "Pamela", "Randall"};
        int [] rollNo = new int[]{101, 104, 102, 103, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120};
        int [] mathMarks = new int[]{95, 30, 55, 67, 88, 90, 45, 100, 95, 89, 66, 55, 35, 90, 22, 12, 67, 80, 75, 80};
        int [] scienceMarks = new int[]{95, 30, 55, 67, 83, 90, 54, 100, 95, 89, 66, 55, 35, 90, 22, 19, 67, 80, 75, 80};
        int [] englishMarks = new int[]{98, 45, 65, 67, 87, 96, 45, 98, 95, 89, 66, 55, 35, 90, 34, 18, 68, 81, 76, 81};
        int [] languageMarks = new int[]{95, 55, 76, 68, 89, 90, 44, 99, 95, 89, 66, 55, 35, 90, 44, 10, 69, 82, 77, 82};
        int [] socialMarks = new int[]{95, 88, 44, 70, 81, 93, 36, 99, 95, 89, 66, 55, 35, 90, 23, 20, 70, 83, 78, 80};

        OakBridgeSchool total=new OakBridgeSchool();
        int [] totalresult=total.calculateTotalMarks(mathMarks,scienceMarks, englishMarks,  languageMarks, socialMarks);
        System.out.println("Total Marks of Student is: ");
        for(int a:totalresult)
        {

            System.out.print(a+" ");
        }
        System.out.println("");
        int [] totalaverage=total.calculateAverageTotalMarks(totalresult);
        System.out.println("Total Average Marks of Student is: ");
        for(int a:totalaverage)
        {

            System.out.print(a+" ");
        }
        System.out.println("");

        System.out.print("The average marks of students in Math : ");
        System.out.println(total.calculateAverageMathMarks(mathMarks));
        System.out.print("The average marks of students in Science :");
        System.out.println(total.calculateAverageScienceMarks(scienceMarks));
        System.out.print("The average marks of students in language :");
        System.out.println(total.calculateAverageLanguageMarks(languageMarks));
        System.out.print("The average marks of students in Social :");
        System.out.println(total.calculateAverageSocialMarks(socialMarks));
        System.out.print("The average marks of students in English :");
        System.out.println(total.calculateAverageEnglishMarks(englishMarks));
        System.out.println("---------------------------------------------");
        System.out.print(" The top Scorer in the class is ");
        System.out.println(total.findTopScorer(totalresult,studentNames));
        int[] passfail=total.isPassed(mathMarks,scienceMarks,socialMarks,languageMarks,englishMarks);

        String[] pass=total.listOfStudentsPassedTheExam(passfail,studentNames);
        System.out.print( "The list of students who have cleared the exam : ");
        for (String a:pass)
        {
            System.out.print(a+",  ");
        }
        System.out.println("");

        String[] fail=total.listOfStudentsToReAppearForExam(passfail,studentNames);
        System.out.print("The list of students who need to reappear for the exam : ");
        for(String a:fail)
        {
            System.out.print(a+",  ");
        }
        System.out.println("");
        char[] grade=total.generateGrades(totalaverage);

        System.out.println("The grades of each student are : ");
        System.out.println("Roll no."+"    GRADE");
        System.out.println("---------------------");
        for (int i=0;i< rollNo.length;i++)
        {
            System.out.print(rollNo[i]+"         ");
            System.out.println(grade[i]);
        }
        total.sortByTotalMarks(totalresult,rollNo);
    }
}
