package br.edu.ifsp.dmo1.login.ui.logged

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import br.edu.ifsp.dmo1.login.databinding.ActivityLoggedBinding
import br.edu.ifsp.dmo1.login.ui.main.MainActivity
import androidx.lifecycle.viewModelScope


class LoggedActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoggedBinding
    private lateinit var viewModel: LoggedViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoggedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(LoggedViewModel::class.java)
        binding.textMessage.setText("Bem-Vindo")

        setListener()
    }

    /* Ao clicar no botão Logout, ele chama o método logout do ViewModel que consequentemente em uma corrotina, chama de uma
    * instancia do repositório,  o método SavePreferences passando um argumento como false */
    private fun setListener(){
        binding.botaoLogout.setOnClickListener{
            viewModel.logout()
            val intentM = Intent(this, MainActivity::class.java)
            startActivity(intentM)
            finish()
        }
    }

}

