package Service;

import Model.Word;

import java.util.ArrayList;
import java.util.List;

public class Dictation {
    public List<Word> list = new ArrayList<>();
    public Dictation(){
        list.add(new Word("Math","toan"));
        list.add(new Word("English","Tieng Anh"));
        list.add(new Word("Alchemy","Hoa hoc"));
        list.add(new Word("Physic","Vat Ly"));
        list.add(new Word("Biology","Sinh Hoc"));
        list.add(new Word("Gun","Sung"));
    }

}
