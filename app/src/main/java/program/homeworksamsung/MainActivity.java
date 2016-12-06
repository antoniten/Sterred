package program.homeworksamsung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Create!", "Create!");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Start!", "Start!");
    }
    @Override
    protected void onRestart() {
        super.onStart();
        Log.e("Start!", "Start!");
    }
    @Override
    protected void onResume() {
        super.onStart();
        Log.e("Resume", "Resume");
    }
    @Override
    protected void onPause() {
        super.onStart();
        Log.e("Pause||", "Pause||");
    }
    @Override
    protected void onStop() {
        super.onStart();
        Log.e("Stop", "Stop");
    }
    @Override
    protected void onDestroy() {
        super.onStart();
        Log.e("Really ?", "Destroy(((");
    }
}
