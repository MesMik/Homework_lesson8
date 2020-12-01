public class ReadFiles {
    public static void main(String[] args) throws Exception {
        // Students student = new Students("Hayk,Arabyan,1998,m,77.5");
        // System.out.println(student.getMark());
        String[] read = FileService.read("C:\\Users\\Lenovo\\IdeaProjects\\Homework_lesson8\\src\\Students.txt");
        Students[] students = new Students[read.length];
        Students[] students1 = new Students[read.length];
        Students[] students2 = new Students[read.length];
        for (int i = 0; i < read.length; i++) {
            students[i] = new Students(read[i]);
            students1[i] = new Students(read[i]);
            students2[i] = new Students(read[i]);
        }


        for (int i = 0; i < students.length; i++) {
            students[i].printInfo();
        }

        System.out.println("Task 1: Print full names of students:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getFirstName() + " " + students[i].getLastName());
        }

        System.out.println("Task 2: Print all male students:");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender() == 'm') {
                System.out.println(students[i].getFirstName() + " " + students[i].getLastName());
            }
        }

        System.out.println("Task 3: Print all female students who has mark greater then 50.4:");
        for (Students student : students) {
            if (student.getMark() > 50.4 && student.getGender() == 'f') {
                System.out.println(student.getFirstName() + " " + student.getLastName());
            }
        }

        System.out.println("Task 4: Print student information having the minimal mark:");
        String minMarkS;
        int index_min = 0;
        for (int i = 0; i < students.length - 1; i++) {
            if (students1[i].getMark() > students1[i + 1].getMark()) {
                students1[i] = students1[i + 1];
                index_min = i;
            }

        }
        students1[index_min].printInfo();

        System.out.println("Task 5: Print biggest male student information:");

        int indexBig = 0;
        for (int i = 0; i < students.length - 1; i++) {
            if (students2[i].getGender() == 'm' && students2[i].getYear() > students2[i + 1].getYear()) {
                students2[indexBig] = students2[i];
                students2[i + 1] = students2[i];

            }
        }
        students2[indexBig].printInfo();

        System.out.println("Task 6: Print students sorted by mark:");
        int temp = 0;
        for (int i = students.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (students[j].getMark() > students[j + 1].getMark()) {
                    students[temp] = students[j];
                    students[j] = students[j + 1];

                }
            }
        }
        for (Students student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }

        System.out.println("Task 7: Print female students sorted by year:");
        int index_bigF = 0;
        for (int i = 0; i < students.length - 1; i++) {
            if (students[i].getGender() == 'f' && (students[i].getYear() > students[i + 1].getYear())) {
                students[i] = students[i + 1];
                index_bigF = i;
            }
        }
        System.out.println(students[index_bigF].getFirstName() + " " + students[index_bigF].getLastName());
        students[index_bigF].printInfo();


    }
}




