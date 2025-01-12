package br.edu.ifsp.dmo1.login.util

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import br.edu.ifsp.dmo1.login.data.DataStoreRepository


//Essa variável é importada no repositorio
val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = DataStoreRepository.PreferencesFiles.FILE_NAME)

class DataStoreExtension {
}