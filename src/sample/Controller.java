package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.text.NumberFormat;


public class Controller
{
    //Fields
    private double result;
    private double firstNumber;
    private double secondNumber;

    private char operator;
    private String first;
    private String second;
    private NumberFormat numberFormat;


    @FXML
    private Button zeroButton;
    @FXML
    private Button oneButton;
    @FXML
    private Button twoButton;
    @FXML
    private Button threeButton;
    @FXML
    private Button fourButton;
    @FXML
    private Button fiveButton;
    @FXML
    private Button sixButton;
    @FXML
    private Button sevenButton;
    @FXML
    private Button eightButton;
    @FXML
    private Button nineButton;
    @FXML
    private Button dotButton;
    @FXML
    private Button plusButton;
    @FXML
    private Button minesButton;
    @FXML
    private Button multiButton;
    @FXML
    private Button divideButton;
    @FXML
    private Button PiButton;
    @FXML
    private Button EButton;
    @FXML
    private Button equalButton;
    @FXML
    private Button clearButton;
    @FXML
    private Button xButton;
    @FXML
    private TextField resultTxt;


    //Constructor
    public Controller()
    {
        result = 0;
        firstNumber = 0.0;
        secondNumber = 0.0;

        numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(10);

        first = "";
        second = "";

        operator = ' ';
    }


    public void keyEvent(KeyEvent event)
    {
        if (event.getCode() == KeyCode.NUMPAD0)
        {
            if (!first.equals(""))
            {
                first += "0";
                resultTxt.setText(first);
            }
        }
        else if (event.getCode() == KeyCode.NUMPAD1)
        {
            first += "1";
            resultTxt.setText(first);
        }
        else if (event.getCode() == KeyCode.NUMPAD2)
        {
            first += "2";
            resultTxt.setText(first);
        }
        else if (event.getCode() == KeyCode.NUMPAD3)
        {
            first += "3";
            resultTxt.setText(first);
        }
        else if (event.getCode() == KeyCode.NUMPAD4)
        {
            first += "4";
            resultTxt.setText(first);
        }
        else if (event.getCode() == KeyCode.NUMPAD5)
        {
            first += "5";
            resultTxt.setText(first);
        }
        else if (event.getCode() == KeyCode.NUMPAD6)
        {
            first += "6";
            resultTxt.setText(first);
        }
        else if (event.getCode() == KeyCode.NUMPAD7)
        {
            first += "7";
            resultTxt.setText(first);
        }
        else if (event.getCode() == KeyCode.NUMPAD8)
        {
            first += "8";
            resultTxt.setText(first);
        }
        else if (event.getCode() == KeyCode.NUMPAD9)
        {
            first += "9";
            resultTxt.setText(first);
        }
        else if (event.getCode() == KeyCode.DECIMAL)
        {
            if (!first.contains("."))
            {
                if (first.equals(""))
                {
                    first += "0.";
                    resultTxt.setText(first);
                }
                else
                {
                    first += ".";
                    resultTxt.setText(first);
                }
            }
        }
        else if (event.getCode() == KeyCode.ADD)
        {
            chekEquals();
            operator = '+';
        }
        else if (event.getCode() == KeyCode.SUBTRACT)
        {
            chekEquals();
            operator = '-';
        }
        else if (event.getCode() == KeyCode.MULTIPLY)
        {
            chekEquals();
            operator = '*';
        }
        else if (event.getCode() == KeyCode.DIVIDE)
        {
            chekEquals();
            operator = '/';
        }
        else if (event.getCode() == KeyCode.DELETE)
        {
            first = "";
            second = "";
            operator = ' ';
            result = 0;
            firstNumber = 0.0;
            secondNumber = 0.0;
            resultTxt.setText("");
        }
        else if (event.getCode() == KeyCode.BACK_SPACE)
        {
            if (!first.equals(""))
            {
                first = first.substring(0, first.length() - 1);
            }
        }
        else if (event.getCode() == KeyCode.ENTER)
        {
            if(second.equals(""))
                second = "0";
            secondNumber = Double.parseDouble(second);
            if (operator == '+')
            {
                result = firstNumber + Double.parseDouble(first);
            }
            else if (operator == '-')
            {
                result = firstNumber - Double.parseDouble(first);
            }
            else if (operator == '*')
            {
                result = firstNumber * Double.parseDouble(first);
            }
            else if (operator == '/')
            {
                try
                {
                    result = firstNumber / Double.parseDouble(first);
                } catch (Exception e)
                {
                    result = 0;
                    System.out.println("Divide by zero");
                }
            }
        }
    }

    public void clickButton(ActionEvent event)
    {
        if (event.getSource() == zeroButton)
        {
            if (!first.equals(""))
            {
                first += "0";
                resultTxt.setText(first);
            }
        }
        else if (event.getSource() == oneButton)
        {
            first += "1";
            resultTxt.setText(first);
        }
        else if (event.getSource() == twoButton)
        {
            first += "2";
            resultTxt.setText(first);
        }
        else if (event.getSource() == threeButton)
        {
            first += "3";
            resultTxt.setText(first);
        }
        else if (event.getSource() == fourButton)
        {
            first += "4";
            resultTxt.setText(first);
        }
        else if (event.getSource() == fiveButton)
        {
            first += "5";
            resultTxt.setText(first);
        }
        else if (event.getSource() == sixButton)
        {
            first += "6";
            resultTxt.setText(first);
        }
        else if (event.getSource() == sevenButton)
        {
            first += "7";
            resultTxt.setText(first);
        }
        else if (event.getSource() == eightButton)
        {
            first += "8";
            resultTxt.setText(first);
        }
        else if (event.getSource() == nineButton)
        {
            first += "9";
            resultTxt.setText(first);
        }
        else if (event.getSource() == dotButton)
        {
            if (!first.contains("."))
            {
                if (first.equals(""))
                {
                    first += "0.";
                    resultTxt.setText(first);
                }
                else
                {
                    first += ".";
                    resultTxt.setText(first);
                }
            }
        }
        else if (event.getSource() == plusButton)
        {
            chekEquals();
            operator = '+';
        }
        else if (event.getSource() == minesButton)
        {
            chekEquals();
            operator = '-';
        }
        else if (event.getSource() == multiButton)
        {
            chekEquals();
            operator = '*';
        }
        else if (event.getSource() == divideButton)
        {
            chekEquals();
            operator = '/';
        }
        else if (event.getSource() == PiButton)
        {
            first = "3.1415926";
        }
        else if (event.getSource() == EButton)
        {
            if (!first.equals(""))
            {
                first = first.substring(0, first.length() - 1);
            }
        }
        else if (event.getSource() == equalButton)
        {
            secondNumber = Double.parseDouble(second);
            if (operator == '+')
            {
                result = firstNumber + Double.parseDouble(first);
            }
            else if (operator == '-')
            {
                result = firstNumber - Double.parseDouble(first);
            }
            else if (operator == '*')
            {
                result = firstNumber * Double.parseDouble(first);
            }
            else if (operator == '/')
            {
                try
                {
                    result = firstNumber / Double.parseDouble(first);
                } catch (Exception e)
                {
                    result = 0;
                    System.out.println("Divide by zero");
                }
            }
            else
            {
                result = Double.parseDouble(first);
            }

            resultTxt.setText(numberFormat.format(result) + "");

            result = 0;
            firstNumber = 0.0;
            secondNumber = 0.0;

        }

        else if (event.getSource() == clearButton)
        {
            first = "";
            second = "";
            operator = ' ';
            result = 0;
            firstNumber = 0.0;
            secondNumber = 0.0;
            resultTxt.setText("");
        }

        else if (event.getSource() == xButton)
        {
            if (!first.equals(""))
            {
                double curr = -Double.parseDouble(first);

                first = Double.toString(curr);
            }
        }
    }

    private void chekEquals()
    {
        if (!first.equals(""))
        {
            switch (operator)
            {
                case '+' -> firstNumber = firstNumber + Double.parseDouble(first);
                case '-' -> firstNumber = firstNumber - Double.parseDouble(first);
                case '*' -> firstNumber = firstNumber * Double.parseDouble(first);
                case '/' -> firstNumber = firstNumber / Double.parseDouble(first);
                default -> firstNumber = Double.parseDouble(first);
            }
            second = first;
            first = "";
            resultTxt.setText("");
        }
        else
        {
            first = "0";
        }
    }
}
