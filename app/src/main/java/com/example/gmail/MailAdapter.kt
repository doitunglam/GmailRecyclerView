package com.example.gmail

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.avatarfirst.avatargenlib.AvatarGenerator
import de.hdodenhof.circleimageview.CircleImageView


class MailAdapter(val items: ArrayList<Email>) : RecyclerView.Adapter<MailAdapter.MailViewHolder>() {
    class MailViewHolder(val itemView : View) : RecyclerView.ViewHolder(itemView){
        val sender = itemView.findViewById<TextView>(R.id.sender)
        val content = itemView.findViewById<TextView>(R.id.content)
        val sendDate = itemView.findViewById<TextView>(R.id.sendDate)
        val avatar = itemView.findViewById<CircleImageView>(R.id.avatar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MailViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.email_layout, parent, false);
        return  MailViewHolder(itemView);
    }

    override fun onBindViewHolder(holder: MailViewHolder, position: Int) {
        val email = items[position]
        holder.avatar.setImageDrawable(AvatarGenerator.AvatarBuilder(holder.avatar.context)
            .setLabel(email.sender[0].toString())
            .setAvatarSize(80)
            .setTextSize(15)
            .toSquare()
            .toCircle()
            .setBackgroundColor(Color.RED)
            .build())
        holder.sender.text = email.sender
        holder.content.text = email.content
        holder.sendDate.text = email.recceiveTime
    }

    override fun getItemCount(): Int {
        return items.size

    }
}