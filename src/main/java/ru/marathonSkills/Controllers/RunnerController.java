package ru.marathonSkills.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.marathonSkills.DAO.RunnerDAO;
import ru.marathonSkills.Models.Runner;
import ru.marathonSkills.repos.MessageRepository;

import javax.validation.Valid;

@Controller
public class RunnerController {
    private MessageRepository messageRepository;

    @Autowired
    public RunnerController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }


//    final RunnerDAO runnerDAO;
//    @Autowired
//    public RunnerController(RunnerDAO runnerDAO) {
//        this.runnerDAO = runnerDAO;
//    }

    @GetMapping("/mainPage")
    public String mainPage(){
        return "mainPage";
    }

    @GetMapping("/authorization")
    public String runnerAuthorization(){
        return "runner/authorization";
    }

    @GetMapping("/newRunner")
    public String getNewRunner(Model model){
        model.addAttribute("runner", new Runner());
        return "runner/newRunner";
    }
    @PostMapping("/runner")
    public String newRunner(@ModelAttribute("runner") @Valid Runner runner, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return "runner/newRunner";
        messageRepository.save(runner);
        return "runner/authorization";


    }
}
