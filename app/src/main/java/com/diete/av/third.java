package com.diete.av;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.text.method.ScrollingMovementMethod;
        import android.widget.TextView;

public class third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView textView = (TextView)findViewById(R.id.textView4);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }
}
