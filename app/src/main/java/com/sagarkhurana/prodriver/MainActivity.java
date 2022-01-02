package com.sagarkhurana.prodriver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Handler;

import com.sagarkhurana.prodriver.data.User;
import com.sagarkhurana.prodriver.other.SharedPref;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvUsername = findViewById(R.id.tvUsernameHome);
        CardView cvStartQuiz = findViewById(R.id.cvStartQuiz);
        CardView cvRule = findViewById(R.id.cvRule);
        CardView cvHistory = findViewById(R.id.cvHistory);
        CardView cvEditPassword = findViewById(R.id.cvEditPassword);
        CardView cvLogout = findViewById(R.id.cvLogout);

        SharedPref sharedPref = SharedPref.getInstance();
        User user = sharedPref.getUser(this);
        tvUsername.setText("Salut, " + user.getUsername());

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("My Notification", "My Notification", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }

        cvStartQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new  Intent(MainActivity.this, QuizOptionActivity.class));

                final Handler handler = new Handler();
                int id = 1;
                int constanta = 1;
                for(int i=0;i<=10;i++) {
                    int finalId = id;
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this, "My Notification");
                            builder.setContentTitle("ProDriver - Reminder");
                            builder.setContentText("Salut, " + user.getUsername() + "!\n" + "Revin-o pentru a mai exersa pentru examenul Auto!");
                            builder.setSmallIcon(R.drawable.ic_launcher_background);
                            builder.setAutoCancel(true);

                            NotificationManagerCompat managerCompat = NotificationManagerCompat.from(MainActivity.this);
                            managerCompat.notify(finalId, builder.build());
                        }
                    }, 6000*id*constanta);
                    constanta++;
                    id=id+10;
                }
//
            }
        });

        cvRule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RuleActivity.class));
            }
        });

        cvHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, HistoryActivity.class));
            }
        });

        cvEditPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, EditPasswordActivity.class));
            }
        });

        cvLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sharedPref.clearSharedPref(MainActivity.this);
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }


}