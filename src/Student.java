public class Student {

    public String name;
    public int grade;
    public int score;

    public void increaseScore(int amount){
        if(amount > 0){
            if ( score + amount > 100) System.out.println("점수는 100을 초과할 수 없습니다.");
            else score += amount;
        }
        else System.out.println("0 보다 큰 값을 입력해야 합니다.");
    }

    public void printInfo(){
        System.out.println("이름 : " + this.name + " 학년 : " + this.grade + " 점수 : " + this.score);
    }

    public Student(){
        this("",1,0);
    }

    public Student(String name){
        this(name,1,0);
    }

    public Student(String name, int grade) {
        this(name,grade, 0);
    }

    public Student(String name, int grade, int score) {
        if(score < 0 || score > 100) {
            System.out.println("score 는 0 ~ 100 사이 정수 입니다. ");
            this.name = name;
            this.grade = grade;
            this.score = 0;
        }

        else {
            this.name = name;
            this.grade = grade;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("1번 학생");
        Student s3 = new Student("2번 학생", 4);
        Student s4 = new Student("3번 학생", 4, 80);

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
        s4.printInfo();

        Student s5 = new Student("4번 학생",4,200);

        s4.increaseScore(-1);
        s4.printInfo();
        s4.increaseScore(1);
        s4.printInfo();
        s4.increaseScore(100);
    }
}
