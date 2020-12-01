public class Students {
    private String firstName;
    private String lastName;
    private int year;
    private char gender;
    private double mark;

    public Students(String s) {
        String[] split = s.split(",");
        firstName = split[0];
        lastName = split[1];
        year = Integer.parseInt(split[2]);
        gender = split[3].charAt(0);
        mark = Double.parseDouble(split[4]);

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fullName) {
        this.firstName = fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void printInfo() {
        String fullInfo = getFirstName() + " " + getLastName() + " " + getYear() + " " + getGender() + " " + getMark();
        System.out.println(fullInfo);
    }
    public double minMark(){
        return Math.min(getMark(),getMark());
    }


}
