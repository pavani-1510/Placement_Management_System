package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.manager.StudentManager;
import com.example.repository.StudentRepository;

@Controller
public class PageController {

    @GetMapping({"/","index.html","index"})
    public String index() {
        return "index.html";
    }

    @GetMapping({"/admin", "/admin.html"})
    public String admin() {
        return "admin.html";
    }
    @GetMapping({"/analysis", "/analysis.html"})
    public String analysis() {
        return "analysis.html";
    }

    @GetMapping({"/adminDashboard", "/adminDashboard.html"})
    public String adminDashboard() {
        return "adminDashboard.html";
    }

    @GetMapping({"/adminLogin", "/adminLogin.html"})
    public String adminLogin() {
        return "adminLogin.html";
    }

    @GetMapping({"/allApplications", "/allApplications.html"})
    public String allApplications() {
        return "allApplications.html";
    }
    @GetMapping({"/allRecruiters", "/allRecruiters.html"})
    public String allRecruiters() {
        return "allRecruiters.html";
    }
    

    @GetMapping({"/applications", "/applications.html"})
    public String applications() {
        return "applications.html";
    }
    
    @GetMapping({"/viewApplications", "/viewApplications.html"})
    public String viewApplications() {
        return "viewApplications.html";
    }



    @GetMapping({"/apply", "/apply.html"})
    public String apply() {
        return "apply.html";
    }

    @GetMapping({"/contact_us", "/contact_us.html"})
    public String contactUs() {
        return "contact_us.html";
    }

    @GetMapping({"/dashboard", "/dashboard.html"})
    public String dashboard() {
        return "dashboard.html";
    }

    @GetMapping({"/getdata", "/getdata.html"})
    public String getData() {
        return "getdata.html";
    }
//
    @GetMapping({"/login","/login.html"})
    public String login() {
        return "login.html";
    }

    @GetMapping({"/recruiterDashboard", "/recruiterDashboard.html"})
    public String recruiterDashboard() {
        return "recruiterDashboard.html";
    }
    @GetMapping({"/recruiterLogin", "/recruiterLogin.html"})
    public String recruiterLogin() {
        return "recruiterLogin.html"; // Name of the HTML page for login
    }
    @GetMapping({"/retrieve", "/retrieve.html"})
    public String retrieve() {
        return "retrieve.html"; // Name of the HTML page for login
    }
    @GetMapping({"/retrieveA", "/retrieveA.html"})
    public String retrieveA() {
        return "retrieveA.html"; // Name of the HTML page for login
    }
    @GetMapping({"/retrieveR", "/retrieveR.html"})
    public String retrieveR() {
        return "retrieve.html"; // Name of the HTML page for login
    }
    @GetMapping({"/signup", "/signup.html"})
    public String signup() {
        return "signup.html"; // Name of the HTML page for signup
    }

    @GetMapping({"/success", "/success.html"})
    public String success() {
        return "success.html"; // Name of the HTML page for success
    }

    @GetMapping({"/thanks", "/thanks.html"})
    public String thanks() {
        return "thanks.html"; // Name of the HTML page for thanks
    }
    
    @GetMapping({"/addRecruiter", "/addRecruiter.html"})
    public String addRecruiter() {
        return "addRecruiter.html"; // Name of the HTML page for thanks
    }

    @GetMapping({"/addJob", "/addJob.html"})
    public String addJob() {
        return "addJob.html"; // Name of the HTML page for thanks
    }
    
    @GetMapping({"/addJobByRecruiter", "/addJobByRecruiter.html"})
    public String addJobByRecruiter() {
        return "addJobByRecruiter.html"; // Name of the HTML page for thanks
    }

    // Handle login form submission
//    // Handle login form submission
//    @PostMapping({"/login","/login.html"})
//    public String handleLogin(@RequestParam String t1, @RequestParam String t2, RedirectAttributes redirectAttributes) {
//        // Validate user credentials using the StudentManager
//        boolean isValidUser = StudentManager.validateUser(t1, t2);
//
//        if (isValidUser) {
//            return "redirect:/dashboard"; // Redirect to dashboard if login is successful
//        } else {
//            redirectAttributes.addFlashAttribute("error", true); // Add error flag
//            return "redirect:/login.html?error=true"; // Redirect to login with error
//        }
//    }
    
}
