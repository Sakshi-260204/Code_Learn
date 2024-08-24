import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Code_Learn extends JFrame {

    private JLabel titleLabel;
    private JTextArea outputTextArea;
    private JTextField inputField;
    private JButton submitButton;

    private int currentLevel = 1;

    public Code_Learn() {
        // Set up the JFrame
        setTitle("Code Learn: A Java App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null); // Center the JFrame on the screen
        setLayout(new BorderLayout());

        // Title label at the top
        titleLabel = new JLabel("Code Learn: A Java App", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(titleLabel, BorderLayout.NORTH);

        // Output text area for game messages
        outputTextArea = new JTextArea();
        outputTextArea.setEditable(false);
        outputTextArea.setLineWrap(true);
        outputTextArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(outputTextArea);
        add(scrollPane, BorderLayout.CENTER);

        // Panel for input and submit button
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputField = new JTextField();
        inputPanel.add(inputField, BorderLayout.CENTER);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processInput(inputField.getText());
            }
        });
        inputPanel.add(submitButton, BorderLayout.EAST);

        add(inputPanel, BorderLayout.SOUTH);

        // Initialize game with Level 1
        startLevel1();
    }

    private void startLevel1() {
        outputTextArea.setText("");
        outputTextArea.append("Welcome to the Village of Variables, Alex.\n");
        outputTextArea.append("Virus X has wreaked havoc here.\n");
        outputTextArea.append("To restore order, we must fix the corrupted terminals.\n");
        outputTextArea.append("Our first task involves variables, the building blocks of any program.\n\n");

        outputTextArea.append("--- Puzzle 1: Variable Declaration and Initialization ---\n");
        outputTextArea.append("Task 1: Declare and initialize an integer variable named 'numberOfKeys' with the value 5.\n");
        outputTextArea.append("Type your code and click Submit.\n");
        currentLevel = 1;
    }

    private void startLevel2() {
        outputTextArea.setText("");
        outputTextArea.append("Welcome to the Forest of Loops, Alex.\n");
        outputTextArea.append("Virus X has trapped the forest in an endless cycle.\n");
        outputTextArea.append("To free the forest, we must collect 10 magic crystals using loops.\n");
        outputTextArea.append("Let's get started!\n\n");

        outputTextArea.append("--- Puzzle 1: Using a For Loop ---\n");
        outputTextArea.append("Task: Use a for loop to collect 10 magic crystals.\n");
        outputTextArea.append("Type your code and click Submit.\n");
        currentLevel = 2;
    }

    private void startLevel3() {
        outputTextArea.setText("");
        outputTextArea.append("Welcome to the Maze of Decisions, Alex.\n");
        outputTextArea.append("To navigate this maze, you must use conditionals.\n");
        outputTextArea.append("Let's solve some puzzles using if-else statements!\n\n");

        outputTextArea.append("--- Puzzle 1: Using If-Else ---\n");
        outputTextArea.append("Task: Write an if-else statement to check if a player's score is greater than 50.\n");
        outputTextArea.append("If true, print 'You passed the challenge!'; otherwise, print 'Try again!'.\n");
        outputTextArea.append("Type your code and click Submit.\n");
        currentLevel = 3;
    }

    private void startLevel4() {
        outputTextArea.setText("");
        outputTextArea.append("Welcome to the Array Adventure, Alex.\n");
        outputTextArea.append("In this land, we need to manage collections of items using arrays.\n");
        outputTextArea.append("Let's tackle some array challenges!\n\n");

        outputTextArea.append("--- Puzzle 1: Declare an Array ---\n");
        outputTextArea.append("Task: Declare an integer array named 'scores' that can hold 5 elements.\n");
        outputTextArea.append("Type your code and click Submit.\n");
        currentLevel = 4;
    }
    private void startLevel5() {
        outputTextArea.setText("");
        outputTextArea.append("Welcome to the Mountain of Methods, Alex.\n");
        outputTextArea.append("To climb this mountain, you need to understand methods and functions in Java.\n");
        outputTextArea.append("Let's tackle some method challenges!\n\n");

        outputTextArea.append("--- Puzzle 1: Define a Method ---\n");
        outputTextArea.append("Task: Define a method named 'greet' that prints 'Hello, World!'.\n");
        outputTextArea.append("Type your code and click Submit.\n");
        currentLevel = 5;
    }

    private void processInput(String userInput) {
        switch (currentLevel) {
            case 1:
                handleLevel1(userInput);
                break;
            case 2:
                handleLevel2(userInput);
                break;
            case 3:
                handleLevel3(userInput);
                break;
            case 4:
                handleLevel4(userInput);
                break;
            case 5:
                handleLevel5(userInput);
                break;
        }
    }

    private void handleLevel1(String userInput) {
        if (userInput.trim().equals("int numberOfKeys = 5;")) {
            outputTextArea.append("Excellent! You've correctly declared and initialized the integer variable.\n\n");

            outputTextArea.append("--- Puzzle 2: Initialize a String Variable ---\n");
            outputTextArea.append("Task: Initialize a string variable named 'welcomeMessage' with the text 'Hello, Coder!'.\n");
            outputTextArea.append("Type your code and click Submit.\n");
        } else if (userInput.trim().equals("String welcomeMessage = \"Hello, Coder!\";")) {
            outputTextArea.append("Perfect! You've correctly initialized the string variable.\n\n");

            outputTextArea.append("--- Puzzle 3: Fix the Following Code ---\n");
            outputTextArea.append("Task: Fix the following code:\n");
            outputTextArea.append("int playerScore;\n");
            outputTextArea.append("playerScore = 100;\n");
            outputTextArea.append("char grade;\n");
            outputTextArea.append("grade = 'A';\n");
            outputTextArea.append("Type your code and click Submit.\n");
        } else if (userInput.trim().equals("int playerScore = 100; char grade = 'A';")) {
            outputTextArea.append("Well done! You've correctly fixed the code.\n\n");
            outputTextArea.append("Great job, Alex! You've freed the Village of Variables from Virus X's corruption.\n");
            outputTextArea.append("Ahead lies the Forest of Loops, where new challenges await.\n");
            startLevel2();
        } else {
            outputTextArea.append("Incorrect. Please try again.\n\n");
        }
        inputField.setText("");
    }

    private void handleLevel2(String userInput) {
        if (userInput.trim().equals("for (int i = 0; i < 10; i++) { System.out.println(\"Collected crystal\"); }")) {
            outputTextArea.append("Excellent! You've correctly used a for loop to collect the crystals.\n\n");

            outputTextArea.append("--- Puzzle 2: Using a While Loop ---\n");
            outputTextArea.append("Task: Use a while loop to keep collecting crystals until you have 10.\n");
            outputTextArea.append("Type your code and click Submit.\n");
        } else if (userInput.trim().equals("int CollectedCrystals = 0; while (CollectedCrystals < 10) {System.out.println(\"Collected crystals\"); CollectedCrystals++; }")) {
            outputTextArea.append("Perfect! You've correctly used a while loop to collect the crystals.\n\n");

            outputTextArea.append("Great job, Alex! You've freed the Forest of Loops from Virus X's influence.\n");
            outputTextArea.append("With your new knowledge of loops, you're ready for the next challenge.\n");
            outputTextArea.append("Ahead lies the Maze of Decisions, where conditionals will guide your path...\n");
            startLevel3();
        } else {
            outputTextArea.append("Incorrect. Please try again.\n\n");
        }
        inputField.setText("");
    }

    private void handleLevel3(String userInput) {
        if (userInput.trim().equals("if (playerScore > 50) {\n    System.out.println(\"You passed the challenge!\");\n} else {\n    System.out.println(\"Try again!\");\n}")) {
            outputTextArea.append("Great job! You've correctly written the if-else statement.\n\n");
            outputTextArea.append("You've successfully navigated the Maze of Decisions and defeated Virus X!\n");
            outputTextArea.append("Let's continue to learn about arrays in the next challenge.\n");
            startLevel4();
        } else {
            outputTextArea.append("Incorrect. Please try again.\n\n");
        }
        inputField.setText("");
    }

    private void handleLevel4(String userInput) {
        if (userInput.trim().equals("int[] scores = new int[5];")) {
            outputTextArea.append("Well done! You've correctly declared the integer array.\n\n");

            outputTextArea.append("--- Puzzle 2: Initialize Array Elements ---\n");
            outputTextArea.append("Task: Initialize the first element of the 'scores' array to 10.\n");
            outputTextArea.append("Type your code and click Submit.\n");
        } else if (userInput.trim().equals("scores[0] = 10;")) {
            outputTextArea.append("Great! You've successfully initialized the first element of the array.\n\n");

            outputTextArea.append("--- Puzzle 3: Sum of Array Elements ---\n");
            outputTextArea.append("Task: Write a loop to sum all elements in the 'scores' array.\n");
            outputTextArea.append("Type your code and click Submit.\n");
        } else if (userInput.trim().equals("int sum = 0;\nfor (int i = 0; i < scores.length; i++) {\n    sum += scores[i];\n}")) {
            outputTextArea.append("Excellent! You've correctly summed the array elements.\n\n");
            outputTextArea.append("Congratulations, Alex! You've completed the Array Adventure and become a true coding hero!\n");
            outputTextArea.append("Now, let's move on to the Mountain of Methods!\n");
            startLevel5();
        } else {
            outputTextArea.append("Incorrect. Please try again.\n\n");
        }
        inputField.setText("");
    }

    private void handleLevel5(String userInput) {
        if (userInput.trim().equals("void greet() {\n    System.out.println(\"Hello, World!\");\n}")) {
            outputTextArea.append("Fantastic! You've correctly defined the greet method.\n\n");

            outputTextArea.append("--- Puzzle 2: Call the Method ---\n");
            outputTextArea.append("Task: Call the 'greet' method to print 'Hello, World!'.\n");
            outputTextArea.append("Type your code and click Submit.\n");
        } else if (userInput.trim().equals("greet();")) {
            outputTextArea.append("Great job! You've correctly called the greet method.\n\n");

            outputTextArea.append("--- Puzzle 3: Method with Parameters ---\n");
            outputTextArea.append("Task: Define a method named 'sum' that takes two integers as parameters and returns their sum.\n");
            outputTextArea.append("Type your code and click Submit.\n");
        } else if (userInput.trim().equals("int sum(int a, int b) {\n    return a + b;\n}")) {
            outputTextArea.append("Excellent! You've correctly defined the sum method with parameters.\n\n");
            outputTextArea.append("Congratulations, Alex! You've climbed the Mountain of Methods and mastered the art of functions!\n");
        } else {
            outputTextArea.append("Incorrect. Please try again.\n\n");
        }
        inputField.setText("");
    }

    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Code_Learn().setVisible(true);
            }
        });
    }
}
