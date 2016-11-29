package program.homeworksamsung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText email_edit;
    private EditText password_edit;

    private Button reg;
    private Button log;

    private TextView login;

    private String email=null;
    private String password=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email_edit = (EditText) findViewById(R.id.editText);
        password_edit = (EditText) findViewById(R.id.editText2);

        login = (TextView) findViewById(R.id.textView);

        reg = (Button) findViewById(R.id.button);
        log = (Button) findViewById(R.id.button2);
        reg.setOnClickListener(this);
        log.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.button:
                email = email_edit.getText().toString();
                password = password_edit.getText().toString();
                break;

            case R.id.button2:
                if(password == "13") {
                    Log.e("True_parol", "Good");

                } else if(password == null) { { Log.e("Not_true_parol,but_why?", "Bad");}}
                break;
        }
    }
}
