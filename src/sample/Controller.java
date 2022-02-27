package sample;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;



public class Controller
{
    private double result;
    private char operator;
    private String first;
    private String second;

    public Controller()
    {
        result = 0;
        operator = ' ';
        first = "";
        second = "";
    }



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

    public void clickButton(ActionEvent event)
    {
        if(event.getSource() == zeroButton)
        {
            first += "0";
            resultTxt.setText(first);
        }
        else if(event.getSource() == oneButton)
        {
            first += "1";
            resultTxt.setText(first);
        }
        else if(event.getSource() == twoButton)
        {
            first += "2";
            resultTxt.setText(first);
        }
        else if(event.getSource() == threeButton)
        {
            first += "3";
            resultTxt.setText(first);
        }
        else if(event.getSource() == fourButton)
        {
            first += "4";
            resultTxt.setText(first);
        }
        else if(event.getSource() == fiveButton)
        {
            first += "5";
            resultTxt.setText(first);
        }
        else if(event.getSource() == sixButton)
        {
            first += "6";
            resultTxt.setText(first);
        }
        else if(event.getSource() == sevenButton)
        {
            first += "0";
            resultTxt.setText(first);
        }
        else if(event.getSource() == eightButton)
        {
            first += "8";
            resultTxt.setText(first);
        }
        else if(event.getSource() == nineButton)
        {
            first += "9";
            resultTxt.setText(first);
        }
        else if(event.getSource() == dotButton)
        {
            if(!first.contains("."))
            {
                if(first.equals(""))
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
        else if(event.getSource() == plusButton)
        {
            if(!first.equals(""))
            {
                second = first;
                first = "";
                operator = '+';
                resultTxt.setText(first + " + ");
            }
            else if(!second.equals(""))
            {
                operator = '-';
            }
        }
        else if(event.getSource() == minesButton)
        {
            if(!first.equals(""))
            {
                second = first;
                first = "";
                operator = '-';
                resultTxt.setText(first + " - ");
            }
            else if(!second.equals(""))
            {
                operator = '-';
            }
        }
        else if(event.getSource() == multiButton)
        {
            if(!first.equals(""))
            {
                second = first;
                first = "";
                operator = '*';
                resultTxt.setText(first + " x ");
            }
            else if(!second.equals(""))
            {
                operator = '-';
            }
        }
        else if(event.getSource() == divideButton)
        {
            if(!first.equals(""))
            {
                second = first;
                first = "";
                operator = '/';
                resultTxt.setText(first + " ÷ ");
            }
            else if(!second.equals(""))
            {
                operator = '-';
            }
        }
        else if(event.getSource() == PiButton)
        {
            first = "3.1415926";
        }
        else if(event.getSource() == EButton)
        {
            first = "2.7182818";
        }
        else if(event.getSource() == equalButton)
        {
            if(!first.equals("") && !second.equals(""))
            {
                if(operator == '+')
                {
                    result = Double.parseDouble(second) + Double.parseDouble(first);
                }
                else if(operator == '-')
                {
                    result = Double.parseDouble(second) - Double.parseDouble(first);
                }
                else if(operator == '*')
                {
                    result = Double.parseDouble(second) * Double.parseDouble(first);
                }
                else
                {
                    try
                    {
                        result = Double.parseDouble(second) + Double.parseDouble(first);
                    }
                    catch(Exception e)
                    {
                        result = 0;
                        System.out.println("Divide by zero");
                    }
                }
            }
        }
        else if(event.getSource() == clearButton)
        {
            first = "";
            second = "";
            operator = ' ';
            result = 0;
        }
        else if(event.getSource() == xButton)
        {
            if(!first.equals(""))
            {
                double curr = -Double.parseDouble(first);

                first = Double.toString(curr);
            }
        }
    }
}