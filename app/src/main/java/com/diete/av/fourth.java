package com.diete.av;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class fourth extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);


        final Button calc = (Button) findViewById(R.id.calculeaza);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText e1 = (EditText) findViewById(R.id.inaltime);
                EditText e2 = (EditText) findViewById(R.id.greutate);
                TextView t1 = (TextView) findViewById(R.id.rezultat);
                TextView t2 = (TextView) findViewById(R.id.textView8);


                String text = e1.getText().toString();
                String text2 = e2.getText().toString();
                String msg = null;


                if (( text.equals(".") || text.equals("") || text.equals("-") || text2.equals(".") || text2.equals("") || text2.equals("-") ))
                    t1.setText("Invalid");
                else {

                    Float num1 = Float.parseFloat(e1.getText().toString());
                    Float num2 = Float.parseFloat(e2.getText().toString());
                    Float sum = ( num2 / ( ( num1 * num1 ) / 10000 ) );
                    t1.setText(String.valueOf(sum));

                    if(sum < 18.5){
                        msg = "Subponderal,risc pentru sanatate: ridicat";

                    }else if(sum > 18.5 && sum < 24.9){

                        msg = "IMC normal, risc pentru sanatate: minim/scazut";
                    }else if(sum > 25 && sum < 29.9){

                        msg = "Obezitate de tip I,risc pentru sanatate:scazut/moderat";
                    }else if(sum > 30 && sum < 34.9){
                        msg = "Obezitate de tip II, risc pentru sanatate:moderat/ridicat";
                    }else if(sum > 35){
                        msg = "Obezitate morbida, risc pentru sanatate:ridicat";
                    }

                    t2.setText(msg);


                }
            }
        });
    }
}