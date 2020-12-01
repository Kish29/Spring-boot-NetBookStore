package org.ustb.netbookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

    @RequestMapping("bookList")
    public ModelAndView showBooks() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/jsp/BookList.jsp");
        return modelAndView;
    }
}
