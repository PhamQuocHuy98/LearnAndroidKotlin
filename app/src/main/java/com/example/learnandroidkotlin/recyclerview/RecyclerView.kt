package com.example.learnandroidkotlin.recyclerview

import PersionAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.learnandroidkotlin.R
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)


        // đầu tiên có data set

        var listPerSion = mutableListOf<Persion>()

        listPerSion.apply {
            add(Persion("Huy",18))
            add(Persion("Huy1",20))
            add(Persion("Huy2",22))
            add(Persion("Huy3",25))
            add(Persion("Huy5",27))
            add(Persion("Huy8",28))
            add(Persion("Huy9",30))

        }

        /// tiếp theo cần 1 LayoutManager
        var persionAdapter = PersionAdapter(listPerSion)

        val linearLayoutManager = LinearLayoutManager(this)
        recycleView.apply {
            setItemViewCacheSize(2)
            layoutManager = linearLayoutManager
            adapter=persionAdapter

        }

    }
}
