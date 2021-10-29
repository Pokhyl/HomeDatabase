package com.example.homedatabase

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.homedatabase.databinding.FragmentBlank1Binding
import javax.inject.Inject

class BlankFragment1 : Fragment() {
lateinit var binding: FragmentBlank1Binding
    @Inject
    lateinit var model: HomeViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (requireActivity() as MainActivity).homeComponent.inject(this)
        binding = FragmentBlank1Binding.inflate(inflater,container, false)
        // Inflate the layout for this fragment
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val model = ViewModelProvider(requireActivity()).get(HomeViewModel ::class.java)
        model.message.observe(viewLifecycleOwner, {
            binding.textView.text = it
        })
        model.list().observe(viewLifecycleOwner,{
            println(it+",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,")
        })
    }

}