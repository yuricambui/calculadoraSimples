package com.example.calculadorasimples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadorasimples.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calcular.setOnClickListener{ calcular() }
    }

    fun calcular() {
        val stringInTextField = binding.valorP.text.toString()
        val valor1 = stringInTextField.toInt()
        val stringInTextField2 = binding.valorS.text.toString()
        val valor2 = stringInTextField2.toInt()
        val selectedId = binding.calOptions.checkedRadioButtonId
        val Operacao = when (selectedId) {
            R.id.option_acao_soma -> valor1
            R.id.option_acao_soma -> valor2
            else -> R.id.option_acao_subtracao

        }
        var result = valor1 + valor2
    }
    val resultado = binding.resultadoConta.text = getString(R.string.resultado1)

}