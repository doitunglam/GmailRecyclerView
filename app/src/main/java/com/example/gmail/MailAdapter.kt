package com.example.gmail

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView
import com.avatarfirst.avatargenlib.AvatarGenerator
import de.hdodenhof.circleimageview.CircleImageView


class MailAdapter(private val context: Context, private val dataSource: ArrayList<Email>) : BaseAdapter() {
    private val inflater: LayoutInflater
            = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    /**
     * How many items are in the data set represented by this Adapter.
     *
     * @return Count of items.
     */
    override fun getCount(): Int {
        return dataSource.size
    }

    /**
     * Get the data item associated with the specified position in the data set.
     *
     * @param position Position of the item whose data we want within the adapter's
     * data set.
     * @return The data at the specified position.
     */
    override fun getItem(position: Int): Email {
        return dataSource[position]
    }

    /**
     * Get the row id associated with the specified position in the list.
     *
     * @param position The position of the item within the adapter's data set whose row id we want.
     * @return The id of the item at the specified position.
     */
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    /**
     * Get a View that displays the data at the specified position in the data set. You can either
     * create a View manually or inflate it from an XML layout file. When the View is inflated, the
     * parent View (GridView, ListView...) will apply default layout parameters unless you use
     * [android.view.LayoutInflater.inflate]
     * to specify a root view and to prevent attachment to the root.
     *
     * @param position The position of the item within the adapter's data set of the item whose view
     * we want.
     * @param convertView The old view to reuse, if possible. Note: You should check that this view
     * is non-null and of an appropriate type before using. If it is not possible to convert
     * this view to display the correct data, this method can create a new view.
     * Heterogeneous lists can specify their number of view types, so that this View is
     * always of the right type (see [.getViewTypeCount] and
     * [.getItemViewType]).
     * @param parent The parent that this view will eventually be attached to
     * @return A View corresponding to the data at the specified position.
     */
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.email_layout, parent, false)

        val senderTextView = rowView.findViewById(R.id.sender) as TextView

        val contentTextView = rowView.findViewById(R.id.content) as TextView

        val sendDateTextView  = rowView.findViewById<TextView>(R.id.sendDate)

        val avatarImageView = rowView.findViewById<CircleImageView>(R.id.avatar)

        val email  = getItem(position)
        senderTextView.text = email.sender
        contentTextView.text = email.content
        sendDateTextView.text = email.recceiveTime

        avatarImageView.setImageDrawable(AvatarGenerator.AvatarBuilder(context)
            .setLabel(email.sender[0].toString())
            .setAvatarSize(80)
            .setTextSize(15)
            .toSquare()
            .toCircle()
            .setBackgroundColor(Color.RED)
            .build())

        return rowView
    }
}