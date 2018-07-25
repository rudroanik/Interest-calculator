package com.example.registration.interestcalculator;import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView mPrincipalAmount,mInterestRate,mTimePeriod,mInterestAmount,mTotalAmount;
    Button mBtnCalculate;
    int calculateInterestAmount,totalAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPrincipalAmount = findViewById(R.id.edit_pricipal_amount);
        mInterestRate = findViewById(R.id.edit_interset_rate);
        mTimePeriod =findViewById(R.id.edit_time_period);
        mInterestAmount = findViewById(R.id.edit_interest_amount);
        mTotalAmount =findViewById(R.id.edit_total_amount);
        mBtnCalculate = findViewById(R.id.btn_calculate);

        mBtnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                    // String principalAmount= mPrincipalAmount.getText().toString();
                    int principalAmount = Integer.parseInt(mPrincipalAmount.getText().toString());

                    //String interestRate = mInterestRate.getText().toString();
                    int intRate = Integer.parseInt(mInterestRate.getText().toString());

                    // String timePeriod =mTimePeriod.getText().toString();
                    int Period = Integer.parseInt(mTimePeriod.getText().toString());

                    calculateInterestAmount = intRate * Period;
                    mInterestAmount.setText(Integer.toString(calculateInterestAmount));

                    totalAmount = principalAmount + calculateInterestAmount;
                    mTotalAmount.setText(Integer.toString(totalAmount));


            }
        });

    }


}
