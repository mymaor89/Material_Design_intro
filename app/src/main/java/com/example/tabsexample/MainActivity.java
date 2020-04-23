package com.example.tabsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.dialog.MaterialDialogs;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button btn_snack;
    private Button btn_date_picker;
    private Button btn_alert;
    private TextView tv_birthday;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_snack = (Button) findViewById(R.id.btn1);
        btn_alert = (Button) findViewById(R.id.btn_alert);
        tv_birthday = (TextView) findViewById(R.id.tv1);
        btn_snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar sb = Snackbar.make(v,"You clicked the button",Snackbar.LENGTH_LONG);
                sb.setDuration(3000);
                sb.setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_SLIDE);
                sb.setAction("Approve", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast toast = Toast.makeText(v.getContext(),"I am toast",Toast.LENGTH_LONG);
                        toast.show();
                    }
                });
                sb.show();

            }
        });
        btn_date_picker = (Button) findViewById(R.id.btn2);
        btn_date_picker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MaterialDatePicker.Builder builder = MaterialDatePicker.Builder.datePicker();
                builder.setTitleText("When is you birthday?");

                final MaterialDatePicker materialDatePicker = builder.build();
                materialDatePicker.show(getSupportFragmentManager(),"DATE_PICKER");
                materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
                    @Override
                    public void onPositiveButtonClick(Object selection) {
                        tv_birthday.setText("Your date is: "+ materialDatePicker.getHeaderText());

                    }
                });
            }
        });
        btn_alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(MainActivity.this);
                builder.setTitle("Birthday");
                builder.setMessage("You are 15yr. old");
                builder.show();
            }
        });
    }
}
// btn = (Button) findViewById(R.id.btn1);
//         btn.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//        Snackbar sb = Snackbar.make(v,"You Clicked the button",Snackbar.LENGTH_LONG) ;
//        sb.show();
//        }
//        });