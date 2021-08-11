package Controller;

import Model.Word;
import Service.Dictation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Controller
public class Control {
    Dictation dictation = new Dictation();
    @RequestMapping("/search")
    public String search(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        String word =request.getParameter("word");
        String result = "";
        for (Word w : dictation.list){
            if (w.getWord().equals(word)){
                result = w.getMean();
                break;
            }
        }
        request.setAttribute("result",result);
        return "/index.jsp";
    }
    @RequestMapping("/home")
    public String home(){
        return "/index.jsp";
    }
}
