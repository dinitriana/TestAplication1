package com.example.test1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

class QuizFragment : Fragment() {

    val questions = arrayOf("Speeds?",
                            "Km/rpm?",
                            "The Colours?")

    var YES_score = 0
    var NO_score  = 0
    var current_question = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.title =  "QUIZ.."
        // Inflate the layout for this fragment
        val binding: ViewDataBinding? = DataBindingUtil.inflate(
            inflater, R.layout.fragment_quiz, container,false)

        binding.questionText.text = questions[current_question]

        binding.YesButton.setOnClickListener{
            YES_score++
            nextQuestion(binding)
        }
        binding.YesButton.setOnClickListener {
            NO_score++
            nextQuestion(binding)
        }
        return binding.root
    }
    fun nextQuestion(binding: ViewDataBinding?){
        current_question++
        binding.questionText.text = questions[current_question]

        if(current_question < questions.size)
            Toast.makeText(context, "berhasil!", Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(context, "sudah maximal!.. next fragment", Toast.LENGTH_SHORT).show()
    }
}