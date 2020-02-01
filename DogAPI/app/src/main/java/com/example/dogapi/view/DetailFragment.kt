package com.example.dogapi.view


//import com.devtides.dogs.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.dogapi.R
import kotlinx.android.synthetic.main.fragment_detail.*

/**
 * A simple [Fragment] subclass.
 */
class DetailFragment : Fragment() {

    private var dogUuid = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //If argument is not null run this bit of code
        arguments?.let {
            dogUuid = DetailFragmentArgs.fromBundle(it).dogUuid
            textView2.text = dogUuid.toString()
        }

            buttonList.setOnClickListener {
                val action = DetailFragmentDirections.actionListFragment()
                Navigation.findNavController(it).navigate(action)
            }
    }

}
