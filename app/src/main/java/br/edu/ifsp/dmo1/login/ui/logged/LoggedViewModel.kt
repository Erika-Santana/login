package br.edu.ifsp.dmo1.login.ui.logged

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import br.edu.ifsp.dmo1.login.data.DataStoreRepository
import kotlinx.coroutines.launch

class LoggedViewModel(application: Application) : AndroidViewModel(application){

    var repository =  DataStoreRepository(application)

    //Função corrotina para a chamada do método suspend savePreferences com um único argumento
    fun logout(){
        viewModelScope.launch {
            repository.savePreferences(false)
        }
    }


}
