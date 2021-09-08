package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btResult.setOnClickListener {

            val name = bindingClass.edName.text.toString().toLowerCase()
            val password = bindingClass.edPassword.text.toString().toInt()

            bindingClass.tvResult.visibility = View.VISIBLE

            if (name == Constanse.DIRECTOR_NAME && password == Constanse.DIRECTOR_PASSWORD) {
                val tempResult = "Ваша зарплата ${Constanse.DIRECTOR_SALARY}"
                bindingClass.tvResult.text = tempResult
                bindingClass.imPhoto.setImageResource(R.drawable.egor)
            } else if (name == Constanse.INGENIR_NAME && password == Constanse.INGENIR_PASSWORD){
                val tempResult = "Ваша зарплата ${Constanse.INGENIR_SALARY}"
                bindingClass.tvResult.text = tempResult
                bindingClass.imPhoto.setImageResource(R.drawable.sergey)
            } else if (name == Constanse.DVORNIK_NAME && password == Constanse.DVORNIK_PASSWORD){
                val tempResult = "Ваша зарплата ${Constanse.DVORNIK_SALARY}"
                bindingClass.tvResult.text = tempResult
                bindingClass.imPhoto.setImageResource(R.drawable.ivan)
            } else {
                bindingClass.tvResult.text = "Неверный логин или пароль"
                bindingClass.imPhoto.setImageResource(R.drawable.dula)
            }

        }

    }

}