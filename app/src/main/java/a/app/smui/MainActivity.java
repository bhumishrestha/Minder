package a.app.smui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email =findViewById(R.id.email);
        pass =findViewById(R.id.pass);
    }
    public void login(View view){
        String s=email.getText().toString();
        String s1=pass.getText().toString();
        Toast.makeText(this, s+"      " +s1, Toast.LENGTH_LONG).show();

        if(s.isEmpty())
        {
            email.setError("Email is required");
            return;
        }
        if(s1.isEmpty()){
            pass.setError("Password is required");
            return;
        }
        Intent in = new Intent(getApplicationContext(),HomeActivity.class);
        in.putExtra("email", s);

        in.putExtra("pass",s1);
        startActivity(in);

    }
}