package com.example.modu4fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AutoCompleteTextView
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var etNama: TextInputEditText
    private lateinit var etUsername: TextInputEditText
    private lateinit var etPass: TextInputEditText
    private lateinit var etPassTwo: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        etNama = view.findViewById(R.id.textInputEtNama)
        etUsername = view.findViewById(R.id.textInputEtUsername)
        etPass = view.findViewById(R.id.textInputEtPassword)

        val btnCategory: Button = view.findViewById(R.id.btnLanjut)
        btnCategory.setOnClickListener{
//            val categoryFragment = SecondFragment()

            val nama = etNama.text.toString()
            val username = etUsername.text.toString()
            val password = etPass.text.toString()

            val bundle = Bundle()
            bundle.putString("key_nama", nama)
            bundle.putString("key_username", username)
            bundle.putString("key_password", password)

            val receiverFragment = SecondFragment()
            receiverFragment.arguments = bundle

            parentFragmentManager.beginTransaction()
                .apply {
                    replace(R.id.frame_container, receiverFragment)
                    addToBackStack(null)
                    commit()
                }
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FirstFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FirstFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}