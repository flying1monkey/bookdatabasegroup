package edu.berliner.bookdatabasegroup.controllers;


import edu.berliner.bookdatabasegroup.Books;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MainController
{

    @GetMapping("/addbook")
    public String addBook(Model model)
    {
        model.addAttribute("addbook", new Books());
        return "addbook";
    }

    @PostMapping("/addbook")//book add
    public String productSubmit(@Valid @ModelAttribute("additem") Product product, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            return "additem";
        }
        productRepository.save(product);
        return "showproductdetails";
    }
}
