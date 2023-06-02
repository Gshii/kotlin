package com.example.messanger3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import com.example.messanger3.R

import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : AppCompatActivity() {
    private var users= arrayListOf(
        UserStory("User1"),
        UserStory("User2"),
        UserStory("User3"),
        UserStory("User4"),
        UserStory("User5"),
        UserStory("User6"),
        UserStory("User7"),
        UserStory("User8")



    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<RecyclerView>(R.id.stories)?.apply{
            this.layoutManager =LinearLayoutManager(this@MainActivity, RecyclerView.HORIZONTAL,false)
            this.adapter=StoryAdapter()
        }
    }

    inner class StoryAdapter: RecyclerView.Adapter<StoryAdapter.StoryViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
            return StoryViewHolder(LayoutInflater.from( this@MainActivity).inflate(R.layout.story_item_style, null, false))
        }

        override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
            holder.itemView.findViewById<TextView>(R.id.username)?.text = users[position].username
        }

        override fun getItemCount(): Int {
            return users.count()
        }

        inner class StoryViewHolder(item: View): RecyclerView.ViewHolder(item)
    }

}

class UserStory{
    var username: String = ""

    constructor(userStory: String){
        this.username = username
    }
}