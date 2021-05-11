package sg.edu.rp.c346.id20014241.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button buttonDisplayDate, buttonDisplayTime;
    TextView tvDisplay;
    Button buttonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        buttonDisplayDate = findViewById(R.id.buttonDisplayDate);
        buttonDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.tvDisplay);
        buttonReset = findViewById(R.id.buttonReset);

        buttonDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String time = "Time is " + tp.getCurrentHour() + ":" + String.format("%02d", tp.getCurrentMinute());
                tvDisplay.setText(time);
            }
        });

        buttonDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String date = "Date is " + dp.getDayOfMonth() + "/" + (dp.getMonth() + 1) + "/" + dp.getYear();
                tvDisplay.setText(date);
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp.setCurrentHour(0);
                tp.setCurrentMinute(0);
                dp.updateDate(2021,0,1);
                tvDisplay.setText(" ");









            }
        });





    }
}