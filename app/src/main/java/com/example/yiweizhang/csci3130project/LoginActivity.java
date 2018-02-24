package com.example.yiweizhang.csci3130project;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
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

                            FirebaseUser user = mAuth.getCurrentUser();

                            Toast.makeText(LoginActivity.this, "sign in success.",
                                    Toast.LENGTH_SHORT).show();

                        } else {

                            Toast.makeText(LoginActivity.this, "sign in failed.",
                                    Toast.LENGTH_SHORT).show();

                        }

                        // ...
                    }
                });
    }
}
