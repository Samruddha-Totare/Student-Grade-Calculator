import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class StudentGradeCalculator extends JFrame implements ActionListener {

    JLabel title, nameLabel, javaLabel, dbmsLabel, dsaLabel;
    JLabel osLabel, cnLabel, totalLabel, percentageLabel, gradeLabel;

    JTextField nameField, javaField, dbmsField, dsaField;
    JTextField osField, cnField, totalField, percentageField, gradeField;

    JButton calculateButton, clearButton;

    StudentGradeCalculator() {

        // Title
        title = new JLabel("STUDENT GRADE CALCULATOR");

        // Labels
        nameLabel = new JLabel("Student Name:");
        javaLabel = new JLabel("Java:");
        dbmsLabel = new JLabel("DBMS:");
        dsaLabel = new JLabel("DSA:");
        osLabel = new JLabel("Operating System:");
        cnLabel = new JLabel("Computer Network:");

        totalLabel = new JLabel("Total:");
        percentageLabel = new JLabel("Percentage:");
        gradeLabel = new JLabel("Grade:");

        // Text fields
        nameField = new JTextField();

        javaField = new JTextField();
        dbmsField = new JTextField();
        dsaField = new JTextField();
        osField = new JTextField();
        cnField = new JTextField();

        totalField = new JTextField();
        percentageField = new JTextField();
        gradeField = new JTextField();

        // Result fields cannot be edited
        totalField.setEditable(false);
        percentageField.setEditable(false);
        gradeField.setEditable(false);

        // Buttons
        calculateButton = new JButton("CALCULATE");
        clearButton = new JButton("CLEAR");

        calculateButton.addActionListener(this);
        clearButton.addActionListener(this);

// =========================
// COLORS
// =========================

        getContentPane().setBackground(new Color(230, 240, 255));

        title.setForeground(new Color(0, 70, 140));
        title.setFont(new Font("Arial", Font.BOLD, 18));

        nameLabel.setForeground(Color.BLACK);
        javaLabel.setForeground(Color.BLACK);
        dbmsLabel.setForeground(Color.BLACK);
        dsaLabel.setForeground(Color.BLACK);
        osLabel.setForeground(Color.BLACK);
        cnLabel.setForeground(Color.BLACK);

        totalLabel.setForeground(new Color(0, 100, 0));
        percentageLabel.setForeground(new Color(0, 100, 0));
        gradeLabel.setForeground(new Color(0, 100, 0));

        nameField.setBackground(Color.WHITE);
        javaField.setBackground(Color.WHITE);
        dbmsField.setBackground(Color.WHITE);
        dsaField.setBackground(Color.WHITE);
        osField.setBackground(Color.WHITE);
        cnField.setBackground(Color.WHITE);

        totalField.setBackground(new Color(220, 255, 220));
        percentageField.setBackground(new Color(220, 255, 220));
        gradeField.setBackground(new Color(220, 255, 220));

        totalField.setForeground(new Color(0, 100, 0));
        percentageField.setForeground(new Color(0, 100, 0));
        gradeField.setForeground(new Color(0, 100, 0));

        calculateButton.setBackground(new Color(0, 120, 215));
        calculateButton.setForeground(Color.WHITE);

        clearButton.setBackground(new Color(220, 60, 60));
        clearButton.setForeground(Color.WHITE);

        calculateButton.setFont(new Font("Arial", Font.BOLD, 12));
        clearButton.setFont(new Font("Arial", Font.BOLD, 12));

        gradeField.setFont(new Font("Arial", Font.BOLD, 14));

// Positions
        // Positions

        title.setBounds(30, 15, 300, 30);

        nameLabel.setBounds(30, 55, 100, 25);
        nameField.setBounds(150, 55, 180, 25);

        javaLabel.setBounds(30, 95, 120, 25);
        javaField.setBounds(150, 95, 100, 25);

        dbmsLabel.setBounds(30, 130, 120, 25);
        dbmsField.setBounds(150, 130, 100, 25);

        dsaLabel.setBounds(30, 165, 120, 25);
        dsaField.setBounds(150, 165, 100, 25);

        osLabel.setBounds(30, 200, 120, 25);
        osField.setBounds(150, 200, 100, 25);

        cnLabel.setBounds(30, 235, 120, 25);
        cnField.setBounds(150, 235, 100, 25);

        calculateButton.setBounds(100, 275, 130, 30);

        totalLabel.setBounds(30, 320, 100, 25);
        totalField.setBounds(150, 320, 120, 25);

        percentageLabel.setBounds(30, 355, 100, 25);
        percentageField.setBounds(150, 355, 120, 25);

        gradeLabel.setBounds(30, 390, 100, 25);
        gradeField.setBounds(150, 390, 120, 25);

        clearButton.setBounds(110, 435, 100, 30);

        // Add components

        add(title);

        add(nameLabel);
        add(nameField);

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

        add(calculateButton);

        add(totalLabel);
        add(totalField);

        add(percentageLabel);
        add(percentageField);

        add(gradeLabel);
        add(gradeField);

        add(clearButton);

        // Frame
        setTitle("Student Grade Calculator");
        setSize(370, 520);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        // =========================
        // CALCULATE BUTTON
        // =========================

        if (e.getSource() == calculateButton) {

            String name = nameField.getText().trim();

            String input1 = javaField.getText().trim();
            String input2 = dbmsField.getText().trim();
            String input3 = dsaField.getText().trim();
            String input4 = osField.getText().trim();
            String input5 = cnField.getText().trim();


            // CHECK EMPTY FIELDS

            if (name.isEmpty() ||
                    input1.isEmpty() ||
                    input2.isEmpty() ||
                    input3.isEmpty() ||
                    input4.isEmpty() ||
                    input5.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please enter all details."
                );

                return;
            }


            // CHECK STUDENT NAME

            if (!name.matches("[a-zA-Z ]+")) {

                JOptionPane.showMessageDialog(
                        this,
                        "Invalid student name!\nPlease enter letters only."
                );

                return;
            }


            // CHECK MARKS ARE NUMBERS ONLY

            if (!input1.matches("\\d+") ||
                    !input2.matches("\\d+") ||
                    !input3.matches("\\d+") ||
                    !input4.matches("\\d+") ||
                    !input5.matches("\\d+")) {

                JOptionPane.showMessageDialog(
                        this,
                        "Invalid marks!\nPlease enter numbers only."
                );

                return;
            }


            // CONVERT TO INTEGER

            int java = Integer.parseInt(input1);
            int dbms = Integer.parseInt(input2);
            int dsa = Integer.parseInt(input3);
            int os = Integer.parseInt(input4);
            int cn = Integer.parseInt(input5);


            // CHECK MARKS RANGE

            if (java > 100 ||
                    dbms > 100 ||
                    dsa > 100 ||
                    os > 100 ||
                    cn > 100) {

                JOptionPane.showMessageDialog(
                        this,
                        "Marks must be between 0 and 100."
                );

                return;
            }


            // CALCULATE TOTAL

            int total = java + dbms + dsa + os + cn;


            // CALCULATE PERCENTAGE

            double percentage = total / 5.0;


            // CALCULATE GRADE

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
            percentageField.setText(percentage + "%");
            gradeField.setText(grade);


            // POPUP

            JOptionPane.showMessageDialog(
                    this,
                    "Student Name: " + name +
                            "\n\nTotal: " + total + " / 500" +
                            "\nPercentage: " + percentage + "%" +
                            "\nGrade: " + grade,
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }


        // =========================
        // CLEAR BUTTON
        // =========================

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
        }
    }


    public static void main(String[] args) {

        new StudentGradeCalculator();
    }
}
