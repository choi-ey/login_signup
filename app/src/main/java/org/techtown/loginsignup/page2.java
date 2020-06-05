package org.techtown.loginsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.techtown.loginsignup.ui.login.LoginActivity;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        //가입하기 버튼
        Button  Edit_signup = (Button)findViewById(R.id. Edit_signup);
        Edit_signup.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //if (DB에 저장된 id와 중복되면 ) -> 중복되는 아이디 설정 오류 메세지 출력
                //if (pw가 6자리 이하라면) -> 비번 설정 오류 메세지 출력

                //else 인경우
                Toast.makeText(getApplicationContext(), "가입완료!", Toast.LENGTH_LONG).show();
                //+db에 저장

                Intent first= new Intent(page2.this, LoginActivity.class);
                startActivity(first);
            }
        });
    }




}
