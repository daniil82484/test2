package com.example.recyclerveiw

data class Poster(val imageId:Int, val title:String, val title2:String)
class PosterList{val list = arrayListOf(
    Poster(R.drawable.poster_1, "Заголовок блока", "Краткое описание блока с двумя строчками"),
    Poster(R.drawable.poster_2, "Заголовок блока", "Краткое описание блока с двумя строчками"),
    Poster(R.drawable.poster_3, "Заголовок блока", "Краткое описание блока с двумя строчками"),
    Poster(R.drawable.poster_1, "Заголовок блока", "Краткое описание блока с двумя строчками"),
    Poster(R.drawable.poster_1, "Заголовок блока", "Краткое описание блока с двумя строчками"),
    Poster(R.drawable.poster_2, "Заголовок блока", "Краткое описание блока с двумя строчками"))}
