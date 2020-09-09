package com.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Quiz;
import com.app.service.QuizService;

@Component
public class DBInitializer implements CommandLineRunner{
	private QuizService service;
	public DBInitializer(QuizService service) {
		this.service=service;
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Quiz quiz1 =new Quiz("“Which crop is sown on the largest area in India....?","Rice" ," Wheat"," Sugarcane"," Maize",1);
		Quiz quiz2 =new Quiz("Entomology is the science that studies?"," Behaviour of human beings","Insects","The origin and history of technical and scientific terms","The formation of rocks",2);
		Quiz quiz3 = new Quiz("Grand Central Terminal, Park Avenue, New York is the world's?","highest railway station"," longest railway station"," largest railway station","  None of the above",3);
		Quiz quiz4=new Quiz( "Galileo was an astronomer who?", " developed the telescope", "discovered four satellites of Jupiter", "discovered that the movement of pendulum produces a regular time measurement", " All the above", 2);
		Quiz quiz5=new Quiz( "Corey Anderson who has hit the fastest ODI century in 36 balls is from?","England", " Australia", " West Indies", "New Zealand", 4);
		Quiz quiz6=new Quiz( "Who among the following were contemporaries of Kanishka?", "Kamban, Banabhatta, Asvagosha", "Nagarjuna, Asvagosha, Vasumitra", " Asvagosha, Kalidasa, Banabhatta","Kalidasa, Kamban, Vasumitra", 2);
		Quiz quiz7=new Quiz("The world smallest country is ?", "Canada  ", "Russia  ", "Maldives ", "Vatican City", 4);
		Quiz quiz8=new Quiz("Novak Djokovic is a famous player associated with the game of?", " Hockey", "Football", "Chess", "Lawn Tennis", 4);
		Quiz quiz9=new Quiz(" Areas of which of the following current states did not come under control of Vijayanagar emperor Krishnadeva Raya?  ", "Kerala ", "Tamil Nadu", "Odisha", "Maharashtra", 4);
		Quiz quiz10=new Quiz("Which one of the following was the first fort constructed by the British in India?", "Fort William ", "Fort St. George ", "Fort St. David", "Fort St. Angelo", 2);
		this.service.saveQuiz(quiz1);
		this.service.saveQuiz(quiz2);
		this.service.saveQuiz(quiz3);
		this.service.saveQuiz(quiz4);
		this.service.saveQuiz(quiz5);
		this.service.saveQuiz(quiz6);
		this.service.saveQuiz(quiz7);
		this.service.saveQuiz(quiz8);
		this.service.saveQuiz(quiz9);
		this.service.saveQuiz(quiz10);
		System.out.println("Database has been initialized");
		
	}

}
