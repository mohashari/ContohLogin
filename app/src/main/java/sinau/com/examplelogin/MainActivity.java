package sinau.com.examplelogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int A = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plushA(View v){
        A=A+1;
        jumlahA(A);
    }
    public void minA(View v){
        A = A-1;
        jumlahA(A);
    }
    public void jumlahA(int A){
        TextView txtA =(TextView) findViewById(R.id.txtA);
        txtA.setText(String.valueOf(A));
    }

}
