package com.example.recyclerveiw

data class Sensation(val imageId:Int, val title:String)
class SensationList{val list = arrayListOf(
    Sensation(R.drawable.sensation_item_1, "Спокойным"),
    Sensation(R.drawable.sensation_item_2, "Расслабленным"),
    Sensation(R.drawable.sensation_item_3, "Задумчивым"),
    Sensation(R.drawable.sensation_item_1, "Взволнованным"))}
