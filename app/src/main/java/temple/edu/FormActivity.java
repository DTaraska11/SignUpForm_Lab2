package temple.edu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saveClicked (View view){

        EditText name = (EditText)findViewById(R.id.editTextTextPersonName);
        EditText email = (EditText)findViewById((R.id.editTextTextEmailAddress));
        EditText password = (EditText)findViewById((R.id.editTextTextPassword));
        EditText passwordConfirm= (EditText)findViewById((R.id.editTextTextPassword2));

        String sName = name.getText().toString();
        String sEmail = email.getText().toString();
        String sPassword = password.getText().toString();

        if (TextUtils.isEmpty(name.getText()) || TextUtils.isEmpty(email.getText()) || TextUtils.isEmpty(password.getText()) || TextUtils.isEmpty(passwordConfirm.getText())){
            Context context = getApplicationContext();
            CharSequence text = "You must fill out all the fields.";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

        else if(!(password.getText().toString().equals(passwordConfirm.getText().toString()))){
            Context context = getApplicationContext();
            CharSequence text = "Passwords do not match.";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

        else{
            Context context = getApplicationContext();
            CharSequence text = "Name: " + name.getText().toString();
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }



    }
}