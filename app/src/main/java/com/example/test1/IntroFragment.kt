package com.example.test1

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.test1.databinding.FragmentIntroBinding

class IntroFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        (activity as AppCompatActivity).supportActionBar?.title = "YES OR NO"
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_intro, container, false)

        val binding: FragmentIntroBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_intro,
            container, false)
        binding.startBtn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_introFragment_to_quizFragment3)
        )
        setHasOptionsMenu(true)
        return binding.root
        }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.overflow_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!, view.findNavController())
                || super.onOptionsItemSelected(item)
    }
}