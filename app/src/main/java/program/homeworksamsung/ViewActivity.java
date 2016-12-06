package program.homeworksamsung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity implements View.OnClickListener {

    TextView recView;

    private Button exit;
    private Button topexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        exit = (Button) findViewById(R.id.button);
        topexit = (Button) findViewById(R.id.button2);
        exit.setOnClickListener(this);
        topexit.setOnClickListener(this);

        recView = (TextView) findViewById(R.id.tvView);

        Intent intent = getIntent();

        String firstname = intent.getStringExtra("fname");
        String lastname = intent.getStringExtra("lname");

        recView.setText("Your name is: " + firstname + " " + lastname);
    }
    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.button:
                finish();
                break;

            case R.id.button2:
                moveTaskToBack(true);
                super.onDestroy();
                System.exit(0);
                break;
        }
    }
}
