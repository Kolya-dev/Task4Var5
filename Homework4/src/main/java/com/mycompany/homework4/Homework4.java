/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author krivosheevnikolaj
 */
public class Homework4 {

    public static void main(String[] args) {
        System.out.println("Дз 4. Вариант 5. Студент Кривошеев Н.А. Группа РИБО-04-21");
        Scanner scan = new Scanner(System.in);
        HashMap<String,String> Dictionary = new HashMap<>();
        Dictionary.put("Abdication", "отречение; отказ; сложение полномочий");
        Dictionary.put("Aperitif", "аперитив");
        Dictionary.put("Mead", "мёд; луг");
        Dictionary.put("Zizz", "жужжание");
        Dictionary.put("Dog", "собака");
        TreeMap<String,String> sortDictionary = new TreeMap<>(Dictionary);
        boolean loop = true;
        while(loop){
        System.out.println("Enter command number: 1 - show Dictionary, 2 - add a new word, 3  - delete an entry, 4 - exit");
        int userCommand = scan.nextInt();
        switch(userCommand){
            case 1:
            for(Entry<String,String> words : sortDictionary.entrySet()){
            String englishWord = words.getKey();
            String russianWord = words.getValue();
            System.out.println(englishWord + " - " + russianWord);
            }
            break;
            case 2:
                System.out.println("Enter command number: 1 - add new entry, 2 - add a translation");
                int userCommand2 = scan.nextInt();
                switch(userCommand2){
                    case 1:
                        System.out.println("Enter a new word on english");
                        String newEnglishWord = scan.next();
                        System.out.println("Enter his translation on russian");
                        String rutranslation = scan.next();
                        sortDictionary.put(newEnglishWord, rutranslation);
                        for(Entry<String,String> words : sortDictionary.entrySet()){
                        String englishWord = words.getKey();
                        String russianWord = words.getValue();
                        System.out.println(englishWord + " - " + russianWord);
                        }               
                        break;
                    case 2:
                        System.out.println("Enter the word in English to which you want to add a translation");
                        String keyWord = scan.next();
                        String valWord = sortDictionary.get(keyWord);
                        System.out.println("Enter a translation");
                        String translation = scan.next();
                        valWord = valWord + "; " + translation;
                        sortDictionary.put(keyWord,valWord);
                        for(Entry<String,String> words : sortDictionary.entrySet()){
                        String englishWord = words.getKey();
                        String russianWord = words.getValue();
                        System.out.println(englishWord + " - " + russianWord);
                        }               
                        break;
                }
                break;
            case 3:
                System.out.println("Enter the word whose entry you want to delete");
                    String deleteWord = scan.next();
                    sortDictionary.remove(deleteWord);
                    for(Entry<String,String> words : sortDictionary.entrySet()){
                        String englishWord = words.getKey();
                        String russianWord = words.getValue();
                        System.out.println(englishWord + " - " + russianWord);
                    }
                    break;
            case 4:
                break;
            default:
                System.out.println("You entered an invalid command number!");
                break;
        }
        if(userCommand != 1 && userCommand != 2 && userCommand != 3 && userCommand != 4){
        loop = true;
        }
        else{
            break;
        }
        }
    }
}
