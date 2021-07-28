
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jkdajac.organiserroom.R
import com.jkdajac.organiserroom.Text
import kotlinx.android.synthetic.main.item_read.view.*


 class TextAdapter(val profiles: ArrayList<Text>, val context: Context )
    : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_read, parent,false))

    }

    override fun onBindViewHolder( holder: ViewHolder,  index: Int) {
        holder.theme.text = profiles[index].theme

        }

     override fun getItemCount(): Int {
        return profiles.size
     }
 }

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val theme = itemView.tvTheme


}