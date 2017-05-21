package sinau.com.examplelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    String username,password;
    EditText ed1,ed2;
    String id="pelitabangsa";
    String pas="123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void loginMain(View v){
        ed1=(EditText)findViewById(R.id.edtUser);
        ed2=(EditText)findViewById(R.id.edtPas);
        username=ed1.getText().toString();
        password=ed2.getText().toString();

        if((username.contains(id))&&(password.contains(pas))){
            Intent intent = new Intent(LoginActivity.this , MainActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "LOGIN GAGAL", Toast.LENGTH_SHORT).show();
        }
    }
}
