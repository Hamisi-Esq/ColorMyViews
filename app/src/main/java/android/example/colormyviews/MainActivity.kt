package android.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){

        val view1 : View = findViewById(R.id.box_one_text)
        val view2 : View = findViewById(R.id.box_two_texts)
        val view3 : View = findViewById(R.id.box_three_text)
        val view4 : View = findViewById(R.id.box_four_text)
        val view5 : View = findViewById(R.id.box_five_text)
        val view6 : View = findViewById(R.id.constraint_layout)

//        buttons
        var red_button : View = findViewById(R.id.red_button)
        var green_button : View = findViewById(R.id.green_button)
        var yellow_button : View = findViewById(R.id.yellow_button)

        val clickableViews: List<View> =
            listOf(view1, view2, view3, view4, view5, view6, red_button, green_button, yellow_button)

        for (item in clickableViews){
            item.setOnClickListener{ makeColored(it)}
        }
    }

    private
    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_texts -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}