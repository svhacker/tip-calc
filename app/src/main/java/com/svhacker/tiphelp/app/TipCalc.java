package com.svhacker.tiphelp.app;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalc extends Activity {

    private Double preTipTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calc);
    }

    public void onClick(View v) {

        EditText preTip = (EditText) findViewById(R.id.etPreTip);

        String preTipAmt =  preTip.getText().toString();

       // TODO: Write a try-catch block to check for the case when user doesn't enter any amount - leading to NumberFormatException

        preTipTotal = Double.parseDouble(preTipAmt);

        Double finalTotalAmt = null;

        switch (v.getId()) {

            case R.id.btn10:
                finalTotalAmt = (.10 * preTipTotal) + preTipTotal;
                break;

            case R.id.btn15:
                finalTotalAmt = (.15 * preTipTotal) + preTipTotal;
                break;

            case R.id.btn20:
                finalTotalAmt = (.20 * preTipTotal) + preTipTotal;
                break;

            default:
                Log.i("Bad ID", String.valueOf(v.getId()));

        }

        TextView t = (TextView) findViewById(R.id.tvFinalTotal);

        t.setText("$" + finalTotalAmt.toString());
    }
}
