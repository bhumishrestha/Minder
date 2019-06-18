package a.app.smui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
TextView email_txt, pass_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        email_txt =findViewById(R.id.email_txt);
        pass_txt=findViewById(R.id.pass_txt);

        Intent in=getIntent();
       String s= in.getStringExtra("email");
       String s1=in.getStringExtra("pass");

       email_txt.setText(s);
       pass_txt.setText(s1);
    }
}
