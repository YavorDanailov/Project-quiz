package com.company;



import java.util.*;

public class Main {
    public static void questionsAndAnswers() {
        String[] Sports1 = {"What is the most popular sport?", "Football", "Basketball", "Volleyball", "Tennis"};
        String[] Sports2 = {"How many World Cups has the Bulgarian National team participated in?", "7", "5", "4", "6"};
        String[] Sports3 = {"Which of the following is NOT an Olympic sport?", "Cricket", "Swimming", "Table tennis", "Gymnastics"};
        String[] Sports4 = {"What is the oldest sport in history?", "Polo", "Baseball", "Rugby", "Boxing"};

        String[] Programming1 = {"What is the first programming language ever?", "FORTRAN", "LISP", "COBOL", "BASIC"};
        String[] Programming2 = {"Which of these is considered the easiest to learn?", "HTML", "JavaScript", "C++", "Python"};
        String[] Programming3 = {"How long approximately does it take to learn JAVA?", "8 months", "6 months", "9 months", "7 months"};
        String[] Programming4 = {"How many programming languages are there?", "700 + ", "100", "250", "500"};

        String[] Geography1 = {"Which of these countries has the highest population?", "Thailand", "The UK", "France", "Italy"};
        String[] Geography2 = {"How many emirates are there in the UAE?", "7", "8", "6", "5"};
        String[] Geography3 = {"How many capitals does The Republic of South Africa have?", "3", "1", "2", "0"};
        String[] Geography4 = {"Mount Everest is the highest point in the world. Where is mount Everest?", "The Himalayan", "The Andes", "Cordillera", "Alps"};
        // NOTE: These arrays contain both the questions and the answers and are only used for visualisation

    }

    public static void factsRazgrad() {
        String[] factsQuest = {"What is the population of Razgrad?", "When was Abritus established?", "How many municipalities does region Razgrad have?", "Which river flows through Razgrad?"};
        String[] factsRazgrad1 = {"30000", "25000", "20000", "15000"};
        String[] factsRazgrad2 = {"1st century", "3rd century", "4th century", "2nd century"};
        String[] factsRazgrad3 = {"7", "5", "4", "8"};
        String[] factsRazgrad4 = {"BeliLom", "The Danube", "Iskar", "Arda"};
        //Questions and answers for "Facts about Razgrad"

        Scanner sc = new Scanner(System.in);
        for (int result = 0; result <= 4; result++) {
            System.out.println(factsQuest[0]);
            List<String> StringList = Arrays.asList(factsRazgrad1);
            Collections.shuffle(StringList);
            StringList.toArray(factsRazgrad1);
            for (String element : factsRazgrad1) {
                System.out.println(element);
            }
            System.out.println("Your answer: ");
            String answer = sc.next();
            if (answer.equals("30000")) {
                result += 1;
                System.out.println(factsQuest[1]);
            }else {
                System.out.println("Facts about Razgrad" + "\n" + result);
                break;
            }
            List<String> StringList2 = Arrays.asList(factsRazgrad2);
            Collections.shuffle(StringList2);
            StringList2.toArray(factsRazgrad2);
            for (String element : factsRazgrad2) {
                System.out.println(element);
            }
            System.out.println("Your answer: ");
            String answer2 = sc.next();
            if (answer2.equals("1st")) {
                result+=1;
                System.out.println(factsQuest[2]);
            }else{
                System.out.println("Facts about Razgrad " + "\n" + result);
                break;
            }
            List<String> StringList3 = Arrays.asList(factsRazgrad3);
            Collections.shuffle(StringList3);
            StringList3.toArray(factsRazgrad3);
            for (String element : factsRazgrad3) {
                System.out.println(element);
            }
            System.out.println("Your answer: ");
            String answer3 = sc.next();
            if (answer3.equals("7")){
                result+=1;
                System.out.println(factsQuest[3]);
            }else{
                System.out.println("Facts about Razgrad " + "\n" + result);
                break;
            }
            List<String> StringList4 = Arrays.asList(factsRazgrad4);
            Collections.shuffle(StringList4);
            StringList4.toArray(factsRazgrad4);
            for (String element : factsRazgrad4) {
                System.out.println(element);
            }
            System.out.println("Your answer: ");
            String answer4 = sc.next();
            if (answer4.equals("BeliLom")){
                result+=1;
                System.out.println("Well done, you have guessed all 4 right! " + "\n" + "Facts about Razgrad" +  "\n" + result);
                break;
            }else{
                System.out.println("Facts about Razgrad " + "\n" +  result);
                break;
            }
        }
        }

        public static void sports (){
            String[] SportsQuest = {"What is the most popular sport?", "How many World Cups has the Bulgarian National team participated in?", "Which of the following is NOT an Olympic sport?", "What is the oldest sport in history?"};
            String[] Sports1 = {"Football", "Basketball", "Volleyball", "Tennis"};
            String[] Sports2 = {"7", "5", "4", "6"};
            String[] Sports3 = {"Cricket", "Swimming", "Table tennis", "Gymnastics"};
            String[] Sports4 = {"Polo", "Baseball", "Rugby", "Boxing"};
            //Questions and answers about "Sports"

            Scanner sc = new Scanner(System.in);
            for (int result = 0; result <= 4; result++) {
                System.out.println(SportsQuest[0]);
                List<String> StringList = Arrays.asList(Sports1);
                Collections.shuffle(StringList);
                StringList.toArray(Sports1);
                for (String element : Sports1) {
                    System.out.println(element);
                }
                System.out.println("Your answer: ");
                String answer = sc.next();
                if (answer.equals("Football")) {
                    result += 1;
                    System.out.println(SportsQuest[1]);
                }else {
                    System.out.println("Sports" + "\n" + result);
                    break;
                }
                List<String> StringList2 = Arrays.asList(Sports2);
                Collections.shuffle(StringList2);
                StringList2.toArray(Sports2);
                for (String element : Sports2) {
                    System.out.println(element);
                }
                System.out.println("Your answer: ");
                String answer2 = sc.next();
                if (answer2.equals("7")) {
                    result+=1;
                    System.out.println(SportsQuest[2]);
                }else{
                    System.out.println("Sports" + "\n" + result);
                    break;
                }
                List<String> StringList3 = Arrays.asList(Sports3);
                Collections.shuffle(StringList3);
                StringList3.toArray(Sports3);
                for (String element : Sports3) {
                    System.out.println(element);
                }
                System.out.println("Your answer: ");
                String answer3 = sc.next();
                if (answer3.equals("Cricket")){
                    result+=1;
                    System.out.println(SportsQuest[3]);
                }else{
                    System.out.println("Sports " + "\n" + result);
                    break;
                }
                List<String> StringList4 = Arrays.asList(Sports4);
                Collections.shuffle(StringList4);
                StringList4.toArray(Sports4);
                for (String element : Sports4) {
                    System.out.println(element);
                }
                System.out.println("Your answer: ");
                String answer4 = sc.next();
                if (answer4.equals("Polo")){
                    result+=1;
                    System.out.println("Well done, you have guessed all 4 right! " + "\n" + "Sports" + "\n" + result);
                    break;
                }else{
                    System.out.println("Sports " + "\n" +  result);
                    break;
                }

            }

        }

        public static void programming (){
            String[] ProgrammingQuest = {"What is the first programming language ever?", "Which of these is considered the easiest to learn?", "How long approximately does it take to learn JAVA?", "How many programming languages are there?"};
            String[] Programming1 = {"FORTRAN", "LISP", "COBOL", "BASIC"};
            String[] Programming2 = {"HTML", "JavaScript", "C++", "Python"};
            String[] Programming3 = {"8 months", "6 months", "9 months", "7 months"};
            String[] Programming4 = {"700", "100", "250", "500"};
            //Questions and answers about "Programming"

            Scanner sc = new Scanner(System.in);
            for (int result = 0; result <= 4; result++) {
                System.out.println(ProgrammingQuest[0]);
                List<String> StringList = Arrays.asList(Programming1);
                Collections.shuffle(StringList);
                StringList.toArray(Programming1);
                for (String element : Programming1) {
                    System.out.println(element);
                }
                System.out.println("Your answer: ");
                String answer = sc.next();
                if (answer.equals("FORTRAN")) {
                    result += 1;
                    System.out.println(ProgrammingQuest[1]);
                }else {
                    System.out.println("Programming" + "\n" + result);
                    break;
                }
                List<String> StringList2 = Arrays.asList(Programming2);
                Collections.shuffle(StringList2);
                StringList2.toArray(Programming2);
                for (String element : Programming2) {
                    System.out.println(element);
                }
                System.out.println("Your answer: ");
                String answer2 = sc.next();
                if (answer2.equals("HTML")) {
                    result+=1;
                    System.out.println(ProgrammingQuest[2]);
                }else{
                    System.out.println("Programming " + "\n" + result);
                    break;
                }
                List<String> StringList3 = Arrays.asList(Programming3);
                Collections.shuffle(StringList3);
                StringList3.toArray(Programming3);
                for (String element : Programming3) {
                    System.out.println(element);
                }
                System.out.println("Your answer: ");
                String answer3 = sc.next();
                if (answer3.equals("8")){
                    result+=1;
                    System.out.println(ProgrammingQuest[3]);
                }else{
                    System.out.println("Programming " + "\n" + result);
                    break;
                }
                List<String> StringList4 = Arrays.asList(Programming4);
                Collections.shuffle(StringList4);
                StringList4.toArray(Programming4);
                for (String element : Programming4) {
                    System.out.println(element);
                }
                System.out.println("Your answer: ");
                String answer4 = sc.next();
                if (answer4.equals("700")){
                    result+=1;
                    System.out.println("Well done, you have guessed all 4 right! " + "\n" + "Programming" + "\n" + result);
                    break;
                }else{
                    System.out.println("Programming " + "\n" +  result);
                    break;
                }

            }

        }

        public static void geography(){
            String[] GeographyQuest = {"Which of these countries has the highest population?", "How many emirates are there in the UAE?", "How many capitals does The Republic of South Africa have?", "Mount Everest is the highest point in the world. Where is mount Everest?"};
            String[] Geography1 = {"Thailand", "The UK", "France", "Italy"};
            String[] Geography2 = {"7", "8", "6", "5"};
            String[] Geography3 = {"3", "1", "2", "0"};
            String[] Geography4 = {"The Himalayan", "The Andes", "Cordillera", "Alps"};
            //Questions and answers about "Geography"

            Scanner sc = new Scanner(System.in);
            for (int result = 0; result <= 4; result++) {
                System.out.println(GeographyQuest[0]);
                List<String> StringList = Arrays.asList(Geography1);
                Collections.shuffle(StringList);
                StringList.toArray(Geography1);
                for (String element : Geography1) {
                    System.out.println(element);
                }
                System.out.println("Your answer: ");
                String answer = sc.next();
                if (answer.equals("Thailand")) {
                    result += 1;
                    System.out.println(GeographyQuest[1]);
                }else {
                    System.out.println("Geography" + "\n" + result);
                    break;
                }
                List<String> StringList2 = Arrays.asList(Geography2);
                Collections.shuffle(StringList2);
                StringList2.toArray(Geography2);
                for (String element : Geography2) {
                    System.out.println(element);
                }
                System.out.println("Your answer: ");
                String answer2 = sc.next();
                if (answer2.equals("7")) {
                    result+=1;
                    System.out.println(GeographyQuest[2]);
                }else{
                    System.out.println("Geography " + "\n" + result);
                    break;
                }
                List<String> StringList3 = Arrays.asList(Geography3);
                Collections.shuffle(StringList3);
                StringList3.toArray(Geography3);
                for (String element : Geography3) {
                    System.out.println(element);
                }
                System.out.println("Your answer: ");
                String answer3 = sc.next();
                if (answer3.equals("3")){
                    result+=1;
                    System.out.println(GeographyQuest[3]);
                }else{
                    System.out.println("Geography" + "\n" + result);
                    break;
                }
                List<String> StringList4 = Arrays.asList(Geography4);
                Collections.shuffle(StringList4);
                StringList4.toArray(Geography4);
                for (String element : Geography4) {
                    System.out.println(element);
                }
                System.out.println("Your answer: ");
                String answer4 = sc.next();
                if (answer4.equals("Himalayan")){
                    result+=1;
                    System.out.println("Well done, you have guessed all 4 right! " + "\n" + "Geography" + "\n" + result);
                    break;
                }else{
                    System.out.println("Geography " + "\n" +  result);
                    break;
                }

            }

        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the quiz! " + "\n 1. Facts about Razgrad " + "\n 2. Sports " + "\n 3. Programming " + "\n 4. Geography " + "\nPlease choose a category: ");
        int n = scan.nextInt();
        if (n==1){
            factsRazgrad();
        }else if (n==2){
            sports();
        }else if(n==3){
            programming();
        }else if(n==4){
            geography();
        }
    }
}
