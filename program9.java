
 class Grade {
    public static void main(String[] args) {
        int sub1 = 10;
        int sub2 = 20;
        int sub3 = 30;
        int sub4 = 10;
        int sub5 = 20;

        int totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;

        int grade;
        
        if (totalMarks >= 90 && totalMarks <= 100) {
            grade = 1;
        } else if (totalMarks >= 60 && totalMarks < 90) {
            grade = 2;
        } else {
            grade = -1; 
        }

        switch (grade) {
            case 1:
                System.out.println("First class with distinction");
                break;
            case 2:
                System.out.println("Second class");
                break;
            default:
                System.out.println("Fail or Invalid Input");
                break;
        }
    }
}
	                                           		
