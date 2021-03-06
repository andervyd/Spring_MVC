package by.andervyd.example_tut;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/request")
public class RequestForm {

    @RequestMapping("/ask-details")
    public String askDetails() {
        return "example/ask_details";
    }

/* old version

    @RequestMapping("/show-details")
    public String showDetails() {
        return "show_details";
    }
*/

/* old version (with HttpServletRequest)

    @RequestMapping("/show-details")
    public String showDetails(HttpServletRequest request, Model model) {

        String nameEmployee = request.getParameter("employeeName");
        nameEmployee = "Mr. " + nameEmployee;

        model.addAttribute("nameAttribute", nameEmployee);
        return "show_details";
    }
*/

    @RequestMapping("/show-details")
    public String showDetails(@RequestParam("employeeName") String employeeName, Model model) {

        employeeName = "Mr. " + employeeName;

        model.addAttribute("nameAttribute", employeeName);
        return "example/show_details";
    }
}
