package com.example.agendajc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ItemList(
                itemContacto = listOf(
                    Contacto("Juan Martinez Soria", "624215122", "masc"),
                    Contacto("Raúl González", "627482939", "masc"),
                    Contacto("Ana Bohueles", "644535636", "fem"),
                    Contacto("Eloy", "666777888", "masc"),
                    Contacto("Pedro", "624215122", "masc"),
                    Contacto("Juanma", "627482939", "masc"),
                    Contacto("Luisa Gaming Cardozo", "644535636", "fem"),
                    Contacto("Migue", "666777888", "masc"),
                    Contacto("Lola", "624215123", "fem"),
                    Contacto("Ignacio", "627482938", "masc"),
                    Contacto("Antonio", "644535635", "masc"),
                    Contacto("Sara", "666777887", "fem"),
                    Contacto("Juana", "644535631", "fem"),
                    Contacto("Isabel", "666777884", "fem"),
                    Contacto("Lola", "624215123", "fem"),
                    Contacto("Pedro Primo", "627482930", "masc"),
                    Contacto("Curro", "644535637", "masc"),
                    Contacto("Saray", "666777889", "fem"),
                )
            )
        }
    }
    @Composable
    fun ItemList(itemContacto: List<Contacto>){
        LazyColumn{
            items(itemContacto){
                itemContacto -> ContactoView(contacto = itemContacto)
            }
        }
    }
    @Composable
    fun ContactoView(contacto: Contacto){
        Card(Modifier.fillMaxWidth()) {
            Row{
                Column {
                    Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "Miguel dúchate porfa", Modifier.height(100.dp))
                }
                Column {
                    Text(text = contacto.nombre, fontSize = 24.sp, modifier = Modifier.padding(8.dp))
                }
            }
        }
    }
}
