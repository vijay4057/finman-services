package sample;

import java.io.File;
import java.io.StringReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class Sample {
    public static void main(String[] args) {

        try {

           // File file = new File("question.xml");
            StringReader stringReader = new StringReader("<question id=\"1\"><answers><sug>asd</sug><sug></sug> <answername>java is a programming language</answername><id>101</id><postedby>ravi</postedby>  </answers></question>");
            JAXBContext jaxbContext = JAXBContext.newInstance(Question.class);

            
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Question que = (Question) jaxbUnmarshaller.unmarshal(stringReader);

            System.out.println(que.getId() + " " + que.getQuestionname());
            System.out.println("Answers:");
            List<Answer> list = que.getAnswers();
            for (Answer ans : list)
                System.out.println(ans.getId() + " " + ans.getAnswername() + "  " + ans.getPostedby());

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
