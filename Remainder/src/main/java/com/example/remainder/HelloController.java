package com.example.remainder;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.util.Duration;

import java.net.URL;
import java.text.DateFormat;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.ResourceBundle;

import static java.lang.Integer.parseInt;

public class HelloController implements Initializable {
    @FXML
    private TextField remainderName;
    @FXML
    private TextField remainderDetails;
    @FXML
    private TextField remainderMinute;
    @FXML
    private DatePicker remainderDate;
    @FXML
    private Button submitBtn;

    //Leble
    @FXML
    private Label firstRemainder;
    @FXML
    private Label secondRemainder;
    @FXML
    private Label thirdRemainder;
    @FXML
    private Label forthRemainder;
    @FXML
    private Label fifthRemainder;
    @FXML
    public Label localTime;

    @FXML
    private ChoiceBox<String> reaminderNumber;
    @FXML
    private ChoiceBox<Integer> remainderHoure;
    @FXML
    private ChoiceBox<String> remainderAmPm;

    private Integer[] remainderHoures={1,2,3,4,5,6,7,8,9,10,11,12};
    private String[] remainderAmPms={"AM","PM"};

    private String[] remainderNumbers={"1","2","3","4","5"};
    @FXML
    protected void submitBtn(ActionEvent event) {
        int number=parseInt(reaminderNumber.getValue());
        try {
            if(number==1){
                firstRemainder.setText(remainderName.getText()+" | "+remainderDetails.getText()+" | Time:-"+remainderHoure.getValue()+" : "+remainderMinute.getText()+" "+remainderAmPm.getValue()+"| Date:-"+remainderDate.getValue());
            } else if (number==2) {
                secondRemainder.setText(remainderName.getText()+" | "+remainderDetails.getText()+" | Time:-"+remainderHoure.getValue()+" : "+remainderMinute.getText()+" "+remainderAmPm.getValue()+"| Date:-"+remainderDate.getValue());
            } else if (number==3) {
                thirdRemainder.setText(remainderName.getText()+" | "+remainderDetails.getText()+" | Time:-"+remainderHoure.getValue()+" : "+remainderMinute.getText()+" "+remainderAmPm.getValue()+"| Date:-"+remainderDate.getValue());
            } else if (number==4) {
                forthRemainder.setText(remainderName.getText()+" | "+remainderDetails.getText()+" | Time:-"+remainderHoure.getValue()+" : "+remainderMinute.getText()+" "+remainderAmPm.getValue()+"| Date:-"+remainderDate.getValue());
            } else if (number==5) {
                fifthRemainder.setText(remainderName.getText()+" | "+remainderDetails.getText()+" | Time:-"+remainderHoure.getValue()+" : "+remainderMinute.getText()+" "+remainderAmPm.getValue()+"| Date:-"+remainderDate.getValue());
            }
        } catch (Exception e){
            System.out.println("Input the Text field Properly");
        }

    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        reaminderNumber.getItems().addAll(remainderNumbers);
        remainderHoure.getItems().addAll(remainderHoures);
        remainderAmPm.getItems().addAll(remainderAmPms);


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM dd,yyyy - hh:mm:ss");
        java.time.LocalDateTime localDateTime= java.time.LocalDateTime.now();
        String time=dateTimeFormatter.format(localDateTime);
        localTime.setText(time);


        String date= String.valueOf(remainderDate);
        String stringHure=String.valueOf(remainderHoure);
        String stringMinute= String.valueOf(remainderMinute);
        String amPm=String.valueOf(remainderAmPm);
        Remainder remainder=new Remainder(stringHure,stringMinute,date,amPm);
        remainder.checkAMPM(stringHure,amPm);
        System.out.println(remainder.checkAMPM(stringHure,amPm));
        remainder.remainder(String.valueOf(localDateTime.getHour()),String.valueOf(localDateTime.getMinute()));


    }


}