package com.example.pertemuanke4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PlayActivity(
    modifier: Modifier = Modifier) {
    Column (
        modifier = modifier.fillMaxSize()) {
        SectionHeader()
        Spacer(modifier = Modifier.padding(10.dp))
        Text(text = "Kepada Yth : ", modifier.padding(start = 15.dp))
        Text(text = "Jodi", modifier.padding(15.dp))

        MainSection(Judul = "Nama", isi = "Jodi")
        MainSection(Judul = "Kelas", isi = "B")
        MainSection(Judul = "NIM", isi = "20220140065")
        MainSection(Judul = "Ket", isi = "Izin tidak mengikuti kelas")
    }
}

@Composable
fun SectionHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.LightGray)){
        Row (
            modifier = Modifier.padding()
        ){
            Box(contentAlignment = Alignment.BottomEnd){
                Image(painter = painterResource(id = R.drawable.uuu),
                    contentDescription = " ",
                    Modifier.size(100.dp),

                )

                Icon(Icons.Filled.Check,
                    contentDescription = "",
                    Modifier.padding(end = 15.dp),
                    tint = Color.Blue
                )
            }
            Column (Modifier
                .padding(20.dp ),

                ){
                Text(
                    text = "Teknologi Informasi",
                    color = Color.Black
                )
                Spacer(Modifier.padding(3.dp))
                Text(
                    text = "UMY",
                    color = Color.Black
                )
            }
        }
    }
}

@Composable
fun MainSection(Judul: String, isi : String){

        Row(modifier = Modifier
            .fillMaxWidth().padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = Judul, modifier = Modifier.weight(0.8f))
            Text(text = ":", modifier = Modifier.weight(0.2f))
            Text(text = "$isi", modifier = Modifier.weight(2f))
        }


}