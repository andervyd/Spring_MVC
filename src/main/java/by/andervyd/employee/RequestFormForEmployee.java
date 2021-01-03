package by.andervyd.employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

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
    public String showDetails(
            @Valid @ModelAttribute("employees") Employee employee, BindingResult bindingResult) {

/*
        System.out.println("Length last name: " + employee.getLastName().length());
*/

        if(bindingResult.hasErrors()) {
            return "/ask_details";
        } else {
            return "/show_details";
        }
/*
        int newSalary = employee.getSalary();
        employee.setSalary(newSalary + 100);
*/
    }
}
