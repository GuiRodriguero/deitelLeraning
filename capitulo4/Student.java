package capitulo4;

public class Student {
    private String name;
    private double average;

    /*public Student(String name, double average){
        this.name = name;

        if(average > 0.0){
            if(average <= 10.0){
                this.average = average;
            }
        }
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        if(average > 0.0){
            if(average <= 10.0){
                this.average = average;
            }
        }
    }

    public String getLetterGrade(){
        String letterGrade = "";

        if(average >= 9.0){
            letterGrade = "A";
        } else if(average >= 8.0){
            letterGrade = "B";
        } else if(average >= 7.0){
            letterGrade = "C";
        } else if(average >= 6.0){
            letterGrade = "D";
        } else{
            letterGrade = "F";
        }
        return letterGrade;
    }
}
