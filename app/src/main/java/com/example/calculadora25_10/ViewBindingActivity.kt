package com.example.calculadora25_10

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.calculadora25_10.databinding.ActivityMainBinding


class ViewBindingActivity: AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calcular.setOnClickListener {
            var operandouno = Integer.parseInt(binding.numero1.text.toString())
            var operandodos = Integer.parseInt(binding.cajanum2.text.toString())

            if (binding.suma.isChecked) {
                val suma: Int = operandouno + operandodos
                binding.resultado.text = "Resultado es : $suma"
                Toast.makeText(this, "Resultado:$suma", Toast.LENGTH_SHORT).show()
            } else {

                val rest: Int = operandouno - operandodos
                binding.resultado.text = "Resultado es : $rest"
                Toast.makeText(this, "Resultado:$rest", Toast.LENGTH_SHORT).show()
            }


        }
    }
}
