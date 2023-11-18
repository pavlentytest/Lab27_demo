package ru.myitschool.lab23

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.checkbox.MaterialCheckBox
import com.google.android.material.chip.Chip
import com.google.android.material.switchmaterial.SwitchMaterial
import androidx.appcompat.widget.AppCompatToggleButton
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView


class MainActivity : AppCompatActivity() {

    private lateinit var chip: Chip
    private lateinit var checkBox: MaterialCheckBox
    private lateinit var switchMaterial: SwitchMaterial
    private lateinit var toggleButton: AppCompatToggleButton

    private lateinit var btn: MaterialButton
    private lateinit var tv: MaterialTextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.show_action)
        tv = findViewById(R.id.summary_text)
        chip = findViewById(R.id.chip_material)
        checkBox = findViewById(R.id.check_box_material)
        switchMaterial = findViewById(R.id.switch_material)
        toggleButton = findViewById(R.id.toggle_button)

        btn.setOnClickListener {
            tv.apply {
                val resultChip = with(chip) {
                   "${javaClass.canonicalName}:${isChecked}"
                }
                val resultCheckbox = with(checkBox) {
                    "${javaClass.canonicalName}:${isChecked}"
                }
                val switchMaterial = with(switchMaterial) {
                    "${javaClass.canonicalName}:${isChecked}"
                }
                val toggleButton = with(toggleButton) {
                    "${javaClass.canonicalName}:${isChecked}"
                }
                this.text = "$resultChip\n$resultCheckbox\n$switchMaterial\n$toggleButton"
            }
        }

    }
}