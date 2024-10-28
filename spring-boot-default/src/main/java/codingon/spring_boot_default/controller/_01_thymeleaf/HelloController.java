package codingon.spring_boot_default.controller._01_thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// @Controller
// - Spring MVC 에 Controller 클래스로 인식되어 Spring MVC 가 제공하는 다양한 어노테이션 사용.
@Controller
public class HelloController {
    // 클라이언트 요청에 대한 처리를 각 메서드에서 작성

    //@GetMapping 노테이션
    // - GET 요청에 대한 URL을 매핑
    // GET localhost:PORT/hi
    @GetMapping("/hi")
    public String getHi(Model model) {
        // Model model
        // - Spring MVC 가 제공하는 타입 (View 에 값을 전달하는 상자 역할, MVC 의 Model 을 의미.)
        // - View 에서 참조할 수 있는 객체 저장.
        // - Controller 클래스의 메서드가 파라미터로 받을 수 있는 객체

        // View 에 값을 전달하기 위해 model 상자에 데이터(속성-값) 추가.
        model.addAttribute("msg", "Hi~");

        // 템플릿 파일명 반환
        // src/resources/templates/_01_thymeleaf/hi.html 을 반환.
        return "_01_thymeleaf/hi";
    }
}
