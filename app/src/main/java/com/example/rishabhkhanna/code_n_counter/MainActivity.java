package com.example.rishabhkhanna.code_n_counter;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import com.example.rishabhkhanna.code_n_counter.UIs.StudentSignUp;
import com.example.rishabhkhanna.code_n_counter.UIs.Student_Login;
import com.example.rishabhkhanna.code_n_counter.UIs.TeacherSignup;
import com.example.rishabhkhanna.code_n_counter.UIs.Teacher_Login;

public class MainActivity extends AppCompatActivity {
    Button teacher;
    Button student;

    ImageView im1,icon,im2;



    public static final float START_FROM = 0f;
    public static final float END_1 = 360f;
    public static final float END_2 = -1*360f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teacher = (Button) findViewById(R.id.teacherSignup);
        student = (Button) findViewById(R.id.studentSignup);

        im1 = (ImageView) findViewById(R.id.image_1);
        im2 = (ImageView) findViewById(R.id.image_2);

        icon = (ImageView) findViewById(R.id.icon);

        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i = new Intent(MainActivity.this ,Teacher_Login.class);
                startActivity(i);

            }
        });

        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this , Student_Login.class);
                startActivity(i);
            }
        });

        RotateAnimation rotateAnimation = new RotateAnimation(START_FROM,END_1, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration((long)10000);
        rotateAnimation.setRepeatCount(Animation.INFINITE);
        im1.setAnimation(rotateAnimation);

        RotateAnimation rotateAnimation1 = new RotateAnimation(START_FROM,END_2, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        rotateAnimation1.setRepeatCount(Animation.INFINITE);
        rotateAnimation1.setInterpolator(new LinearInterpolator());
        rotateAnimation1.setDuration((long)10000);
        im2.setAnimation(rotateAnimation1);


        
    }
}
