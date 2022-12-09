package com.example.tobias_spring_project.Student;

import com.example.tobias_spring_project.Prices.Price;
import com.example.tobias_spring_project.Prices.PriceService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// husk at skrive http://localhost:8080/api/v1/student/ når du tester backend
@RestController
// husk cross origin er vigtig for at kunne hente fra databasen eller kan man ikke gøre det pga cors
@CrossOrigin
@RequestMapping("api/v1/student")
public class StudentController {

    private final StudentService studentService;

    // gør at denne function ved hvor den skal finde StudentService vha. autowired
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public List<Student> getStudents() {
        return StudentService.getStudents();
    }

    @GetMapping(path = "findStudentById/{studentId}")
    // pathvariable bruges til at definere en variabel i sit endpoint
    public Optional<Student> getStudentById(@PathVariable("studentId") Long studentId) {
        return studentService.getStudentById(studentId);
    }

    @PostMapping("/addStudent")
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }



}
