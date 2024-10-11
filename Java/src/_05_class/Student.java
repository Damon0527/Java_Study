package _05_class;

// 클래스
// - 객체지향 프로그래밍의 기초
// - "클래스"를 통해 "인스턴스"를 생성

// (공개) 클래스 선언
public class Student {

    // 필드
    public String name;
    public int grade;

    // 생성자
    // - 객체가 생성될 때 자동으로 호출되는 특별한 종류의 메서드
    public Student(String name, int grade) {
        // this란? "자기자신"을 의미
        // this.name, this.grade: 현재 인스턴스의 name, grade 필드를 의미.
        // 멤버 변수와 생성자의 매개변수 이름이 동일하다면 this를 이용해 구분
        this.name = name;
        this.grade = grade;
    }

    // this 를 안쓰는 생성자
//    public Student(String n, int g) {
//        name = n;
//        grade = g;
//    }

    // 메소드
    // 1) 인자 x, 반환값 x
    public void goToSchool() {
        System.out.println(this.name + "가(이) 학교에 가다");

    }
    // 2) 인자 o, 반환값 x
    public void  study(String subject) {
        System.out.println(this.name + "가(이)" + subject + " 과목을 공부한다! ");
    }

    // 3) 인자 x, 반환값 o
    public int getGrade() {
        return this.grade;
    }

    // 4) 인자 o, 반환값 o
    public String getTestResult(int score) {
        return this.name + "학생의 점수" + score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}


