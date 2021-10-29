package com.example.homedatabase

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.homedatabase.databinding.FragmentBlank2Binding
import javax.inject.Inject


class BlankFragment2 : Fragment() {
    private lateinit var binding: FragmentBlank2Binding
   @Inject lateinit var model: HomeViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (requireActivity() as MainActivity).homeComponent.inject(this)
        binding = FragmentBlank2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       // model = ViewModelProvider(requireActivity()).get(HomeViewModel ::class.java)
       binding.button.setOnClickListener{model.sendMessage("${binding.editText.text}")}
    }
}