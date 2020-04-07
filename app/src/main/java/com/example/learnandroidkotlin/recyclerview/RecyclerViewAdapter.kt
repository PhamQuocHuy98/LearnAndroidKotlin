import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.learnandroidkotlin.R
import com.example.learnandroidkotlin.recyclerview.Persion
import kotlinx.android.synthetic.main.item_persion.view.*

class PersionAdapter(val data : List<Persion>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){


    inner class PersionViewHolder(itemViewHolder: View): RecyclerView.ViewHolder(itemViewHolder) {

        fun  bindData(persion: Persion){
            itemView.txtName.text =persion.name
            itemView.txtAge.text =persion.age.toString()

        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        var layoutInflare = LayoutInflater.from(parent.context).inflate(R.layout.item_persion,parent,false)

        return PersionViewHolder(layoutInflare)

    }

    override fun getItemCount() =data.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        if (holder is PersionViewHolder){
            holder.bindData(data[position])
        }
    }

}