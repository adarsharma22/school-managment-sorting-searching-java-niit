## Challenge Statement: Oak Bridge School Management System

**Educational institutions are burdened by cumbersome paperwork and manual processes, and they find it difficult to maintain records of the students’ results, their attendance reports, etc. The management and teachers of the Oak Bridge School have conducted exams for their high school students and the evaluation of the answer scripts has also been completed. The teachers with the help of a technical team need to put a system in place to automate the grading process. Teams are formed and each team is assigned a task.**

1. Evaluation and Grading Team:
   
   This team needs to evaluate the results and grades of the students. In order to do this, the below calculations need to be made on the data entered.
- Calculate the total marks of each student and store them in an array.
- Find the total average marks of the students in the class.
- Find the average marks of the students in the class in each subject and store them.

**Sample Input :**

      String [] studentNames = new String[]{"Abe", "Gary", "Chloe", "Dave", "Fara", "Harry", "Ira", "Jack", "Jim", "Joel", "Kevin", "Larry", "Levin", "Malcolm", "Navya", "Nathan", "Noel", "Oliver", "Pamela", "Randall"};
      int [] rollNo = new int[]{101, 104, 102, 103, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120};
      int [] mathMarks = new int[]{95, 30, 55, 67, 88, 90, 45, 100, 95, 89, 66, 55, 35, 90, 22, 12, 67, 80, 75, 80};
      int [] scienceMarks = new int[]{95, 30, 55, 67, 83, 90, 54, 100, 95, 89, 66, 55, 35, 90, 22, 19, 67, 80, 75, 80};
      int [] englishMarks = new int[]{98, 45, 65, 67, 87, 96, 45, 98, 95, 89, 66, 55, 35, 90, 34, 18, 68, 81, 76, 81};
      int [] languageMarks = new int[]{95, 55, 76, 68, 89, 90, 44, 99, 95, 89, 66, 55, 35, 90, 44, 10, 69, 82, 77, 82};
      int [] socialMarks = new int[]{95, 88, 44, 70, 81, 93, 36, 99, 95, 89, 66, 55, 35, 90, 23, 20, 70, 83, 78, 80};

**Expected Output :**

      Total Marks : {478, 248, 295, 339, 428, 459, 224, 496, 475, 445, 330, 275, 175, 450, 145, 79, 341, 406, 381, 403};
      Total Average : {95, 49, 59, 67, 85, 91, 44, 99, 95, 89, 66, 55, 35, 90, 29, 15, 68, 81, 76, 80};
      
      The average marks of students in Math : 66
      The average marks of students in Science: 67
      The average marks of students in Language: 70
      The average marks of students in Social: 69
      The average marks of students in English: 69

2. Report Generation Team: 
   
   This team has to find the top scorer of the exam and also the students who have failed and passed the exam.

- Find the top scorer in the class and display the student name
- Find the students who have cleared the examination  
- Find the students who have failed in a subject and have to reappear for the exam
- The mark of a student in a subject must be in the range of 0 to 100. Ensure that the mark is not a negative number and does not exceed 100.
- A student must score a minimum of 35 marks to clear a subject

**Sample Input:**
      
**Sample Input to find topscorer :** 

      The name list of students :"Abe", "Dave", "Fara", "Harry", "Ira", "Jack", "Jim", "Joel", "Kevin", "Larry","Noel", "Oliver", "Pamela", "Randall"
      Total Marks : {478, 248, 295, 339, 428, 459, 224, 496, 475, 445, 330, 275, 175, 450, 145, 79, 341, 406, 381, 403};

**Sample Input to find students who have cleared or failed the exam:**

      The name list of students :"Abe", "Dave", "Fara", "Harry", "Ira", "Jack", "Jim", "Joel", "Kevin", "Larry","Noel", "Oliver", "Pamela", "Randall"
      int [] math = new int[]{95, 30, 55, 67, 88, 90, 45, 100, 95, 89, 66, 55, 35, 90, 22, 12, 67, 80, 75, 80};
      int [] science = new int[]{95, 30, 55, 67, 83, 90, 54, 100, 95, 89, 66, 55, 35, 90, 22, 19, 67, 80, 75, 80};
      int [] english = new int[]{98, 45, 65, 67, 87, 96, 45, 98, 95, 89, 66, 55, 35, 90, 34, 18, 68, 81, 76, 81};
      int [] language = new int[]{95, 55, 76, 68, 89, 90, 44, 99, 95, 89, 66, 55, 35, 90, 44, 10, 69, 82, 77, 82};
      int [] social = new int[]{95, 88, 44, 70, 81, 93, 36, 99, 95, 89, 66, 55, 35, 90, 23, 20, 70, 83, 78, 80};
 
**Expected Output:**
   
      The top Scorer in the class is Jack
      The list of students who have cleared the exam : "Abe", "Dave", "Fara", "Harry", "Ira", "Jack", "Jim", "Joel", "Kevin", "Larry","Noel", "Oliver", "Pamela", "Randall"
      The list of students who need to reappear for the exam : Levin, Malcolm, Chloe

3. Survey and Statistics Team: 
   
   The school conducts a statistical survey to determine the pass percentage and performance of the students. This team builds the necessary statistics for the same.
- Generate the grades for each student, and 
- display the roll numbers of the students on the class board in ascending order of the total marks scored in the exam.

Note :- The grade calculation must follow the below criteria
  
      if marks is >= 90 the grade is 'A'
      if marks is >= 80 and <=89 the grade is 'B'
      if marks is  >= 70 and <= 79 the grade is 'C'
      if marks is >= 60  and <=69) the grade is 'D'
      if marks is >= 50  and  <=59) the grade is 'E'
      or else if marks is < 50 the grade is 'F'

**Sample Input:**
      
         Roll Numbers : 114, 118, 109, 112, 121
         Average marks to calculate grades : 94,98, 78, 90, 79
         The total marks to be sorted : 478, 496, 358, 450, 398
   
**Expected Output:**

   The grades of each student are :
   
            
            Roll No  Grade
            --------------
            118      A
            114      A
            109      C
            112      A
            121      C


   The sorted list of students based on the total marks :

         Roll No  Total Marks
         --------------------
         109      358
         121      398
         112      450
         114      478
         118      496

