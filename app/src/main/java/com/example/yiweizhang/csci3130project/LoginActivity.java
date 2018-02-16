package com.example.yiweizhang.csci3130project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    
    private EditText userEnterEmail, userEnterPassword;
    private Button userClickSignIn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        userEnterEmail = findViewById(R.id.userEnteredEmail);
        userEnterPassword = findViewById(R.id.userEnteredPassword);
        userClickSignIn = findViewById(R.id.clickLoginBtn);

        userClickSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userWantSignIn();
            }
        });

    }

    private void userWantSignIn(){
        String userEmail = userEnterEmail.getText().toString();
        String userPassword = userEnterPassword.getText().toString();

        mAuth.signInWithEmailAndPassword(userEmail, userPassword)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            //Log.d(TAG, "signInWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();

                            Toast.makeText(MainActivity.this, "sign in success.",
                                    Toast.LENGTH_SHORT).show();

                            // start a new activity when login successful
                            // could be the profile edit activity



                        } else {
                            // If sign in fails, display a message to the user.
                            //Log.w(TAG, "signInWithEmail:failure", task.getException());
                            Toast.makeText(MainActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();

                        }

                        // ...
                    }
                });
    }
}
