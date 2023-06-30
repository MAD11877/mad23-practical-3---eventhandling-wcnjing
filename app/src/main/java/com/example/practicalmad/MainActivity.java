package com.example.practicalmad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private boolean following = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button followButton = findViewById(R.id.flwButton);
followButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(!following){
            followButton.setText("Unfollow");
        }
        else{
            followButton.setText("Follow");
        }
        following = !following;
    }
});
    }



}