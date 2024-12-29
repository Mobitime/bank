package com.example.bank

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class SliderAdapter(private val context: Context) : RecyclerView.Adapter<SliderAdapter.SliderViewHolder>() {

    private val sliderList = listOf(
        SliderItem("Добро пожаловать в банк", "Ваш надежный финансовый партнер.", R.drawable.slide1),
        SliderItem("Легкая регистрация", "Зарегистрируйтесь, чтобы начать использовать наши услуги.", R.drawable.slide2),
        SliderItem("Вход", "Войдите, чтобы получить доступ к своему аккаунту.", R.drawable.slide3)
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SliderViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_slider, parent, false)
        return SliderViewHolder(view)
    }

    override fun onBindViewHolder(holder: SliderViewHolder, position: Int) {
        val currentItem = sliderList[position]
        holder.bind(currentItem)
    }

    override fun getItemCount(): Int = sliderList.size

    class SliderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val title: TextView = itemView.findViewById(R.id.title)
        private val description: TextView = itemView.findViewById(R.id.description)
        private val image: ImageView = itemView.findViewById(R.id.image)

        fun bind(sliderItem: SliderItem) {
            title.text = sliderItem.title
            description.text = sliderItem.description
            image.setImageResource(sliderItem.imageRes)
        }
    }
}
