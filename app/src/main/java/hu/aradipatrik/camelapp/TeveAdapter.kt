package hu.aradipatrik.camelapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TeveAdapter : RecyclerView.Adapter<TeveAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.camel_store_list_item, parent, false)
        return ViewHolder(layout)
    }

    override fun getItemCount() = CamelUtils.camels.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(CamelUtils.camels[position])

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Camel) {
            itemView.findViewById<TextView>(R.id.camel_name_text_view).text = item.name
        }
    }
}