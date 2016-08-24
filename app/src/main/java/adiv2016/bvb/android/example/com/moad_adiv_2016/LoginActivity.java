package adiv2016.bvb.android.example.com.moad_adiv_2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText userNameET_ref;
    EditText passwdET_ref;
    Button loginSubmitBtn_ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userNameET_ref=(EditText) findViewById(R.id.userNameET_Id);


    }
}
