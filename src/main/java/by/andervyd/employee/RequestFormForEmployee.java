package by.andervyd.employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestFormForEmployee {

    @RequestMapping("/")
    public String mainView() {
        return "/main_view";
    }

    @RequestMapping("/ask-details")
    public String askDetails(Model model) {

        model.addAttribute("employees", new Employee());

        return "/ask_details";
    }

    @RequestMapping("/show-details")
    public String showDetails(@ModelAttribute("employees") Employee employee) {

        int newSalary = employee.getSalary();
        employee.setSalary(newSalary + 100);

        return "/show_details";
    }
}
