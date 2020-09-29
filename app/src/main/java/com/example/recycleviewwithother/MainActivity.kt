package com.example.recycleviewwithother

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recycleviewwithother.Adapter.UtlAdapter
import com.example.recycleviewwithother.model.Ultilities
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var ultlist = ArrayList<Ultilities>()
        ultlist.add(Ultilities(R.drawable.list, "My Wishlist"))
        ultlist.add(Ultilities(R.drawable.wallet, "My Followed Sellers"))
        ultlist.add(Ultilities(R.drawable.item, "My Purchased item"))
        ultlist.add(Ultilities(R.drawable.coupon_24, "My coupons"))
        ultlist.add(Ultilities(R.drawable.wallet, "My Cards Wallet"))
        ultlist.add(Ultilities(R.drawable.coupon_24, "Exp coupons"))
        ultlist.add(Ultilities(R.drawable.list, "My Given Feadback"))
        ultlist.add(Ultilities(R.drawable.history, "Search History"))
        ultlist.add(Ultilities(R.drawable.list, "Event & calendar"))
        var ultAdapter = UtlAdapter(ultlist)
        recycleview.layoutManager = GridLayoutManager(this, 3)
        recycleview.adapter = ultAdapter
    }
}