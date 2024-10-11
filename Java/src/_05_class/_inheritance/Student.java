package _05_class._inheritance;

//
public class Student extends Person {
    // case1. public 필드
    public String campus;

    public Student(String name, int age) {
        // 1-1 기본 생성자
////        super();  // 생략 가능 ( 컴파일 시 자동 추가 ) -> 부모 생성자 호출
//        System.out.println("자식 클래스 Student(String name, int age) 생성자 호출");
//
//        // 부모로부터 상속받은 필드 값 할당
//        this.name = name;
//        this.age = age;

        // 1-2 "매개변수를 갖는" 생성자
        super(name, age); // 부모한테 각각 인자 값을 넘겨줘야 하기 때문에 super 생략 불가능!
        System.out.println("자식 클래스 Student(String name, int age) 생성자 호출");
    }

    // 메서드
    public void setCampus(String campus) {
        this.campus = campus;
        System.out.println(campus + "캠퍼스에서 공부중!");
    }
}
