package com.nepplus.jickbangcopy_20111127.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.nepplus.jickbangcopy_20111127.R
import com.nepplus.jickbangcopy_20111127.datas.RoomData
import java.util.ArrayList

class RoomAdapter(
    val mContext: Context,
    resId: Int,
    val mList: ArrayList<RoomData>
) : ArrayAdapter<RoomData>(mContext, resId, mList) {

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {
            tempRow = mInflater.inflate( R.layout.room_list_item, null )
        }

        val row = tempRow!!

        val data = mList[position]

        val txtPrice = row.findViewById<TextView>(R.id.txtPrice)
        val txtAddressAndFloor = row.findViewById<TextView>(R.id.txtAddressAndFloor)
        val txtDescription = row.findViewById<TextView>(R.id.txtDescription)

        txtPrice.text = data.getFormattedPrice()
        txtAddressAndFloor.text = "${data.address}, ${data.getFormattedFloor()}"
        txtDescription.text = data.description

        return  row
    }
}