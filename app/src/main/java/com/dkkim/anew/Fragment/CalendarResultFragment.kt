package com.dkkim.anew.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView
import androidx.fragment.app.Fragment
import com.dkkim.anew.databinding.FragmentCalendarResultBinding
import com.dkkim.anew.databinding.FragmentDietBinding
import com.dkkim.anew.databinding.FragmentSettingQnaBinding

class CalendarResultFragment(var month: Int, var dayOfMonth: Int) : Fragment() {
    lateinit var binding: FragmentCalendarResultBinding

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCalendarResultBinding.inflate(inflater, container, false)

        month = month + 1
        binding.monthDate.text = "$month/$dayOfMonth"

        Log.d("월일", "$month/$dayOfMonth")

        // 뒤로가기 버튼
        binding.backBtn.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
        // 프래그먼트에선 return 문이 코드 마지막에 와야 함
        return binding.root

    }


}