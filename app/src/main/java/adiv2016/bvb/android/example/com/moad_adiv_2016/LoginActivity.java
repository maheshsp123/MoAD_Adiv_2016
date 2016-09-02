package adiv2016.bvb.android.example.com.moad_adiv_2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                String userName=userNameET_ref.getText().toString();
                String pswd=passwdET_ref.getText().toString();
                boolean flag=false;
                for (int a=0;a<userArray.length;a++)
                {
                    if(userName.equals(userArray[a].userName)  &&
                            pswd.equals(userArray[a].password) )
                    {
                        flag=true;
                        break;

                    }
                }
                if (flag)
                    Toast.makeText
                            (LoginActivity.this, "successfull login", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText
                            (LoginActivity.this, "login failed", Toast.LENGTH_SHORT).show();
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_login,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int select_item= item.getItemId();
        if(select_item==R.id.profile_menuitem_id)
            Toast.makeText
                    (LoginActivity.this, "profile selected"
                            , Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
}
