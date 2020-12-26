package az.com.bk.controller;

import az.com.bk.dto.CardDto;
import az.com.bk.service.CardService;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

@Controller
public class IndexController {
    private final CardService cardService;

    public IndexController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping(value={"/","/index"})
    public ModelAndView index(ModelAndView modelAndView){
        //CardDto cardDto=cardService.getID(3);
       List<CardDto> cardDtos=cardService.findAll();
        modelAndView.addObject("index","Melumatlarin elave olunmasi");

        modelAndView.setViewName("index");
       modelAndView.addObject("cardDtos",cardDtos);
        return modelAndView;
    }
    @PostMapping ("/save")
    public ModelAndView index (CardDto cardDto,ModelAndView modelAndView){
        cardService.save(cardDto);
        modelAndView.addObject("index","Done !!!");
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }
    @GetMapping ("/{id}")
    public ModelAndView index (@PathVariable Integer id, ModelAndView modelAndView){
        cardService.delete(id);
        modelAndView.addObject("index","Done !!!");
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }
    @GetMapping ("/getData/{id}")
    public ModelAndView getData (@PathVariable Integer id, ModelAndView modelAndView) throws IOException {
        System.out.println("getData");
           CardDto cardDto=cardService.getID(id);
        modelAndView.addObject("index","Done !!!");
        modelAndView.addObject("cardDto",cardDto);
        modelAndView.setViewName("modal");
        System.out.println(cardDto);
          return modelAndView;
    }
}
