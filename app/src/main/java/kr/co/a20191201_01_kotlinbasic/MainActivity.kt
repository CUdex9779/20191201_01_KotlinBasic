package kr.co.a20191201_01_kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        버튼이 눌리면
//        EditText(inputEdt)에 적힌 값을 받아서 TextView(resultTxt)에 내용으로 반영

        okBtn.setOnClickListener {
            
        }


    }
}
