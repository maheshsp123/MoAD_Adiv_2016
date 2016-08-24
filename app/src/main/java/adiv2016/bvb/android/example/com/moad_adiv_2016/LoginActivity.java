package adiv2016.bvb.android.example.com.moad_adiv_2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText userNameET_ref;
    EditText passwdET_ref;
    Button loginSubmitBtn_ref;
    UserCredentials[] userArray=new UserCredentials[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        for(int i=0;i<userArray.length;i++)
            userArray[i]=new UserCredentials("aaa"+i, "bbb"+i);

        setContentView(R.layout.activity_login);


        userNameET_ref=(EditText) findViewById(R.id.userNameET_Id);
        passwdET_ref=(EditText) findViewById(R.id.passwdET_id);
        loginSubmitBtn_ref= (Button)findViewById(R.id.loginSubmitBtnId);

        loginSubmitBtn_ref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}
