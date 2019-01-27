package care.nursing.nursingcare.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import care.nursing.nursingcare.DataBaseFake
import care.nursing.nursingcare.R

class NextPatients (private val data: ArrayList<DataBaseFake.CardViewInformation>) : RecyclerView.Adapter<NextPatients.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_next_patients, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, i: Int) {
        holder.tv_name.text = data[i].name
        holder.tv_date.text = data[i].date
        holder.tv_direction.text = data[i].direction
        holder.tv_schedule.text = data[i].schedule
        holder.iv_patient.setImageResource(data[i].photo)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var tv_name: TextView
        internal var tv_schedule : TextView
        internal var tv_direction : TextView
        internal var tv_date : TextView
        internal var iv_patient : ImageView

        init {
            tv_name = itemView.findViewById(R.id.tv_patient_name) as TextView
            tv_schedule = itemView.findViewById(R.id.tv_schedule) as TextView
            tv_direction = itemView.findViewById(R.id.tv_direction) as TextView
            tv_date = itemView.findViewById(R.id.tv_date) as TextView
            iv_patient = itemView.findViewById(R.id.iv_patient) as ImageView
        }
    }

}