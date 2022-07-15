package com.megaverkruzo.trendapps

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import java.net.URI

class GameAdapter(
    private val context: Context,
    private val dataSource: ArrayList<Game>
) : BaseAdapter() {
    private val inflater: LayoutInflater =
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int = dataSource.size

    override fun getItem(p0: Int): Any = dataSource[p0]

    override fun getItemId(p0: Int): Long = p0.toLong()

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.list_item_game, p2, false)

        val nameTextView = rowView.findViewById(R.id.game_list_name) as TextView
        val linkTextView = rowView.findViewById(R.id.game_list_link) as TextView
        val descriptionTextView = rowView.findViewById(R.id.game_list_description) as TextView

        val game = getItem(p0) as Game

        nameTextView.text = game.name
        linkTextView.text = game.link
        descriptionTextView.text = game.description


        return rowView
    }
}