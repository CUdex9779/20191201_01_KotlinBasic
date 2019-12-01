package kr.co.a20191201_01_kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        버튼이 눌리면
//        EditText(inputEdt)에 적힌 값을 받아서 TextView(resultTxt)에 내용으로 반영

        okBtn.setOnClickListener {

           var inputString =  inputEdt.text.toString() // get => 내용물 받아오기.
            resultTxt.text = inputString // set => 내용물 설정하기.

//            확인버튼이 눌렸는지 로그
            Log.d("확인 버튼 클릭",inputString)

//            if (inputString == "Hello"){
//                Toast.makeText(this , "안녕반가워!" , Toast.LENGTH_SHORT).show()
//            }
//            else if (inputString == "bye"){
//                Toast.makeText(this , "잘가!" , Toast.LENGTH_SHORT).show()
//            }
//            else{
//                Toast.makeText(this , "무슨 말이야?" , Toast.LENGTH_SHORT).show()
//            }

            when (inputString){
                "hello" -> {Toast.makeText(this , "안녕반가워!" , Toast.LENGTH_SHORT).show()
                Log.d("환영인사","환영인사인경우")}
                "bye" -> {Toast.makeText(this , "잘가!" , Toast.LENGTH_SHORT).show()}
                else -> {Toast.makeText(this , "무슨 말이야?" , Toast.LENGTH_SHORT).show()}
            }
        }

        okBtn.setOnLongClickListener {


            resultTxt.text = "초기상태"

            Log.d("확인버튼롱클릭","텍스트뷰초기화")
//
//            return의 의미는 OnClick을 무시할건지 말건지
//            true 일 경우 LongClick만 실행되지만
//            false일 경우 OnClick도 같이 실행된다.
            return@setOnLongClickListener true
        }


    }
}
