import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentGradeCalculator extends JFrame implements ActionListener {

    JLabel title, subtitle;
    JLabel nameLabel, javaLabel, dbmsLabel, dsaLabel;
    JLabel osLabel, cnLabel;
    JLabel totalLabel, percentageLabel, gradeLabel;

    JTextField nameField, javaField, dbmsField, dsaField;
    JTextField osField, cnField;
    JTextField totalField, percentageField, gradeField;

    JButton calculateButton, clearButton;

    // Colors
    Color backgroundColor = new Color(211, 211, 211);//
    Color headerColor = new Color(35, 95, 160);
    Color inputColor = Color.WHITE;
    Color resultColor = new Color(255, 255, 255);
    Color buttonColor = new Color(210, 35, 55);
    Color clearColor = new Color(210, 35, 55);

    StudentGradeCalculator() {
        // FRAME
        setTitle("Student Grade Calculator");
        setSize(600, 650);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(backgroundColor);

        // HEADER

        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(null);
        headerPanel.setBackground(headerColor);
        headerPanel.setBounds(0, 0, 600, 95);

        title = new JLabel("STUDENT GRADE CALCULATOR");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setBounds(80, 20, 440, 35);

        subtitle = new JLabel("Enter marks for all subjects");
        subtitle.setForeground(Color.WHITE);
        subtitle.setFont(new Font("Arial", Font.PLAIN, 14));
        subtitle.setHorizontalAlignment(SwingConstants.CENTER);
        subtitle.setBounds(80, 55, 440, 25);

        headerPanel.add(title);
        headerPanel.add(subtitle);

        add(headerPanel);

        // STUDENT NAME

        nameLabel = new JLabel("Student Name");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        nameLabel.setForeground(new Color(50, 50, 50));
        nameLabel.setBounds(50, 115, 120, 25);

        nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.PLAIN, 14));
        nameField.setBackground(inputColor);
        nameField.setBounds(180, 112, 365, 32);

        add(nameLabel);
        add(nameField);

        // SUBJECT LABEL

        JLabel subjectTitle = new JLabel("SUBJECT MARKS");
        subjectTitle.setFont(new Font("Arial", Font.BOLD, 15));
        subjectTitle.setForeground(headerColor);
        subjectTitle.setBounds(50, 160, 200, 25);

        add(subjectTitle);

        // SUBJECT FIELDS

        javaLabel = new JLabel("Java");
        dbmsLabel = new JLabel("DBMS");
        dsaLabel = new JLabel("DSA");
        osLabel = new JLabel("Operating System");
        cnLabel = new JLabel("Computer Network");

        javaField = new JTextField();
        dbmsField = new JTextField();
        dsaField = new JTextField();
        osField = new JTextField();
        cnField = new JTextField();

        // Labels
        javaLabel.setBounds(50, 200, 120, 25);
        dbmsLabel.setBounds(50, 250, 120, 25);
        dsaLabel.setBounds(50, 300, 120, 25);

        osLabel.setBounds(315, 200, 140, 25);
        cnLabel.setBounds(315, 250, 150, 25);

        // Fields
        javaField.setBounds(180, 197, 100, 32);
        dbmsField.setBounds(180, 247, 100, 32);
        dsaField.setBounds(180, 297, 100, 32);

        osField.setBounds(465, 197, 80, 32);
        cnField.setBounds(465, 247, 80, 32);

        add(javaLabel);
        add(javaField);

        add(dbmsLabel);
        add(dbmsField);

        add(dsaLabel);
        add(dsaField);

        add(osLabel);
        add(osField);

        add(cnLabel);
        add(cnField);

        // CALCULATE BUTTON

        calculateButton = new JButton("CALCULATE");
        calculateButton.setBounds(205, 345, 190, 40);

        calculateButton.setBackground(buttonColor);
        calculateButton.setForeground(Color.WHITE);
        calculateButton.setFont(new Font("Arial", Font.BOLD, 14));
        calculateButton.setFocusPainted(false);
        calculateButton.setBorderPainted(false);

        calculateButton.addActionListener(this);

        add(calculateButton);

        // RESULT TITLE

        JLabel resultTitle = new JLabel("RESULT");
        resultTitle.setFont(new Font("Arial", Font.BOLD, 15));
        resultTitle.setForeground(new Color(0, 110, 60));
        resultTitle.setBounds(50, 410, 150, 25);

        add(resultTitle);

        // RESULT FIELDS

        totalLabel = new JLabel("Total");
        percentageLabel = new JLabel("Percentage");
        gradeLabel = new JLabel("Grade");

        totalField = new JTextField();
        percentageField = new JTextField();
        gradeField = new JTextField();

        totalLabel.setBounds(50, 450, 100, 25);
        percentageLabel.setBounds(220, 450, 100, 25);
        gradeLabel.setBounds(390, 450, 80, 25);

        totalField.setBounds(50, 478, 140, 35);
        percentageField.setBounds(220, 478, 140, 35);
        gradeField.setBounds(390, 478, 155, 35);

        // Result field properties
        totalField.setEditable(false);
        percentageField.setEditable(false);
        gradeField.setEditable(false);

        totalField.setBackground(resultColor);
        percentageField.setBackground(resultColor);
        gradeField.setBackground(resultColor);

        totalField.setFont(new Font("Arial", Font.BOLD, 14));
        percentageField.setFont(new Font("Arial", Font.BOLD, 14));
        gradeField.setFont(new Font("Arial", Font.BOLD, 16));

        totalField.setForeground(Color.BLACK);
        percentageField.setForeground(Color.BLACK);
        gradeField.setForeground(Color.BLACK);

        add(totalLabel);
        add(totalField);

        add(percentageLabel);
        add(percentageField);

        add(gradeLabel);
        add(gradeField);

        // CLEAR BUTTON

        clearButton = new JButton("CLEAR");

        clearButton.setBounds(230, 550, 140, 35);

        clearButton.setBackground(clearColor);
        clearButton.setForeground(Color.WHITE);
        clearButton.setFont(new Font("Arial", Font.BOLD, 13));
        clearButton.setFocusPainted(false);
        clearButton.setBorderPainted(false);

        clearButton.addActionListener(this);

        add(clearButton);

               // SHOW FRAME
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // BUTTON ACTION

    @Override
    public void actionPerformed(ActionEvent e) {

        // CALCULATE

        if (e.getSource() == calculateButton) {

            String name = nameField.getText().trim();

            String input1 = javaField.getText().trim();
            String input2 = dbmsField.getText().trim();
            String input3 = dsaField.getText().trim();
            String input4 = osField.getText().trim();
            String input5 = cnField.getText().trim();

            // EMPTY INPUT

            if (name.isEmpty() ||
                    input1.isEmpty() ||
                    input2.isEmpty() ||
                    input3.isEmpty() ||
                    input4.isEmpty() ||
                    input5.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please enter all details.",
                        "Missing Input",
                        JOptionPane.WARNING_MESSAGE
                );

                return;
            }

            // NAME VALIDATION

            if (!name.matches("[a-zA-Z ]+")) {

                JOptionPane.showMessageDialog(
                        this,
                        "Invalid student name!\nPlease enter letters only.",
                        "Invalid Name",
                        JOptionPane.ERROR_MESSAGE
                );

                nameField.requestFocus();

                return;
            }

            // MARKS VALIDATION

            if (!input1.matches("\\d+") ||
                    !input2.matches("\\d+") ||
                    !input3.matches("\\d+") ||
                    !input4.matches("\\d+") ||
                    !input5.matches("\\d+")) {

                JOptionPane.showMessageDialog(
                        this,
                        "Invalid marks!\nPlease enter numbers only.",
                        "Invalid Marks",
                        JOptionPane.ERROR_MESSAGE
                );

                return;
            }

            // CONVERT TO INTEGER

            int java = Integer.parseInt(input1);
            int dbms = Integer.parseInt(input2);
            int dsa = Integer.parseInt(input3);
            int os = Integer.parseInt(input4);
            int cn = Integer.parseInt(input5);

            // RANGE CHECK

            if (java > 100 ||
                    dbms > 100 ||
                    dsa > 100 ||
                    os > 100 ||
                    cn > 100) {

                JOptionPane.showMessageDialog(
                        this,
                        "Marks must be between 0 and 100.",
                        "Invalid Marks",
                        JOptionPane.ERROR_MESSAGE
                );

                return;
            }

            // CALCULATION
            int total = java + dbms + dsa + os + cn;

            double percentage = total / 5.0;

            String grade;


            if (percentage >= 90) {
                grade = "A+";
            }
            else if (percentage >= 80) {
                grade = "A";
            }
            else if (percentage >= 70) {
                grade = "B";
            }
            else if (percentage >= 60) {
                grade = "C";
            }
            else if (percentage >= 50) {
                grade = "D";
            }
            else {
                grade = "F";
            }

            // DISPLAY RESULT
            totalField.setText(total + " / 500");

            percentageField.setText(
                    String.format("%.1f%%", percentage)
            );

            gradeField.setText(grade);

            // POPUP
            JOptionPane.showMessageDialog(
                    this,

                    "Student Name : " + name +
                            "\n\nTotal       : " + total + " / 500" +
                            "\nPercentage  : " +
                            String.format("%.1f%%", percentage) +
                            "\nGrade       : " + grade,

                    "Student Result",

                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        // CLEAR

        else if (e.getSource() == clearButton) {

            nameField.setText("");

            javaField.setText("");
            dbmsField.setText("");
            dsaField.setText("");
            osField.setText("");
            cnField.setText("");

            totalField.setText("");
            percentageField.setText("");
            gradeField.setText("");

            nameField.requestFocus();
        }
    }

    // MAIN
    public static void main(String[] args) {

        new StudentGradeCalculator();
    }
}
